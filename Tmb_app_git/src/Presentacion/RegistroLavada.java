/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.Administrador;
import Servicios.Conexion;
import Servicios.SLavadero;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;

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
        jText_TipoLavada.setVisible(false);
        jText_IngresarValor.setVisible(false);
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
        jCombo_TipoA = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCombo_TpoLvador = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jCombo_TpoLvda = new javax.swing.JComboBox<>();
        jText_TipoLavada = new javax.swing.JTextField();
        jText_IngresarValor = new javax.swing.JTextField();
        jText_Valor = new javax.swing.JTextField();
        jLabelVTipoLavado = new javax.swing.JLabel();
        jText_MarcaV = new javax.swing.JTextField();

        setBackground(new java.awt.Color(36, 47, 65));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registrar Lavada");

        jText_Placa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Placa.setText("Ingresar Placa Vehiculo");
        jText_Placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_PlacaMouseClicked(evt);
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

        jPanel_Registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jCombo_TipoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCombo_TipoAMouseClicked(evt);
            }
        });
        jCombo_TipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_TipoAActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Tipo Vehiculo");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Lavador");

        jCombo_TpoLvador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCombo_TpoLvador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCombo_TpoLvadorMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Tipo de Lavado");

        jCombo_TpoLvda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCombo_TpoLvda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCombo_TpoLvdaMouseClicked(evt);
            }
        });
        jCombo_TpoLvda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_TpoLvdaActionPerformed(evt);
            }
        });

        jText_TipoLavada.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_TipoLavada.setText("Ingresar Tipo de Lavada");
        jText_TipoLavada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_TipoLavadaMouseClicked(evt);
            }
        });

        jText_IngresarValor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_IngresarValor.setText("Ingresar Valor Tipo de Lavada");
        jText_IngresarValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_IngresarValorMouseClicked(evt);
            }
        });

        jText_Valor.setEditable(false);
        jText_Valor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabelVTipoLavado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelVTipoLavado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVTipoLavado.setText(" Valor Tipo Lavado");

        jText_MarcaV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_MarcaV.setText("Ingresar Marca Vehiculo");
        jText_MarcaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_MarcaVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jText_Placa)
                    .addComponent(jCombo_TipoA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_TpoLvador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCombo_TpoLvda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_TipoLavada, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_IngresarValor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelVTipoLavado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jText_MarcaV)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(jText_Valor))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TpoLvador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jText_MarcaV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombo_TpoLvda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelVTipoLavado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jText_TipoLavada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jText_IngresarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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
         
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //String DateToStr = format.format(jXDateFPago.getDate());
        //System.out.println(DateToStr);

    }//GEN-LAST:event_jPanel_RegistrarMouseClicked

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        Lavadero m=new Lavadero();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(m,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked

    private void jText_PlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_PlacaMouseClicked
        // TODO add your handling code here:
        reiniciar();
        if(jText_Placa.getText().equals("Ingresar Placa Vehiculo")){
        jText_Placa.setText("");}
    }//GEN-LAST:event_jText_PlacaMouseClicked

    private void jCombo_TpoLvdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_TpoLvdaActionPerformed
        // TODO add your handling code here:
        if(jCombo_TpoLvda.getSelectedItem().equals("Otro")){
            jText_TipoLavada.setVisible(true);
            jText_IngresarValor.setVisible(true);
            jText_Valor.setVisible(false);
            this.revalidate();
            this.repaint();
            
        }else{
            
            jText_TipoLavada.setVisible(false);
            jText_IngresarValor.setVisible(false);
            jText_Valor.setVisible(true);
            calcularValor();
            this.revalidate();
            this.repaint();
        }
    }//GEN-LAST:event_jCombo_TpoLvdaActionPerformed

    private void jText_TipoLavadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_TipoLavadaMouseClicked
        // TODO add your handling code here:
        reiniciar();
        if(jText_TipoLavada.getText().equals("Ingresar Tipo de Lavada")){
        jText_TipoLavada.setText("");}
    }//GEN-LAST:event_jText_TipoLavadaMouseClicked

    private void jText_MarcaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_MarcaVMouseClicked
        // TODO add your handling code here:
        reiniciar();
        if(jText_MarcaV.getText().equals("Ingresar Marca Vehiculo")){
        jText_MarcaV.setText("");}
    }//GEN-LAST:event_jText_MarcaVMouseClicked

    private void jCombo_TpoLvadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCombo_TpoLvadorMouseClicked
        // TODO add your handling code here:
        reiniciar();       
    }//GEN-LAST:event_jCombo_TpoLvadorMouseClicked

    private void jCombo_TipoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCombo_TipoAMouseClicked
        // TODO add your handling code here:
        reiniciar();
        
        
    }//GEN-LAST:event_jCombo_TipoAMouseClicked

    private void jCombo_TpoLvdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCombo_TpoLvdaMouseClicked
        // TODO add your handling code here:
        
        //reiniciar();
    }//GEN-LAST:event_jCombo_TpoLvdaMouseClicked

    private void jText_IngresarValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_IngresarValorMouseClicked
        // TODO add your handling code here:
        reiniciar();
        if(jText_IngresarValor.getText().equals("Ingresar Valor Tipo de Lavada")){
        jText_IngresarValor.setText("");}
    }//GEN-LAST:event_jText_IngresarValorMouseClicked

    private void jCombo_TipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_TipoAActionPerformed
        // TODO add your handling code here:
        calcularValor();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jCombo_TipoAActionPerformed

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
                jCombo_TipoA.removeAllItems();
                jText_Valor.setText("");
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
        
    public void reiniciar(){
        
        if(jText_Placa.getText().equals("")){
            jText_Placa.setText("Ingresar Placa Vehiculo");
        }
        
        if(jText_MarcaV.getText().equals("")){
            jText_MarcaV.setText("Ingresar Marca Vehiculo");
        }
        
        if(jText_TipoLavada.getText().equals("")){
            jText_TipoLavada.setText("Ingresar Tipo de Lavada");
        }
        
        if(jText_IngresarValor.getText().equals("")){
            jText_IngresarValor.setText("Ingresar Valor Tipo de Lavada");
        }
    }
    
    public final void LoadVehiculos()
    {
        jCombo_TipoA.removeAllItems();
        SLavadero obj = new SLavadero();
        ArrayList<String> tipos = obj.loadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(!tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                jCombo_TipoA.addItem(tipos.get(i));
            }
        }   
    }
    public void LoadMotos()
    {
        jCombo_TipoA.removeAllItems();
        SLavadero obj = new SLavadero();      
        ArrayList<String> tipos = obj.loadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            if(tipos.get(i).equalsIgnoreCase("MOTO"))
            {
                this.jCombo_TipoA.addItem(tipos.get(i));
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
        SLavadero obj = new SLavadero();
        ArrayList<String> tipos = obj.loadTiposLavadas(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            jCombo_TpoLvda.addItem(tipos.get(i));
        }
        jCombo_TpoLvda.addItem("Otro");
    }
    
    public final void LoadAllVehiculos()
    {
        jCombo_TipoA.removeAllItems();
        SLavadero obj = new SLavadero();        
        ArrayList<String> tipos = obj.loadTiposVehiculos(Conexion.obtener());
        for (int i = 0; i < tipos.size(); i++) 
        {
            jCombo_TipoA.addItem(tipos.get(i));                       
        }
    }
    
    public final void calcularValor(){
        
        if(jCombo_TipoA.getSelectedItem()!=null&& jCombo_TpoLvda.getSelectedItem()!=null){
            SLavadero obj = new SLavadero();
            if(jCombo_TpoLvda.getSelectedItem().equals("Otro")){
               jText_Valor.setVisible(false);
            }else{

                float valor=obj.costoLavada(Conexion.obtener(),
                        String.valueOf(jCombo_TipoA.getSelectedItem()),
                        String.valueOf(jCombo_TpoLvda.getSelectedItem()) );
                jText_Valor.setText(Float.toString(valor));
            }
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCombo_TipoA;
    private javax.swing.JComboBox<String> jCombo_TpoLvador;
    private javax.swing.JComboBox<String> jCombo_TpoLvda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelVTipoLavado;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JTextField jText_IngresarValor;
    private javax.swing.JTextField jText_MarcaV;
    private javax.swing.JTextField jText_Placa;
    private javax.swing.JTextField jText_TipoLavada;
    private javax.swing.JTextField jText_Valor;
    // End of variables declaration//GEN-END:variables
}
