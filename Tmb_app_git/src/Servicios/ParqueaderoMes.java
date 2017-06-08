/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelos.Cliente;
import Modelos.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author hp
 */
public class ParqueaderoMes {
    
    public boolean RegisterCustomer(Connection conexion, Cliente cliente, Vehiculo vehiculo)
    {
        boolean resultado;
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
            resultado = true;
        }catch(Exception e)
        {
            resultado = false;
        }
        return resultado;
    }
    
}
