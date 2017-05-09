/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Sesion {

    //Instancia de sesion, para mantener sesion activa durante la ejecucion del programa
    private static Sesion instanciaSesion = new Sesion();
    //Variables de sesion
    private int identificador;
    private String rolAutenticado;
    private boolean sesionActiva;

    private Sesion() {
        identificador = -1;
        rolAutenticado = "";
        sesionActiva = false;
    }

    public static Sesion getInstanciaSesion() {
        return instanciaSesion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRolAutenticado() {
        return rolAutenticado;
    }

    public void setRolAutenticado(String rolAutenticado) {
        this.rolAutenticado = rolAutenticado;
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
            //Asignacion de variables de sesion
            identificador = Integer.parseInt((String) callProcedure.getString(3));
            rolAutenticado = callProcedure.getString(4);
            sesionActiva = true;
            System.out.println(identificador + "/" + rolAutenticado);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return autenticado;
    }

    public boolean sesionActiva() {
        return sesionActiva;
    }

    public boolean cerrarSesion() {
        if (sesionActiva) {
            System.out.println("La sesion esta activa");
            this.identificador = -1;
            this.rolAutenticado = "";
            this.sesionActiva = false;
            return true;
        } else {
            System.out.println("La sesion no esta activa");
            return false;
        }
    }
}
