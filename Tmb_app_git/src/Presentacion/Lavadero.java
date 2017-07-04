/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Informacion_Lavadero;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.SLavadero;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Santiago Ortega
 */
public class Lavadero extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    TableRowSorter filter;
    int rown = -1;
    
    public Lavadero() {
        initComponents();
        LoadDataTable();
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

        jPanel_Informe = new javax.swing.JPanel();
        jLabel_icn_inf = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel_Registrar = new javax.swing.JPanel();
        jLabel_icn_add = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_icn_add1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel_CDeuda = new javax.swing.JPanel();
        jLabel_icn_addE = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jText_Buscador = new javax.swing.JTextField();

        setBackground(new java.awt.Color(36, 47, 65));

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
        jPanel_Informe.add(jLabel_icn_inf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 20, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Generar Informe Diario");
        jPanel_Informe.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_Informe.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

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
        jPanel_Registrar.add(jLabel_icn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 20, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Registrar Lavada");
        jPanel_Registrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 20));

        jLabel_icn_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_20px_1.png"))); // NOI18N

        jPanel_CDeuda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel_CDeuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_CDeuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_CDeudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_CDeudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_CDeudaMouseExited(evt);
            }
        });
        jPanel_CDeuda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icn_addE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Refund_20px.png"))); // NOI18N
        jPanel_CDeuda.add(jLabel_icn_addE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 20, 40));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Cancelar Deuda Negocio");
        jPanel_CDeuda.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel_CDeuda.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo Lavador", "Fecha Lavada", "Placa", "Tipo Vehiculo", "Tipo Lavada", "Valor Lavada", "Valor Pago", "Comentarios", "Acciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
        jText_Buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_BuscadorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_icn_add1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jText_Buscador)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel_Informe, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel_CDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 205, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_CDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jText_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_icn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jPanel_CDeudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CDeudaMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Refund_20px.png"));
        jLabel_icn_addE.setIcon(ii);
    }//GEN-LAST:event_jPanel_CDeudaMouseExited

    private void jPanel_CDeudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CDeudaMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Refund_20px_1.png"));
        jLabel_icn_addE.setIcon(ii);
    }//GEN-LAST:event_jPanel_CDeudaMouseEntered

    private void jPanel_CDeudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CDeudaMouseClicked
        // TODO add your handling code here:
        DeudaLavadero d=new DeudaLavadero();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(d,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CDeudaMouseClicked

    private void jPanel_InformeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Report Card_20px.png"));
        jLabel_icn_inf.setIcon(ii);
    }//GEN-LAST:event_jPanel_InformeMouseExited

    private void jPanel_InformeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Report Card_20px_1.png"));
        jLabel_icn_inf.setIcon(ii);
    }//GEN-LAST:event_jPanel_InformeMouseEntered

    private void jPanel_InformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_InformeMouseClicked
        // TODO add your handling code here:
        InformeLavadero l=new InformeLavadero();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(l,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();        
    }//GEN-LAST:event_jPanel_InformeMouseClicked

    private void jPanel_RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_RegistrarMouseExited

    private void jPanel_RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Add_20px_1.png"));
        jLabel_icn_add.setIcon(ii);
    }//GEN-LAST:event_jPanel_RegistrarMouseEntered

    private void jPanel_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_RegistrarMouseClicked
        // TODO add your handling code here:
        RegistroLavada l=new RegistroLavada();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(l,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();

    }//GEN-LAST:event_jPanel_RegistrarMouseClicked

    private void jText_BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_BuscadorMouseClicked
        jText_Buscador.setText("");
    }//GEN-LAST:event_jText_BuscadorMouseClicked

    private void jText_BuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_BuscadorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLowerCase(c))
        {
            String cadena = (""+c).toUpperCase();
            c = cadena.charAt(0);
            evt.setKeyChar(c);
        }
        jText_Buscador.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jText_Buscador.getText());
                jText_Buscador.setText(cadena);
                repaint();
                filter.setRowFilter(RowFilter.regexFilter(jText_Buscador.getText(), 1));
            }
        });
        filter = new TableRowSorter(this.jTable2.getModel());
        this.jTable2.setRowSorter(filter);
    }//GEN-LAST:event_jText_BuscadorKeyTyped

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
                
                int id_lava = Integer.parseInt(jTable2.getValueAt(rown, 0).toString());
                int codLavador = Integer.parseInt(jTable2.getValueAt(rown, 1).toString());            
                float valor_lavada=Float.valueOf(jTable2.getValueAt(rown, 7).toString());
                
                if(boton.getName().equals("t")){
                     
                    try{
                        SLavadero obj = new SLavadero();
                        Sesion instancia = Sesion.getInstanciaSesion(); 
                       
                        String[] list = {"Negocio", "Cliente"};
                      
                        String tipo_pago = (String) JOptionPane.showInputDialog(null, 
                            "Quien va asumir el pago de la Lavada?",
                            "Pago Lavada",
                            JOptionPane.QUESTION_MESSAGE, 
                            null, 
                            list, 
                            list[0]);
                        
                        if(!tipo_pago.equals("")){
                            String resultado=obj.realizarPago(Conexion.obtener(),instancia.getIdentificador(), 
                                                          codLavador, id_lava, valor_lavada, tipo_pago);
                            JOptionPane.showMessageDialog(null, resultado);
                            
                            int resultopcion = JOptionPane.showConfirmDialog(null, "¿Desea imprimir el recibo correspondiente?","Imprimir Recibo",JOptionPane.YES_NO_OPTION);                            
                            if(resultopcion == 0)
                            {
                                ImpresionFacturas impfac = new ImpresionFacturas();
                                boolean res = impfac.FacturaLavadero(id_lava,instancia.getIdentificador());
                                if(!res)
                                {
                                    JOptionPane.showMessageDialog(null, "Error en la impresion");
                                }                                    
                            }   
                            
                            Lavadero l=new Lavadero();
                            this.removeAll();
                            this.setLayout(new BorderLayout());
                            this.add(l,BorderLayout.CENTER);
                            this.repaint();
                            this.revalidate();
                        }
                       
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    jTable2.clearSelection();
                }
                
                if(boton.getName().equals("d")){
                     
                    try{
                        SLavadero obj = new SLavadero();
                        String resultado=obj.descripcionLavada(Conexion.obtener(),id_lava);
                        
                        JPanel myPanel = new JPanel();
                        JTextArea area=new JTextArea(resultado);
                        area.setEditable(false);
                        myPanel.add(area);
                        
                        
                        JOptionPane.showMessageDialog(null, myPanel, 
                        "Comentarios Descripcion", JOptionPane.INFORMATION_MESSAGE);
                         
                    }catch(Exception ex){
                        System.out.println(ex.getMessage());
                    }
                    jTable2.clearSelection();
                }
                
                
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    public final void LoadDataTable()
    {
        SLavadero obj = new SLavadero();   
        ArrayList<Informacion_Lavadero> datos=obj.loadInformacionLavadero(Conexion.obtener());
        jTable2.setDefaultRenderer(Object.class, new RenderTabla());
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        
        JButton btn_visualizar = new JButton("Realizar Pago");
        JButton btn_visualizar1 = new JButton("Descripcion");
        btn_visualizar.setName("t");
        btn_visualizar1.setName("d");
        
        for(int i=0;i<datos.size();i++)
        {
            Object [] fila = new Object[10];
            fila[0] = datos.get(i).getId_lava();
            fila[1] = datos.get(i).getLavadorCodigo();
            fila[2] = datos.get(i).getFecha_lavada();
            fila[3] = datos.get(i).getVehiculo_placa();
            fila[4] = datos.get(i).getVehiculo_tipo();
            fila[5] = datos.get(i).getTipo_lavada();
            fila[6] = datos.get(i).getValor_lavada();
            fila[7] = datos.get(i).getValor_pago();
            fila[8] = btn_visualizar1;
            fila[9] = btn_visualizar;
            modelo.addRow(fila);
        }
        
        this.jTable2.setModel(modelo);
        this.jTable2.getColumnModel().getColumn(0).setMinWidth(0);
        this.jTable2.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icn_add;
    private javax.swing.JLabel jLabel_icn_add1;
    private javax.swing.JLabel jLabel_icn_addE;
    private javax.swing.JLabel jLabel_icn_inf;
    private javax.swing.JPanel jPanel_CDeuda;
    private javax.swing.JPanel jPanel_Informe;
    private javax.swing.JPanel jPanel_Registrar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jText_Buscador;
    // End of variables declaration//GEN-END:variables
}
