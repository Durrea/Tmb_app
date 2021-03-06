/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Informacion_Deuda_Lavadero;
import Servicios.Conexion;
import Servicios.SLavadero;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Santiago Ortega
 */
public class DeudaLavadero extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    TableRowSorter filter;
    int rown = -1;
    
    public DeudaLavadero() {
        initComponents();
        LoadDataTable();
        LoadDeuda();
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jText_Buscador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel_TotalDeuda = new javax.swing.JLabel();
        jPanel_Cancelar = new javax.swing.JPanel();
        jLabel_icn_canc = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));

        jLabel_icn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_20px_1.png"))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Tipo Vehiculo", "Valor Deuda", "Acciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(40);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jText_Buscador.setBackground(new java.awt.Color(36, 47, 65));
        jText_Buscador.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Buscador.setForeground(new java.awt.Color(255, 255, 255));
        jText_Buscador.setBorder(null);
        jText_Buscador.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_BuscadorMouseClicked(evt);
            }
        });
        jText_Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_BuscadorActionPerformed(evt);
            }
        });
        jText_Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_BuscadorKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cancelar Deuda Negocio");

        jLabel_TotalDeuda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_TotalDeuda.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_TotalDeuda.setText(" Total Deuda :");

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

        jLabel_icn_canc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Start_20px.png"))); // NOI18N
        jPanel_Cancelar.add(jLabel_icn_canc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Volver");
        jPanel_Cancelar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_icn_add1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_Buscador, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jSeparator4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_TotalDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel_TotalDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_icn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jText_BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_BuscadorMouseClicked
        jText_Buscador.setText("");
    }//GEN-LAST:event_jText_BuscadorMouseClicked

    private void jText_BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_BuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_BuscadorActionPerformed

    private void jText_BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_BuscadorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        if((c==KeyEvent.VK_ESCAPE) || (c==KeyEvent.VK_DELETE) ||(c==KeyEvent.VK_SPACE) ||(c==KeyEvent.VK_CONTROL)){
            evt.consume();
        }
        jText_Buscador.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jText_Buscador.getText());
                jText_Buscador.setText(cadena);
                repaint();
                filter.setRowFilter(RowFilter.regexFilter(jText_Buscador.getText(), 0));
            }
        });
        filter = new TableRowSorter(this.jTable2.getModel());
        this.jTable2.setRowSorter((RowSorter<TableModel>)filter);
    }//GEN-LAST:event_jText_BuscadorKeyTyped

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        // TODO add your handling code here:
        Lavadero m=new Lavadero();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(m,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked

    private void jPanel_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Start_20px_1.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseEntered

    private void jPanel_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Start_20px.png"));
        jLabel_icn_canc.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseExited

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        rown = jTable2.rowAtPoint(evt.getPoint());

        int column = jTable2.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTable2.getRowHeight();
        
        if(row < jTable2.getRowCount() && row >= 0 && column < jTable2.getColumnCount() && column >= 0){
            Object value = jTable2.getValueAt(row, column);
            if(value instanceof JButton){
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String placa = jTable2.getValueAt(rown, 0).toString();
                             
                if(boton.getName().equals("t")){
                     
                    try{
                        SLavadero obj = new SLavadero();
                        Sesion instancia = Sesion.getInstanciaSesion(); 
                       
                        int res= JOptionPane.showConfirmDialog(null, "¿Desea cancelar la Deuda?","Deuda", JOptionPane.YES_NO_OPTION);
                        
                        if(res == 0)
                        {   
                            String resultado=obj.cancelarDeuda(Conexion.obtener(),instancia.getIdentificador(),placa);
                            JOptionPane.showMessageDialog(null, resultado);

                            DeudaLavadero d=new DeudaLavadero();
                            this.removeAll();
                            this.setLayout(new BorderLayout());
                            this.add(d,BorderLayout.CENTER);
                            this.repaint();
                            this.revalidate();
                        }
                       
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }   
                }
                
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    public final void LoadDataTable()
    {
        SLavadero obj = new SLavadero();   
        ArrayList<Informacion_Deuda_Lavadero> datos=obj.loadInformacionDeuda(Conexion.obtener());
        jTable2.setDefaultRenderer(Object.class, new RenderTabla());
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        
        JButton btn_visualizar = new JButton("Cancelar Deuda");
        btn_visualizar.setName("t");
        
        for(int i=0;i<datos.size();i++)
        {
            Object [] fila = new Object[4];
            fila[0] = datos.get(i).getVehiculo_placa();
            fila[1] = datos.get(i).getVehiculo_tipo();
            fila[2] = (long)datos.get(i).getValor_deuda();
            fila[3] = btn_visualizar;
            modelo.addRow(fila);
        }
        this.jTable2.setModel(modelo);
    }
    
    public final void LoadDeuda()
    {
        SLavadero obj = new SLavadero();
        float valor=obj.loadDeuda(Conexion.obtener());
        if(valor!=0){
            jLabel_TotalDeuda.setText("Total Deuda: " +(long)valor);
        }else{
            JOptionPane.showMessageDialog(null, "Actualmente no existe ninguna Deuda con el Negocio");
            Lavadero d=new Lavadero();
            this.removeAll();
            this.setLayout(new BorderLayout());
            this.add(d,BorderLayout.CENTER);
            this.repaint();
            this.revalidate();
        }  
    }
    
    public final String validar(){
        
        String res="Por favor Ingresar:";
        
        
        return res; 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_TotalDeuda;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JLabel jLabel_icn_canc;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Buscador;
    // End of variables declaration//GEN-END:variables
}
