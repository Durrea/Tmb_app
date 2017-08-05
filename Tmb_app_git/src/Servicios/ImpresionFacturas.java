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
import javax.swing.JOptionPane;

public class ImpresionFacturas {

    public boolean FacturaFraccion(int tipo, String placa, int idrecep) {
        // tipo : 0 para entrada en fraccion y 1 para salida 
        boolean resultado;
        try
        {
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
                printer.printTextWrap(1, 2, 10, 50, "HOTEL, PARQUEADERO Y LAVADERO");
                printer.printTextWrap(2, 3, 11, 50, "LOS APOSENTOS DE LA VIRGEN");
                printer.printTextWrap(3, 4, 9, 50, "CALLE 17 No. 14-45 TIMBIO-CAUCA");
                printer.printTextWrap(4, 5, 20, 50, encabezado.get(1));
                printer.printTextWrap(5, 6, 1, 50, encabezado.get(2));
                //printer.printTextWrap(linI, linE, colI, colE, null);
                printer.printTextWrap(7, 8, 1, columnas, "RECEPCIONISTA: " + ultimoregistro.get(0));
                printer.printTextWrap(8, 9, 1, columnas, "PLACA: " + ultimoregistro.get(1));
                printer.printTextWrap(9, 10, 1, columnas, "TIPO DE VEHICULO: " + ultimoregistro.get(2));
                printer.printTextWrap(10, 11, 1, columnas, "FECHA ENTRADA: " + ultimoregistro.get(3));
                printer.printTextWrap(11, 12, 1, columnas, "FECHA SALIDA: " + ultimoregistro.get(4));
                if (!ultimoregistro.get(7).equalsIgnoreCase("0")&&!ultimoregistro.get(7).equalsIgnoreCase("---")) 
                {
                    printer.printTextWrap(12, 13, 1, columnas, "SUBTOTAL: " + ultimoregistro.get(6));
                    printer.printTextWrap(13, 14, 1, columnas, "VALOR IVA: " + ultimoregistro.get(7));
                    printer.printTextWrap(14, 15, 1, columnas, "VALOR COBRADO: " + ultimoregistro.get(5));
                    printer.printCharAtCol(16, 1, columnas, "=");
                    printer.printTextWrap(16, 17, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
                    printer.printTextWrap(17, 18, 12, columnas, "GRACIAS POR PREFERIRNOS!");
                }
                else
                {
                    printer.printTextWrap(12, 13, 1, columnas, "VALOR COBRADO: " + ultimoregistro.get(5));
                    printer.printCharAtCol(14, 1, columnas, "=");
                    printer.printTextWrap(14, 15, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
                    printer.printTextWrap(15, 16, 12, columnas, "GRACIAS POR PREFERIRNOS!");
                }            
                imprimirFactura(printer);
                resultado = true;
                return resultado;
            } else {
                resultado = false;
                return resultado;
            }   
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            resultado = false;
            return resultado;
        }
    }

    public boolean FacturaLavadero(int idLavada, int idrecep) {

        boolean resultado;
        Administrador servadmin = new Administrador();
        SLavadero lavadero = new SLavadero();
        ArrayList<String> encabezado = new ArrayList<String>();
        encabezado = servadmin.EncabezadoRecibos(Conexion.obtener());
        ArrayList<String> ultimoregistro = new ArrayList<String>();
        ultimoregistro = lavadero.LoadLastRecord(Conexion.obtener(), idLavada,idrecep);
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
            printer.printTextWrap(1, 2, 10, 50, "HOTEL, PARQUEADERO Y LAVADERO");
            printer.printTextWrap(2, 3, 11, 50, "LOS APOSENTOS DE LA VIRGEN");
            printer.printTextWrap(3, 4, 9, 50, "CALLE 17 No. 14-45 TIMBIO-CAUCA");
            printer.printTextWrap(4, 5, 20, 50, encabezado.get(1));
            printer.printTextWrap(5, 6, 1, 50, encabezado.get(2));
            //printer.printTextWrap(linI, linE, colI, colE, null);
            printer.printTextWrap(7, 8, 1, columnas, "RECEPCIONISTA: " + ultimoregistro.get(0));
            printer.printTextWrap(8, 9, 1, columnas, "PLACA: " + ultimoregistro.get(1));
            printer.printTextWrap(9, 10, 1, columnas, "LAVADOR: " + ultimoregistro.get(2));
            printer.printTextWrap(10, 11, 1, columnas, "FECHA SALIDA: " + ultimoregistro.get(3));
            printer.printTextWrap(11, 12, 1, columnas, "TIPO DE LAVADA: " + ultimoregistro.get(4));
            if (!ultimoregistro.get(6).equalsIgnoreCase("0")) {
                printer.printTextWrap(12, 13, 1, columnas, "SUBTOTAL: " + ultimoregistro.get(5));
                printer.printTextWrap(13, 14, 1, columnas, "VALOR IVA: " + ultimoregistro.get(6));
                printer.printTextWrap(14, 15, 1, columnas, "VALOR COBRADO: " + ultimoregistro.get(7));
                printer.printCharAtCol(16, 1, columnas, "=");
                printer.printTextWrap(16, 17, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
                printer.printTextWrap(17, 18, 12, columnas, "GRACIAS POR PREFERIRNOS!");
            } else {
                printer.printTextWrap(12, 13, 1, columnas, "VALOR COBRADO: " + ultimoregistro.get(7));
                printer.printCharAtCol(14, 1, columnas, "=");
                printer.printTextWrap(14, 15, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
                printer.printTextWrap(15, 16, 12, columnas, "GRACIAS POR PREFERIRNOS!");
            }
            imprimirFactura(printer);
            resultado = true;
            return resultado;
        } else {
            resultado = false;
            return resultado;
        }
    }
    
    public boolean FacturaLavadero(int idrecep) {

        boolean resultado;
        Administrador servadmin = new Administrador();
        SLavadero lavadero = new SLavadero();
        ArrayList<String> encabezado = new ArrayList<String>();
        encabezado = servadmin.EncabezadoRecibos(Conexion.obtener());
        ArrayList<String> ultimoregistro = new ArrayList<String>();
        ultimoregistro = lavadero.LoadLastRecord(Conexion.obtener(),idrecep);
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
            printer.printTextWrap(1, 2, 10, 50, "HOTEL, PARQUEADERO Y LAVADERO");
            printer.printTextWrap(2, 3, 11, 50, "LOS APOSENTOS DE LA VIRGEN");
            printer.printTextWrap(3, 4, 9, 50, "CALLE 17 No. 14-45 TIMBIO-CAUCA");
            printer.printTextWrap(4, 5, 20, 50, encabezado.get(1));
            printer.printTextWrap(5, 6, 1, 50, encabezado.get(2));
            //printer.printTextWrap(linI, linE, colI, colE, null);
            printer.printTextWrap(7, 8, 1, columnas, "RECEPCIONISTA: " + ultimoregistro.get(0));
            printer.printTextWrap(8, 9, 1, columnas, "PLACA: " + ultimoregistro.get(1));
            printer.printTextWrap(9, 10, 1, columnas, "FECHA ENTRADA: " + ultimoregistro.get(2));
            printer.printCharAtCol(11, 1, columnas, "=");
            printer.printTextWrap(11, 12, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
            printer.printTextWrap(12, 13, 12, columnas, "GRACIAS POR PREFERIRNOS!");
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
            printer.printTextWrap(1, 2, 10, 50, "HOTEL, PARQUEADERO Y LAVADERO");
            printer.printTextWrap(2, 3, 11, 50, "LOS APOSENTOS DE LA VIRGEN");
            printer.printTextWrap(3, 4, 9, 50, "CALLE 17 No. 14-45 TIMBIO-CAUCA");
            printer.printTextWrap(4, 5, 20, 50, encabezado.get(1));
            printer.printTextWrap(5, 6, 1, 50, encabezado.get(2));
            //printer.printTextWrap(linI, linE, colI, colE, null);
            printer.printTextWrap(7, 8, 1, columnas, "RECEPCIONISTA: " + ultimoregistro.get(0));
            printer.printTextWrap(8, 9, 1, columnas, "HABITACION: " + ultimoregistro.get(1));
            printer.printTextWrap(9, 10, 1, columnas, "N° PERSONAS: " + ultimoregistro.get(2));
            printer.printTextWrap(10, 11, 1, columnas, "TIEMPO DE HOSPEDAJE");
            printer.printTextWrap(11, 12, 1, columnas, "DIAS: " + ultimoregistro.get(3));
            printer.printTextWrap(12, 13, 1, columnas, "HORAS: " + ultimoregistro.get(4));
            printer.printTextWrap(13, 14, 1, columnas, "PLACA VEHICULO: " + ultimoregistro.get(8));
            printer.printTextWrap(14, 15, 1, columnas, "TIPO VEHICULO: " + ultimoregistro.get(9));
            if (!ultimoregistro.get(6).equalsIgnoreCase("0")) {
                printer.printTextWrap(15, 16, 1, columnas, "SUBTOTAL: " + ultimoregistro.get(5));
                printer.printTextWrap(16, 17, 1, columnas, "VALOR IVA: " + ultimoregistro.get(6));
                printer.printTextWrap(17, 18, 1, columnas, "VALOR COBRADO: " + ultimoregistro.get(7));
                printer.printCharAtCol(19, 1, columnas, "=");
                printer.printTextWrap(19, 20, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
                printer.printTextWrap(20, 21, 12, columnas, "GRACIAS POR PREFERIRNOS!");
            } else {
                printer.printTextWrap(15, 16, 1, columnas, "VALOR COBRADO: " + ultimoregistro.get(7));
                printer.printCharAtCol(17, 1, columnas, "=");
                printer.printTextWrap(17, 18, 7, columnas, "CON ESTE RECIBO RECLAME SU VEHICULO");
                printer.printTextWrap(18, 19, 12, columnas, "GRACIAS POR PREFERIRNOS!");
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
        String ruta = System.getProperty("user.home");
        printer.toFile(ruta+"\\impresion.txt");
        /*FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(ruta+"\\impresion.txt");
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
