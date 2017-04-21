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
public class Entradas_diarias {
    
    //Atributos de la relacion Entradas_diarias
    private int idEntradas;
    private int idVehiculo;
    private Date fecha_entrada;

    //Contructor por defecto
    public Entradas_diarias()
    {}
    
    //Contructor parametrizado
    public Entradas_diarias(int idEntradas, int idVehiculo, Date fecha_entrada) {
        this.idEntradas = idEntradas;
        this.idVehiculo = idVehiculo;
        this.fecha_entrada = fecha_entrada;
    }

    //Getter's and Setter's
    /**
     * @return the idEntradas
     */
    public int getIdEntradas() {
        return idEntradas;
    }

    /**
     * @param idEntradas the idEntradas to set
     */
    public void setIdEntradas(int idEntradas) {
        this.idEntradas = idEntradas;
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
   
}
