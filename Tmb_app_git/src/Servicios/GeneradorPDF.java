/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class GeneradorPDF {
    
    private Document doc;
    private float tamTitulo;
    private float tamCuerpo;
    private float tamSubTitulos;
    public String ruta;
    
    public GeneradorPDF(Rectangle tam)
    {
        this.doc = new Document(tam);
        //this.doc.open();
    }
    public GeneradorPDF(Rectangle tam, float tamTitulos, float tamCuerpo, float tamSubTitulos)
    {
        this.doc = new Document(tam);
        this.tamTitulo = tamTitulos;
        this.tamCuerpo = tamCuerpo;
        this.tamSubTitulos = tamSubTitulos;
        //this.doc.open();
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public float getTamTitulo() {
        return tamTitulo;
    }

    public void setTamTitulo(float tamTitulo) {
        this.tamTitulo = tamTitulo;
    }

    public float getTamCuerpo() {
        return tamCuerpo;
    }

    public void setTamCuerpo(float tamCuerpo) {
        this.tamCuerpo = tamCuerpo;
    }

    public float getTamSubTitulos() {
        return tamSubTitulos;
    }

    public void setTamSubTitulos(float tamSubTitulos) {
        this.tamSubTitulos = tamSubTitulos;
    }
    
    public void openDoc()
    {
        this.doc.open();
    }
    public void closeDoc()
    {
        this.doc.close();
    }
    
    public void addParagrafo(String texto)
    {
        try {
            Font fuente = new Font();
            fuente.setSize(this.tamCuerpo);
            this.doc.add(new Paragraph(texto,fuente));
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        
    }
    public void AgregarCeldaTabla(String cabecera, PdfPTable tabla)
    {
        try {
            Font fuente = new Font();
            fuente.setSize(this.tamCuerpo);
            PdfPCell celda1 = new PdfPCell(new Paragraph(cabecera,fuente));
            tabla.addCell(celda1);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }     
    }
    public void addTable(PdfPTable tabla)
    {
        try 
        {
            this.doc.add(tabla);
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        
    }
    public void GenerarPDF(String path) throws FileNotFoundException
    {
        int random = (int) (Math.random()*9999999+1000000);
        String nombre = "reporte"+random+".pdf";
        try {
            FileOutputStream archivo = new FileOutputStream(path+"\\"+nombre);
            PdfWriter.getInstance(this.doc, archivo);
            this.ruta = path+"\\"+nombre;                        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        
    }
    public void addTitulo(String texto)
    {
        
        try {
            Font fuente = new Font();
            fuente.setSize(this.tamTitulo);
            fuente.setStyle(1);
            Paragraph obj = new Paragraph(texto,fuente);
            obj.setAlignment(Element.ALIGN_CENTER);
            this.doc.add(obj);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
    }
    public void addSubTitulo(String texto)
    {
        
        try {
            Font fuente = new Font();
            fuente.setSize(this.tamSubTitulos);
            Paragraph obj = new Paragraph(texto,fuente);
            obj.setAlignment(Element.ALIGN_CENTER);
            this.doc.add(obj);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
    }
}
