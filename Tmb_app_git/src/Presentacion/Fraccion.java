/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Santiago Ortega
 */
public class Fraccion extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    
    ImageIcon ii;
    public int idRecep;
    TableRowSorter filter;
    
    public Fraccion(ArrayList<Modelos.Informacion_Fraccion> datos) {
        initComponents();
        LoadDataTable(datos);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Informe = new javax.swing.JPanel();
        jLabel_icn_inf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_Ag1 = new javax.swing.JPanel();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botonTerminar1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Informe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Informe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_InformeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_InformeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_InformeMouseExited(evt);
            }
        });
        jPanel_Informe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_inf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"))); // NOI18N
        jPanel_Informe.add(jLabel_icn_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Generar Informe Diario");
        jPanel_Informe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Informe.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        add(jPanel_Informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Placa", "Tipo Vehiculo", "Fecha Entrada", "Fecha Salida", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 770, 110));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jPanel_Ag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jLabel9.setText("Añadir Entrada");
        jPanel_Ag1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        add(jPanel_Ag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 40));

        jTextField1.setBackground(new java.awt.Color(36, 47, 65));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 126, 170, 20));

        botonTerminar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonTerminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTerminar1MouseClicked(evt);
            }
        });
        botonTerminar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Terminar Ingreso");
        botonTerminar1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        add(botonTerminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_InformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_InformeMouseClicked

    
    
    private void jPanel_InformeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Report Card_20px_1.png"));
        jLabel_icn_inf.setIcon(ii);
    }//GEN-LAST:event_jPanel_InformeMouseEntered

    private void jPanel_InformeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseExited
        // TODO add your handling code here:
         ii = new ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"));
        jLabel_icn_inf.setIcon(ii);
    }//GEN-LAST:event_jPanel_InformeMouseExited

    private void jPanel_Ag1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseClicked
        
        Form_Entradas_Fraccion f = new Form_Entradas_Fraccion();
        f.idRecep = this.idRecep;
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(f,BorderLayout.CENTER);
        this.repaint();
        this.revalidate(); 
    }//GEN-LAST:event_jPanel_Ag1MouseClicked

    private void jPanel_Ag1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_Ag1MouseEntered

    private void jPanel_Ag1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_Ag1MouseExited

    private void botonTerminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTerminar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTerminar1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jTextField1.getText());
                jTextField1.setText(cadena);
                repaint();
                filter.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 1));
            }
        });
        filter = new TableRowSorter(this.jTable2.getModel());
        this.jTable2.setRowSorter(filter);
        
    }//GEN-LAST:event_jTextField1KeyTyped
    
    public void LoadDataTable(ArrayList<Modelos.Informacion_Fraccion> datos)
    {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        for(int i=0;i<datos.size();i++)
            {
                Object [] fila = new Object[6];
                fila[0] = datos.get(i).getIdFraccion();
                fila[1] = datos.get(i).getVehiculo_placa();
                fila[2] = datos.get(i).getVehiculo_tipo();
                fila[3] = datos.get(i).getFecha_entrada();
                fila[4] = datos.get(i).getFecha_salida();
                fila[5] = datos.get(i).getValor_pagar();
                modelo.addRow(fila);
            }
        this.jTable2.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonTerminar1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JPanel jPanel_Ag1;
    private javax.swing.JPanel jPanel_Informe;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
