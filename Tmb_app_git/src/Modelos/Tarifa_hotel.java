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
public class Tarifa_hotel {
    
    //Atributos de la entidad Tarifa_hotel
    private int idTarifa_hotel;
    private int numero_habitacion;
    private float costo_hora;
    private float costo_dia;
    
    //Constructor por defecto
    public Tarifa_hotel(int idTarifa_hotel, int numero_habitacion, float costo_hora, float costo_dia) {
        this.idTarifa_hotel = idTarifa_hotel;
        this.numero_habitacion = numero_habitacion;
        this.costo_hora = costo_hora;
        this.costo_dia = costo_dia;
    }
    
    //Getter's and Setter's
    /**
     * @return the idTarifa_hotel
     */
    public int getIdTarifa_hotel() {
        return idTarifa_hotel;
    }

    /**
     * @param idTarifa_hotel the idTarifa_hotel to set
     */
    public void setIdTarifa_hotel(int idTarifa_hotel) {
        this.idTarifa_hotel = idTarifa_hotel;
    }

    /**
     * @return the numero_habitacion
     */
    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    /**
     * @param numero_habitacion the numero_habitacion to set
     */
    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    /**
     * @return the costo_hora
     */
    public float getCosto_hora() {
        return costo_hora;
    }

    /**
     * @param costo_hora the costo_hora to set
     */
    public void setCosto_hora(float costo_hora) {
        this.costo_hora = costo_hora;
    }

    /**
     * @return the costo_dia
     */
    public float getCosto_dia() {
        return costo_dia;
    }

    /**
     * @param costo_dia the costo_dia to set
     */
    public void setCosto_dia(float costo_dia) {
        this.costo_dia = costo_dia;
    }
    
    
    
}
