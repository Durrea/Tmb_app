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
public class Cliente {
 
    //Atributos de la entidad Cliente
    private int idCliente;
    private String cliente_nombre;
    private String cliente_telefono;
    private String cliente_cedula;
    
    //Constructor por defecto
    public Cliente()
    {}

    
    //Getter's and Setter'
    
    /**
     * @return the idcliente
     */
    public int getIdcliente() {
        return idCliente;
    }

    /**
     * @param idcliente the idcliente to set
     */
    public void setIdcliente(int idcliente) {
        this.idCliente = idcliente;
    }

    /**
     * @return the cliente_nombre
     */
    public String getCliente_nombre() {
        return cliente_nombre;
    }

    /**
     * @param cliente_nombre the cliente_nombre to set
     */
    public void setCliente_nombre(String cliente_nombre) {
        this.cliente_nombre = cliente_nombre;
    }

    /**
     * @return the cliente_telefono
     */
    public String getCliente_telefono() {
        return cliente_telefono;
    }

    /**
     * @param cliente_telefono the cliente_telefono to set
     */
    public void setCliente_telefono(String cliente_telefono) {
        this.cliente_telefono = cliente_telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente_cedula() {
        return cliente_cedula;
    }

    public void setCliente_cedula(String cliente_cedula) {
        this.cliente_cedula = cliente_cedula;
    }
    
    
    
}
