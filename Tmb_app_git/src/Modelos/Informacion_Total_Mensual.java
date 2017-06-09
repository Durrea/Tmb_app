/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Eduardo
 */
public class Informacion_Total_Mensual {
    
    private String cliente;
    private String placa;
    private String fecha_vencimiento;
    private double deuda;
    
    public Informacion_Total_Mensual()
    {
        
    }

    public Informacion_Total_Mensual(String cliente, String placa, String fecha_vencimiento, double deuda) {
        this.cliente = cliente;
        this.placa = placa;
        this.fecha_vencimiento = fecha_vencimiento;
        this.deuda = deuda;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }
    
}
