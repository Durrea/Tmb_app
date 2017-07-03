/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.Administrador;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.ParquaderoFraccion;
import Servicios.Sesion;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        //this.setLayout(new BorderLayout());
        //this.add(this.jLabel1,BorderLayout.NORTH);
        //this.add(this.jLabel2,BorderLayout.NORTH);
        //this.add(this.jLabel3,BorderLayout.CENTER);
        //this.add(this.jText_Placa,BorderLayout.CENTER);
        //this.add(this.jLabel4,BorderLayout.CENTER);
        //this.add(this.TipoVehiculo,BorderLayout.CENTER);
        LoadAllVehiculos();
        //hhhhhh
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
        jPanel_Ag = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TipoVehiculo = new javax.swing.JComboBox<>();
        jText_Placa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel_icn_inf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"))); // NOI18N
        jPanel_Cancelar.add(jLabel_icn_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cancelar");
        jPanel_Cancelar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Cancelar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jPanel_Ag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Ag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel_Ag.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro entradas por fraccion");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Para realizar el registro de una entrada por fracción debe diligenciar la siguiente información.");

        jText_Placa.setBackground(new java.awt.Color(36, 47, 65));
        jText_Placa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Placa.setForeground(new java.awt.Color(255, 255, 255));
        jText_Placa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        jText_Placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_PlacaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_PlacaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Vehiculo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Ag, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jText_Placa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TipoVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(TipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Ag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        // TODO add your handling code here:        
        Fraccion f=new Fraccion();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(f,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked

    
    
    private void jPanel_AgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AgMouseClicked
        // TODO add your handling code here:
        if(!jText_Placa.getText().equalsIgnoreCase(""))
        {
            ValidadorCadenas val = new ValidadorCadenas();
            if(val.ValidarCadenasPlaca(jText_Placa.getText())!=0)
            {
                int resultopcion_registrar = JOptionPane.showConfirmDialog(null, "¿Desea realizar el registro?");
                if(resultopcion_registrar == 0)
                {
                    ParquaderoFraccion obj = new ParquaderoFraccion();
                    Sesion instancia = Sesion.getInstanciaSesion();
                    //System.out.println(instancia.getIdentificador());
                    String resultado = obj.RegisterEntryFraccion(Conexion.obtener(), jText_Placa.getText(), (String) TipoVehiculo.getSelectedItem(), instancia.getIdentificador());
                    if(resultado.equalsIgnoreCase("Se ha realizado el registro"))
                    {
                        JOptionPane.showMessageDialog(null, resultado);
                        int resultopcion = JOptionPane.showConfirmDialog(null, "¿Desea imprimir el recibo correspondiente?");
                        if(resultopcion == 0)
                        {
                            ImpresionFacturas impfac = new ImpresionFacturas();
                            boolean res = impfac.FacturaFraccion(0, jText_Placa.getText(),Sesion.getInstanciaSesion().getIdentificador());
                            if(!res)
                            {
                                JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la impresión");
                            }
                        }                                                                                        
                        Fraccion f=new Fraccion();
                        this.removeAll();
                        this.setLayout(new BorderLayout());
                        this.add(f,BorderLayout.CENTER);
                        this.repaint();
                        this.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, resultado);
                    }
                }                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Formato incorrecto. Formato para las placas ej: AAA123");
            }
        }
        else
        {
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

    private void jText_PlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_PlacaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_PlacaMouseClicked

    private void jText_PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_PlacaActionPerformed

    private void jText_PlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_PlacaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();            
            c = cadena.charAt(0);
            evt.setKeyChar(c);            
        }        
    }//GEN-LAST:event_jText_PlacaKeyTyped

    private void jText_PlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_PlacaKeyReleased
        // TODO add your handling code here:
        String cadena = this.jText_Placa.getText();
        ValidadorCadenas val = new ValidadorCadenas();
            int res = val.ValidarCadenasPlaca(cadena);
            if(res !=0)
            {
                if(res == 1)
                {
                    LoadMotos();
                }
                else
                {
                    LoadVehiculos();
                }
            }
            else
            {
                this.TipoVehiculo.removeAllItems();
            }
    }//GEN-LAST:event_jText_PlacaKeyReleased
    
    
    public void LoadAllVehiculos()
    {
        this.TipoVehiculo.removeAllItems();
        Administrador obj = new Administrador();        
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            this.TipoVehiculo.addItem(tipos.get(i));                       
        }
    }
    public void LoadVehiculos()
    {
        this.TipoVehiculo.removeAllItems();
        Administrador obj = new Administrador();        
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(!tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                this.TipoVehiculo.addItem(tipos.get(i));
            }            
        }
    }
    public void LoadMotos()
    {
        this.TipoVehiculo.removeAllItems();
        Administrador obj = new Administrador();        
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                this.TipoVehiculo.addItem(tipos.get(i));
            }            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JPanel jPanel_Ag;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jText_Placa;
    // End of variables declaration//GEN-END:variables
}
