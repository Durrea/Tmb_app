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
public class Tarifa_parqueadero {
    
    //Atributos de la entidad Tarifa_parqueadero
    private int idTarifa;
    private String tipo_vehiculo;
    private float valor_mes;
    private float valor_hora;
    private float valor_dia;
    
    //Constructor por defecto
    public Tarifa_parqueadero()
    {}
    
    //Constructor parametrizado
    public Tarifa_parqueadero(int idTarifa, String tipo_vehiculo, float valor_mes, float valor_hora, float valor_dia) {
        this.idTarifa = idTarifa;
        this.tipo_vehiculo = tipo_vehiculo;
        this.valor_mes = valor_mes;
        this.valor_hora = valor_hora;
        this.valor_dia = valor_dia;
    }

    //Getter's and Setter's
    /**
     * @return the idTarifa
     */
    public int getIdTarifa() {
        return idTarifa;
    }

    /**
     * @param idTarifa the idTarifa to set
     */
    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    /**
     * @return the tipo_vehiculo
     */
    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    /**
     * @param tipo_vehiculo the tipo_vehiculo to set
     */
    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    /**
     * @return the valor_mes
     */
    public float getValor_mes() {
        return valor_mes;
    }

    /**
     * @param valor_mes the valor_mes to set
     */
    public void setValor_mes(float valor_mes) {
        this.valor_mes = valor_mes;
    }

    /**
     * @return the valor_hora
     */
    public float getValor_hora() {
        return valor_hora;
    }

    /**
     * @param valor_hora the valor_hora to set
     */
    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }

    /**
     * @return the valor_dia
     */
    public float getValor_dia() {
        return valor_dia;
    }

    /**
     * @param valor_dia the valor_dia to set
     */
    public void setValor_dia(float valor_dia) {
        this.valor_dia = valor_dia;
    }
    
    
}
