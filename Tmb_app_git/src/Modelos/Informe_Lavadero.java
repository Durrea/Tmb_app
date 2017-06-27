/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Santiago Ortega
 */
public class Informe_Lavadero {
    
    String lavador_names;
    float valor_total;

    public Informe_Lavadero(String lavador_names, float valor_total) {
        this.lavador_names = lavador_names;
        this.valor_total = valor_total;
    }

    public String getLavador_names() {
        return lavador_names;
    }

    public void setLavador_names(String lavador_names) {
        this.lavador_names = lavador_names;
    }


    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }
    
  
    
}
