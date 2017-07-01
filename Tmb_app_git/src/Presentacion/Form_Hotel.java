/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Habitacion;
import Servicios.Conexion;
import Servicios.ParquaderoFraccion;
import Servicios.S_Hotel;
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
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Santiago Ortega
 */
public class Form_Hotel extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    private Habitacion habitacion;
    private S_Hotel servicio;

    public Form_Hotel(Habitacion habitacion) {
        initComponents();
        LoadTipo();
        this.habitacion = habitacion;
        servicio = new S_Hotel();
        jText_numeroPersonas.setValue(habitacion.getHabitacion_capacidad());
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
        jLabel5 = new javax.swing.JLabel();
        jText_Usuario = new javax.swing.JTextField();
        jLabel_icn_canc2 = new javax.swing.JLabel();
        jPanel_Aceptar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        jText_numeroPersonas = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        extra = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(36, 47, 65));

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

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cancelar");
        jPanel_Cancelar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 20));

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

        jLabel_icn_canc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"))); // NOI18N
        jPanel_Cancelar.add(jLabel_icn_canc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 40));

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
        jPanel_Aceptar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de entradas al hotel");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Para realizar el registro de un hospedaje debe diligenciar la siguiente información.");

        TipoHospedaje.setBackground(new java.awt.Color(0, 0, 102));
        TipoHospedaje.setForeground(new java.awt.Color(0, 0, 102));
        TipoHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoHospedajeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de hospedaje");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargo extra");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Entrada");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salida");

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(jText_Salida,"yyyy-MM-dd HH:mm:ss");
        jText_Salida.setEditor(de1);

        JSpinner.DateEditor de = new JSpinner.DateEditor(jText_Entrada,"yyyy-MM-dd HH:mm:ss");
        jText_Entrada.setEditor(de);

        jText_numeroPersonas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        jText_numeroPersonas.setToolTipText("");
        jText_numeroPersonas.setEditor(new javax.swing.JSpinner.NumberEditor(jText_numeroPersonas, ""));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Número de personas");

        extra.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        extra.setEditor(new javax.swing.JSpinner.NumberEditor(extra, ""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jText_numeroPersonas)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jText_Entrada)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jText_Salida)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(extra)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TipoHospedaje, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jPanel_Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(51, 51, 51)
                            .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jText_numeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jText_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(5, 5, 5)
                .addComponent(jText_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(extra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(TipoHospedaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ArrayList entradas = servicio.ocuparHabitacion(Conexion.obtener(), habitacion, TipoHospedaje.getSelectedItem().toString(), Integer.parseInt(jText_numeroPersonas.getValue().toString()), dateFormat.format(jText_Entrada.getValue()), dateFormat.format(jText_Salida.getValue()), Float.parseFloat(extra.getValue().toString()));
        Form_RegistroRealizado h = new Form_RegistroRealizado(entradas, habitacion);
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(h, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();

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
        jLabel_icn_canc2.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseEntered

    private void jPanel_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"));
        jLabel_icn_canc2.setIcon(ii);
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
    private javax.swing.JSpinner extra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JLabel jLabel_icn_canc1;
    private javax.swing.JLabel jLabel_icn_canc2;
    private javax.swing.JPanel jPanel_Aceptar;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JPanel jPanel_Cancelar1;
    private javax.swing.JPanel jPanel_Cancelar2;
    private javax.swing.JSpinner jText_Entrada;
    private javax.swing.JSpinner jText_Salida;
    private javax.swing.JTextField jText_Usuario;
    private javax.swing.JSpinner jText_numeroPersonas;
    // End of variables declaration//GEN-END:variables

    private void LoadTipo() {
        TipoHospedaje.addItem("DIA");
        TipoHospedaje.addItem("HORA");
    }
}
