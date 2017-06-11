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
            ocuparHabitacion(Connection conexion, Habitacion habitacion, String tipo, int numP, String entrada, String salida, float extra) {
        ArrayList<Float> retorno = new ArrayList<>();
        Sesion sesion = Sesion.getInstanciaSesion();
        try {
            CallableStatement callProcedure = conexion.prepareCall("{call PRO_OCUPAR_HABITACION(?,?,?,?,?,?,?,?,?,?,?)}");
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
            JOptionPane.showMessageDialog(null, "Registro fallido");
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
                informacion.add(obj);
            }
            return informacion;
        } catch (Exception e) {
            return informacion;
        }
    }
}
