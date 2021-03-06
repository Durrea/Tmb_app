/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.InterfacesAdmin;

import Presentacion.*;
import Servicios.Administrador;
import Servicios.Conexion;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author Santiago Ortega
 */
public class Facturacion extends javax.swing.JPanel {

    /**
     * Creates new form Parqueadero
     */
    ImageIcon ii;
    public Facturacion() {
        initComponents();
        this.Cargar_Informacion();
        InputMap map2 = this.jText_IVA.getInputMap(this.jText_IVA.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        //this.jText_IVA.setEditable(false);
        //this.jText_Desc.setEditable(false);
        //this.jText_NIT.setEditable(false);
    }
    public int idRecep;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFM = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jText_Desc = new javax.swing.JTextField();
        jText_NIT = new javax.swing.JTextField();
        jText_IVA = new javax.swing.JTextField();
        jPanel_EditDesc = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_EditNit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_EditIva = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_Guardar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(820, 610));

        jPanelFM.setBackground(new java.awt.Color(36, 47, 65));
        jPanelFM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Facturación");

        jText_Desc.setBackground(new java.awt.Color(36, 47, 65));
        jText_Desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Desc.setForeground(new java.awt.Color(255, 255, 255));
        jText_Desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_Desc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jText_Desc.setEnabled(false);
        jText_Desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_DescKeyTyped(evt);
            }
        });

        jText_NIT.setBackground(new java.awt.Color(36, 47, 65));
        jText_NIT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_NIT.setForeground(new java.awt.Color(255, 255, 255));
        jText_NIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_NIT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jText_NIT.setEnabled(false);

        jText_IVA.setBackground(new java.awt.Color(36, 47, 65));
        jText_IVA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_IVA.setForeground(new java.awt.Color(255, 255, 255));
        jText_IVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jText_IVA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jText_IVA.setEnabled(false);
        jText_IVA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_IVAKeyTyped(evt);
            }
        });

        jPanel_EditDesc.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_EditDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_EditDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_EditDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_EditDescMouseClicked(evt);
            }
        });
        jPanel_EditDesc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar");
        jPanel_EditDesc.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel_EditNit.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_EditNit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_EditNit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_EditNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_EditNitMouseClicked(evt);
            }
        });
        jPanel_EditNit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Editar");
        jPanel_EditNit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel_EditIva.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_EditIva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_EditIva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_EditIva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_EditIvaMouseClicked(evt);
            }
        });
        jPanel_EditIva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editar");
        jPanel_EditIva.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel_Guardar.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_GuardarMouseClicked(evt);
            }
        });
        jPanel_Guardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Guardar");
        jPanel_Guardar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NIT");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("IVA");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Descripción");

        javax.swing.GroupLayout jPanelFMLayout = new javax.swing.GroupLayout(jPanelFM);
        jPanelFM.setLayout(jPanelFMLayout);
        jPanelFMLayout.setHorizontalGroup(
            jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .addGroup(jPanelFMLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelFMLayout.createSequentialGroup()
                            .addComponent(jText_NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel_EditNit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelFMLayout.createSequentialGroup()
                            .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jText_IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jText_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel_EditDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel_EditIva, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFMLayout.setVerticalGroup(
            jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_EditNit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_EditDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addGroup(jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_IVA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_EditIva, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanel_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jPanelFM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_EditIvaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_EditIvaMouseClicked
        // TODO add your handling code here:
        this.jText_IVA.setEnabled(true);
    }//GEN-LAST:event_jPanel_EditIvaMouseClicked

    private void jPanel_EditDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_EditDescMouseClicked
        // TODO add your handling code here:
        this.jText_Desc.setEnabled(true);
    }//GEN-LAST:event_jPanel_EditDescMouseClicked

    private void jPanel_EditNitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_EditNitMouseClicked
        // TODO add your handling code here:
        this.jText_NIT.setEnabled(true);
    }//GEN-LAST:event_jPanel_EditNitMouseClicked

    private void jPanel_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_GuardarMouseClicked
        // TODO add your handling code here:
        int result =  JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?", "Guardar",JOptionPane.YES_NO_OPTION);
        if(result == 0)
        {
            if(!this.jText_IVA.getText().equalsIgnoreCase("")&&!this.jText_NIT.getText().equalsIgnoreCase("")&&!this.jText_Desc.getText().equalsIgnoreCase(""))
            {
                Administrador admin = new Administrador();
                String resultado = admin.ActualizarEncabezado(Conexion.obtener(), 
                        this.jText_IVA.getText(), this.jText_NIT.getText(), this.jText_Desc.getText());
                if(resultado.equalsIgnoreCase("Actualización exitosa"))
                {
                    JOptionPane.showMessageDialog(null, resultado);
                    Facturacion h = new Facturacion();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(h, BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, resultado);
                    Facturacion h = new Facturacion();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(h, BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios.");
            }            
        }        
    }//GEN-LAST:event_jPanel_GuardarMouseClicked

    private void jText_DescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_DescKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
        
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();            
            c = cadena.charAt(0);
            evt.setKeyChar(c);            
        } 
    }//GEN-LAST:event_jText_DescKeyTyped

    private void jText_IVAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_IVAKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_IVAKeyTyped

    public void Cargar_Informacion()
    {
        Administrador admin = new Administrador();
        ArrayList<String> res = admin.CargarInfoEncabezado(Conexion.obtener());
        if(res.size() == 1)
        {
            JOptionPane.showMessageDialog(null, res.get(0));
        }
        else
        {
            this.jText_IVA.setText(res.get(0));
            this.jText_NIT.setText(res.get(1));
            this.jText_Desc.setText(res.get(2));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFM;
    private javax.swing.JPanel jPanel_EditDesc;
    private javax.swing.JPanel jPanel_EditIva;
    private javax.swing.JPanel jPanel_EditNit;
    private javax.swing.JPanel jPanel_Guardar;
    private javax.swing.JTextField jText_Desc;
    private javax.swing.JTextField jText_IVA;
    private javax.swing.JTextField jText_NIT;
    // End of variables declaration//GEN-END:variables
}
