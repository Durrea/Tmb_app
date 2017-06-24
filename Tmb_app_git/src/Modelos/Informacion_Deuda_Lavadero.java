/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Santiago Ortega
 */
public class Informacion_Deuda_Lavadero {
    
    String vehiculo_placa;
    String vehiculo_tipo;
    float valor_deuda;

    public Informacion_Deuda_Lavadero(String vehiculo_placa, String vehiculo_tipo, float valor_deuda) {
        this.vehiculo_placa = vehiculo_placa;
        this.vehiculo_tipo = vehiculo_tipo;
        this.valor_deuda = valor_deuda;
    }
    
    public String getVehiculo_placa() {
        return vehiculo_placa;
    }

    public void setVehiculo_placa(String vehiculo_placa) {
        this.vehiculo_placa = vehiculo_placa;
    }

    public String getVehiculo_tipo() {
        return vehiculo_tipo;
    }

    public void setVehiculo_tipo(String vehiculo_tipo) {
        this.vehiculo_tipo = vehiculo_tipo;
    }

    public float getValor_deuda() {
        return valor_deuda;
    }

    public void setValor_deuda(float valor_deuda) {
        this.valor_deuda = valor_deuda;
    }
    
    
}
