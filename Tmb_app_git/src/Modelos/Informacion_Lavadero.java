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
    
    int id_lava;
    int lavador_codigo;
    String fecha_entrada;
    String fecha_salida;
    String vehiculo_placa;
    String vehiculo_tipo;
    String vehiculo_marca;
    String tipo_lavada;
    float valor_lavada;
    float valor_pago;
    
    public Informacion_Lavadero(int id_lava,int lavador_codigo, String fecha_entrada,String fecha_salida,String vehiculo_placa, String vehiculo_tipo, String vehiculo_marca, String tipo_lavada, float valor_lavada,float valor_pago) {
        this.id_lava=id_lava;
        this.lavador_codigo = lavador_codigo;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.vehiculo_placa = vehiculo_placa;
        this.vehiculo_tipo = vehiculo_tipo;
        this.vehiculo_marca = vehiculo_marca;
        this.tipo_lavada = tipo_lavada;
        this.valor_lavada = valor_lavada;
        this.valor_pago=valor_pago;
        
    }

    public int getId_lava() {
        return id_lava;
    }

    public void setId_lava(int id_lava) {
        this.id_lava = id_lava;
    }
    
    public int getLavadorCodigo() {
        return lavador_codigo;
    }

    public void setLavadorCodigo(int lavadorCodigo) {
        this.lavador_codigo = lavadorCodigo;
    }

     public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
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

    public float getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(float valor_pago) {
        this.valor_pago = valor_pago;
    }
            
}
