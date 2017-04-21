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
public class Ingreso_mensual {
    
    //Atributos de la relacion Ingreso_mensual;
    private int inMensual;
    private int idVehiculo;
    private int idRecepcionista;
    private Date fecha;
    private float valor;
    
    //Contructor por defecto
    public Ingreso_mensual()
    {}
    
    //Constructor parametrizado
    public Ingreso_mensual(int inMensual, int idVehiculo, int idRecepcionista, 
            Date fecha, float valor) {
        this.inMensual = inMensual;
        this.idVehiculo = idVehiculo;
        this.idRecepcionista = idRecepcionista;
        this.fecha = fecha;
        this.valor = valor;
    }

    //Getter's and Setter's
    /**
     * @return the inMensual
     */
    public int getInMensual() {
        return inMensual;
    }

    /**
     * @param inMensual the inMensual to set
     */
    public void setInMensual(int inMensual) {
        this.inMensual = inMensual;
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
