/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author hp
 */
public class Lava {
    
    //Atributos de la relacion Lava
    private int idLavada;
    private int idVehiculo;
    private int idRecepcionista;
    private int idLavador;
    private String fecha_lavada;
    private float valor_lavada;
    private float valor_pago;
    private String tipo_lavada;
    private String tipo_pago;

    public Lava(int idLavada, int idVehiculo, int idRecepcionista, int idLavador, String fecha_lavada, float valor_pago, String tipo_lavada, String tipo_pago) {
        
        this.idLavada = idLavada;
        this.idVehiculo = idVehiculo;
        this.idRecepcionista = idRecepcionista;
        this.idLavador = idLavador;
        this.fecha_lavada = fecha_lavada;
        this.valor_pago = valor_pago;
        this.tipo_lavada = tipo_lavada;
        this.tipo_pago = tipo_pago;
    }

    public int getIdLavada() {
        return idLavada;
    }

    public void setIdLavada(int idLavada) {
        this.idLavada = idLavada;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    public int getIdLavador() {
        return idLavador;
    }

    public void setIdLavador(int idLavador) {
        this.idLavador = idLavador;
    }

    public String getFecha_lavada() {
        return fecha_lavada;
    }

    public void setFecha_lavada(String fecha_lavada) {
        this.fecha_lavada = fecha_lavada;
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

    public String getTipo_lavada() {
        return tipo_lavada;
    }

    public void setTipo_lavada(String tipo_lavada) {
        this.tipo_lavada = tipo_lavada;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }
    
    

    
    
   
    
    
}
