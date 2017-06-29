/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Informacion_Fraccion;
import Modelos.Informacion_hotel;
import Modelos.Recepcionista;
import Servicios.Administrador;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.ParquaderoFraccion;
import Servicios.S_Hotel;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Santiago Ortega
 */
public class ResultaInfHotel extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    ImageIcon ii;
    public int idRecep;
    TableRowSorter filter;
    int rown = -1;
    String fecha;
    int habitacion;

    public ResultaInfHotel(String fecha, int habitacion) {
        initComponents();
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.InformeDiarioFraccion(fecha,habitacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Ag1 = new javax.swing.JPanel();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(36, 47, 65));

        jPanel_Ag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Ag1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Ag1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Ag1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_Ag1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_Ag1MouseExited(evt);
            }
        });
        jPanel_Ag1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Ag1.add(jLabel_icn_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Volver");
        jPanel_Ag1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultado Reporte");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("En esta parte se encontrarán las entradas al hotel en un día en especifico por cada recepcionista.");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha: ");

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(325, 325, 325)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(342, 342, 342)
                            .addComponent(jPanel_Ag1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Ag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void jPanel_Ag1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseClicked

        InforDHotelRecep informes = new InforDHotelRecep();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(informes, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_Ag1MouseClicked

    private void jPanel_Ag1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add1.setIcon(ii);
    }//GEN-LAST:event_jPanel_Ag1MouseEntered

    private void jPanel_Ag1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add1.setIcon(ii);
    }//GEN-LAST:event_jPanel_Ag1MouseExited
    public void InformeDiarioFraccion(String fecha, int habitacion) {
        //Administrador objadmin = new Administrador();
        S_Hotel objHotel = new S_Hotel();
        //ArrayList<Recepcionista> listarecep = new ArrayList<Recepcionista>();
        ArrayList<Informacion_hotel> inforecep = new ArrayList<Informacion_hotel>();
        //listarecep = objadmin.GetInfoRecepcionista(Conexion.obtener());
        this.jLabel3.setText("Fecha: " + fecha);
        //for (int i = 0; i < listarecep.size(); i++) {
            JLabel nombrerecepcionista = new JLabel();
            nombrerecepcionista.setText("Habitacion: " + habitacion);
            nombrerecepcionista.setForeground(Color.WHITE);
            nombrerecepcionista.setFont(new java.awt.Font("Century Gothic", 1, 14));
            JPanel panel_title = new JPanel();
            GridLayout layout = new GridLayout();
            layout.setColumns(1);
            layout.setRows(0);
            panel_title.setLayout(layout);
            TitledBorder border = BorderFactory.createTitledBorder("Habitacion: " + habitacion);
            border.setTitleColor(Color.WHITE);
            panel_title.setBorder(border);
            inforecep = objHotel.LoadInfoPerRecepcionistaMensual(Conexion.obtener(), fecha, habitacion );
            JTable tabla;
            tabla = BuildTable(inforecep);
            JScrollPane scroll = new JScrollPane(tabla);
            panel_title.add(scroll);
            panel_title.setBackground(new Color(36, 47, 65));
            this.jPanel2.add(panel_title);
        //}
        this.jPanel2.updateUI();
    }

    public JTable BuildTable(ArrayList<Informacion_hotel> infoHotel) {
        JTable tabla = new JTable();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha entrada");
        modelo.addColumn("Hora entrada");
        Object[] fila = new Object[2];
        for (int i = 0; i < infoHotel.size(); i++) {
            fila[0] = infoHotel.get(i).getFechEntrada();
            fila[1] = infoHotel.get(i).getHoraEntrada();
            modelo.addRow(fila);
        }
        
           fila[0] = "";
           fila[1] = "";
        modelo.addRow(fila);
           fila[0] = "Cantidad de veces utilizada";
           fila[1] = infoHotel.size();
        modelo.addRow(fila);
        tabla.setModel(modelo);
        tabla.setVisible(true);
        return tabla;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Ag1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
