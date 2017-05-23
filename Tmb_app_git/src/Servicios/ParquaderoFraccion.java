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
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ParquaderoFraccion {
    
    public ArrayList<Modelos.Informacion_Fraccion> CargaInformacionPorFraccion(Connection conexion) 
    {
        ArrayList<Modelos.Informacion_Fraccion> informacion_fraccion;
        informacion_fraccion = new ArrayList<Modelos.Informacion_Fraccion>();
        
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TOTAL_FRACCION()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                int id_fraccion = Integer.parseInt(resultado_consulta.getString(1));
                String placa = resultado_consulta.getString(2);
                String tipo = resultado_consulta.getString(3);
                String fecha_entrada;
                String fecha_salida;
                double valor_cobrado;
                if(resultado_consulta.getString(4) == null)
                {
                    fecha_entrada = "";
                }
                else
                {
                    fecha_entrada = resultado_consulta.getString(4);
                    
                }
                if(resultado_consulta.getString(5) == null || resultado_consulta.getString(6) == null)
                {
                    fecha_salida = "";
                    valor_cobrado = 0.0;
                }
                else
                {
                    fecha_salida = resultado_consulta.getString(5);
                    valor_cobrado = Double.parseDouble(resultado_consulta.getString(6));
                }                
                Modelos.Informacion_Fraccion obj_info = new Modelos.Informacion_Fraccion(id_fraccion,placa,tipo,fecha_entrada,fecha_salida,valor_cobrado);
                informacion_fraccion.add(obj_info);
            }
            
        }catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        return informacion_fraccion;
    }
    
    public ArrayList<String> LoadTiposVehiculos(Connection conexion)
    {
        ArrayList<String> tipos = new ArrayList();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TIPOS_VEHICULOS()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                String tipo = resultado_consulta.getString(1);
                tipos.add(tipo);
            }
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return tipos;
    }
    public boolean RegisterEntryFraccion(Connection conexion, String placa, String tipo, int recep)
    {
        boolean resultado; 
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRAR_ENTRADAS_FRACCION(?,?,?)}");
            callProcedure.setString(1, placa);
            callProcedure.setString(2, tipo);
            callProcedure.setString(3, Integer.toString(recep)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          );
            callProcedure.execute();
            resultado = true;
            
        }catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, e.getMessage());
            resultado = false;
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
            resultado = false;
        }
        return resultado;
    }
    public ArrayList<String> LoadLastRecord(Connection conexion, int tipo, int idfrac)
    {
        ArrayList<String> resultado = new ArrayList<String>();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CARGAR_ULTIMO_REGISTRO_FRACCION(?,?,?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(tipo));
            callProcedure.setString(2, Integer.toString(idfrac));
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
}
