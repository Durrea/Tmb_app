/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author DANIEL
 */
public class Informacion_hotel {

    private int numHabitacion;
    private float totalPagado;

    public Informacion_hotel() {
    }

    public Informacion_hotel(int numH, float totalP) {
        this.numHabitacion = numH;
        this.totalPagado = totalP;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public long getTotalPagado() {
        return (long) totalPagado;
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }

}
