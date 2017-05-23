/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmb_app;

import Servicios.ValidadorCadenas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Eduardo
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*String cadena = "Hola";
        String exp = "\\-";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(cadena);
        System.out.println(m.find());*/
        String cadena = "AAA244s";
        //System.out.println(cadena.toUpperCase());
        ValidadorCadenas obj = new ValidadorCadenas();
        System.out.println(obj.ValidarCadenasPlaca(cadena));
        System.out.println("Cambio Santiago");
        System.out.println("Prueba");
        System.out.println("Prueba");
        System.out.println("Prueba");
        System.out.println("Prueba de nuevo");
        System.out.println("Prueba de nuevo");
        System.out.println("Prueba de nuevo");
        
    }
    //Esto es un comentario
}
