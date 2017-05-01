/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Eduardo
 */
public class ValidadorCadenas {
    
    public boolean ValidarCadenasPlaca(String cadena)
    {
        boolean resultado;
        if(cadena.length() == 6 || cadena.length() == 5)
        {
            if(cadena.length() == 6)
            {
                cadena = cadena.toUpperCase();
                int letras = 0;
                for(int i = 0;i<cadena.length()/2;i++)
                {
                    if(Character.isLetter(cadena.charAt(i)))
                    {
                        letras = letras + 1;
                    }
                }
                int numeros = 0;
                for(int i = cadena.length()/2;i<cadena.length();i++)
                {
                    if(Character.isDigit(cadena.charAt(i)))
                    {
                        numeros = numeros + 1;
                    }
                }
                if(letras != 3 || numeros < 2)
                {
                    resultado = false;
                }
                else
                {
                    if(Character.isDigit(cadena.charAt(cadena.length()-1)))
                    {
                        resultado = true;
                    }
                    else
                    {
                        if(Character.isLetter(cadena.charAt(cadena.length()-1)))
                        {
                            resultado = true;
                        }
                        else
                        {
                            resultado = false;
                        }
                    }
                }
            }
            else
            {
                cadena = cadena.toUpperCase();
                int letras = 0;
                for(int i = 0;i<3;i++)
                {
                    if(Character.isLetter(cadena.charAt(i)))
                    {
                        letras = letras + 1;
                    }
                }
                int numeros = 0;
                for(int i = 3;i<cadena.length();i++)
                {
                    if(Character.isDigit(cadena.charAt(i)))
                    {
                        numeros = numeros + 1;
                    }
                }
                if(letras != 3 || numeros != 2)
                {
                    resultado = false;
                }
                else
                {
                    resultado = true;
                }
            }
            
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }
    
}
