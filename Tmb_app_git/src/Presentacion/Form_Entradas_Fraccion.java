/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.Conexion;
import Servicios.ParquaderoFraccion;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Santiago Ortega
 */
public class Form_Entradas_Fraccion extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    public Form_Entradas_Fraccion() {
        initComponents();
        LoadVehiculos();
    }
    ImageIcon ii;
    public int idRecep;
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
        jText_Usuario = new javax.swing.JTextField();
        jPanel_Ag = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TipoVehiculo = new javax.swing.JComboBox<>();
        jText_Placa = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

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
        jLabel5.setText("Cancelar");
        jPanel_Informe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Informe.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jText_Usuario.setBackground(new java.awt.Color(36, 47, 65));
        jText_Usuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jText_Usuario.setText("Ingresar Usuario");
        jText_Usuario.setBorder(null);
        jText_Usuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_UsuarioMouseClicked(evt);
            }
        });
        jText_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_UsuarioActionPerformed(evt);
            }
        });
        jPanel_Informe.add(jText_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 270, -1));

        add(jPanel_Informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 180, 40));

        jPanel_Ag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Ag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_AgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_AgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_AgMouseExited(evt);
            }
        });
        jPanel_Ag.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Ag.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Añadir Entrada");
        jPanel_Ag.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        add(jPanel_Ag, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro entradas por fraccion");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para realizar el registro de una entrada por fracción debe diligenciar la siguiente información. Los campos con (*) son obligatorios.");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        TipoVehiculo.setBackground(new java.awt.Color(0, 0, 102));
        TipoVehiculo.setForeground(new java.awt.Color(0, 0, 102));
        add(TipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, -1));

        jText_Placa.setBackground(new java.awt.Color(36, 47, 65));
        jText_Placa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Placa.setForeground(new java.awt.Color(255, 255, 255));
        jText_Placa.setText("Ingresar Usuario");
        jText_Placa.setBorder(null);
        jText_Placa.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_PlacaMouseClicked(evt);
            }
        });
        jText_Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_PlacaActionPerformed(evt);
            }
        });
        add(jText_Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 270, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 260, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_InformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_InformeMouseClicked

    
    
    private void jPanel_AgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgMouseClicked
        // TODO add your handling code here:
        
        System.out.println(this.idRecep);
    }//GEN-LAST:event_jPanel_AgMouseClicked

    private void jPanel_AgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgMouseEntered
        // TODO add your handling code here:
         ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_AgMouseEntered

    private void jPanel_AgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_AgMouseExited

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

    private void jText_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_UsuarioMouseClicked
        jText_Usuario.setText("");
    }//GEN-LAST:event_jText_UsuarioMouseClicked

    private void jText_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_UsuarioActionPerformed

    private void jText_PlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_PlacaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_PlacaMouseClicked

    private void jText_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_PlacaActionPerformed
    
    public void LoadVehiculos()
    {
        ParquaderoFraccion obj = new ParquaderoFraccion();
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            this.TipoVehiculo.addItem(tipos.get(i));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JPanel jPanel_Ag;
    private javax.swing.JPanel jPanel_Informe;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jText_Placa;
    private javax.swing.JTextField jText_Usuario;
    // End of variables declaration//GEN-END:variables
}
