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
public class Recepcionista {
    
    //Atribuos de la entidad Recepcionista
    private int idRecepcionista;
    private String recepcionista_nombres;
    private String recepcionista_apellidos;
    private String recepcionista_usuario;
    private String recepcionista_contrasenia;
    
    //Constructor por defecto
    public Recepcionista()
    {}
    
    //Constructor parametrizado
    public Recepcionista(int idRecepcionista, String recepcionista_nombres, String 
            recepcionista_apellidos, String recepcionista_usuario, String recepcionista_contrasenia)
    {
        this.idRecepcionista = idRecepcionista;
        this.recepcionista_nombres = recepcionista_nombres;
        this.recepcionista_apellidos = recepcionista_apellidos;
        this.recepcionista_usuario = recepcionista_usuario;
        this.recepcionista_contrasenia = recepcionista_contrasenia;
    }
    public Recepcionista(int idRecepcionista, String recepcionista_nombres, String 
            recepcionista_apellidos)
    {
        this.idRecepcionista = idRecepcionista;
        this.recepcionista_nombres = recepcionista_nombres;
        this.recepcionista_apellidos = recepcionista_apellidos;        
    }

    //Getter's and Setter's
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
     * @return the recepcionista_nombres
     */
    public String getRecepcionista_nombres() {
        return recepcionista_nombres;
    }

    /**
     * @param recepcionista_nombres the recepcionista_nombres to set
     */
    public void setRecepcionista_nombres(String recepcionista_nombres) {
        this.recepcionista_nombres = recepcionista_nombres;
    }

    /**
     * @return the recepcionista_apellidos
     */
    public String getRecepcionista_apellidos() {
        return recepcionista_apellidos;
    }

    /**
     * @param recepcionista_apellidos the recepcionista_apellidos to set
     */
    public void setRecepcionista_apellidos(String recepcionista_apellidos) {
        this.recepcionista_apellidos = recepcionista_apellidos;
    }

    /**
     * @return the recepcionista_usuario
     */
    public String getRecepcionista_usuario() {
        return recepcionista_usuario;
    }

    /**
     * @param recepcionista_usuario the recepcionista_usuario to set
     */
    public void setRecepcionista_usuario(String recepcionista_usuario) {
        this.recepcionista_usuario = recepcionista_usuario;
    }

    /**
     * @return the recepcionista_contrasenia
     */
    public String getRecepcionista_contrasenia() {
        return recepcionista_contrasenia;
    }

    /**
     * @param recepcionista_contrasenia the recepcionista_contrasenia to set
     */
    public void setRecepcionista_contrasenia(String recepcionista_contrasenia) {
        this.recepcionista_contrasenia = recepcionista_contrasenia;
    }
    
    
    
}
