/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author hp
 */
public class Tarifa_lavadero {
 
    //Atributos de la entidad Tarifa_lavadero
    private int idTarifa;
    private String tipo_vehiculo;
    private float valor_lavada;
    private String tipo_lavada;
    
    //Constructor por defecto
    public Tarifa_lavadero() 
    {}

    //Constructor parametrizado
    public Tarifa_lavadero(int idTarifa, String tipo_vehiculo, float valor_lavada, String tipo_lavada) {
        this.idTarifa = idTarifa;
        this.tipo_vehiculo = tipo_vehiculo;
        this.valor_lavada = valor_lavada;
        this.tipo_lavada = tipo_lavada;
    }

    //Getter's and Setter's
    /**
     * @return the idTarifa
     */
    public int getIdTarifa() {
        return idTarifa;
    }

    /**
     * @param idTarifa the idTarifa to set
     */
    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    /**
     * @return the tipo_vehiculo
     */
    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    /**
     * @param tipo_vehiculo the tipo_vehiculo to set
     */
    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    /**
     * @return the valor_lavada
     */
    public float getValor_lavada() {
        return valor_lavada;
    }

    /**
     * @param valor_lavada the valor_lavada to set
     */
    public void setValor_lavada(float valor_lavada) {
        this.valor_lavada = valor_lavada;
    }

    /**
     * @return the tipo_lavada
     */
    public String getTipo_lavada() {
        return tipo_lavada;
    }

    /**
     * @param tipo_lavada the tipo_lavada to set
     */
    public void setTipo_lavada(String tipo_lavada) {
        this.tipo_lavada = tipo_lavada;
    }
    
    
    
    
    
}
