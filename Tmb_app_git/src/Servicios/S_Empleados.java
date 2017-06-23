/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 *
 * @author DANIEL
 */
public class S_Empleados {

    public S_Empleados() {
    }

    public ArrayList<Object> LoadInformacionLavadores(Connection conexion) {
        ArrayList<Object> resultado_lista = new ArrayList<Object>();
        ArrayList<String> columnas = new ArrayList<String>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_EMPLEADOS_LAV()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            ResultSetMetaData columnas_consulta = resultado_consulta.getMetaData();
            for (int i = 0; i < columnas_consulta.getColumnCount(); i++) {
                columnas.add(columnas_consulta.getColumnLabel(i + 1));
            }
            resultado_lista.add(columnas);
            while (resultado_consulta.next()) {
                ArrayList<String> fila = new ArrayList<String>();
                for (int i = 0; i < columnas_consulta.getColumnCount(); i++) {
                    fila.add(resultado_consulta.getString(i + 1));
                }
                resultado_lista.add(fila);
            }
            return resultado_lista;
        } catch (Exception e) {
            return resultado_lista;
        }
    }

    public ArrayList<Object> LoadInformacionRecepcionista(Connection conexion) {
        ArrayList<Object> resultado_lista = new ArrayList<Object>();
        ArrayList<String> columnas = new ArrayList<String>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_EMPLEADOS_REC()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            ResultSetMetaData columnas_consulta = resultado_consulta.getMetaData();
            for (int i = 0; i < columnas_consulta.getColumnCount(); i++) {
                columnas.add(columnas_consulta.getColumnLabel(i + 1));
            }
            resultado_lista.add(columnas);
            while (resultado_consulta.next()) {
                ArrayList<String> fila = new ArrayList<String>();
                for (int i = 0; i < columnas_consulta.getColumnCount(); i++) {
                    fila.add(resultado_consulta.getString(i + 1));
                }
                resultado_lista.add(fila);
            }
            return resultado_lista;
        } catch (Exception e) {
            return resultado_lista;
        }
    }

    public boolean registrarEmpleado(Connection conect, int tipoEmpleado, String nombre, String apellido, String usuario, String contra, String telefono, String documento, int CodigoLavador) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_REGISTRAR_EMPLEADO(?,?,?,?,?,?,?,?)}");
            callProcedure.setInt(1, tipoEmpleado);
            callProcedure.setString(2, nombre);
            callProcedure.setString(3, apellido);
            callProcedure.setString(4, usuario);
            callProcedure.setString(5, contra);
            callProcedure.setString(6, telefono);
            callProcedure.setString(7, documento);
            callProcedure.setInt(8, CodigoLavador);
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
