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
public class Empleados extends javax.swing.JPanel {

    /**
     * Creates new form Parqueadero
     */
    
    ImageIcon ii;
    public Empleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFM = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_Ag1 = new javax.swing.JPanel();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(36, 47, 65));
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(820, 610));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFM.setBackground(new java.awt.Color(36, 47, 65));
        jPanelFM.setPreferredSize(new java.awt.Dimension(820, 610));
        jPanelFM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTable1);

        jPanelFM.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 590, 150));

        jPanel_Ag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_Ag1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Ag1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Ag1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_Ag1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_Ag1MouseExited(evt);
            }
        });
        jPanel_Ag1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Add_20px.png"))); // NOI18N
        jPanel_Ag1.add(jLabel_icn_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 20, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Añadir ");
        jPanel_Ag1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 90, -1));

        jPanelFM.add(jPanel_Ag1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, 40));

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
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanelFM.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 590, 150));

        add(jPanelFM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_Ag1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseClicked

        Form_Empleados f = new Form_Empleados();
        //f.idRecep = this.idRecep;
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(f,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_Ag1MouseClicked

    private void jPanel_Ag1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add1.setIcon(ii);
    }//GEN-LAST:event_jPanel_Ag1MouseEntered

    private void jPanel_Ag1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Ag1MouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add1.setIcon(ii);
    }//GEN-LAST:event_jPanel_Ag1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JPanel jPanelFM;
    private javax.swing.JPanel jPanel_Ag1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
