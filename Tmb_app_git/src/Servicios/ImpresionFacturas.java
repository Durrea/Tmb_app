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

    public boolean FacturaFraccion(int tipo, String placa, int idrecep) {
        // tipo : 0 para entrada en fraccion y 1 para salida 
        boolean resultado;
        Administrador servadmin = new Administrador();
        ParquaderoFraccion serparqfraccion = new ParquaderoFraccion();
        ArrayList<String> encabezado = new ArrayList<String>();
        encabezado = servadmin.EncabezadoRecibos(Conexion.obtener());
        ArrayList<String> ultimoregistro = new ArrayList<String>();
        ultimoregistro = serparqfraccion.LoadLastRecord(Conexion.obtener(), tipo, placa,idrecep);
        int columnas = 48;
        int lineas = 20;
        if (encabezado.size() != 0 && ultimoregistro.size() != 0) {
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
            printer.printTextWrap(4, 5, 1, columnas, "Recepcionista: " + ultimoregistro.get(0));
            printer.printTextWrap(5, 6, 1, columnas, "Placa: " + ultimoregistro.get(1));
            printer.printTextWrap(6, 7, 1, columnas, "Tipo de vehiculo: " + ultimoregistro.get(2));
            printer.printTextWrap(7, 8, 1, columnas, "Fecha Entrada: " + ultimoregistro.get(3));
            printer.printTextWrap(8, 9, 1, columnas, "Fecha Salida: " + ultimoregistro.get(4));
            if (!ultimoregistro.get(7).equalsIgnoreCase("0")&&!ultimoregistro.get(7).equalsIgnoreCase("---")) 
            {
                printer.printTextWrap(9, 10, 1, columnas, "SubTotal: " + ultimoregistro.get(6));
                printer.printTextWrap(10, 11, 1, columnas, "Valor iva: " + ultimoregistro.get(7));
                printer.printTextWrap(11, 12, 1, columnas, "Valor Cobrado: " + ultimoregistro.get(5));
                printer.printCharAtCol(13, 1, columnas, "=");
            }
            else
            {
                printer.printTextWrap(9, 10, 1, columnas, "Valor Cobrado: " + ultimoregistro.get(5));
                printer.printCharAtCol(11, 1, columnas, "=");
            }            
            imprimirFactura(printer);
            resultado = true;
            return resultado;
        } else {
            resultado = false;
            return resultado;
        }
    }

    public boolean FacturaLavadero(int idLavada) {

        boolean resultado;
        Administrador servadmin = new Administrador();
        SLavadero lavadero = new SLavadero();
        ArrayList<String> encabezado = new ArrayList<String>();
        encabezado = servadmin.EncabezadoRecibos(Conexion.obtener());
        ArrayList<String> ultimoregistro = new ArrayList<String>();
        ultimoregistro = lavadero.LoadLastRecord(Conexion.obtener(), idLavada);
        //ultimoregistro = serparqfraccion.LoadLastRecord(Conexion.obtener(), tipo, placa);        
        int columnas = 48;
        int lineas = 20;
        if (encabezado.size() != 0 && ultimoregistro.size() != 0) {
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
            printer.printTextWrap(5, 6, 1, columnas, "Lavador: " + ultimoregistro.get(1) + " " + ultimoregistro.get(2));
            printer.printTextWrap(6, 7, 1, columnas, "Fecha Lavada: " + ultimoregistro.get(3));
            printer.printTextWrap(7, 8, 1, columnas, "Tipo de Lavada: " + ultimoregistro.get(4));
            printer.printTextWrap(8, 9, 1, columnas, "Valor Cobrado: " + ultimoregistro.get(5));
            printer.printCharAtCol(10, 1, columnas, "=");
            imprimirFactura(printer);
            resultado = true;
            return resultado;
        } else {
            resultado = false;
            return resultado;
        }
    }

    public boolean FacturaHotel(int idRegistro) {

        boolean resultado;
        Administrador servadmin = new Administrador();
        S_Hotel servicio = new S_Hotel();
        ArrayList<String> encabezado = new ArrayList<String>();
        encabezado = servadmin.EncabezadoRecibos(Conexion.obtener());
        ArrayList<String> ultimoregistro = new ArrayList<String>();
        ultimoregistro = servicio.LoadLastRecord(Conexion.obtener(), idRegistro, Sesion.getInstanciaSesion().getIdentificador());
        //ultimoregistro = serparqfraccion.LoadLastRecord(Conexion.obtener(), tipo, placa);        
        int columnas = 48;
        int lineas = 20;
        if (encabezado.size() != 0 && ultimoregistro.size() != 0) {
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
            printer.printTextWrap(4, 5, 1, columnas, "Recepcionista: " + ultimoregistro.get(0));
            printer.printTextWrap(5, 6, 1, columnas, "Habitacion: " + ultimoregistro.get(1));
            printer.printTextWrap(6, 7, 1, columnas, "N° personas: " + ultimoregistro.get(2));
            printer.printTextWrap(7, 8, 1, columnas, "Tiempo de hospedaje");
            printer.printTextWrap(8, 9, 1, columnas, "Dias: " + ultimoregistro.get(3));
            printer.printTextWrap(9, 10, 1, columnas, "Horas: " + ultimoregistro.get(4));
            if (!ultimoregistro.get(6).equalsIgnoreCase("0")) {
                printer.printTextWrap(10, 11, 1, columnas, "SubTotal: " + ultimoregistro.get(5));
                printer.printTextWrap(11, 12, 1, columnas, "Valor iva: " + ultimoregistro.get(6));
                printer.printTextWrap(12, 13, 1, columnas, "Valor Cobrado: " + ultimoregistro.get(7));
                printer.printCharAtCol(14, 1, columnas, "=");
            } else {
                printer.printTextWrap(10, 11, 1, columnas, "Valor Cobrado: " + ultimoregistro.get(7));
                printer.printCharAtCol(12, 1, columnas, "=");
            }

            imprimirFactura(printer);
            resultado = true;
            return resultado;
        } else {
            resultado = false;
            return resultado;
        }
    }

    public void imprimirFactura(PrinterMatrix printer) {
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
