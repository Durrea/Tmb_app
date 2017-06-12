/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Cliente;
import Modelos.Informacion_Total_Mensual;
import Modelos.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ParqueaderoMes {
    
    public boolean RegisterCustomer(Connection conexion, Cliente cliente, Vehiculo vehiculo)
    {
        boolean resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRO_CLIENTE(?,?,?,?,?,?,?,?)}");
            callProcedure.setString(1, cliente.getCliente_nombre());
            callProcedure.setString(2, cliente.getCliente_cedula());
            callProcedure.setString(3, cliente.getCliente_telefono());
            callProcedure.setString(4, vehiculo.getVehiculo_placa());
            callProcedure.setString(5, vehiculo.getVehiculo_tipo());
            callProcedure.setString(6, vehiculo.getVehiculo_color());
            callProcedure.setString(7, vehiculo.getVehiculo_marca());
            callProcedure.registerOutParameter(8, java.sql.Types.VARCHAR);
            callProcedure.execute();
            System.out.println(callProcedure.getString(8));
            resultado = true;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    public ArrayList<Object> LoadInformacionTotalMensual(Connection conexion)
    {
        ArrayList<Object> resultado_lista = new ArrayList<Object>();        
        ArrayList<String> columnas = new ArrayList<String>();
        try
        {            
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TOTAL_MENSUAL()}");            
            callProcedure.execute();            
            ResultSet resultado_consulta = callProcedure.getResultSet();            
            ResultSetMetaData columnas_consulta = resultado_consulta.getMetaData();            
            for(int i=0;i<columnas_consulta.getColumnCount();i++)
            {
                columnas.add(columnas_consulta.getColumnLabel(i+1));
            }
            resultado_lista.add(columnas);
            while(resultado_consulta.next())
            {
                ArrayList<String> fila = new ArrayList<String>();
                for(int i =0;i<columnas_consulta.getColumnCount();i++)
                {
                    fila.add(resultado_consulta.getString(i+1));
                }
                resultado_lista.add(fila);
            }            
            return resultado_lista;
        }catch(Exception e)
        {            
            return resultado_lista;
        }
    }    
}
