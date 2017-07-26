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
import Servicios.ValidadorCadenas;
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
public class RegistrarAbonoMensual extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */    
    String placa;
    double deuda;
    public RegistrarAbonoMensual() {
        initComponents();        
        InputMap map2 = this.jTextField1.getInputMap(jTextField1.WHEN_FOCUSED);
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

        jPanel_Pagar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_icn_addE = new javax.swing.JLabel();
        jPanel_Cancelar_Pago = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_icn_canc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel_Pagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_PagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_PagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_PagarMouseExited(evt);
            }
        });
        jPanel_Pagar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Pagar");
        jPanel_Pagar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 20));

        jLabel_icn_addE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refund_20px.png"))); // NOI18N
        jPanel_Pagar.add(jLabel_icn_addE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 40));

        jPanel_Cancelar_Pago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Cancelar_Pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Cancelar_Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Cancelar_PagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_Cancelar_PagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_Cancelar_PagoMouseExited(evt);
            }
        });
        jPanel_Cancelar_Pago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cancelar");
        jPanel_Cancelar_Pago.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 20));

        jLabel_icn_canc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"))); // NOI18N
        jPanel_Cancelar_Pago.add(jLabel_icn_canc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 20, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pago Mensual");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valor a pagar");

        jTextField1.setBackground(new java.awt.Color(36, 47, 65));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jPanel_Cancelar_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Cancelar_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jPanel_PagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PagarMouseClicked
        // TODO add your handling code here:
        String valor_pagar = this.jTextField1.getText();
        if(!valor_pagar.equalsIgnoreCase(""))
        {
            ValidadorCadenas val = new ValidadorCadenas();
            if(val.validarPrecio(valor_pagar))
            {
                ParqueaderoMes obj = new ParqueaderoMes();
                Sesion instancia = Sesion.getInstanciaSesion();
                int idrecep = instancia.getIdentificador();
                int result =  JOptionPane.showConfirmDialog(this, "¿Desea realizar el pago del abono mensual?", "Pago Abono Mensual",JOptionPane.YES_NO_OPTION);
                if(result == 0)
                {
                    String resultado = obj.RegistrarAbonoMensual(Conexion.obtener(), Double.parseDouble(valor_pagar), this.placa, idrecep);
                    if(resultado.equalsIgnoreCase("Se ha realizado el abono de la mensualidad con exito"))
                    {
                        JOptionPane.showMessageDialog(null, resultado);
                        Mensual r=new Mensual();
                        this.removeAll();
                        this.setLayout(new BorderLayout());
                        this.add(r,BorderLayout.CENTER);
                        this.repaint();
                        this.revalidate();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, resultado);
                        this.jTextField1.setText("");
                    }  
                }                              
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El valor escrito debe ser numerico y multiplico de 50");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Debe digitar un valor a pagar");
        }                                
    }//GEN-LAST:event_jPanel_PagarMouseClicked

    private void jPanel_PagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PagarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Refund_20px_1.png"));
        jLabel_icn_addE.setIcon(ii);
    }//GEN-LAST:event_jPanel_PagarMouseEntered

    private void jPanel_PagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_PagarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Refund_20px.png"));
        jLabel_icn_addE.setIcon(ii);
    }//GEN-LAST:event_jPanel_PagarMouseExited

    private void jPanel_Cancelar_PagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Cancelar_PagoMouseClicked
        // TODO add your handling code here:
        Mensual ent=new Mensual();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(ent,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_Cancelar_PagoMouseClicked

    private void jPanel_Cancelar_PagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Cancelar_PagoMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px_2.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_Cancelar_PagoMouseEntered

    private void jPanel_Cancelar_PagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Cancelar_PagoMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Cancel_20px.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_Cancelar_PagoMouseExited
    
    public void setLabels()
    {
        this.jLabel2.setText("Vehiculo: "+this.placa);
        this.jLabel4.setText("Valor deuda actual: "+(long)this.deuda);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_addE;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JPanel jPanel_Cancelar_Pago;
    private javax.swing.JPanel jPanel_Pagar;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
}
