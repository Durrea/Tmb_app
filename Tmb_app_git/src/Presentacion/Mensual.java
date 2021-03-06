/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Informacion_Total_Mensual;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.ParquaderoFraccion;
import Servicios.ParqueaderoMes;
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
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Santiago Ortega
 */
public class Mensual extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    TableRowSorter filter;
    TableRowSorter filter1;
    int rown = -1;
    public Mensual() {
        initComponents();
        Cargar_Datos();
        Cargar_Datos_Men_Ven();
        this.jTable1.setRowHeight(40);
        this.jTable2.setRowHeight(40);
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

        jPanel_Informe = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_icn_inf = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel_Registrar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jText_Buscador = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel_Añadir = new javax.swing.JPanel();
        jLabel_icn_addE = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel_Informe_Entradas_Diarias = new javax.swing.JPanel();
        jLabel_icn_inf1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jText_Buscador1 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel_icn_add2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel_Informe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Informe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel5.setText("Ingresos Diarios");
        jPanel_Informe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, 100, 20));

        jLabel_icn_inf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"))); // NOI18N
        jPanel_Informe.add(jLabel_icn_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 20, 40));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Informe.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

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
        jLabel8.setText("Registrar Cliente");
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

        jPanel_Añadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Añadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_AñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_AñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_AñadirMouseExited(evt);
            }
        });
        jPanel_Añadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_addE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Añadir.add(jLabel_icn_addE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 20, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Añadir Entrada");
        jPanel_Añadir.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Añadir.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jPanel_Informe_Entradas_Diarias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Informe_Entradas_Diarias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Informe_Entradas_Diarias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Informe_Entradas_DiariasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_Informe_Entradas_DiariasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_Informe_Entradas_DiariasMouseExited(evt);
            }
        });
        jPanel_Informe_Entradas_Diarias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_inf1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"))); // NOI18N
        jPanel_Informe_Entradas_Diarias.add(jLabel_icn_inf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 20, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Entradas Mensuales");
        jPanel_Informe_Entradas_Diarias.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Informe_Entradas_Diarias.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_Buscador1)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 582, Short.MAX_VALUE)
                                .addComponent(jLabel_icn_add1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jText_Buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jSeparator4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel_Informe_Entradas_Diarias, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 117, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel_Informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel_Informe_Entradas_Diarias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_icn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jText_Buscador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_icn_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_InformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseClicked
        // TODO add your handling code here:
        InforDMensualRecep f = new InforDMensualRecep();        
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(f,BorderLayout.CENTER);
        this.repaint();
        this.revalidate(); 
    }//GEN-LAST:event_jPanel_InformeMouseClicked
    
    private void jPanel_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseClicked
        // TODO add your handling code here:
        RegistroCliente r=new RegistroCliente();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(r,BorderLayout.CENTER);
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

    private void jText_BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_BuscadorMouseClicked
        jText_Buscador.setText("");
    }//GEN-LAST:event_jText_BuscadorMouseClicked

    private void jText_BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_BuscadorActionPerformed

    private void jPanel_AñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AñadirMouseClicked
        // TODO add your handling code here:
        AddEntradaMensual ent=new AddEntradaMensual();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(ent,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_AñadirMouseClicked

    private void jPanel_AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AñadirMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_addE.setIcon(ii);
    }//GEN-LAST:event_jPanel_AñadirMouseEntered

    private void jPanel_AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AñadirMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_addE.setIcon(ii);
    }//GEN-LAST:event_jPanel_AñadirMouseExited

    private void jText_BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_BuscadorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();
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
        this.jTable2.setRowSorter((RowSorter<TableModel>)filter);
    }//GEN-LAST:event_jText_BuscadorKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        rown = jTable2.rowAtPoint(evt.getPoint());

        int column = jTable2.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTable2.getRowHeight();
        
        if(row < jTable2.getRowCount() && row >= 0 && column < jTable2.getColumnCount() && column >= 0){
            Object value = jTable2.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String placa = ""+jTable2.getValueAt(rown, 1);
                String deuda = ""+jTable2.getValueAt(rown, 6);
                double valor_deuda = Double.parseDouble(deuda);
                if(boton.getName().equals("t"))
                {
                    RegistrarAbonoMensual obj=new RegistrarAbonoMensual();
                    obj.placa = placa;
                    obj.deuda = valor_deuda;
                    obj.setLabels();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(obj,BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();
                }
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jPanel_Informe_Entradas_DiariasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Informe_Entradas_DiariasMouseClicked
        // TODO add your handling code here:
        InforEntradasMensual obj=new InforEntradasMensual();                    
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(obj,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_Informe_Entradas_DiariasMouseClicked

    private void jPanel_Informe_Entradas_DiariasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Informe_Entradas_DiariasMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Report Card_20px_1.png"));
        jLabel_icn_inf1.setIcon(ii);
    }//GEN-LAST:event_jPanel_Informe_Entradas_DiariasMouseEntered

    private void jPanel_Informe_Entradas_DiariasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Informe_Entradas_DiariasMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"));
        jLabel_icn_inf1.setIcon(ii);
    }//GEN-LAST:event_jPanel_Informe_Entradas_DiariasMouseExited

    private void jText_Buscador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_Buscador1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Buscador1MouseClicked

    private void jText_Buscador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Buscador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_Buscador1ActionPerformed

    private void jText_Buscador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_Buscador1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        jText_Buscador1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jText_Buscador1.getText());
                jText_Buscador1.setText(cadena);
                repaint();
                filter1.setRowFilter(RowFilter.regexFilter(jText_Buscador1.getText(), 1));
            }
        });
        filter1 = new TableRowSorter(this.jTable1.getModel());
        this.jTable1.setRowSorter(filter1);
    }//GEN-LAST:event_jText_Buscador1KeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        rown = jTable1.rowAtPoint(evt.getPoint());

        int column = jTable1.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTable1.getRowHeight();
        
        if(row < jTable1.getRowCount() && row >= 0 && column < jTable1.getColumnCount() && column >= 0){
            Object value = jTable1.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String placa = ""+jTable1.getValueAt(rown, 1);
                String tipo = ""+jTable1.getValueAt(rown, 2);
                String deuda = ""+jTable1.getValueAt(rown, 3);
                double valor_deuda = Double.parseDouble(deuda);
                if(boton.getName().equals("t"))
                {                    
                    int result =  JOptionPane.showConfirmDialog(this, "¿Desea renovar la mensualidad de este vehiculo?", "Renovar Mensualidad",JOptionPane.YES_NO_OPTION);
                    if(result == 0)
                    {
                        ParqueaderoMes obj = new ParqueaderoMes();
                        String resultado = obj.RenovarMensualidad(Conexion.obtener(), placa, tipo);
                        if(resultado.equalsIgnoreCase("La renovación de la mensualidad ha sido exitosa"))
                        {
                            JOptionPane.showMessageDialog(null, resultado);
                            Mensual f=new Mensual();
                            this.removeAll();
                            this.setLayout(new BorderLayout());
                            this.add(f,BorderLayout.CENTER);
                            this.repaint();
                            this.revalidate();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, resultado);
                            Mensual f=new Mensual();
                            this.removeAll();
                            this.setLayout(new BorderLayout());
                            this.add(f,BorderLayout.CENTER);
                            this.repaint();
                            this.revalidate();
                        }
                    }
                    /*RegistrarAbonoMensual obj=new RegistrarAbonoMensual();
                    obj.placa = placa;                    
                    obj.setLabels();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(obj,BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();*/
                }
                if(boton.getName().equals("p"))
                {                 
                    RegistrarAbonoMensual obj=new RegistrarAbonoMensual();
                    obj.placa = placa;
                    obj.deuda = valor_deuda;
                    obj.setLabels();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(obj,BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked
    
    public void Cargar_Datos()
    {
        jTable2.setDefaultRenderer(Object.class, new RenderTabla());
        ParqueaderoMes obj = new ParqueaderoMes();
        ArrayList<Object> lista = new ArrayList<Object>();
        lista = obj.LoadInformacionTotalMensual(Conexion.obtener());
        if(lista.size() == 0)
        {
            DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
            modelo.addColumn("No hay registros");
        }
        else
        {
            ArrayList<String> columnas = (ArrayList<String>) lista.get(0);
            DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
            for(int i=0;i<columnas.size();i++)
            {
                modelo.addColumn(columnas.get(i));            
            }
            modelo.addColumn("ACCIONES");

            for(int i=1;i<lista.size();i++)
            {
                ArrayList<String> lista_info = new ArrayList<String>();                        
                JButton btn_visualizar_2 = new JButton("Realizar Pago");
                btn_visualizar_2.setName("t");
                btn_visualizar_2.setBounds(0, 0, 60, 30);
                lista_info = (ArrayList<String>) lista.get(i);
                Object [] fila = new Object[lista_info.size()+1];
                for(int j=0;j<lista_info.size();j++)
                {
                    fila [j] = lista_info.get(j);
                }                                  
                fila[lista_info.size()] = btn_visualizar_2;            
                modelo.addRow(fila);            
            }
            this.jTable2.setModel(modelo);
        }                
    }
    public void Cargar_Datos_Men_Ven()
    {
        jTable1.setDefaultRenderer(Object.class, new RenderTabla());
        ParqueaderoMes obj = new ParqueaderoMes();
        ArrayList<Object> lista = new ArrayList<Object>();
        lista = obj.CargarInformacionMensualidadVenc(Conexion.obtener());
        if(lista.size() == 0)
        {
            DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
            modelo.addColumn("No hay registros");
        }
        else
        {
            ArrayList<String> columnas = (ArrayList<String>) lista.get(0);
            DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
            for(int i=0;i<columnas.size();i++)
            {
                modelo.addColumn(columnas.get(i));            
            }
            modelo.addColumn("ACCIONES");
            modelo.addColumn("ACCIONES");
            for(int i=1;i<lista.size();i++)
            {
                ArrayList<String> lista_info = new ArrayList<String>();                        
                JButton btn_visualizar_2 = new JButton("Actualizar/Activar");
                btn_visualizar_2.setName("t");
                btn_visualizar_2.setBounds(0, 0, 60, 30);
                JButton btn_visualizar_3 = new JButton("Realizar Pago");
                btn_visualizar_3.setName("p");
                btn_visualizar_3.setBounds(0, 0, 60, 30);
                lista_info = (ArrayList<String>) lista.get(i);
                Object [] fila = new Object[lista_info.size()+2];
                for(int j=0;j<lista_info.size();j++)
                {
                    fila [j] = lista_info.get(j);
                }                                  
                fila[lista_info.size()] = btn_visualizar_2;
                fila[lista_info.size()+1] = btn_visualizar_3;
                modelo.addRow(fila);            
            }
            this.jTable1.setModel(modelo);
        }                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JLabel jLabel_icn_add2;
    private javax.swing.JLabel jLabel_icn_addE;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JLabel jLabel_icn_inf1;
    private javax.swing.JPanel jPanel_Añadir;
    private javax.swing.JPanel jPanel_Informe;
    private javax.swing.JPanel jPanel_Informe_Entradas_Diarias;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Buscador;
    private javax.swing.JTextField jText_Buscador1;
    // End of variables declaration//GEN-END:variables
    
}
