/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class SLavadero {
    
    
    public ArrayList<String> loadCodLavadores(Connection conexion)
    {
        ArrayList<String> tipos = new ArrayList();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CODIGOS_LAVADORES()}");
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
    
    public ArrayList<String> loadTiposVehiculos(Connection conexion)
    {
        ArrayList<String> tipos = new ArrayList();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TIPOS_VEHICULOS_LAVADERO()}");
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
    
    public ArrayList<String> loadTiposLavadas(Connection conexion)
    {
        ArrayList<String> tipos = new ArrayList();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TIPOS_LAVADAS()}");
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
    
    public float costoLavada(Connection conexion,String tipoVehiculo,String tipoLavada){
        
        float valor = 0;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_COSTO_LAVADA(?,?,?)}");
            callProcedure.setString(1, tipoVehiculo);
            callProcedure.setString(2, tipoLavada);
            callProcedure.registerOutParameter(3, java.sql.Types.FLOAT);
            callProcedure.execute();
            valor=callProcedure.getFloat(3);
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return valor;
    }
    
}
