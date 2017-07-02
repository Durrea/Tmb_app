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
import Servicios.S_Empleados;
import Servicios.S_Hotel;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Empleados extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    TableRowSorter filter;
    int rown = -1;

    public Empleados() {
        initComponents();
        Cargar_Datos_Lavador();
        Cargar_Datos_Recepcionista();
        this.jTable2.setRowHeight(40);
        //editor de celdas lavador
        jTable2.getColumnModel().getColumn(2).setCellEditor(new MyTableCellEditorEmpleados("LAVADOR", "LAVADOR_NOMBRE"));//Columna Nombre
        jTable2.getColumnModel().getColumn(3).setCellEditor(new MyTableCellEditorEmpleados("LAVADOR", "LAVADOR_APELLIDOS"));//Columna Apellido
        jTable2.getColumnModel().getColumn(5).setCellEditor(new MyTableCellEditorEmpleados("LAVADOR", "LAVADOR_TELEFONO"));//Columna Telefono
        //editor de celdas recepcionista
        jTable3.getColumnModel().getColumn(1).setCellEditor(new MyTableCellEditorEmpleados("RECEPCIONISTA", "RECEPCIONISTA_NOMBRES"));//Columna Nombre
        jTable3.getColumnModel().getColumn(2).setCellEditor(new MyTableCellEditorEmpleados("RECEPCIONISTA", "RECEPCIONISTA_APELLIDOS"));//Columna Apellido
        jTable3.getColumnModel().getColumn(4).setCellEditor(new MyTableCellEditorEmpleados("RECEPCIONISTA", "RECEPCIONISTA_CONTRASENIA"));//Columna contrasenia
        jTable3.getColumnModel().getColumn(6).setCellEditor(new MyTableCellEditorEmpleados("RECEPCIONISTA", "RECEPCIONISTA_TELEFONO"));//Columna telefono
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jText_Buscador1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel_icn_add2 = new javax.swing.JLabel();

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
        jPanel_Registrar.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrar Empleado");
        jPanel_Registrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 20));

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

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.setName(""); // NOI18N
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jText_Buscador1.setBackground(new java.awt.Color(36, 47, 65));
        jText_Buscador1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Buscador1.setForeground(new java.awt.Color(255, 255, 255));
        jText_Buscador1.setBorder(null);
        jText_Buscador1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Buscador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_Buscador1MouseClicked(evt);
            }
        });
        jText_Buscador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Buscador1ActionPerformed(evt);
            }
        });
        jText_Buscador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_Buscador1KeyTyped(evt);
            }
        });

        jLabel_icn_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_icn_add2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_Buscador1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jSeparator5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_icn_add1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_icn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jText_Buscador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_icn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseClicked
        // TODO add your handling code here:
        Form_Empleados ent = new Form_Empleados();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(ent, BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
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
        //Buscar en la tbla lavador por Documento
        jText_Buscador.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jText_Buscador.getText());
                jText_Buscador.setText(cadena);
                repaint();
                filter.setRowFilter(RowFilter.regexFilter(jText_Buscador.getText(), 4));
            }
        });
        filter = new TableRowSorter(this.jTable2.getModel());
        this.jTable2.setRowSorter(filter);
    }//GEN-LAST:event_jText_BuscadorKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        rown = jTable2.rowAtPoint(evt.getPoint());

        int column = jTable2.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTable2.getRowHeight();

        if (row < jTable2.getRowCount() && row >= 0 && column < jTable2.getColumnCount() && column >= 0) {
            Object value = jTable2.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                String id = "" + jTable2.getValueAt(rown, 0);
                if (boton.getName().equals("t")) {
                    S_Empleados servicio = new S_Empleados();
                    try {
                        servicio.cambiarEstado(Conexion.obtener(), "Lavador", id);
                        Cargar_Datos_Lavador();
                    } catch (SQLException ex) {
                        Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:

        rown = jTable3.rowAtPoint(evt.getPoint());

        int column = jTable3.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / jTable3.getRowHeight();

        if (row < jTable3.getRowCount() && row >= 0 && column < jTable3.getColumnCount() && column >= 0) {
            Object value = jTable3.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                String id = "" + jTable3.getValueAt(rown, 0);
                if (boton.getName().equals("t")) {
                    S_Empleados servicio = new S_Empleados();
                    try {
                        servicio.cambiarEstado(Conexion.obtener(), "Recepcionista", id);
                        Cargar_Datos_Recepcionista();
                    } catch (SQLException ex) {
                        Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jText_Buscador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_Buscador1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Buscador1MouseClicked

    private void jText_Buscador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Buscador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Buscador1ActionPerformed

    private void jText_Buscador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_Buscador1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cadena = ("" + c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        //Buscar en la tbla recepcionista por Documento
        jText_Buscador1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jText_Buscador1.getText());
                jText_Buscador1.setText(cadena);
                repaint();
                filter.setRowFilter(RowFilter.regexFilter(jText_Buscador1.getText(), 5));
            }
        });
        filter = new TableRowSorter(this.jTable3.getModel());
        this.jTable3.setRowSorter(filter);
    }//GEN-LAST:event_jText_Buscador1KeyTyped

    public void Cargar_Datos_Lavador() {
        jTable2.setDefaultRenderer(Object.class, new RenderTabla());
        S_Empleados obj = new S_Empleados();
        ArrayList<Object> lista = new ArrayList<Object>();
        lista = obj.LoadInformacionLavadores(Conexion.obtener());
        ArrayList<String> columnas = (ArrayList<String>) lista.get(0);
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return columna == 0 || columna == 1 || columna == 4 || columna == 6 ? false : true;
            }
            //public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        for (int i = 0; i < columnas.size(); i++) {
            modelo.addColumn(columnas.get(i));
        }
        modelo.addColumn("ESTADO");

        for (int i = 1; i < lista.size(); i++) {
            ArrayList<String> lista_info = new ArrayList<String>();
            JButton btn_visualizar_2;

            lista_info = (ArrayList<String>) lista.get(i);
            if (lista_info.get(6).equals("ACTIVO")) {
                btn_visualizar_2 = new JButton("Desactivar");
                btn_visualizar_2.setName("t");
                btn_visualizar_2.setBounds(0, 0, 60, 30);
            } else {
                btn_visualizar_2 = new JButton("Activar");
                btn_visualizar_2.setName("t");
                btn_visualizar_2.setBounds(0, 0, 60, 30);
            }
            Object[] fila = new Object[lista_info.size() + 1];
            for (int j = 0; j < lista_info.size(); j++) {
                fila[j] = lista_info.get(j);
            }
            fila[lista_info.size()] = btn_visualizar_2;
            modelo.addRow(fila);
        }
        this.jTable2.setModel(modelo);
        
        //oculta columna ID
        jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(0).setMinWidth(0);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //oculta columna estado
        jTable2.getColumnModel().getColumn(6).setMaxWidth(0);
        jTable2.getColumnModel().getColumn(6).setMinWidth(0);
        jTable2.getTableHeader().getColumnModel().getColumn(6).setMaxWidth(0);
        jTable2.getTableHeader().getColumnModel().getColumn(6).setMinWidth(0);
        
    }

    public void Cargar_Datos_Recepcionista() {
        jTable3.setDefaultRenderer(Object.class, new RenderTabla());
        S_Empleados obj = new S_Empleados();
        ArrayList<Object> lista = new ArrayList<Object>();
        lista = obj.LoadInformacionRecepcionista(Conexion.obtener());
        ArrayList<String> columnas = (ArrayList<String>) lista.get(0);
        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
                return columna == 0 || columna == 3 || columna == 5 || columna == 7 ? false : true;
            }
            //public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
        for (int i = 0; i < columnas.size(); i++) {
            modelo.addColumn(columnas.get(i));
        }
        modelo.addColumn("ESTADO");

        for (int i = 1; i < lista.size(); i++) {
            ArrayList<String> lista_info = new ArrayList<String>();
            JButton btn_visualizar_3;
            //btn_visualizar_2.setName("t");
            //btn_visualizar_2.setBounds(0, 0, 60, 30);
            lista_info = (ArrayList<String>) lista.get(i);
            if (lista_info.get(7).equals("ACTIVO")) {
                btn_visualizar_3 = new JButton("Desactivar");
                btn_visualizar_3.setName("t");
                btn_visualizar_3.setBounds(0, 0, 60, 30);
            } else {
                btn_visualizar_3 = new JButton("Activar");
                btn_visualizar_3.setName("t");
                btn_visualizar_3.setBounds(0, 0, 60, 30);
            }
            Object[] fila = new Object[lista_info.size() + 1];
            for (int j = 0; j < lista_info.size(); j++) {
                fila[j] = lista_info.get(j);
            }
            fila[lista_info.size()] = btn_visualizar_3;
            modelo.addRow(fila);
        }
        this.jTable3.setModel(modelo);
        //oculta columna ID
        jTable3.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable3.getColumnModel().getColumn(0).setMinWidth(0);
        jTable3.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        jTable3.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        //oculta columna estado
        jTable3.getColumnModel().getColumn(7).setMaxWidth(0);
        jTable3.getColumnModel().getColumn(7).setMinWidth(0);
        jTable3.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        jTable3.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JLabel jLabel_icn_add2;
    private javax.swing.JLabel jLabel_icn_add3;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JPanel jPanel_Registrar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jText_Buscador;
    private javax.swing.JTextField jText_Buscador1;
    // End of variables declaration//GEN-END:variables

}
