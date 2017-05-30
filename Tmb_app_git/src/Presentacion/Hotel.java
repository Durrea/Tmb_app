/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.*;
import Modelos.*;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablero = new javax.swing.JPanel();

        setBackground(new java.awt.Color(36, 47, 65));
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setPreferredSize(new java.awt.Dimension(820, 610));

        jButton1.setText("jButton1");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(36, 47, 65));
        jScrollPane1.setBorder(null);

        tablero.setBackground(new java.awt.Color(36, 47, 65));
        tablero.setLayout(new java.awt.GridLayout(0, 4));
        jScrollPane1.setViewportView(tablero);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 727, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(this, habitaciones.size());

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
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
                JOptionPane.showMessageDialog(this, "La habitación se encuentra: " + habitaciones.get(i).getHabitacion_estado());
            }
        }

    }
}
