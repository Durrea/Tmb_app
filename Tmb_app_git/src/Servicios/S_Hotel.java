/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Habitacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

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

}
