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
public class Ingreso_fraccion {

    //Atributos de la relacion Ingresio_fraccion
    private int idFraccion;
    private int idVehiculo;
    private int idRecepcionista;
    private Date fecha_entrada;
    private Date fecha_salida;
    private float valor_pagar;
    
    //Contructor por defecto
    public Ingreso_fraccion()
    {}
    
    //Contructor parametrizado
    public Ingreso_fraccion(int idFraccion, int idVehiculo, int idRecepcionista, 
            Date fecha_entrada, Date fecha_salida, float valor_pagar) {
        this.idFraccion = idFraccion;
        this.idVehiculo = idVehiculo;
        this.idRecepcionista = idRecepcionista;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.valor_pagar = valor_pagar;
    }

    
    //Getter's and Setter's
    /**
     * @return the idFraccion
     */
    public int getIdFraccion() {
        return idFraccion;
    }

    /**
     * @param idFraccion the idFraccion to set
     */
    public void setIdFraccion(int idFraccion) {
        this.idFraccion = idFraccion;
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
    
    
    
    
    
}
