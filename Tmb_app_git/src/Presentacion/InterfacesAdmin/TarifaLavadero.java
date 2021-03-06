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
import Servicios.SLavadero;
import Servicios.S_Hotel;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Santiago Ortega
 */
public class TarifaLavadero extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    TableRowSorter filter;
    int rown = -1;

    public TarifaLavadero() {
        initComponents();
        InputMap map2 = this.registrar_tipoL.getInputMap(registrar_tipoL.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        map2 = this.registrar_tipoV.getInputMap(registrar_tipoV.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");

        Cargar_Datos();
        //Ocultar campos del formulario
        ocultarFormulario();
        this.jTable2.setRowHeight(40);
        //editor de caldas
        jTable2.getColumnModel().getColumn(1).setCellEditor(new MyTableCellEditor("LAVADERO", "TIPO_VEHICULO"));
        jTable2.getColumnModel().getColumn(2).setCellEditor(new MyTableCellEditor("LAVADERO", "VALOR_LAVADA"));
        jTable2.getColumnModel().getColumn(3).setCellEditor(new MyTableCellEditor("LAVADERO", "TIPO_LAVADA"));
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jText_Buscador = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel_tipoV = new javax.swing.JLabel();
        jLabel_valor = new javax.swing.JLabel();
        registrar_valor = new javax.swing.JSpinner();
        jLabel_tipoL = new javax.swing.JLabel();
        jButton_aceptar = new javax.swing.JButton();
        jButton_cancelar = new javax.swing.JButton();
        registrar_tipoV = new javax.swing.JTextField();
        registrar_tipoL = new javax.swing.JTextField();

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

        jLabel_tipoV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_tipoV.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tipoV.setText("Tipo Vehiculo");

        jLabel_valor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_valor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_valor.setText("Valor lavada");

        registrar_valor.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 5000));
        registrar_valor.setEditor(new javax.swing.JSpinner.NumberEditor(registrar_valor, ""));

        jLabel_tipoL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel_tipoL.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tipoL.setText("Tipo lavada");

        jButton_aceptar.setText("Aceptar");
        jButton_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_aceptarMouseEntered(evt);
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

        registrar_tipoV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        registrar_tipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_tipoVActionPerformed(evt);
            }
        });
        registrar_tipoV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registrar_tipoVKeyTyped(evt);
            }
        });

        registrar_tipoL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        registrar_tipoL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registrar_tipoLKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_icn_add1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_Buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jSeparator4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(registrar_tipoV, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(jLabel_tipoV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel_valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(registrar_valor, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_tipoL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(registrar_tipoL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_valor)
                        .addComponent(jLabel_tipoL))
                    .addComponent(jLabel_tipoV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrar_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_tipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar_tipoL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void jButton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aceptarActionPerformed
        // TODO add your handling code here:
        SLavadero obj = new SLavadero();
        if (registrar_tipoL.getText().equalsIgnoreCase("")  ||  registrar_tipoV.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "El tipo de vehiculo & de lavada no pueden ser vacios");
        } else {
            if (validarRegistro()) {
                if (obj.registrarTarifa(Conexion.obtener(), registrar_tipoV.getText().toUpperCase(), (int) registrar_valor.getValue(), registrar_tipoL.getText().toUpperCase())) {
                    JOptionPane.showMessageDialog(this, "Tarifa registrada con exito");

                    TarifaLavadero e = new TarifaLavadero();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(e, BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();

                } else {
                    JOptionPane.showMessageDialog(this, "La tarifa no ha sido registrada");
                    registrar_tipoL.setText("");
                    registrar_tipoV.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Las tarifas deben ser multiplos de 50");
                registrar_tipoL.setText("");
                registrar_tipoV.setText("");
            }
        }
    }//GEN-LAST:event_jButton_aceptarActionPerformed

    private void registrar_tipoLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrar_tipoLKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        if ((Character.isDigit(c)) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_ESCAPE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_CONTROL)) {
            evt.consume();
        }
    }//GEN-LAST:event_registrar_tipoLKeyTyped

    private void registrar_tipoVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrar_tipoVKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        if ((Character.isDigit(c)) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_ESCAPE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_CONTROL)) {
            evt.consume();
        }
    }//GEN-LAST:event_registrar_tipoVKeyTyped

    private void jButton_aceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_aceptarMouseEntered
        // TODO add your handling code here:
        registrar_tipoL.requestFocus();
    }//GEN-LAST:event_jButton_aceptarMouseEntered

    public void Cargar_Datos() {
        jTable2.setDefaultRenderer(Object.class, new RenderTabla());
        SLavadero obj = new SLavadero();
        ArrayList<Object> lista = new ArrayList<Object>();
        lista = obj.LoadInformacionTarifaLavadero(Conexion.obtener());
        ArrayList<String> columnas = (ArrayList<String>) lista.get(0);
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return columna == 0 || columna == 1 || columna == 3 ? false : true;
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
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JLabel jLabel_tipoL;
    private javax.swing.JLabel jLabel_tipoV;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Buscador;
    private javax.swing.JTextField registrar_tipoL;
    private javax.swing.JTextField registrar_tipoV;
    private javax.swing.JSpinner registrar_valor;
    // End of variables declaration//GEN-END:variables

    private void ocultarFormulario() {
        jLabel_tipoL.setVisible(false);
        jLabel_tipoV.setVisible(false);
        jLabel_valor.setVisible(false);
        registrar_tipoL.setVisible(false);
        registrar_tipoV.setVisible(false);
        registrar_valor.setVisible(false);
        jButton_aceptar.setVisible(false);
        jButton_cancelar.setVisible(false);
        registrar_tipoL.setText("");
        registrar_tipoV.setText("");
        registrar_valor.setValue(0);

    }

    private void habilitarFormulario() {
        jLabel_tipoL.setVisible(true);
        jLabel_tipoV.setVisible(true);
        jLabel_valor.setVisible(true);
        registrar_tipoL.setVisible(true);
        registrar_tipoV.setVisible(true);
        registrar_valor.setVisible(true);
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
        if (validarNum((int) registrar_valor.getValue(), 50)) {
            return true;
        } else {
            return false;
        }
    }
}
