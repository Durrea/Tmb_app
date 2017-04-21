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
public class Mensualidad {
 
    //Atributos de la entidad Mensualidad
    private int idMensualidad;
    private int idVehiculo;
    private Date fecha_inicio;
    private Date fecha_fin;
    private float valor_pagar;
    private float valor_deuda;

    //Contructor por defecto
    public Mensualidad()
    {}
    
    //Constructor parametrizado
    public Mensualidad(int idMensualidad, int idVehiculo, Date fecha_inicio, 
            Date fecha_fin, float valor_pagar, float valor_deuda) {
        this.idMensualidad = idMensualidad;
        this.idVehiculo = idVehiculo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.valor_pagar = valor_pagar;
        this.valor_deuda = valor_deuda;
    }

    //Getter's and Setter's
    /**
     * @return the idMensualidad
     */
    public int getIdMensualidad() {
        return idMensualidad;
    }

    /**
     * @param idMensualidad the idMensualidad to set
     */
    public void setIdMensualidad(int idMensualidad) {
        this.idMensualidad = idMensualidad;
    }

    /**
     * @return the idVehiculo
     */
    public int getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * @param idVehiculo the idVehiculo to set
     */
    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    /**
     * @return the fecha_inicio
     */
    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_inicio the fecha_inicio to set
     */
    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return the fecha_fin
     */
    public Date getFecha_fin() {
        return fecha_fin;
    }

    /**
     * @param fecha_fin the fecha_fin to set
     */
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    /**
     * @return the valor_pagar
     */
    public float getValor_pagar() {
        return valor_pagar;
    }

    /**
     * @param valor_pagar the valor_pagar to set
     */
    public void setValor_pagar(float valor_pagar) {
        this.valor_pagar = valor_pagar;
    }

    /**
     * @return the valor_deuda
     */
    public float getValor_deuda() {
        return valor_deuda;
    }

    /**
     * @param valor_deuda the valor_deuda to set
     */
    public void setValor_deuda(float valor_deuda) {
        this.valor_deuda = valor_deuda;
    }
    
}
