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
public class Registra {
    
    //Atributos de la relacion Registra
    private int idRegistra;
    private int idHabitacion;
    private int idRecepcionista;
    private Date fecha_entrada;
    private Date fecha_salida;
    private int numero_personas;
    private float costo;
    private String tipo_servicio;
    
    //Constructor por defecto
    public Registra()
    {}
    
    //Constructor parametrizado
    public Registra(int idRegistra, int idHabitacion, int idRecepcionista, Date fecha_entrada, Date fecha_salida, int numero_personas, float costo, String tipo_servicio) {
        this.idRegistra = idRegistra;
        this.idHabitacion = idHabitacion;
        this.idRecepcionista = idRecepcionista;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.numero_personas = numero_personas;
        this.costo = costo;
        this.tipo_servicio = tipo_servicio;
    }

    //Getter's and Setter's
    /**
     * @return the idRegistra
     */
    public int getIdRegistra() {
        return idRegistra;
    }

    /**
     * @param idRegistra the idRegistra to set
     */
    public void setIdRegistra(int idRegistra) {
        this.idRegistra = idRegistra;
    }

    /**
     * @return the idHabitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @param idHabitacion the idHabitacion to set
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * @return the idRecepcionista
     */
    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    /**
     * @param idRecepcionista the idRecepcionista to set
     */
    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    /**
     * @return the fecha_entrada
     */
    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    /**
     * @param fecha_entrada the fecha_entrada to set
     */
    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    /**
     * @return the fecha_salida
     */
    public Date getFecha_salida() {
        return fecha_salida;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    /**
     * @return the numero_personas
     */
    public int getNumero_personas() {
        return numero_personas;
    }

    /**
     * @param numero_personas the numero_personas to set
     */
    public void setNumero_personas(int numero_personas) {
        this.numero_personas = numero_personas;
    }

    /**
     * @return the costo
     */
    public float getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * @return the tipo_servicio
     */
    public String getTipo_servicio() {
        return tipo_servicio;
    }

    /**
     * @param tipo_servicio the tipo_servicio to set
     */
    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
    
    
}
