/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Habitacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class S_Hotel {

    public S_Hotel() {
    }

    public ArrayList<Modelos.Habitacion> cargarHabitaciones(Connection conexion) {
        ArrayList<Modelos.Habitacion> habitaciones;
        habitaciones = new ArrayList<Modelos.Habitacion>();

        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFO_HABITACIONES(?)}");
            callProcedure.registerOutParameter(1, java.sql.Types.NUMERIC);
            callProcedure.execute();
            int hab = callProcedure.getInt(1);
            //System.out.println("Numero de habitaciones - " + hab);
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                int id = resultado_consulta.getInt(1);
                int num = resultado_consulta.getInt(2);
                int cpc = resultado_consulta.getInt(3);
                String std = resultado_consulta.getString(4);
                habitaciones.add(new Habitacion(id, num, cpc, std));
            }

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return habitaciones;
    }

    public ArrayList<Float>
            ocuparHabitacion(Connection conexion, Habitacion habitacion, String tipo, int numP, String entrada, String salida, float extra, String placa, String tipoV) {
        ArrayList<Float> retorno = new ArrayList<>();
        Sesion sesion = Sesion.getInstanciaSesion();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_OCUPAR_HABITACION(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            callProcedure.setInt(1, sesion.getIdentificador());
            callProcedure.setInt(2, habitacion.getIdHabitacion());
            callProcedure.setInt(3, habitacion.getHabitacion_numero());
            callProcedure.setString(4, entrada);
            callProcedure.setString(5, salida);
            callProcedure.setInt(6, numP);
            callProcedure.setString(7, tipo);
            callProcedure.registerOutParameter(8, java.sql.Types.NUMERIC);
            callProcedure.registerOutParameter(9, java.sql.Types.NUMERIC);
            callProcedure.setFloat(10, extra);
            callProcedure.registerOutParameter(11, java.sql.Types.FLOAT);
            callProcedure.setString(12, placa);
            callProcedure.setString(13, tipo);
            callProcedure.execute();
            int idRegistro = callProcedure.getInt(8);
            int excedida = callProcedure.getInt(9);
            float costo = callProcedure.getFloat(11);
            retorno.add((float) idRegistro);
            retorno.add((float) excedida);
            retorno.add(costo);
            //JOptionPane.showMessageDialog(null, idRegistro + " - " + excedida);

        } catch (Exception e) {
            //System.out.println("Error al ocupar");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return retorno;
    }

    public void cancelarRegistro(Connection conexion, int idRegistro) {
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CANCELAR_REGISTRO_HABITACION(?)}");
            callProcedure.setInt(1, idRegistro);
            callProcedure.execute();
            JOptionPane.showMessageDialog(null, "Cancelación exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cancelación fallida");
        }

    }

    public void liberarHabitacion(Connection conexion, int numHab) {
        try {
            CallableStatement callProdecure = conexion.prepareCall("{call PRO_LIBERAR_HABITACION(?)}");
            callProdecure.setInt(1, numHab);
            callProdecure.execute();
            JOptionPane.showMessageDialog(null, "Liberacion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Liberacion fallida");
        }
    }

    public ArrayList<Modelos.Informacion_hotel> LoadInfoPerRecepcionista(Connection conexion, String fecha, int idrecep) {
        ArrayList<Modelos.Informacion_hotel> informacion = new ArrayList<Modelos.Informacion_hotel>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORME_HOTEL(?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(idrecep));
            callProcedure.setString(2, fecha);
            callProcedure.registerOutParameter(3, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(4, java.sql.Types.NUMERIC);
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                Modelos.Informacion_hotel obj;
                if (resultado_consulta.getString(2) == null) {
                    obj = new Modelos.Informacion_hotel(Integer.parseInt(resultado_consulta.getString(1)),
                            0);
                } else {
                    obj = new Modelos.Informacion_hotel(Integer.parseInt(resultado_consulta.getString(1)),
                            Float.parseFloat(resultado_consulta.getString(2)));
                }
                obj.setNumentradas(Integer.parseInt(resultado_consulta.getString(3)));
                informacion.add(obj);
            }
            return informacion;
        } catch (Exception e) {
            return informacion;
        }
    }

    public ArrayList<Modelos.Informacion_hotel> LoadInfoPerRecepcionistaMensual(Connection conexion, String fecha, int numHabitacion) {
        ArrayList<Modelos.Informacion_hotel> informacion = new ArrayList<Modelos.Informacion_hotel>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORME_HOTEL_RECEPCIONISTA(?,?)}");
            callProcedure.setString(1, fecha);
            callProcedure.setString(2, Integer.toString(numHabitacion));            
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                Modelos.Informacion_hotel obj;
                obj = new Modelos.Informacion_hotel(resultado_consulta.getString(1),resultado_consulta.getString(2));
                informacion.add(obj);
            }
            return informacion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return informacion;
        }
    }

    public ArrayList<Object> LoadInformacionTarifaHotel(Connection conexion) {
        ArrayList<Object> resultado_lista = new ArrayList<Object>();
        ArrayList<String> columnas = new ArrayList<String>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_INFORMACION_TARIFA_HOTEL()}");
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

    public static boolean updateTarifa(Connection conect, String string, String ID) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_MODIFICAR_TARIFA_HOTEL(?,?)}");
            callProcedure.setString(1, string);
            callProcedure.setInt(2, Integer.parseInt(ID));
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean registrarTarifa(Connection conect, int habitacion, int costoHora, int costoDia) {
        try {
            CallableStatement callProcedure = conect.prepareCall("{call PRO_REGISTRAR_TARIFA_HOTEL(?,?,?)}");
            callProcedure.setInt(1, habitacion);
            callProcedure.setFloat(2, costoHora);
            callProcedure.setFloat(3, costoDia);
            callProcedure.execute();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<Integer> loadNumHabitaciones(Connection conexion) {
        ArrayList<Integer> resultado_lista = new ArrayList<>();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CARGAR_HABITACIONES()}");
            callProcedure.execute();
            ResultSet resultado_consulta = callProcedure.getResultSet();
            while (resultado_consulta.next()) {
                resultado_lista.add(Integer.parseInt(resultado_consulta.getString(1)));
            }
            return resultado_lista;
        } catch (Exception e) {
            return resultado_lista;
        }
    }
    
    public ArrayList<String> LoadLastRecord(Connection conexion, int id, int idRecep)
    {
        ArrayList<String> resultado = new ArrayList<String>();
        try
        {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CARGAR_FACTURA_HOTEL(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callProcedure.setString(1, Integer.toString(id));
            callProcedure.setString(2, Integer.toString(idRecep));
            callProcedure.registerOutParameter(3, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(4, java.sql.Types.NUMERIC);
            callProcedure.registerOutParameter(5, java.sql.Types.NUMERIC);
            callProcedure.registerOutParameter(6, java.sql.Types.NUMERIC);
            callProcedure.registerOutParameter(7, java.sql.Types.NUMERIC);
            callProcedure.registerOutParameter(8, java.sql.Types.FLOAT);
            callProcedure.registerOutParameter(9, java.sql.Types.FLOAT);
            callProcedure.registerOutParameter(10, java.sql.Types.FLOAT);
            callProcedure.registerOutParameter(11, java.sql.Types.VARCHAR);
            callProcedure.registerOutParameter(12, java.sql.Types.VARCHAR);
            callProcedure.execute();            
            for(int i=3;i<=12;i++)
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
            System.out.println(e.getMessage());
            return resultado;
        }
    }
    
    public float
            calcularCostoHabitacion(Connection conexion, Habitacion habitacion, String tipo, int numP, String entrada, String salida) {
        Sesion sesion = Sesion.getInstanciaSesion();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_CALCULAR_COSTO_HABITACION(?,?,?,?,?,?,?,?)}");
            callProcedure.setInt(1, sesion.getIdentificador());
            callProcedure.setInt(2, habitacion.getIdHabitacion());
            callProcedure.setInt(3, habitacion.getHabitacion_numero());
            callProcedure.setString(4, entrada);
            callProcedure.setString(5, salida);
            callProcedure.setInt(6, numP);
            callProcedure.setString(7, tipo);
            callProcedure.registerOutParameter(8, java.sql.Types.NUMERIC);
            callProcedure.execute();
            float costo = callProcedure.getInt(8);
            return costo;
            //JOptionPane.showMessageDialog(null, idRegistro + " - " + excedida);

        } catch (Exception e) {
            //System.out.println("Error al ocupar");
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return 0;
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
            resultado = "Error Java";
            return resultado;
        }       
    }        
            
            
}
