/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Recepcionista;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Administrador {

    public void guardar(Connection conexion, Recepcionista recepcionista) throws SQLException {
        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO recepcionista (recepcionista_nombres,recepcionista_apellidos"
                    + ", recepcionista_usuario, recepcionista_constrasenia) VALUES(?, ?, ?, ?)");
            consulta.setString(1, recepcionista.getRecepcionista_nombres());
            consulta.setString(2, recepcionista.getRecepcionista_apellidos());
            consulta.setString(3, recepcionista.getRecepcionista_usuario());
            consulta.setString(4, recepcionista.getRecepcionista_contrasenia());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public ArrayList autenticarUsuario(Connection conexion, String usuario, String contrasenia) throws SQLException {
        ArrayList<String> autenticado;
        autenticado = new ArrayList<>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_AUTENTICAR_USUARIO(?,?,?,?)}");
            // Parametro 1 y 2 del procedimiento almacenado
            callProcedure.setString(1, usuario);
            callProcedure.setString(2, contrasenia);
            // Definimos los tipos de los parametros de salida del procedimiento almacenado
            callProcedure.registerOutParameter(3, java.sql.Types.NUMERIC);
            callProcedure.registerOutParameter(4, java.sql.Types.VARCHAR);
            // Ejecuta el procedimiento almacenado
            callProcedure.execute();
            // Se obtienen la salida del procedimineto almacenado
            autenticado.add(callProcedure.getString(3));
            autenticado.add(callProcedure.getString(4));
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return autenticado;
    }
}
