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
public class Lavador {
    
    //Atributos de la entidad Lavador
    private int idLavador;
    private int lavador_codigo;
    private String lavador_nombre;
    private String lavador_apellido;
    
    //Contructor por defecto
    public Lavador()
    {}
    
    //Constructor parametrizado
    public Lavador(int idLavador, int lavador_codigo, String lavador_nombre, String lavador_apellido) {
        this.idLavador = idLavador;
        this.lavador_codigo = lavador_codigo;
        this.lavador_nombre = lavador_nombre;
        this.lavador_apellido = lavador_apellido;
    }

    
    //Getter's and Setter's
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
     * @return the lavador_codigo
     */
    public int getLavador_codigo() {
        return lavador_codigo;
    }

    /**
     * @param lavador_codigo the lavador_codigo to set
     */
    public void setLavador_codigo(int lavador_codigo) {
        this.lavador_codigo = lavador_codigo;
    }

    /**
     * @return the lavador_nombre
     */
    public String getLavador_nombre() {
        return lavador_nombre;
    }

    /**
     * @param lavador_nombre the lavador_nombre to set
     */
    public void setLavador_nombre(String lavador_nombre) {
        this.lavador_nombre = lavador_nombre;
    }

    /**
     * @return the lavador_apellido
     */
    public String getLavador_apellido() {
        return lavador_apellido;
    }

    /**
     * @param lavador_apellido the lavador_apellido to set
     */
    public void setLavador_apellido(String lavador_apellido) {
        this.lavador_apellido = lavador_apellido;
    }
    
    
    
    
}
