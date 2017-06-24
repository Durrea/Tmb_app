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
    
    public String RegisterCustomer(Connection conexion, Cliente cliente, Vehiculo vehiculo)
    {
        String resultado;
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
            resultado = "Registro realizado con exito";
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = e.getMessage();
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
    public String BuscadorPlacaMensual(Connection conexion, String placa)
    {
        String resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_BUSCADOR_VEHICULO_MENSUAL(?)}");
            callProcedure.setString(1, placa);            
            callProcedure.execute();            
            resultado = "Registrado";
            return resultado;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = e.getMessage();
        }
        return resultado;
    }
    public String RegistrarEntradaDiaria(Connection conexion, String placa)
    {
        String resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRAR_ENTRADA_MENSUAL(?)}");
            callProcedure.setString(1, placa);            
            callProcedure.execute();
            resultado = "Exitoso";
        }catch(Exception e)
        {
            resultado = e.getMessage();
        }
        return resultado;
    }

public static boolean updateTarifa(Connection conect, String string, String ID) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_MODIFICAR_TARIFA_PARQUEADERO(?,?)}");
            callProcedure.setString(1, string);
            callProcedure.setInt(2, Integer.parseInt(ID));
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public ArrayList<Object> LoadInformacionTarifaParqueadero(Connection conexion) {
        ArrayList<Object> resultado_lista = new ArrayList<Object>();
        ArrayList<String> columnas = new ArrayList<String>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TARIFA_PARQUEADERO()}");
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
    public String RegistrarAbonoMensual(Connection conexion, double valor, String placa, int recepcionista)
    {
        String resultado = "";
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRAR_ABONO_MENSUALIDAD(?,?,?)}");
            callProcedure.setString(1, Double.toString(valor));
            callProcedure.setString(2, placa);
            callProcedure.setString(3, Integer.toString(recepcionista));
            callProcedure.execute();
            resultado = "Se ha realizado el abono de la mensualidad con exito";
        }catch(Exception e)
        {            
            resultado = e.getMessage();
        }
        return resultado;
    }

    public boolean registrarTarifa(Connection conect, String tipoV, int costoHora, int costoDia, int costoMes) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_REGISTRAR_TARIFA_PARQUEADERO(?,?,?,?)}");
            callProcedure.setString(1,tipoV);
            callProcedure.setFloat(2, costoMes);
            callProcedure.setFloat(3, costoDia);
            callProcedure.setFloat(4, costoHora);
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public ArrayList<String> InformeEntradasMensual(Connection conexion,String placa, String fecha)
    {
        ArrayList<String> resultado;
        try
        {
            resultado = new ArrayList();
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORME_ENTRADAS_MENSUAL(?,?)}");
            callProcedure.setString(1, placa);
            callProcedure.setString(2, fecha);
            callProcedure.execute();
            ResultSet rs = callProcedure.getResultSet();
            while(rs.next())
            {
                resultado.add(rs.getString(1));
            }
            System.out.println("Try");
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = new ArrayList();            
        }
        return resultado;
    }
    public ArrayList<Object> CargarInformacionPorRecepcionista(Connection conexion, String fecha, int idrecep)
    {
        ArrayList<Object> resultado_lista;
        ArrayList<String> columnas = new ArrayList<String>();
        try
        {
            resultado_lista = new ArrayList();
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_MENSUALIDAD_RECEP(?,?)}");
            callProcedure.setString(1, fecha);
            callProcedure.setString(2, Integer.toString(idrecep));
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
            
        }catch(Exception e)
        {
            resultado_lista = new ArrayList();
        }
        return resultado_lista;
    }
}
