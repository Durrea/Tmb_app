/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Informacion_Fraccion;
import Servicios.Conexion;
import Servicios.ParquaderoFraccion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class Cargue_Datos_Fraccion {
    
    private ArrayList<Modelos.Informacion_Fraccion> datos_fraccion;
    private DefaultTableModel modelo; 
    public Cargue_Datos_Fraccion()
    {
        this.datos_fraccion = new ArrayList();
        modelo = new DefaultTableModel();
    }
    
    public JTable run(JTable tabla)
    {
       Connection con = null;
        try {
            ParquaderoFraccion obj_parq = new ParquaderoFraccion();
            con = Conexion.obtener();
            this.datos_fraccion = obj_parq.CargaInformacionPorFraccion(con);
            this.modelo.addColumn("ID");
            this.modelo.addColumn("Placa");
            this.modelo.addColumn("Tipo Vehiculo");
            this.modelo.addColumn("Fecha Entrada");
            this.modelo.addColumn("Fecha Salida");
            this.modelo.addColumn("Valor");
            for(int i=0;i<this.datos_fraccion.size();i++)
            {
                Object [] fila = new Object[5];
                fila[0] = this.datos_fraccion.get(i).getIdFraccion();
                fila[1] = this.datos_fraccion.get(i).getVehiculo_placa();
                fila[2] = this.datos_fraccion.get(i).getVehiculo_tipo();
                fila[3] = this.datos_fraccion.get(i).getFecha_entrada();
                fila[4] = this.datos_fraccion.get(i).getFecha_salida();
                fila[5] = this.datos_fraccion.get(i).getValor_pagar();
                this.modelo.addRow(fila);
            }
            tabla.setModel(this.modelo);
        } catch (Exception ex) {
            System.out.println("Error JTable");
        }
        return tabla;
    }

    public ArrayList<Informacion_Fraccion> getDatos_fraccion() {
        return datos_fraccion;
    }

    public void setDatos_fraccion(ArrayList<Informacion_Fraccion> datos_fraccion) {
        this.datos_fraccion = datos_fraccion;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }
    
}
