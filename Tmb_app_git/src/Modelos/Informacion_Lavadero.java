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
public class Informacion_Lavadero {
    
    int lavador_codigo;
    String fecha_lavada;
    String vehiculo_placa;
    String vehiculo_tipo;
    String vehiculo_marca;
    String tipo_lavada;
    float valor_lavada;
    String estado_pago;

    public Informacion_Lavadero(int lavador_codigo, String fecha_lavada, String vehiculo_placa, String vehiculo_tipo, String vehiculo_marca, String tipo_lavada, float valor_lavada, String estado_pago) {
        this.lavador_codigo = lavador_codigo;
        this.fecha_lavada = fecha_lavada;
        this.vehiculo_placa = vehiculo_placa;
        this.vehiculo_tipo = vehiculo_tipo;
        this.vehiculo_marca = vehiculo_marca;
        this.tipo_lavada = tipo_lavada;
        this.valor_lavada = valor_lavada;
        this.estado_pago = estado_pago;
    }

    
    
    public int getLavadorCodigo() {
        return lavador_codigo;
    }

    public void setLavadorCodigo(int lavadorCodigo) {
        this.lavador_codigo = lavadorCodigo;
    }

    public String getFecha_lavada() {
        return fecha_lavada;
    }

    public void setFecha_lavada(String fecha_lavada) {
        this.fecha_lavada = fecha_lavada;
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

    public String getVehiculo_marca() {
        return vehiculo_marca;
    }

    public void setVehiculo_marca(String vehiculo_marca) {
        this.vehiculo_marca = vehiculo_marca;
    }

    public String getTipo_lavada() {
        return tipo_lavada;
    }

    public void setTipo_lavada(String tipo_lavada) {
        this.tipo_lavada = tipo_lavada;
    }

    public float getValor_lavada() {
        return valor_lavada;
    }

    public void setValor_lavada(float valor_lavada) {
        this.valor_lavada = valor_lavada;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }
    
    
            
}
