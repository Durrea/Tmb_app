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
    private Date fecha_lavada;
    private Date costo_lavada;
    private String tipo_lavada;
    private String tipo_pago;
    private String cancelada;
    
    //Constructor por defecto
    public Lava()
    {}
    
    //Constructor parametrizado
    public Lava(int idLavada, int idVehiculo, int idRecepcionista, int idLavador, Date fecha_lavada, Date costo_lavada, String tipo_lavada, String tipo_pago, String cancelada) {
        this.idLavada = idLavada;
        this.idVehiculo = idVehiculo;
        this.idRecepcionista = idRecepcionista;
        this.idLavador = idLavador;
        this.fecha_lavada = fecha_lavada;
        this.costo_lavada = costo_lavada;
        this.tipo_lavada = tipo_lavada;
        this.tipo_pago = tipo_pago;
        this.cancelada = cancelada;
    }

    //Getter's and Setter's
    /**
     * @return the idLavada
     */
    public int getIdLavada() {
        return idLavada;
    }

    /**
     * @param idLavada the idLavada to set
     */
    public void setIdLavada(int idLavada) {
        this.idLavada = idLavada;
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
     * @return the idLavador
     */
    public int getIdLavador() {
        return idLavador;
    }

    /**
     * @param idLavador the idLavador to set
     */
    public void setIdLavador(int idLavador) {
        this.idLavador = idLavador;
    }

    /**
     * @return the fecha_lavada
     */
    public Date getFecha_lavada() {
        return fecha_lavada;
    }

    /**
     * @param fecha_lavada the fecha_lavada to set
     */
    public void setFecha_lavada(Date fecha_lavada) {
        this.fecha_lavada = fecha_lavada;
    }

    /**
     * @return the costo_lavada
     */
    public Date getCosto_lavada() {
        return costo_lavada;
    }

    /**
     * @param costo_lavada the costo_lavada to set
     */
    public void setCosto_lavada(Date costo_lavada) {
        this.costo_lavada = costo_lavada;
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

    /**
     * @return the tipo_pago
     */
    public String getTipo_pago() {
        return tipo_pago;
    }

    /**
     * @param tipo_pago the tipo_pago to set
     */
    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    /**
     * @return the cancelada
     */
    public String getCancelada() {
        return cancelada;
    }

    /**
     * @param cancelada the cancelada to set
     */
    public void setCancelada(String cancelada) {
        this.cancelada = cancelada;
    }
    
    
    
    
}
