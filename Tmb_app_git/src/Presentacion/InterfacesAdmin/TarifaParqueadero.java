/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.InterfacesAdmin;

import Presentacion.*;
import Modelos.Informacion_Total_Mensual;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.ParquaderoFraccion;
import Servicios.ParqueaderoMes;
import Servicios.S_Hotel;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Santiago Ortega
 */
public class TarifaParqueadero extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    TableRowSorter filter;
    int rown = -1;
    
    public TarifaParqueadero() {
        initComponents();
        Cargar_Datos();
        //Ocultar campos del formulario
        ocultarFormulario();
        this.jTable2.setRowHeight(40);
        //editor de caldas
        jTable2.getColumnModel().getColumn(1).setCellEditor(new MyTableCellEditor("PARQUEADERO", "TIPO_VEHICULO"));
        jTable2.getColumnModel().getColumn(2).setCellEditor(new MyTableCellEditor("PARQUEADERO", "VALOR_HORA"));
        jTable2.getColumnModel().getColumn(3).setCellEditor(new MyTableCellEditor("PARQUEADERO", "VALOR_HORA_DOS"));
        jTable2.getColumnModel().getColumn(4).setCellEditor(new MyTableCellEditor("PARQUEADERO", "VALOR_DIA"));
        jTable2.getColumnModel().getColumn(5).setCellEditor(new MyTableCellEditor("PARQUEADERO", "VALOR_MES"));
        jTable2.getColumnModel().getColumn(6).setCellEditor(new MyTableCellEditor("PARQUEADERO", "VALOR_ADICIONAL"));
        //this.jTable2.setEnabled(false);
    }
    ImageIcon ii;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Registrar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jText_Buscador = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_TipoV = new javax.swing.JLabel();
        registrar_mes = new javax.swing.JSpinner();
        jLabel_Dia = new javax.swing.JLabel();
        registrar_dia = new javax.swing.JSpinner();
        jLabel_Hora = new javax.swing.JLabel();
        registrar_hora2 = new javax.swing.JSpinner();
        jButton_aceptar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        registrar_tipoV = new javax.swing.JTextField();
        jLabel_Mes = new javax.swing.JLabel();
        registrar_hora1 = new javax.swing.JSpinner();
        registrar_adicional = new javax.swing.JSpinner();
        jLabel_Hora1 = new javax.swing.JLabel();
        jLabel_Hora2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel_Registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_RegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_RegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_RegistrarMouseExited(evt);
            }
        });
        jPanel_Registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Registrar.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Registrar tarifa");
        jPanel_Registrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 20));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setName(""); // NOI18N
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel_icn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_20px_1.png"))); // NOI18N

        jText_Buscador.setBackground(new java.awt.Color(36, 47, 65));
        jText_Buscador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Buscador.setForeground(new java.awt.Color(255, 255, 255));
        jText_Buscador.setBorder(null);
        jText_Buscador.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_BuscadorMouseClicked(evt);
            }
        });
        jText_Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_BuscadorActionPerformed(evt);
            }
        });
        jText_Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_BuscadorKeyTyped(evt);
            }
        });

        jLabel_TipoV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_TipoV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TipoV.setText("Tipo Vehiculo");

        registrar_mes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        registrar_mes.setEditor(new javax.swing.JSpinner.NumberEditor(registrar_mes, ""));

        jLabel_Dia.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Dia.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dia.setText("Dia");

        registrar_dia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        registrar_dia.setEditor(new javax.swing.JSpinner.NumberEditor(registrar_dia, ""));

        jLabel_Hora.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Hora.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Hora.setText("Hora (5-12)");

        registrar_hora2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        registrar_hora2.setEditor(new javax.swing.JSpinner.NumberEditor(registrar_hora2, ""));

        jButton_aceptar.setText("Aceptar");
        jButton_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_aceptarMouseClicked(evt);
            }
        });
        jButton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aceptarActionPerformed(evt);
            }
        });

        jButton_cancelar.setText("Cancelar");
        jButton_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_cancelarMouseClicked(evt);
            }
        });
        jButton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelarActionPerformed(evt);
            }
        });

        registrar_tipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_tipoVActionPerformed(evt);
            }
        });

        jLabel_Mes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Mes.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Mes.setText("Mes");

        registrar_hora1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        registrar_hora1.setEditor(new javax.swing.JSpinner.NumberEditor(registrar_hora1, ""));

        registrar_adicional.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        registrar_adicional.setEditor(new javax.swing.JSpinner.NumberEditor(registrar_adicional, ""));

        jLabel_Hora1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Hora1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Hora1.setText("Hora (0-1)");

        jLabel_Hora2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_Hora2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Hora2.setText("Adicional");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_icn_add1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_TipoV, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(registrar_tipoV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrar_mes, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jLabel_Mes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrar_dia)
                                    .addComponent(jLabel_Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrar_hora2)
                                    .addComponent(jLabel_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registrar_hora1)
                                    .addComponent(jLabel_Hora1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_Hora2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(registrar_adicional))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_icn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(registrar_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registrar_tipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registrar_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Hora)
                            .addComponent(jLabel_Hora1)
                            .addComponent(jLabel_Hora2)
                            .addComponent(jLabel_Dia)
                            .addComponent(jLabel_Mes)
                            .addComponent(jLabel_TipoV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrar_hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrar_hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrar_adicional, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseClicked
        // TODO add your handling code here:
        habilitarFormulario();
    }//GEN-LAST:event_jPanel_RegistrarMouseClicked

    private void jPanel_RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_RegistrarMouseEntered

    private void jPanel_RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_RegistrarMouseExited

    private void jText_BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_BuscadorMouseClicked
        jText_Buscador.setText("");
    }//GEN-LAST:event_jText_BuscadorMouseClicked

    private void jText_BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_BuscadorActionPerformed

    private void jText_BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_BuscadorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        jText_Buscador.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jText_Buscador.getText());
                jText_Buscador.setText(cadena);
                repaint();
                filter.setRowFilter(RowFilter.regexFilter(jText_Buscador.getText(), 1));
            }
        });
        filter = new TableRowSorter(this.jTable2.getModel());
        this.jTable2.setRowSorter(filter);
    }//GEN-LAST:event_jText_BuscadorKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_cancelarActionPerformed

    private void registrar_tipoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_tipoVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrar_tipoVActionPerformed

    private void jButton_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_cancelarMouseClicked
        // TODO add your handling code here:
        ocultarFormulario();
    }//GEN-LAST:event_jButton_cancelarMouseClicked

    private void jButton_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_aceptarMouseClicked
        // TODO add your handling code here:
        habilitarFormulario();
    }//GEN-LAST:event_jButton_aceptarMouseClicked

    private void jButton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aceptarActionPerformed
        // TODO add your handling code here:
        ParqueaderoMes obj = new ParqueaderoMes();
        if (obj.registrarTarifa(Conexion.obtener(), registrar_tipoV.getText().toUpperCase(), (int) registrar_mes.getValue(), (int) registrar_dia.getValue(), (int) registrar_hora2.getValue(), (int) registrar_hora1.getValue(), (int) registrar_adicional.getValue()) && validarRegistro()) {
            JOptionPane.showMessageDialog(this, "Tarifa registrada con exito");
            Cargar_Datos();
            ocultarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "La tarifa no ha sido registrada");
            registrar_tipoV.setText("");
        }
    }//GEN-LAST:event_jButton_aceptarActionPerformed
    
    public void Cargar_Datos() {
        jTable2.setDefaultRenderer(Object.class, new RenderTabla());
        ParqueaderoMes obj = new ParqueaderoMes();
        ArrayList<Object> lista = new ArrayList<Object>();
        lista = obj.LoadInformacionTarifaParqueadero(Conexion.obtener());
        ArrayList<String> columnas = (ArrayList<String>) lista.get(0);
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return columna == 0 || columna == 1 ? false : true;
            }
        };
        
        for (int i = 0; i < columnas.size(); i++) {
            modelo.addColumn(columnas.get(i));
        }
        
        for (int i = 1; i < lista.size(); i++) {
            ArrayList<String> lista_info = new ArrayList<String>();
            lista_info = (ArrayList<String>) lista.get(i);
            Object[] fila = new Object[lista_info.size() + 1];
            for (int j = 0; j < lista_info.size(); j++) {
                fila[j] = lista_info.get(j);
            }
            modelo.addRow(fila);
        }
        this.jTable2.setModel(modelo);
        //oculta columna ID
        jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(0).setMinWidth(0);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aceptar;
    private javax.swing.JButton jButton_cancelar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Dia;
    private javax.swing.JLabel jLabel_Hora;
    private javax.swing.JLabel jLabel_Hora1;
    private javax.swing.JLabel jLabel_Hora2;
    private javax.swing.JLabel jLabel_Mes;
    private javax.swing.JLabel jLabel_TipoV;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Buscador;
    private javax.swing.JSpinner registrar_adicional;
    private javax.swing.JSpinner registrar_dia;
    private javax.swing.JSpinner registrar_hora1;
    private javax.swing.JSpinner registrar_hora2;
    private javax.swing.JSpinner registrar_mes;
    private javax.swing.JTextField registrar_tipoV;
    // End of variables declaration//GEN-END:variables

    private void ocultarFormulario() {
        jLabel_Dia.setVisible(false);
        jLabel_Hora.setVisible(false);
        jLabel_Hora1.setVisible(false);
        jLabel_Hora2.setVisible(false);
        jLabel_Mes.setVisible(false);
        jLabel_TipoV.setVisible(false);
        registrar_dia.setVisible(false);
        registrar_hora2.setVisible(false);
        registrar_hora1.setVisible(false);
        registrar_adicional.setVisible(false);
        registrar_mes.setVisible(false);
        registrar_tipoV.setVisible(false);
        jButton_aceptar.setVisible(false);
        jButton_cancelar.setVisible(false);
        registrar_dia.setValue(0);
        registrar_hora2.setValue(0);
        registrar_mes.setValue(0);
        registrar_tipoV.setText("");
    }
    
    private void habilitarFormulario() {
        jLabel_Dia.setVisible(true);
        jLabel_Hora.setVisible(true);
        jLabel_Hora1.setVisible(true);
        jLabel_Hora2.setVisible(true);
        jLabel_Mes.setVisible(true);
        jLabel_TipoV.setVisible(true);
        registrar_dia.setVisible(true);
        registrar_hora2.setVisible(true);
        registrar_hora1.setVisible(true);
        registrar_adicional.setVisible(true);
        registrar_mes.setVisible(true);
        registrar_tipoV.setVisible(true);
        jButton_aceptar.setVisible(true);
        jButton_cancelar.setVisible(true);
    }
    
    public static boolean validarNum(int n1, int n2) {
        if (n1 % n2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean validarRegistro() {
        if (validarNum((int) registrar_dia.getValue(), 50) && validarNum((int) registrar_hora1.getValue(), 50) && validarNum((int) registrar_adicional.getValue(), 50)&& validarNum((int) registrar_hora2.getValue(), 50) && validarNum((int) registrar_mes.getValue(), 50)) {
            return true;
        } else {
            return false;
        }
    }
}
