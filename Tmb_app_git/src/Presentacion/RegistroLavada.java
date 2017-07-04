/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Lavador;
import Modelos.Tarifa_lavadero;
import Modelos.Vehiculo;

import Servicios.Conexion;
import Servicios.SLavadero;
import Servicios.Sesion;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Santiago Ortega
 */
public class RegistroLavada extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    public RegistroLavada() {
        initComponents();
        LoadLavadores();
        LoadAllVehiculos();
        LoadLavadas();
        calcularValor();
        jText_ValorOtro.setVisible(false);
        jLabelVTipoLavadoN.setVisible(false);
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
        jPanel_Registrar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel_Cancelar = new javax.swing.JPanel();
        jLabel_icn_canc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCombo_TipoV = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCombo_TpoLvador = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jCombo_TpoLvda = new javax.swing.JComboBox<>();
        jText_ValorOtro = new javax.swing.JTextField();
        jText_ValorLavdo = new javax.swing.JTextField();
        jLabelVTipoLavado = new javax.swing.JLabel();
        jText_MarcaV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelVTipoLavadoN = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabelVTipoLavadoN1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar Lavada");

        jText_Placa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_PlacaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_PlacaKeyTyped(evt);
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

        jCombo_TipoV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCombo_TipoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_TipoVActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Tipo Vehiculo");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Lavador");

        jCombo_TpoLvador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Tipo de Lavado");

        jCombo_TpoLvda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCombo_TpoLvda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_TpoLvdaActionPerformed(evt);
            }
        });

        jText_ValorOtro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_ValorOtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_ValorOtroKeyTyped(evt);
            }
        });

        jText_ValorLavdo.setEditable(false);
        jText_ValorLavdo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_ValorLavdo.setRequestFocusEnabled(false);

        jLabelVTipoLavado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelVTipoLavado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVTipoLavado.setText(" Valor Tipo Lavado");

        jText_MarcaV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_MarcaV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_MarcaVKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Placa Vehiculo");

        jLabelVTipoLavadoN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelVTipoLavadoN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVTipoLavadoN.setText(" Ingresar Valor Tipo Lavado");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Marca Vehiculo");

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea);

        jLabelVTipoLavadoN1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelVTipoLavadoN1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVTipoLavadoN1.setText(" Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jText_Placa)
                    .addComponent(jCombo_TipoV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_TpoLvda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_ValorOtro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVTipoLavado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_MarcaV)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jText_ValorLavdo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVTipoLavadoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_TpoLvador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVTipoLavadoN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(276, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TpoLvador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_MarcaV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TpoLvda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVTipoLavado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_ValorLavdo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVTipoLavadoN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_ValorOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVTipoLavadoN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

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
         
        String res=validar();
        
        if(!res.equals("Por favor Ingresar:"))
        {
           JOptionPane.showMessageDialog(null,res,"Error",JOptionPane.ERROR_MESSAGE);
        }else{
            SLavadero obj = new SLavadero(); 
            Sesion instancia = Sesion.getInstanciaSesion();
            Lavador lavador=new Lavador();
            lavador.setLavador_codigo(Integer.valueOf((String)jCombo_TpoLvador.getSelectedItem()));
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setVehiculo_placa(jText_Placa.getText());
            vehiculo.setVehiculo_tipo((String)jCombo_TipoV.getSelectedItem());
            vehiculo.setVehiculo_marca(jText_MarcaV.getText());
            Tarifa_lavadero tarifa=new Tarifa_lavadero();
            
            if(jCombo_TpoLvda.getSelectedIndex()!=-1 && jCombo_TpoLvda.getItemCount()!=0){
                if(jCombo_TpoLvda.getSelectedItem().equals("Otro")){
                    tarifa.setTipo_lavada((String) jCombo_TpoLvda.getSelectedItem());
                    tarifa.setValor_lavada(Float.valueOf(jText_ValorOtro.getText()));
                }else{
                    tarifa.setTipo_lavada((String) jCombo_TpoLvda.getSelectedItem());
                    tarifa.setValor_lavada(Float.valueOf(jText_ValorLavdo.getText()));
                }
            }
            String msj = obj.registerLavadores
                            (Conexion.obtener(),lavador,vehiculo,tarifa,jTextArea.getText(),instancia.getIdentificador());
            JOptionPane.showMessageDialog(null, msj);
            
            Lavadero lavadero=new Lavadero();
            this.removeAll();
            this.setLayout(new BorderLayout());
            this.add(lavadero,BorderLayout.CENTER);
            this.repaint();
            this.revalidate();
            
        }
        
    }//GEN-LAST:event_jPanel_RegistrarMouseClicked
    
    public final String validar(){
        
        String res="Por favor Ingresar:";
        
        if(jCombo_TpoLvador.getSelectedIndex()==-1 && jCombo_TpoLvador.getItemCount()==0){res+="\nTipo Lavador";}
        if(jText_Placa.getText().equals("")){res+="\nPlaca Vehiculo";}
        if(jCombo_TipoV.getSelectedIndex()==-1 && jCombo_TipoV.getItemCount()==0){res+="\nTipo Vehiculo";}
        if(jText_MarcaV.getText().equals("")){res+="\nMarca Vehiculo";}
        if(jTextArea.getText().equals("")){res+="\nDescripcion";}
        
        if(jCombo_TpoLvda.getSelectedIndex()!=-1 && jCombo_TpoLvda.getItemCount()!=0){
            if(jCombo_TpoLvda.getSelectedItem().equals("Otro")){
                
                if(jText_ValorOtro.getText().equals("")){
                    res+="\nValor Lavado Otro";
                }
            }else{
                if(jText_ValorLavdo.getText().equals("") ){
                    res+="\nValor Lavado Otro";
                }
            }
        }else{
            res+="\nTipo Lavado";
            if(jText_ValorLavdo.getText().equals("")){
                res+="\nValor Lavado";
            }
        }
       
        return res; 
    }
   
    
    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        Lavadero m=new Lavadero();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(m,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked

    private void jCombo_TpoLvdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_TpoLvdaActionPerformed
        // TODO add your handling code here:
        if(jCombo_TpoLvda.getItemCount()!=0){
            if(jCombo_TpoLvda.getSelectedItem().equals("Otro")){
                
                jText_ValorOtro.setVisible(true);
                jText_ValorLavdo.setVisible(false);
                jLabelVTipoLavado.setVisible(false);
                jLabelVTipoLavadoN.setVisible(true);
                this.revalidate();
                this.repaint();

            }else{

                jText_ValorOtro.setVisible(false);
                jLabelVTipoLavadoN.setVisible(false);
                jText_ValorLavdo.setVisible(true);   
                jLabelVTipoLavado.setVisible(true);
                calcularValor();
                this.revalidate();
                this.repaint();
            }
        }
    }//GEN-LAST:event_jCombo_TpoLvdaActionPerformed

    private void jCombo_TipoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_TipoVActionPerformed
        // TODO add your handling code here:
        calcularValor();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jCombo_TipoVActionPerformed

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
                    LoadLavadas();
                    calcularValor();
                }
                else
                {
                    
                    LoadVehiculos();
                    LoadLavadas();
                    calcularValor();
                }
            }
            else
            {
                jCombo_TipoV.removeAllItems();
                jText_ValorLavdo.setText("");
                jCombo_TpoLvda.removeAllItems();
            }
    }//GEN-LAST:event_jText_PlacaKeyReleased

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

    private void jText_MarcaVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_MarcaVKeyTyped
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
                
    }//GEN-LAST:event_jText_MarcaVKeyTyped

    private void jText_ValorOtroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_ValorOtroKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jText_ValorOtroKeyTyped

    private void jTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaKeyTyped
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
    }//GEN-LAST:event_jTextAreaKeyTyped
        
    
    public final void LoadVehiculos()
    {
        jCombo_TipoV.removeAllItems();
        SLavadero obj = new SLavadero();
        ArrayList<String> tipos = obj.loadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(!tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                jCombo_TipoV.addItem(tipos.get(i));
            }
        }   
    }
    public void LoadMotos()
    {
        jCombo_TipoV.removeAllItems();
        SLavadero obj = new SLavadero();      
        ArrayList<String> tipos = obj.loadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                this.jCombo_TipoV.addItem(tipos.get(i));
            }            
        }
    }
    
    public final void LoadLavadores()
    {
        
        SLavadero obj = new SLavadero();
        ArrayList<String> tipos = obj.loadCodLavadores(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            jCombo_TpoLvador.addItem(tipos.get(i));
        }  
    }
    
    
    
    public final void LoadLavadas()
    {
        if(jCombo_TipoV.getItemCount()!=0 && jCombo_TpoLvda.getItemCount()==0){
            SLavadero obj = new SLavadero();
            ArrayList<String> tipos = obj.loadTiposLavadas(Conexion.obtener());
            for (int i = 0; i < tipos.size(); i++) 
            {
                jCombo_TpoLvda.addItem(tipos.get(i));
            }
            jCombo_TpoLvda.addItem("Otro");
        }
    }
    
    public final void LoadAllVehiculos()
    {
        jCombo_TipoV.removeAllItems();
        SLavadero obj = new SLavadero();        
        ArrayList<String> tipos = obj.loadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            jCombo_TipoV.addItem(tipos.get(i));                       
        }
    }
    
    public final void calcularValor(){
        
        if(jCombo_TipoV.getItemCount()!=0&& jCombo_TpoLvda.getItemCount()!=0){
            SLavadero obj = new SLavadero();
            if(jCombo_TpoLvda.getSelectedItem().equals("Otro")){
               jText_ValorLavdo.setVisible(false);
            }else{

                float valor=obj.costoLavada(Conexion.obtener(),
                        String.valueOf(jCombo_TipoV.getSelectedItem()),
                        String.valueOf(jCombo_TpoLvda.getSelectedItem()) );
                if(valor!=0){
                    jText_ValorLavdo.setText(Float.toString(valor));
                }else{
                    JOptionPane.showMessageDialog(new JPanel(), "Tarifa no Existe", "Error", JOptionPane.ERROR_MESSAGE);
                    jCombo_TpoLvda.removeAllItems();
                    LoadLavadas();
                    calcularValor();
                }
            }
        }
        
    }
    
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_TipoV;
    private javax.swing.JComboBox<String> jCombo_TpoLvador;
    private javax.swing.JComboBox<String> jCombo_TpoLvda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelVTipoLavado;
    private javax.swing.JLabel jLabelVTipoLavadoN;
    private javax.swing.JLabel jLabelVTipoLavadoN1;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jText_MarcaV;
    private javax.swing.JTextField jText_Placa;
    private javax.swing.JTextField jText_ValorLavdo;
    private javax.swing.JTextField jText_ValorOtro;
    // End of variables declaration//GEN-END:variables
}
