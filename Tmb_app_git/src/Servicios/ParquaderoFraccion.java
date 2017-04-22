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
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ParquaderoFraccion {
    
    public ArrayList CargaInformacionPorFraccion(Connection conexion)
    {
        ArrayList<Modelos.Informacion_Fraccion> informacion_fraccion;
        informacion_fraccion = new ArrayList();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TOTAL_FRACCION()}");
            callProcedure.execute();
            
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                int id_fraccion = Integer.parseInt(resultado_consulta.getString(1));
                String placa = resultado_consulta.getString(2);
                Date fecha_entrada = java.sql.Date.valueOf(resultado_consulta.getString(3));
                Date fecha_salida = java.sql.Date.valueOf(resultado_consulta.getString(4));
                float valor_cobrado = Float.parseFloat(resultado_consulta.getString(5));
                Modelos.Informacion_Fraccion obj_info = new Modelos.Informacion_Fraccion(id_fraccion,placa,fecha_entrada,fecha_salida,valor_cobrado);
                informacion_fraccion.add(obj_info);
            }
            
        }catch(Exception e)
        {
            System.out.println("Error");
        }
        return informacion_fraccion;
    }
    
}
