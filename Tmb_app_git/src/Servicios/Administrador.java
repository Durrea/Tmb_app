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
}
