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
public class Encabezado_recibo {
    
    //Atributos de la entidad Encabezado_recibo
    private int idEncabezado;
    private float valor_iva;
    private String nit;
    private String descripcion;
    
    //Constructor por defecto
    public Encabezado_recibo() 
    {}
    
    //Constructor parametrizado
    public Encabezado_recibo(int idEncabezado, float valor_iva, String nit, String descripcion) {
        this.idEncabezado = idEncabezado;
        this.valor_iva = valor_iva;
        this.nit = nit;
        this.descripcion = descripcion;
    }
    
    //Getter's and Setter's
    /**
     * @return the idEncabezado
     */
    public int getIdEncabezado() {
        return idEncabezado;
    }

    /**
     * @param idEncabezado the idEncabezado to set
     */
    public void setIdEncabezado(int idEncabezado) {
        this.idEncabezado = idEncabezado;
    }

    /**
     * @return the valor_iva
     */
    public float getValor_iva() {
        return valor_iva;
    }

    /**
     * @param valor_iva the valor_iva to set
     */
    public void setValor_iva(float valor_iva) {
        this.valor_iva = valor_iva;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
