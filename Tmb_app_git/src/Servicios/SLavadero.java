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
 * @author hp
 */
public class SLavadero {

    public ArrayList<String> loadCodLavadores(Connection conexion) {
        ArrayList<String> tipos = new ArrayList();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CODIGOS_LAVADORES()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                String tipo = resultado_consulta.getString(1);
                tipos.add(tipo);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tipos;
    }

    public ArrayList<String> loadTiposVehiculos(Connection conexion) {
        ArrayList<String> tipos = new ArrayList();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TIPOS_VEHICULOS_LAVADERO()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                String tipo = resultado_consulta.getString(1);
                tipos.add(tipo);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tipos;
    }

    public ArrayList<String> loadTiposLavadas(Connection conexion) {
        ArrayList<String> tipos = new ArrayList();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TIPOS_LAVADAS()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                String tipo = resultado_consulta.getString(1);
                tipos.add(tipo);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tipos;
    }

    public float costoLavada(Connection conexion, String tipoVehiculo, String tipoLavada) {

        float valor = 0;
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_COSTO_LAVADA(?,?,?)}");
            callProcedure.setString(1, tipoVehiculo);
            callProcedure.setString(2, tipoLavada);
            callProcedure.registerOutParameter(3, java.sql.Types.FLOAT);
            callProcedure.execute();
            valor = callProcedure.getFloat(3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return valor;
    }

    public static boolean updateTarifa(Connection conect, String string, String ID) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_MODIFICAR_TARIFA_LAVADERO(?,?)}");
            callProcedure.setString(1, string);
            callProcedure.setInt(2, Integer.parseInt(ID));
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Object> LoadInformacionTarifaLavadero(Connection conexion) {
        ArrayList<Object> resultado_lista = new ArrayList<Object>();
        ArrayList<String> columnas = new ArrayList<String>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TARIFA_LAVADERO()}");
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

}
