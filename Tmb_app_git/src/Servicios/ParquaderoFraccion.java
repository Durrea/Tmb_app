/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ParquaderoFraccion {
    
    public ArrayList<Object> CargaInformacionPorFraccion(Connection conexion) 
    {
        ArrayList<Object> resultado_lista;
        ArrayList<String> columnas = new ArrayList<String>();        
        try
        {
            resultado_lista = new ArrayList<Object>();
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TOTAL_FRACCION()}");
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
                    if(resultado_consulta.getString(i+1) == null && 
                            columnas_consulta.getColumnType(i+1) == 12)
                    {
                        fila.add("");
                       
                    }
                    else
                    {
                        if(resultado_consulta.getString(i+1) == null && 
                            columnas_consulta.getColumnType(i+1) == 7)
                        {
                            fila.add("0.0");
                        }
                        else
                        {
                            fila.add(resultado_consulta.getString(i+1));
                        }
                    }                                        
                }
                resultado_lista.add(fila);
            }
            
        }catch(Exception e)
        {
            resultado_lista = new ArrayList<Object>();
        }
        return resultado_lista;
    }        
    public String RegisterEntryFraccion(Connection conexion, String placa, String tipo, int recep)
    {
        String resultado; 
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRAR_ENTRADAS_FRACCION(?,?,?)}");
            callProcedure.setString(1, placa);
            callProcedure.setString(2, tipo);
            callProcedure.setString(3, Integer.toString(recep));
            callProcedure.execute();            
            resultado = "Se ha realizado el registro";
            
        }catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, e.getMessage());                        
            resultado = e.getMessage();
        }
        return resultado;
    }
    public boolean CheckOutFraccion(Connection conexion, String placa, String tipo, int recep)
    {
        boolean resultado; 
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRAR_SALIDAS_FRACCION(?,?,?)}");
            callProcedure.setString(1, placa);
            callProcedure.setString(2, tipo);
            callProcedure.setString(3, Integer.toString(recep)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          );
            callProcedure.execute();
            resultado = true;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = false;
        }
        return resultado;
    }
    public ArrayList<String> LoadLastRecord(Connection conexion, int tipo, String placa)
    {
        ArrayList<String> resultado = new ArrayList<String>();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CARGAR_ULTIMO_REGISTRO_FRACCION(?,?,?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(tipo));
            callProcedure.setString(2, placa);
            callProcedure.registerOutParameter(3, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(4, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(5, java.sql.Types.DATE);
            callProcedure.registerOutParameter(6, java.sql.Types.DATE);
            callProcedure.registerOutParameter(7, java.sql.Types.FLOAT);
            callProcedure.execute();            
            for(int i=3;i<=7;i++)
            {
                String val = callProcedure.getString(i);
                if(val != null)
                {
                    resultado.add(callProcedure.getString(i));                    
                }
                else
                {
                    resultado.add("---");
                }
            }            
            return resultado;
        }catch(Exception e)
        {            
            return resultado;
        }
    }
    public ArrayList<Modelos.Informacion_Fraccion> LoadInfoPerRecepcionista(Connection conexion, String fecha, int idrecep)
    {
        ArrayList<Modelos.Informacion_Fraccion> informacion = new ArrayList<Modelos.Informacion_Fraccion>();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_INGRESO_FRACCION(?,?)}");
            callProcedure.setString(1, fecha);
            callProcedure.setString(2, Integer.toString(idrecep));
            callProcedure.execute(); 
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                Modelos.Informacion_Fraccion obj;
                if(resultado_consulta.getString(4) == null && resultado_consulta.getString(5) == null)
                {
                    obj = new Modelos.Informacion_Fraccion(Integer.parseInt(resultado_consulta.getString(1)),
                    resultado_consulta.getString(2),"",resultado_consulta.getString(3),"",0.0);
                }
                else
                {
                    obj = new Modelos.Informacion_Fraccion(Integer.parseInt(resultado_consulta.getString(1)),
                    resultado_consulta.getString(2),"",resultado_consulta.getString(3),resultado_consulta.getString(4),Double.parseDouble(resultado_consulta.getString(5)));
                }
                informacion.add(obj);
            }
            return informacion;
        }catch(Exception e)
        {
            return informacion;
        }
    }
}
