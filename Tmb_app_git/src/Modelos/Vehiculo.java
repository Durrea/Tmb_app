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
public class Vehiculo {
    
    //Atributos de la entidad Vehiculo
    private int idVehiculo;
    private int idCliente;
    private String vehiculo_placa;
    private String vehiculo_tipo;
    private String vehiculo_color;
    private String vehiculo_marca;
    private String vehiculo_estado;
    
    
    //Contructor por defecto
    public Vehiculo()
    {}
    
    //Contructor parametrizado
    public Vehiculo(int idVehiculo, int idCliente, String vehiculo_placa, 
            String vehiculo_tipo, String vehiculo_color, String vehiculo_marca, 
            String vehiculo_estado) {
        this.idVehiculo = idVehiculo;
        this.idCliente = idCliente;
        this.vehiculo_placa = vehiculo_placa;
        this.vehiculo_tipo = vehiculo_tipo;
        this.vehiculo_color = vehiculo_color;
        this.vehiculo_marca = vehiculo_marca;
        this.vehiculo_estado = vehiculo_estado;
    }
    
    //Getter's and Setter's

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
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the vehiculo_placa
     */
    public String getVehiculo_placa() {
        return vehiculo_placa;
    }

    /**
     * @param vehiculo_placa the vehiculo_placa to set
     */
    public void setVehiculo_placa(String vehiculo_placa) {
        this.vehiculo_placa = vehiculo_placa;
    }

    /**
     * @return the vehiculo_tipo
     */
    public String getVehiculo_tipo() {
        return vehiculo_tipo;
    }

    /**
     * @param vehiculo_tipo the vehiculo_tipo to set
     */
    public void setVehiculo_tipo(String vehiculo_tipo) {
        this.vehiculo_tipo = vehiculo_tipo;
    }

    /**
     * @return the vehiculo_color
     */
    public String getVehiculo_color() {
        return vehiculo_color;
    }

    /**
     * @param vehiculo_color the vehiculo_color to set
     */
    public void setVehiculo_color(String vehiculo_color) {
        this.vehiculo_color = vehiculo_color;
    }

    /**
     * @return the vehiculo_marca
     */
    public String getVehiculo_marca() {
        return vehiculo_marca;
    }

    /**
     * @param vehiculo_marca the vehiculo_marca to set
     */
    public void setVehiculo_marca(String vehiculo_marca) {
        this.vehiculo_marca = vehiculo_marca;
    }

    /**
     * @return the vehiculo_estado
     */
    public String getVehiculo_estado() {
        return vehiculo_estado;
    }

    /**
     * @param vehiculo_estado the vehiculo_estado to set
     */
    public void setVehiculo_estado(String vehiculo_estado) {
        this.vehiculo_estado = vehiculo_estado;
    }
    
    
}
