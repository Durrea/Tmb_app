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
public class Administrador {
 
    //Atributos de la entidad Administrador
    private int idAdministrador;
    private String nombre_usuario;
    private String contrasenia;
    
    //Constructor por defecto
    public Administrador()
    {}
    
    //Constructor parametrizado
    public Administrador(int idAdministrador, String nombre_usuario, String contrasenia) {
        this.idAdministrador = idAdministrador;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }
    
    //Getter's and Setter's
    /**
     * @return the idAdministrador
     */
    public int getIdAdministrador() {
        return idAdministrador;
    }

    /**
     * @param idAdministrador the idAdministrador to set
     */
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
}
