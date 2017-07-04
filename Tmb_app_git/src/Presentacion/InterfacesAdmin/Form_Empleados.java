/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.InterfacesAdmin;

import Presentacion.*;
import Servicios.Administrador;
import Servicios.Conexion;
import Servicios.ParquaderoFraccion;
import Servicios.S_Empleados;
import Servicios.Sesion;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santiago Ortega
 */
public class Form_Empleados extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    public Form_Empleados() {
        initComponents();
        LoadTipo();
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

        jPanel_Informe = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jText_Usuario = new javax.swing.JTextField();
        jLabel_icn_canc = new javax.swing.JLabel();
        jPanel_Ag = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TipoEmpleado = new javax.swing.JComboBox<>();
        jText_Nombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jText_Apellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jText_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jText_Documento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jText_NombreUsuario = new javax.swing.JTextField();
        jText_Contrasenia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jText_CodigoLavador = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cancelar");
        jPanel_Informe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

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

        jLabel_icn_canc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"))); // NOI18N
        jPanel_Informe.add(jLabel_icn_canc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 20, 40));

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
        jPanel_Ag.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrar");
        jPanel_Ag.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Empleado");

        TipoEmpleado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoEmpleadoActionPerformed(evt);
            }
        });

        jText_Nombres.setBackground(new java.awt.Color(36, 47, 65));
        jText_Nombres.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Nombres.setForeground(new java.awt.Color(255, 255, 255));
        jText_Nombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_Nombres.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Nombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_NombresMouseClicked(evt);
            }
        });
        jText_Nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_NombresKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de empleado");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombres");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellidos");

        jText_Apellidos.setBackground(new java.awt.Color(36, 47, 65));
        jText_Apellidos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        jText_Apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_Apellidos.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_ApellidosKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono");

        jText_Telefono.setBackground(new java.awt.Color(36, 47, 65));
        jText_Telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jText_Telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_Telefono.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_TelefonoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Documento");

        jText_Documento.setBackground(new java.awt.Color(36, 47, 65));
        jText_Documento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Documento.setForeground(new java.awt.Color(255, 255, 255));
        jText_Documento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_Documento.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_DocumentoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario");

        jText_NombreUsuario.setBackground(new java.awt.Color(36, 47, 65));
        jText_NombreUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jText_NombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_NombreUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_NombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_NombreUsuarioKeyTyped(evt);
            }
        });

        jText_Contrasenia.setBackground(new java.awt.Color(36, 47, 65));
        jText_Contrasenia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        jText_Contrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_Contrasenia.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_ContraseniaKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contraseña");

        jText_CodigoLavador.setBackground(new java.awt.Color(36, 47, 65));
        jText_CodigoLavador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_CodigoLavador.setForeground(new java.awt.Color(255, 255, 255));
        jText_CodigoLavador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_CodigoLavador.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_CodigoLavador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_CodigoLavadorKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Codigo Lavador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TipoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Nombres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_Documento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel_Ag, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_CodigoLavador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_Contrasenia)
                    .addComponent(jText_NombreUsuario)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(TipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_CodigoLavador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Ag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_InformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseClicked
        // TODO add your handling code here:
        Empleados ent = new Empleados();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(ent, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_InformeMouseClicked


    private void jPanel_AgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgMouseClicked
        // TODO add your handling code here:
        if (!jText_Nombres.getText().equalsIgnoreCase("") && !jText_Apellidos.getText().equalsIgnoreCase("") && !jText_Documento.getText().equalsIgnoreCase("") && !jText_Telefono.getText().equalsIgnoreCase("")) {
            if (TipoEmpleado.getSelectedIndex() == 0) {
                if (!jText_NombreUsuario.getText().equalsIgnoreCase("") && !jText_Contrasenia.getText().equalsIgnoreCase("")) {
                    //Se registra la recepcionista
                    S_Empleados obj = new S_Empleados();
                    if (obj.registrarEmpleado(Conexion.obtener(), TipoEmpleado.getSelectedIndex(), jText_Nombres.getText().toUpperCase(), jText_Apellidos.getText().toUpperCase(), jText_NombreUsuario.getText().toUpperCase(), jText_Contrasenia.getText(), jText_Telefono.getText().toUpperCase(), jText_Documento.getText().toUpperCase(), Integer.parseInt("-1"))) {
                        JOptionPane.showMessageDialog(null, "Registro realizado con exito");
                        Empleados ent = new Empleados();
                        this.removeAll();
                        this.setLayout(new BorderLayout());
                        this.add(ent, BorderLayout.CENTER);
                        this.repaint();
                        this.revalidate();
                    } else {
                        JOptionPane.showMessageDialog(null, "Verifique que los campos 'Documento' y 'Usuario' no existan");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Los campos Usuario y Contraseña con necesarios para el registro de una nueva recepcionista");
                }
            } else {
                if (isNumeric(jText_CodigoLavador.getText())) {
                    //Se registra el lavador
                    S_Empleados obj = new S_Empleados();
                    if (obj.registrarEmpleado(Conexion.obtener(), TipoEmpleado.getSelectedIndex(), jText_Nombres.getText().toUpperCase(), jText_Apellidos.getText().toUpperCase(), jText_NombreUsuario.getText().toUpperCase(), jText_Contrasenia.getText(), jText_Telefono.getText().toUpperCase(), jText_Documento.getText().toUpperCase(), Integer.parseInt(jText_CodigoLavador.getText()))) {
                        JOptionPane.showMessageDialog(null, "Registro realizado con exito");
                        Empleados ent = new Empleados();
                        this.removeAll();
                        this.setLayout(new BorderLayout());
                        this.add(ent, BorderLayout.CENTER);
                        this.repaint();
                        this.revalidate();
                    } else {
                        JOptionPane.showMessageDialog(null, "Verifique que los campos 'Documento' y 'Codigo' no existan");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El campo Codigo debe ser numerico");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar los campos requeridos");
        }
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
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px_2.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_InformeMouseEntered

    private void jPanel_InformeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_InformeMouseExited

    private void jText_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_UsuarioMouseClicked
        jText_Usuario.setText("");
    }//GEN-LAST:event_jText_UsuarioMouseClicked

    private void jText_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_UsuarioActionPerformed

    private void jText_NombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_NombresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_NombresMouseClicked

    private void jText_NombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_NombresKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_NombresKeyTyped

    private void jText_ApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_ApellidosKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_ApellidosKeyTyped

    private void jText_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_TelefonoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_TelefonoKeyTyped

    private void jText_DocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_DocumentoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_DocumentoKeyTyped

    private void jText_NombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_NombreUsuarioKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_NombreUsuarioKeyTyped

    private void jText_CodigoLavadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_CodigoLavadorKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_CodigoLavadorKeyTyped

    private void TipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoEmpleadoActionPerformed
        // TODO add your handling code here:
        int tipo = TipoEmpleado.getSelectedIndex();
        System.out.println("Seleccion:" + tipo);
        if (tipo == 0) {

            jText_CodigoLavador.setVisible(false);
            jLabel12.setVisible(false);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jText_NombreUsuario.setVisible(true);
            jText_Contrasenia.setVisible(true);
        } else {
            jText_NombreUsuario.setVisible(false);
            jLabel12.setVisible(true);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jText_Contrasenia.setVisible(false);
            jText_CodigoLavador.setVisible(true);
        }
    }//GEN-LAST:event_TipoEmpleadoActionPerformed

    private void jText_ContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_ContraseniaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ContraseniaKeyTyped

    public void LoadVehiculos() {
        Administrador obj = new Administrador();
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) {
            this.TipoEmpleado.addItem(tipos.get(i));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JPanel jPanel_Ag;
    private javax.swing.JPanel jPanel_Informe;
    private javax.swing.JTextField jText_Apellidos;
    private javax.swing.JTextField jText_CodigoLavador;
    private javax.swing.JTextField jText_Contrasenia;
    private javax.swing.JTextField jText_Documento;
    private javax.swing.JTextField jText_NombreUsuario;
    private javax.swing.JTextField jText_Nombres;
    private javax.swing.JTextField jText_Telefono;
    private javax.swing.JTextField jText_Usuario;
    // End of variables declaration//GEN-END:variables

    private void LoadTipo() {
        TipoEmpleado.addItem("Recepcionista");
        TipoEmpleado.addItem("Lavador");
    }

    public static boolean isNumeric(String s) {
        try {
            double y = Double.parseDouble(s);
            if (y > -1) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException err) {
            return false;
        }
    }
}
