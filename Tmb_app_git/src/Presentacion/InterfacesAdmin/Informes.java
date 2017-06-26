/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.InterfacesAdmin;

import Presentacion.*;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.ParquaderoFraccion;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Santiago Ortega
 */
public class Informes extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    
    ImageIcon ii;
    public int idRecep;
    TableRowSorter filter;
    int rown = -1;
    
    public Informes() {
        initComponents();        
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
        jPanel1 = new javax.swing.JPanel();
        Inf_Lavadero = new javax.swing.JPanel();
        jLabel_icn_add2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Inf_Mensual_Total = new javax.swing.JPanel();
        jLabel_icn_add3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Inf_Fraccion = new javax.swing.JPanel();
        jLabel_icn_add4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Inf_Hotel = new javax.swing.JPanel();
        jLabel_icn_add5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Inf_Mensual = new javax.swing.JPanel();
        jLabel_icn_add6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));

        Inf_Lavadero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inf_Lavadero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inf_Lavadero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inf_LavaderoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Inf_LavaderoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Inf_LavaderoMouseExited(evt);
            }
        });
        Inf_Lavadero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        Inf_Lavadero.add(jLabel_icn_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Lavadero");
        Inf_Lavadero.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        Inf_Mensual_Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inf_Mensual_Total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inf_Mensual_Total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inf_Mensual_TotalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Inf_Mensual_TotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Inf_Mensual_TotalMouseExited(evt);
            }
        });
        Inf_Mensual_Total.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        Inf_Mensual_Total.add(jLabel_icn_add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Mensual Total");
        Inf_Mensual_Total.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        Inf_Fraccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inf_Fraccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inf_Fraccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inf_FraccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Inf_FraccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Inf_FraccionMouseExited(evt);
            }
        });
        Inf_Fraccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        Inf_Fraccion.add(jLabel_icn_add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("P. Fracción");
        Inf_Fraccion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        Inf_Hotel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inf_Hotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inf_Hotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inf_HotelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Inf_HotelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Inf_HotelMouseExited(evt);
            }
        });
        Inf_Hotel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        Inf_Hotel.add(jLabel_icn_add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Hotel");
        Inf_Hotel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        Inf_Mensual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Inf_Mensual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inf_Mensual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inf_MensualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Inf_MensualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Inf_MensualMouseExited(evt);
            }
        });
        Inf_Mensual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        Inf_Mensual.add(jLabel_icn_add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("P. Mensual");
        Inf_Mensual.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Inf_Mensual_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inf_Lavadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inf_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Inf_Fraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inf_Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Inf_Fraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inf_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inf_Lavadero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Inf_Hotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inf_Mensual_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Inf_LavaderoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_LavaderoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_LavaderoMouseClicked

    private void Inf_LavaderoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_LavaderoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_LavaderoMouseEntered

    private void Inf_LavaderoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_LavaderoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_LavaderoMouseExited

    private void Inf_Mensual_TotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_Mensual_TotalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_Mensual_TotalMouseClicked

    private void Inf_Mensual_TotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_Mensual_TotalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_Mensual_TotalMouseEntered

    private void Inf_Mensual_TotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_Mensual_TotalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_Mensual_TotalMouseExited

    private void Inf_FraccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_FraccionMouseClicked
        // TODO add your handling code here:
        GeneracionInf obj = new GeneracionInf();
        obj.tipo_informe = 2;
        obj.setVisible(true);
    }//GEN-LAST:event_Inf_FraccionMouseClicked

    private void Inf_FraccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_FraccionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_FraccionMouseEntered

    private void Inf_FraccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_FraccionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_FraccionMouseExited

    private void Inf_HotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_HotelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_HotelMouseClicked

    private void Inf_HotelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_HotelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_HotelMouseEntered

    private void Inf_HotelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_HotelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_HotelMouseExited

    private void Inf_MensualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_MensualMouseClicked
        // TODO add your handling code here:
        GeneracionInf obj = new GeneracionInf();
        obj.tipo_informe = 1;
        obj.setVisible(true);
    }//GEN-LAST:event_Inf_MensualMouseClicked

    private void Inf_MensualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_MensualMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_MensualMouseEntered

    private void Inf_MensualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inf_MensualMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Inf_MensualMouseExited
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inf_Fraccion;
    private javax.swing.JPanel Inf_Hotel;
    private javax.swing.JPanel Inf_Lavadero;
    private javax.swing.JPanel Inf_Mensual;
    private javax.swing.JPanel Inf_Mensual_Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel_icn_add2;
    private javax.swing.JLabel jLabel_icn_add3;
    private javax.swing.JLabel jLabel_icn_add4;
    private javax.swing.JLabel jLabel_icn_add5;
    private javax.swing.JLabel jLabel_icn_add6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}