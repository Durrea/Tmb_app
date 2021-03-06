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
    
    public String registerLavadores(Connection conexion, Lavador lavador, Vehiculo vehiculo,Tarifa_lavadero tarifa,String descripcion,int recep)
    {
        String resultado;
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_REGISTRO_LAVADO(?,?,?,?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(recep));
            callProcedure.setString(2, Integer.toString(lavador.getLavador_codigo()));
            callProcedure.setString(3, vehiculo.getVehiculo_placa());
            callProcedure.setString(4, vehiculo.getVehiculo_tipo());
            callProcedure.setString(5, vehiculo.getVehiculo_marca());
            callProcedure.setString(6, tarifa.getTipo_lavada());
            callProcedure.setString(7, Float.toString(tarifa.getValor_lavada()));
            callProcedure.setString(8, descripcion);
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
                String fecha_entrada= resultado_consulta.getString(3);
                String vehiculo_placa = resultado_consulta.getString(4);
                String vehiculo_tipo = resultado_consulta.getString(5);
                String tipo_lavada=resultado_consulta.getString(6);
                float valor_lavada=Float.valueOf(resultado_consulta.getString(7));
                float valor_pago=Float.valueOf(resultado_consulta.getString(8));
                               
                Modelos.Informacion_Lavadero obj_info = new Modelos.Informacion_Lavadero
                       (id_lava,lavador_codigo,fecha_entrada,"",vehiculo_placa,vehiculo_tipo,"",tipo_lavada,valor_lavada,valor_pago);
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


    public boolean registrarTarifa(Connection conect, String tipoV, int valorL, String tipoL) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_REGISTRAR_TARIFA_LAVADERO(?,?,?)}");
            callProcedure.setString(1,tipoV);
            callProcedure.setFloat(2, valorL);
            callProcedure.setString(3, tipoL);
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ArrayList<Modelos.Informacion_Lavadero> loadInforme(Connection conexion,int lavador_codigo,String fecha) 
    {
        ArrayList<Modelos.Informacion_Lavadero> lst_lavadero= new ArrayList<>();
        
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORME_DIARIA_LAVADOR(?,?)}");
            callProcedure.setString(1, Integer.toString(lavador_codigo));
            callProcedure.setString(2, fecha);
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while(resultado_consulta.next())
            {
                String vehiculo_placa = resultado_consulta.getString(1);
                String vehiculo_tipo= resultado_consulta.getString(2);
                String tipo_lavada = resultado_consulta.getString(3);
                float valor_pago=Float.valueOf(resultado_consulta.getString(4));
                               
                Modelos.Informacion_Lavadero obj_info = new Modelos.Informacion_Lavadero
                       (0,0,"","",vehiculo_placa,vehiculo_tipo,"",tipo_lavada,0,valor_pago);
                lst_lavadero.add(obj_info);
            }
            
        }catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
        return lst_lavadero;
    }      
    
    public ArrayList<Modelos.Lavador> loadLavador(Connection conexion,int lavador_codigo) {
        
        ArrayList<Modelos.Lavador> lst_lavador= new ArrayList<>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_NAMES_LAVADOR(?)}");
            callProcedure.setString(1, Integer.toString(lavador_codigo));
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
          
            while(resultado_consulta.next())
            {
                String lavador_nombre = resultado_consulta.getString(1);
                String lavador_apellido = resultado_consulta.getString(2);

                Modelos.Lavador obj_info = new Modelos.Lavador(0,0,lavador_nombre,lavador_apellido);
                lst_lavador.add(obj_info);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst_lavador;
    }
    
    
    public ArrayList<String> LoadLastRecord(Connection conexion, int tipo,int recep)
    {
        ArrayList<String> resultado = new ArrayList<String>();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CARGAR_FACTURA_LAVADERO(?,?,?,?,?,?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(tipo));
            callProcedure.setString(2, Integer.toString(recep));
            callProcedure.registerOutParameter(3, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(4, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(5, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(6, java.sql.Types.DATE);
            callProcedure.registerOutParameter(7, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(8, java.sql.Types.FLOAT);
            callProcedure.registerOutParameter(9, java.sql.Types.FLOAT);
            callProcedure.registerOutParameter(10, java.sql.Types.FLOAT);
            callProcedure.execute();            
            for(int i=3;i<=10;i++)
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
    
    public ArrayList<String> LoadLastRecord(Connection conexion,int recep)
    {
        ArrayList<String> resultado = new ArrayList<String>();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_FACTURA_REG_LAVADERO(?,?,?,?)}");            
            callProcedure.setString(1, Integer.toString(recep));
            callProcedure.registerOutParameter(2, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(3, java.sql.Types.VARCHAR);            
            callProcedure.registerOutParameter(4, java.sql.Types.DATE);
            callProcedure.execute();            
            for(int i=2;i<=4;i++)
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
    
    public ArrayList<Modelos.Informe_Lavadero> LoadInfoPerRecepcionista(Connection conexion, String fecha, int idrecep) {
        ArrayList<Modelos.Informe_Lavadero> lst_lavadero = new ArrayList<Modelos.Informe_Lavadero>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_RECEP_LAVADERO(?,?)}");
            callProcedure.setString(1, fecha);
            callProcedure.setString(2, Integer.toString(idrecep));
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                String lavador_names = resultado_consulta.getString(1);
                float valor_total=Float.valueOf(resultado_consulta.getString(2));

                Modelos.Informe_Lavadero obj_info = new Modelos.Informe_Lavadero(lavador_names,valor_total);
                
                lst_lavadero.add(obj_info);
            }
            return lst_lavadero;
        } catch (Exception e) {
            return lst_lavadero;
        }
    }
     
    public float LoadTotalRecep(Connection conexion, String fecha) {
        float valor = 0;
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TOTAL_RECEP_LAVADERO(?,?)}");
            callProcedure.setString(1, fecha);
            callProcedure.execute();
            callProcedure.registerOutParameter(2, java.sql.Types.FLOAT);
            callProcedure.execute();
            valor = callProcedure.getFloat(2);
            return valor;
        } catch (Exception e) {
            return valor;
        }
    }
    
    public String descripcionLavada(Connection conexion,int id_lava) {

        String descripcion = "";
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_DESCRIPCION_LAVADERO(?,?)}");
            callProcedure.setString(1, Integer.toString(id_lava));
            callProcedure.registerOutParameter(2, java.sql.Types.VARCHAR);
            callProcedure.execute();
            descripcion = callProcedure.getString(2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return descripcion;
    }
    
    public boolean validarTarifa(Connection conexion, String tipoVehiculo, String tipoLavada) {

        boolean respuesta = true;
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_VALIDAR_TARIFA_LAVADERO(?,?,?)}");
            callProcedure.setString(1, tipoVehiculo);
            callProcedure.setString(2, tipoLavada);
            callProcedure.registerOutParameter(3, java.sql.Types.BOOLEAN);
            callProcedure.execute();
            respuesta = callProcedure.getBoolean(3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return respuesta;
    }
    
    public boolean updateLavador(Connection conexion,int id_lava,String id_lavador) {
        
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_MODIFICAR_CODIGO_LAVADOR(?,?)}");
            callProcedure.setString(1, Integer.toString(id_lava));
            callProcedure.setString(2, id_lavador);
            callProcedure.execute();
            return true;

        } catch (Exception e) {
            return false;
        }
        
   }
    
    public float loadTotalInforme(Connection conexion,int lavador_codigo,String fecha) {
        
        float valor = 0;
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TOTAL_INFORME_DIARIO_LAVADERO(?,?,?)}");
            callProcedure.setString(1, Integer.toString(lavador_codigo));
            callProcedure.setString(2, fecha);
            callProcedure.registerOutParameter(3, java.sql.Types.FLOAT);
            callProcedure.execute();
            valor = callProcedure.getFloat(3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return valor;
    }
    
    public String validarPlaca(Connection conexion, String placa) {
        String resultado;
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_TIPO_VEHICULO_EXISTENTE(?,?)}");
            callProcedure.setString(1, placa);
            callProcedure.registerOutParameter(2, java.sql.Types.VARCHAR);
            callProcedure.execute();
            resultado = callProcedure.getString(2);
            return resultado;
        } catch (Exception e) {            
            resultado = e.getMessage();
            return resultado;
        }       
    }
}
