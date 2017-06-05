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
public class Habitacion {
    
    //Atributos de la entidad Habitacion
    private int idHabitacion;
    private int habitacion_numero;
    private int habitacion_capacidad;
    private String habitacion_estado;
    
    
    //Constructor por defecto
    public Habitacion()
    {}

    //Constructor parametrizado
    public Habitacion(int idHabitacion, int habitacion_numero, int habitacion_capacidad, String habitacion_estado) {
        this.idHabitacion = idHabitacion;
        this.habitacion_numero = habitacion_numero;
        this.habitacion_capacidad = habitacion_capacidad;
        this.habitacion_estado = habitacion_estado;
    }

    //Getter's and Setter's
    /**
     * @return the idHabitacion
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /**
     * @param idHabitacion the idHabitacion to set
     */
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * @return the habitacion_numero
     */
    public int getHabitacion_numero() {
        return habitacion_numero;
    }

    /**
     * @param habitacion_numero the habitacion_numero to set
     */
    public void setHabitacion_numero(int habitacion_numero) {
        this.habitacion_numero = habitacion_numero;
    }

    /**
     * @return the habitacion_capacidad
     */
    public int getHabitacion_capacidad() {
        return habitacion_capacidad;
    }

    /**
     * @param habitacion_capacidad the habitacion_capacidad to set
     */
    public void setHabitacion_capacidad(int habitacion_capacidad) {
        this.habitacion_capacidad = habitacion_capacidad;
    }

    /**
     * @return the habitacion_estado
     */
    public String getHabitacion_estado() {
        return habitacion_estado;
    }

    /**
     * @param habitacion_estado the habitacion_estado to set
     */
    public void setHabitacion_estado(String habitacion_estado) {
        this.habitacion_estado = habitacion_estado;
    }
    
   
}
