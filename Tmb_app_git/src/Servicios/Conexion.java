/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.*;

public class Conexion {

    private static Connection cnx = null;

    public static Connection obtener(){
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/tmb_bd", "root", "1046MyS@L");
            } catch (Exception ex) {
                System.out.println("Error al crear la conexion");
            }
        
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
}
