/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.*;
import Modelos.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Ortega
 */
public class Hotel extends javax.swing.JPanel {

    private S_Hotel servicios;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<JButton> botonesHabitaciones;
    ImageIcon ii;

    public Hotel() {

        initComponents();
        this.servicios = new S_Hotel();
        habitaciones = this.servicios.cargarHabitaciones(Conexion.obtener());
        botonesHabitaciones = new ArrayList<>();
        cargarTablero();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablero = new javax.swing.JPanel();
        jPanel_Informe = new javax.swing.JPanel();
        jLabel_icn_inf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(36, 47, 65));
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(820, 610));

        jScrollPane1.setBackground(new java.awt.Color(36, 47, 65));
        jScrollPane1.setBorder(null);

        tablero.setBackground(new java.awt.Color(36, 47, 65));
        tablero.setLayout(new java.awt.GridLayout(0, 4));
        jScrollPane1.setViewportView(tablero);

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

        jLabel_icn_inf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"))); // NOI18N
        jPanel_Informe.add(jLabel_icn_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 20, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Generar Informe Diario");
        jPanel_Informe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, -1, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Informe.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_InformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseClicked
        // TODO add your handling code here:
        InforDHotelRecep informes = new InforDHotelRecep();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(informes,BorderLayout.CENTER);
        this.repaint();
        this.revalidate(); 
    }//GEN-LAST:event_jPanel_InformeMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JPanel jPanel_Informe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables

    private void cargarTablero() {
        for (Habitacion habitacion : habitaciones) {
            JButton button = new JButton(Integer.toString(habitacion.getHabitacion_numero()));
            button.setCursor(new Cursor(HAND_CURSOR));
            if (habitacion.getHabitacion_estado().equalsIgnoreCase("LIBRE")) {
                button.setBackground(new java.awt.Color(102, 102, 102));
            } else {
                button.setBackground(new java.awt.Color(36, 47, 65));
            }

            ActionListener listener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource().equals(button)) {
                        //JOptionPane.showMessageDialog(null, button.getText());
                        eventoHabitacion(button.getText());
                    }
                }
            };
            button.addActionListener(listener);
            botonesHabitaciones.add(button);
            tablero.add(button);
        }
        tablero.updateUI();
    }

    public void eventoHabitacion(String numHab) {
        for (int i = 0; i < habitaciones.size(); i++) {
            if (habitaciones.get(i).getHabitacion_numero() == Integer.parseInt(numHab)) {
                if (habitaciones.get(i).getHabitacion_estado().equalsIgnoreCase("OCUPADA")) {
                  int result =  JOptionPane.showConfirmDialog(this, "¿Desea liberar esta habitación?", "Liberar habitación",JOptionPane.YES_NO_OPTION);
                 //int result = JOptionPane.showConfirmDialog(this, "¿Liberar habitacion?");
                 if(result==0)
                 {
                     servicios.liberarHabitacion(Conexion.obtener(), habitaciones.get(i).getHabitacion_numero());
                    Hotel h = new Hotel();
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(h, BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();
                 }
                } else {
                    Form_Hotel h = new Form_Hotel(habitaciones.get(i));
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(h, BorderLayout.CENTER);
                    this.repaint();
                    this.revalidate();
                }

            }
        }

    }
}
