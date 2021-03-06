/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.Conexion;
import Servicios.ParqueaderoMes;
import Servicios.ValidadorCadenas;
import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


/**
 *
 * @author Santiago Ortega
 */
public class AddEntradaMensual extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    public AddEntradaMensual() {
        initComponents();
        InputMap map2 = this.jText_Buscar.getInputMap(jText_Buscar.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
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
        jLabel3 = new javax.swing.JLabel();
        jPanel_Añadir = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel_Cancelar = new javax.swing.JPanel();
        jLabel_icn_canc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jText_Buscar = new javax.swing.JTextField();
        jPanel_Buscar = new javax.swing.JPanel();
        jLabel_icn_buscar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jText_Placa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Añadir Entrada");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Para realizar el registro de una entrada, debe buscar el Vehiculo por su Placa.");

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

        jLabel_icn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Añadir.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Añadir Entrada");
        jPanel_Añadir.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 20));

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

        jText_Buscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_BuscarMouseClicked(evt);
            }
        });
        jText_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_BuscarKeyTyped(evt);
            }
        });

        jPanel_Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_BuscarMouseExited(evt);
            }
        });
        jPanel_Buscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_20px_2.png"))); // NOI18N
        jPanel_Buscar.add(jLabel_icn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Buscar");
        jPanel_Buscar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 20));

        jText_Placa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Placa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jText_Placa.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Buscar por placa");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Placa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jPanel_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jText_Buscar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jText_Placa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_AñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AñadirMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_AñadirMouseEntered

    private void jPanel_AñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AñadirMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_AñadirMouseExited

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        Mensual m=new Mensual();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(m,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked

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

    private void jText_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_BuscarMouseClicked
        // TODO add your handling code here:
        if(jText_Buscar.getText().equals("Buscar por Placa")){
            jText_Buscar.setText("");} 
    }//GEN-LAST:event_jText_BuscarMouseClicked

    private void jPanel_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BuscarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Search_20px.png"));
        jLabel_icn_buscar.setIcon(ii);
    }//GEN-LAST:event_jPanel_BuscarMouseEntered

    private void jPanel_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BuscarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Search_20px_2.png"));
        jLabel_icn_buscar.setIcon(ii);
    }//GEN-LAST:event_jPanel_BuscarMouseExited

    private void jPanel_BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_BuscarMouseClicked
        // TODO add your handling code here:
        //jText_Placa.setText("Hola Mundo");
        ValidadorCadenas val = new ValidadorCadenas();
        if(!this.jText_Buscar.getText().equalsIgnoreCase(""))
        {
            if(val.ValidarCadenasPlaca(this.jText_Buscar.getText())!=0)
            {
                ParqueaderoMes obj = new ParqueaderoMes();
                String res = obj.BuscadorPlacaMensual(Conexion.obtener(), this.jText_Buscar.getText());
                if(!res.equalsIgnoreCase("Registrado"))
                {
                    this.jText_Placa.setText(res);
                }
                else
                {
                    this.jText_Placa.setText(this.jText_Buscar.getText());
                    this.jText_Buscar.setEnabled(false);
                    this.jPanel_Buscar.setEnabled(false);                    
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Formato de placa incorrecto");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El campo placa no puede estar vacio");
        }
    }//GEN-LAST:event_jPanel_BuscarMouseClicked

    private void jText_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_BuscarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();            
            c = cadena.charAt(0);
            evt.setKeyChar(c);            
        }
        if((c==KeyEvent.VK_SPACE) || (c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_CONTROL))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jText_BuscarKeyTyped

    private void jPanel_AñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AñadirMouseClicked
        // TODO add your handling code here:
        ValidadorCadenas val = new ValidadorCadenas();
        if(!this.jText_Placa.getText().equalsIgnoreCase(""))
        {
            if(val.ValidarCadenasPlaca(this.jText_Placa.getText()) != 0)
            {
                ParqueaderoMes obj = new ParqueaderoMes();
                String res = obj.RegistrarEntradaDiaria(Conexion.obtener(), this.jText_Placa.getText());
                if(res.equalsIgnoreCase("Exitoso"))                    
                {
                    JOptionPane.showMessageDialog(null, "Registro "+res);
                    Mensual m=new Mensual();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(m,BorderLayout.CENTER);
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
                JOptionPane.showMessageDialog(null, this.jText_Placa.getText());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe buscar un vehiculo por la placa");
        }
    }//GEN-LAST:event_jPanel_AñadirMouseClicked
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_buscar;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JPanel jPanel_Añadir;
    private javax.swing.JPanel jPanel_Buscar;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JTextField jText_Buscar;
    private javax.swing.JTextField jText_Placa;
    // End of variables declaration//GEN-END:variables
}
