/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Lava;
import Modelos.Lavador;
import Modelos.Tarifa_lavadero;
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
    
    public String registerLavadores(Connection conexion, Lavador lavador, Vehiculo vehiculo,Tarifa_lavadero tarifa,int recep)
    {
        String resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRO_LAVADO(?,?,?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(recep));
            callProcedure.setString(2, Integer.toString(lavador.getLavador_codigo()));
            callProcedure.setString(3, vehiculo.getVehiculo_placa());
            callProcedure.setString(4, vehiculo.getVehiculo_tipo());
            callProcedure.setString(5, vehiculo.getVehiculo_marca());
            callProcedure.setString(6, tarifa.getTipo_lavada());
            callProcedure.setString(7, Float.toString(tarifa.getValor_lavada()));
            callProcedure.execute();
            resultado = "Registro realizado con exito";
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = e.getMessage(); 
        }
        return resultado;
    }
    
    public ArrayList<Modelos.Informacion_Lavadero> loadInformacionLavadero(Connection conexion) 
    {
        ArrayList<Modelos.Informacion_Lavadero> lst_lavadero= new ArrayList<>();
        
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TOTAL_LAVADERO()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                int id_lava=Integer.parseInt(resultado_consulta.getString(1));
                int lavador_codigo = Integer.parseInt(resultado_consulta.getString(2));
                String fecha_lavada= resultado_consulta.getString(3);
                String vehiculo_placa = resultado_consulta.getString(4);
                String vehiculo_tipo = resultado_consulta.getString(5);
                String vehiculo_marca=resultado_consulta.getString(6);
                String tipo_lavada=resultado_consulta.getString(7);
                float valor_lavada=Float.valueOf(resultado_consulta.getString(8));
                String estado_pago=resultado_consulta.getString(9);
                               
                Modelos.Informacion_Lavadero obj_info = new Modelos.Informacion_Lavadero
                       (id_lava,lavador_codigo,fecha_lavada,vehiculo_placa,vehiculo_tipo,vehiculo_marca,tipo_lavada,valor_lavada,estado_pago);
                lst_lavadero.add(obj_info);
            }
            
        }catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        return lst_lavadero;
    }        
    
    public String realizarPago(Connection conexion,int recep,int codLavador,int id_lava,float valorLavada,String tipo_pago){
        String resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REALIZAR_PAGO_LAVADERO(?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(recep));
            callProcedure.setString(2, Integer.toString(codLavador));
            callProcedure.setString(3, Integer.toString(id_lava));
            callProcedure.setString(4, Float.toString(valorLavada));
            callProcedure.setString(5, tipo_pago);
            callProcedure.execute();
            resultado = "Pago realizado con exito";
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = e.getMessage(); 
        }
        return resultado;
    }
    
    public float loadDeuda(Connection conexion) {
        
        float valor = 0;
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_DEUDA_LAVADERO(?)}");
            callProcedure.registerOutParameter(1, java.sql.Types.FLOAT);
            callProcedure.execute();
            valor = callProcedure.getFloat(1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return valor;
    }
    
    public ArrayList<Modelos.Informacion_Deuda_Lavadero> loadInformacionDeuda(Connection conexion) 
    {
        ArrayList<Modelos.Informacion_Deuda_Lavadero> lst_lavadero= new ArrayList<>();
        
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_DEUDA_LAVADERO()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                String vehiculo_placa = resultado_consulta.getString(1);
                String vehiculo_tipo = resultado_consulta.getString(2);
                float valor_deuda=Float.valueOf(resultado_consulta.getString(3));
                               
                Modelos.Informacion_Deuda_Lavadero obj_info = new Modelos.Informacion_Deuda_Lavadero
                       (vehiculo_placa,vehiculo_tipo,valor_deuda);
                lst_lavadero.add(obj_info);
            }
            
        }catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        return lst_lavadero;
    }
    
    
    public String cancelarDeuda(Connection conexion,int recep,String placa){
        String resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CANCELAR_DEUDA_LAVADERO(?,?)}");
            callProcedure.setString(1, Integer.toString(recep));
            callProcedure.setString(2, placa);
            callProcedure.execute();
            resultado = "Cancelacion Deuda con exito";
            
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            resultado = e.getMessage(); 
        }
        return resultado;
    }

}
