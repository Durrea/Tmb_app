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
import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
public class ImpresionFacturas {
    
    public boolean FacturaFraccion(int tipo, int idfrac){
        // tipo : 0 para entrada en fraccion y 1 para salida 
        boolean resultado;
        Administrador servadmin = new Administrador();
        ParquaderoFraccion serparqfraccion = new ParquaderoFraccion();
        ArrayList<String> encabezado = new ArrayList<String>();
        encabezado = servadmin.EncabezadoRecibos(Conexion.obtener());
        ArrayList<String> ultimoregistro = new ArrayList<String>();
        ultimoregistro = serparqfraccion.LoadLastRecord(Conexion.obtener(), tipo, idfrac);        
        int columnas = 48;
        int lineas = 20;
        if(encabezado.size() != 0 && ultimoregistro.size() != 0)
        {
            /*Datos a imprimir*/
            PrinterMatrix printer = new PrinterMatrix();
            Extenso e = new Extenso();
            e.setNumber(101.85);
            //Definir el tamanho del papel para la impresion  aca 25 lineas y 80 columnas
            printer.setOutSize(lineas, columnas);
            //Imprimir * de la 2da linea a 25 en la columna 1;
            // printer.printCharAtLin(2, 25, 1, "*");
            //Imprimir * 1ra linea de la columa de 1 a 80
            printer.printCharAtCol(1, 1, columnas, "=");
            //Imprimir Encabezado nombre del La EMpresa
            printer.printTextWrap(1, 2, 20, 50, "LA VIRGEN");
            printer.printTextWrap(2, 3, 20, 50, encabezado.get(1));
            printer.printTextWrap(3, 4, 20, 50, encabezado.get(2));
            //printer.printTextWrap(linI, linE, colI, colE, null);
            printer.printTextWrap(4, 5, 1, columnas, "Placa: " + ultimoregistro.get(0));
            printer.printTextWrap(5, 6, 1, columnas, "Tipo de vehiculo: " + ultimoregistro.get(1));
            printer.printTextWrap(6, 7, 1, columnas, "Fecha Entrada: " + ultimoregistro.get(2));
            printer.printTextWrap(7, 8, 1, columnas, "Fecha Salida: "+ ultimoregistro.get(3));
            printer.printTextWrap(8, 9, 1, columnas, "Valor a cobrar: " + ultimoregistro.get(4));                   
            printer.printCharAtCol(10, 1, columnas, "=");
            imprimirFactura(printer);
            resultado = true;
            return resultado;
        }
        else
        {
            resultado = false;
            return resultado;
        }                     
    }
    public void imprimirFactura(PrinterMatrix printer)
    {
        printer.toFile("impresion.txt");
        /*FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream("impresion.txt");
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            if (inputStream == null) {
                return;
            }
            DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
            Doc document = new SimpleDoc(inputStream, docFormat, null);
            PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
            PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();
            if (defaultPrintService != null) {
                DocPrintJob printJob = defaultPrintService.createPrintJob();
                try {
                    printJob.print(document, attributeSet);

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("No existen impresoras instaladas");
            }*/
    }
}
