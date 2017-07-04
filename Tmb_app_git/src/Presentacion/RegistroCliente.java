/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Cliente;
import Modelos.Vehiculo;
import Servicios.Administrador;
import Servicios.Conexion;
import Servicios.ParqueaderoMes;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;





/**
 *
 * @author Santiago Ortega
 */
public class RegistroCliente extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    public RegistroCliente() {
        initComponents();
        LoadAllVehiculos();
        //jCombo_TipoA.setSelectedItem(null); 
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

        jLabel4 = new javax.swing.JLabel();
        jText_Placa = new javax.swing.JTextField();
        jText_Color = new javax.swing.JTextField();
        jText_Cliente = new javax.swing.JTextField();
        jText_Marca = new javax.swing.JTextField();
        jText_Telefono = new javax.swing.JTextField();
        jText_Cedula = new javax.swing.JTextField();
        jPanel_Registrar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel_Cancelar = new javax.swing.JPanel();
        jLabel_icn_canc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCombo_TipoA = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar Cliente");

        jText_Placa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_PlacaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_PlacaKeyTyped(evt);
            }
        });

        jText_Color.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ColorActionPerformed(evt);
            }
        });
        jText_Color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_ColorKeyTyped(evt);
            }
        });

        jText_Cliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_ClienteKeyTyped(evt);
            }
        });

        jText_Marca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_MarcaKeyTyped(evt);
            }
        });

        jText_Telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_TelefonoKeyTyped(evt);
            }
        });

        jText_Cedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_CedulaKeyTyped(evt);
            }
        });

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
        jPanel_Registrar.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Registrar");
        jPanel_Registrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 20));

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

        jLabel_icn_canc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"))); // NOI18N
        jPanel_Cancelar.add(jLabel_icn_canc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Cancelar");
        jPanel_Cancelar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 20));

        jCombo_TipoA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Tipo Vehiculo");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Cedula");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Telefono");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Placa");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Color");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Marca");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jText_Cliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Placa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Color, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Marca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Cedula)
                    .addComponent(jCombo_TipoA, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(277, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jText_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ColorActionPerformed

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

    private void jPanel_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px_2.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseEntered

    private void jPanel_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseExited

    private void jPanel_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseClicked
       // TODO add your handling code here:
        ValidadorCadenas val = new ValidadorCadenas();
        if(!this.jText_Cliente.getText().equalsIgnoreCase("")&&!this.jText_Cedula.getText().equalsIgnoreCase("")&&
           !this.jText_Telefono.getText().equalsIgnoreCase("")&&!this.jText_Placa.getText().equalsIgnoreCase("")&&
           !this.jCombo_TipoA.getSelectedItem().toString().equalsIgnoreCase("")&&!this.jText_Color.getText().equalsIgnoreCase("")&&
           !this.jText_Marca.getText().equalsIgnoreCase(""))
        {
            if(val.ValidarCadenasPlaca(this.jText_Placa.getText())!=0)
            {
                if(val.validarNumeros(this.jText_Cedula.getText()) &&val.validarNumeros(this.jText_Telefono.getText()))
                {
                    ParqueaderoMes obj = new ParqueaderoMes();
                    Cliente cliente = new Cliente();
                    cliente.setCliente_nombre(this.jText_Cliente.getText());
                    cliente.setCliente_cedula(this.jText_Cedula.getText());
                    cliente.setCliente_telefono(this.jText_Telefono.getText());
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo.setVehiculo_placa(this.jText_Placa.getText());
                    vehiculo.setVehiculo_tipo((String) this.jCombo_TipoA.getSelectedItem());
                    vehiculo.setVehiculo_color(this.jText_Color.getText());
                    vehiculo.setVehiculo_marca(this.jText_Marca.getText());
                    String res = obj.RegisterCustomer(Conexion.obtener(), cliente, vehiculo);
                    if(res.equalsIgnoreCase("Registro realizado con exito"))
                    {
                        JOptionPane.showMessageDialog(null, res);
                        Mensual r=new Mensual();
                        this.removeAll();
                        this.setLayout(new BorderLayout());
                        this.add(r,BorderLayout.CENTER);
                        this.repaint();
                        this.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, res);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Los campos cedula y telefono deben ser numericos");
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
    }//GEN-LAST:event_jPanel_RegistrarMouseClicked

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        Mensual m=new Mensual();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(m,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked
    
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
                this.jCombo_TipoA.removeAllItems();
            }
    }//GEN-LAST:event_jText_PlacaKeyReleased

    private void jText_ClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_ClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();            
            c = cadena.charAt(0);
            evt.setKeyChar(c);            
        }         
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_ClienteKeyTyped

    private void jText_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_CedulaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();        
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_CedulaKeyTyped

    private void jText_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_TelefonoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_TelefonoKeyTyped

    private void jText_ColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_ColorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();            
            c = cadena.charAt(0);
            evt.setKeyChar(c);            
        }         
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_ColorKeyTyped

    private void jText_MarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_MarcaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();            
            c = cadena.charAt(0);
            evt.setKeyChar(c);            
        } 
        if((Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_MarcaKeyTyped
    
    public void LoadVehiculos()
    {
        this.jCombo_TipoA.removeAllItems();
        Administrador obj = new Administrador();        
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(!tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                this.jCombo_TipoA.addItem(tipos.get(i));
            }            
        }
    }
    public void LoadMotos()
    {
        this.jCombo_TipoA.removeAllItems();
        Administrador obj = new Administrador();        
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                this.jCombo_TipoA.addItem(tipos.get(i));
            }            
        }
    }
    public void LoadAllVehiculos()
    {
        this.jCombo_TipoA.removeAllItems();
        Administrador obj = new Administrador();        
        ArrayList<String> tipos = obj.LoadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            this.jCombo_TipoA.addItem(tipos.get(i));                       
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_TipoA;
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
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JTextField jText_Cedula;
    private javax.swing.JTextField jText_Cliente;
    private javax.swing.JTextField jText_Color;
    private javax.swing.JTextField jText_Marca;
    private javax.swing.JTextField jText_Placa;
    private javax.swing.JTextField jText_Telefono;
    // End of variables declaration//GEN-END:variables
}
