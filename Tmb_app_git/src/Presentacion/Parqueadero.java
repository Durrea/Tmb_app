/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;

/**
 *
 * @author Santiago Ortega
 */
public class Parqueadero extends javax.swing.JPanel {

    /**
     * Creates new form Parqueadero
     */
    ImageIcon ii;
    public Parqueadero() {
        initComponents();
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
        jPanel_Fraccion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_icn_fn = new javax.swing.JLabel();
        jPanel_Mensual = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_icn_ml = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(36, 47, 65));
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(820, 610));

        jPanelFM.setBackground(new java.awt.Color(36, 47, 65));

        javax.swing.GroupLayout jPanelFMLayout = new javax.swing.GroupLayout(jPanelFM);
        jPanelFM.setLayout(jPanelFMLayout);
        jPanelFMLayout.setHorizontalGroup(
            jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelFMLayout.setVerticalGroup(
            jPanelFMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jPanel_Fraccion.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Fraccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Fraccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Fraccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_FraccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_FraccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_FraccionMouseExited(evt);
            }
        });
        jPanel_Fraccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fraccion");
        jPanel_Fraccion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel_icn_fn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Sort Down_20px_1.png"))); // NOI18N
        jPanel_Fraccion.add(jLabel_icn_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel_Mensual.setBackground(new java.awt.Color(102, 102, 102));
        jPanel_Mensual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Mensual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Mensual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_MensualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_MensualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_MensualMouseExited(evt);
            }
        });
        jPanel_Mensual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mensual");
        jPanel_Mensual.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Mensual.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 50));

        jLabel_icn_ml.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Sort Down_20px_1.png"))); // NOI18N
        jPanel_Mensual.add(jLabel_icn_ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel_Fraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_Fraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Mensual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelFM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_FraccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FraccionMouseClicked
        // TODO add your handling code here:
        Cargue_Datos_Fraccion datos = new Cargue_Datos_Fraccion();
        datos.run();
        Fraccion f=new Fraccion(datos.getDatos_fraccion());
        f.idRecep = this.idRecep;
        jPanelFM.removeAll();
        jPanelFM.setLayout(new BorderLayout());
        jPanelFM.add(f,BorderLayout.CENTER);
        jPanelFM.repaint();
        jPanelFM.revalidate();  
    }//GEN-LAST:event_jPanel_FraccionMouseClicked

    private void jPanel_FraccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FraccionMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Sort Down_20px.png"));
        jLabel_icn_fn.setIcon(ii);
    }//GEN-LAST:event_jPanel_FraccionMouseEntered

    private void jPanel_FraccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_FraccionMouseExited
        ii = new ImageIcon(getClass().getResource("/Iconos/Sort Down_20px_1.png"));
        jLabel_icn_fn.setIcon(ii);
    }//GEN-LAST:event_jPanel_FraccionMouseExited

    private void jPanel_MensualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MensualMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Sort Down_20px.png"));
        jLabel_icn_ml.setIcon(ii);
    }//GEN-LAST:event_jPanel_MensualMouseEntered

    private void jPanel_MensualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MensualMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Sort Down_20px_1.png"));
        jLabel_icn_ml.setIcon(ii);
    }//GEN-LAST:event_jPanel_MensualMouseExited

    private void jPanel_MensualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MensualMouseClicked
        // TODO add your handling code here:
        Mensual f=new Mensual();
        jPanelFM.removeAll();
        jPanelFM.setLayout(new BorderLayout());
        jPanelFM.add(f,BorderLayout.CENTER);
        jPanelFM.repaint();
        jPanelFM.revalidate();
    }//GEN-LAST:event_jPanel_MensualMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_icn_fn;
    private javax.swing.JLabel jLabel_icn_ml;
    private javax.swing.JPanel jPanelFM;
    private javax.swing.JPanel jPanel_Fraccion;
    private javax.swing.JPanel jPanel_Mensual;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
