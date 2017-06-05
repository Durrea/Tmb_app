/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Habitacion;
import Servicios.Conexion;
import Servicios.ParquaderoFraccion;
import Servicios.Sesion;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Santiago Ortega
 */
public class Form_Hotel extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    
    private Habitacion habitacion;
    
    public Form_Hotel(Habitacion habitacion) {
        initComponents();
        LoadTipo();
        this.habitacion = habitacion;
        //LoadVehiculos();
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

        jPanel_Cancelar = new javax.swing.JPanel();
        jLabel_icn_inf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jText_Usuario = new javax.swing.JTextField();
        jPanel_Aceptar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TipoHospedaje = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Date date1 = new Date();
        SpinnerDateModel sm1 =
        new SpinnerDateModel(date1,null,null,Calendar.HOUR_OF_DAY);
        jText_Salida = new javax.swing.JSpinner(sm1);
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        jText_Entrada = new javax.swing.JSpinner(sm);
        jText_NumeroPersonas = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(36, 47, 65));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_CancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_CancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_CancelarMouseExited(evt);
            }
        });
        jPanel_Cancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_inf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"))); // NOI18N
        jPanel_Cancelar.add(jLabel_icn_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Cancelar");
        jPanel_Cancelar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Cancelar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

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
        jPanel_Cancelar.add(jText_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 270, -1));

        add(jPanel_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 180, 40));

        jPanel_Aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_AceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_AceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_AceptarMouseExited(evt);
            }
        });
        jPanel_Aceptar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Aceptar.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Añadir Entrada");
        jPanel_Aceptar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        add(jPanel_Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 140, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de entradas al hotel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Para realizar el registro de un hospedaje debe diligenciar la siguiente información. Los campos con (*) son obligatorios.");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        TipoHospedaje.setBackground(new java.awt.Color(0, 0, 102));
        TipoHospedaje.setForeground(new java.awt.Color(0, 0, 102));
        TipoHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoHospedajeActionPerformed(evt);
            }
        });
        add(TipoHospedaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 270, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de hospedaje");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de personas");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Entrada");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salida");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(jText_Salida,"yyyy-MM-dd HH:mm:ss");
        jText_Salida.setEditor(de1);
        add(jText_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 270, 30));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jText_Entrada,"yyyy-MM-dd HH:mm:ss");
        jText_Entrada.setEditor(de);
        add(jText_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 270, 30));
        add(jText_NumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 270, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        // TODO add your handling code here:
        Hotel h = new Hotel();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(h, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked


    private void jPanel_AceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AceptarMouseClicked
        // TODO add your handling code here:
        /*if (!jText_Entrada.getText().equalsIgnoreCase("")) {
            ValidadorCadenas val = new ValidadorCadenas();
            if (val.ValidarCadenasPlaca(jText_Entrada.getText())) {
                ParquaderoFraccion obj = new ParquaderoFraccion();
                Sesion instancia = Sesion.getInstanciaSesion();
                System.out.println(instancia.getIdentificador());
                boolean resultado = obj.RegisterEntryFraccion(Conexion.obtener(), jText_Entrada.getText(), (String) TipoHospedaje.getSelectedItem(), instancia.getIdentificador());
                if (resultado) {
                    JOptionPane.showMessageDialog(null, "Registro realizado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha realizado el registro");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Formato incorrecto. Formato para las placas ej: AAA123");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos requeridos");
        }*/
        JOptionPane.showMessageDialog(this, "Habitación a ocupar " +  habitacion.getHabitacion_numero());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        JOptionPane.showMessageDialog(this, "Entrada: " +  dateFormat.format(jText_Entrada.getValue()));
        
    }//GEN-LAST:event_jPanel_AceptarMouseClicked

    private void jPanel_AceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AceptarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_AceptarMouseEntered

    private void jPanel_AceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AceptarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_AceptarMouseExited

    private void jPanel_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px_2.png"));
        jLabel_icn_inf.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseEntered

    private void jPanel_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"));
        jLabel_icn_inf.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseExited

    private void jText_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_UsuarioMouseClicked
        jText_Usuario.setText("");
    }//GEN-LAST:event_jText_UsuarioMouseClicked

    private void jText_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_UsuarioActionPerformed

    private void TipoHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoHospedajeActionPerformed
        // TODO add your handling code here:
        int tipo = TipoHospedaje.getSelectedIndex();
        System.out.println("Seleccion:" + tipo);
        if (tipo == 0) {
           
        } else {

        }

    }//GEN-LAST:event_TipoHospedajeActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoHospedaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JPanel jPanel_Aceptar;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jText_Entrada;
    private javax.swing.JSpinner jText_NumeroPersonas;
    private javax.swing.JSpinner jText_Salida;
    private javax.swing.JTextField jText_Usuario;
    // End of variables declaration//GEN-END:variables

    private void LoadTipo() {
        TipoHospedaje.addItem("DIA");
        TipoHospedaje.addItem("HORA");
    }
}