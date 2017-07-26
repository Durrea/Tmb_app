/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Modelos.Informacion_Fraccion;
import Modelos.Recepcionista;
import Servicios.Administrador;
import Servicios.Conexion;
import Servicios.ImpresionFacturas;
import Servicios.ParquaderoFraccion;
import Servicios.ParqueaderoMes;
import Servicios.Sesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Santiago Ortega
 */
public class ResultaInfMensual extends javax.swing.JPanel {

    /**
     * Creates new form Fraccion
     */
    ImageIcon ii;
    public int idRecep;
    TableRowSorter filter;
    int rown = -1;
    String fecha;

    public ResultaInfMensual(String fecha) {
        initComponents();
        this.fecha = fecha;
        this.InformeDiarioFraccion(fecha);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Cancelar = new javax.swing.JPanel();
        jLabel_icn_canc2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(36, 47, 65));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resultado Reporte");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Ingresos del parqueadero mensual de un día en especifico por cada recepcionista.");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Fecha: ");

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 30, 30));
        jScrollPane2.setViewportView(jPanel2);

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

        jLabel_icn_canc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Start_20px.png"))); // NOI18N
        jPanel_Cancelar.add(jLabel_icn_canc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 20, 40));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Volver");
        jPanel_Cancelar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 331, Short.MAX_VALUE)
                        .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 332, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseClicked
        // TODO add your handling code here:
        InforDMensualRecep in=new InforDMensualRecep();
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(in,BorderLayout.CENTER);
        this.repaint();
        this.revalidate();
    }//GEN-LAST:event_jPanel_CancelarMouseClicked

    private void jPanel_CancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseEntered
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Start_20px_1.png"));
        jLabel_icn_canc2.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseEntered

    private void jPanel_CancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_CancelarMouseExited
        // TODO add your handling code here:
        ii = new ImageIcon(getClass().getResource("/Iconos/Start_20px.png"));
        jLabel_icn_canc2.setIcon(ii);
    }//GEN-LAST:event_jPanel_CancelarMouseExited

    public void InformeDiarioFraccion(String fecha) {
        Administrador objadmin = new Administrador();
        ParqueaderoMes objfraccion = new ParqueaderoMes();
        ArrayList<Recepcionista> listarecep = new ArrayList<Recepcionista>();
        ArrayList<Object> inforecep = new ArrayList<Object>();
        listarecep = objadmin.GetInfoRecepcionista(Conexion.obtener());
        this.jLabel3.setText(" Fecha: " + fecha);
        for (int i = 0; i < listarecep.size(); i++) {                                    
            //JPanel panel_cuerpo = new JPanel();
            inforecep = objfraccion.CargarInformacionPorRecepcionista(Conexion.obtener(), fecha, listarecep.get(i).getIdRecepcionista());
            if(inforecep.size() > 1)
            {
                JPanel panel_title = new JPanel();
                GridLayout layout = new GridLayout();
                layout.setColumns(1);
                layout.setRows(0);
                panel_title.setLayout(layout);
                //panel_title.add(nombrerecepcionista);
                //this.jPanel2.add(nombrerecepcionista);
                TitledBorder border = BorderFactory.createTitledBorder("Recepcionista: " + listarecep.get(i).getRecepcionista_nombres() + " " + listarecep.get(i).getRecepcionista_apellidos());
                border.setTitleColor(Color.WHITE);
                panel_title.setBorder(border);
                JTable tabla;
                tabla = BuildTable(inforecep);
                JScrollPane scroll = new JScrollPane(tabla);
                panel_title.add(scroll);
                //this.jPanel2.add(panel_title);
                panel_title.setBackground(new Color(36, 47, 65));
                //panel_cuerpo.add(scroll);
                this.jPanel2.add(panel_title);
            }            
            //this.jPanel2.add(scroll);
        }
        this.jPanel2.updateUI();
    }

    public JTable BuildTable(ArrayList<Object> inforecep) {
        JTable tabla = new JTable();
        DefaultTableModel modelo = new DefaultTableModel(){
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}};
        ArrayList<String> columnas = new ArrayList();
        columnas = (ArrayList<String>) inforecep.get(0);
        for(int i=0;i<columnas.size();i++)
        {
            modelo.addColumn(columnas.get(i));
        }
        double suma = 0;
        for(int i=1;i<inforecep.size();i++)
        {
            ArrayList<String> datos = new ArrayList();
            datos = (ArrayList<String>) inforecep.get(i);
            Object[] fila = new Object[datos.size()];
            for(int j=0;j<datos.size();j++)
            {
                fila[j] = datos.get(j);
                if(j == (datos.size()-1))
                {
                    suma = suma + Double.parseDouble(datos.get(j));
                }
            }
            modelo.addRow(fila);
        }
        Object[] fila = new Object[2];
        fila[0] = "Total";
        fila[1] = (long)suma;
        modelo.addRow(fila);
        tabla.setModel(modelo);               
        //tabla.setEnabled(false);
        tabla.setVisible(true);
        return tabla;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_icn_canc2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Cancelar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
