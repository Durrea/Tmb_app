/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.Conexion;
import Servicios.Sesion;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Ortega
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Login() {
        initComponents();
        panel_Img.setBackground(new Color(0,0,0,200));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Img = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jText_Contrasena = new javax.swing.JPasswordField();
        jText_Usuario = new javax.swing.JTextField();
        jPanel_Acceder = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_Cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Img.setBackground(new java.awt.Color(51, 51, 51));
        panel_Img.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_ImgMouseDragged(evt);
            }
        });
        panel_Img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_ImgMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("La Virgen");

        javax.swing.GroupLayout panel_ImgLayout = new javax.swing.GroupLayout(panel_Img);
        panel_Img.setLayout(panel_ImgLayout);
        panel_ImgLayout.setHorizontalGroup(
            panel_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImgLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ImgLayout.setVerticalGroup(
            panel_ImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImgLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2))
        );

        getContentPane().add(panel_Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 470));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imágenes-de-la-Virgen-María-para-Twitter-5-copia.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 340, 470));

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, 10));

        jText_Contrasena.setBackground(new java.awt.Color(36, 47, 65));
        jText_Contrasena.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Contrasena.setForeground(new java.awt.Color(255, 255, 255));
        jText_Contrasena.setText("jPasswordField1");
        jText_Contrasena.setBorder(null);
        jText_Contrasena.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Contrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jText_ContrasenaFocusGained(evt);
            }
        });
        jPanel1.add(jText_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 274, 260, -1));

        jText_Usuario.setBackground(new java.awt.Color(36, 47, 65));
        jText_Usuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jText_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        jText_Usuario.setText("Ingresar Usuario");
        jText_Usuario.setBorder(null);
        jText_Usuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jText_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jText_UsuarioMouseClicked(evt);
            }
        });
        jText_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jText_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 260, 20));

        jPanel_Acceder.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_Acceder.setForeground(new java.awt.Color(51, 51, 51));
        jPanel_Acceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_Acceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_AccederMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acceder");

        javax.swing.GroupLayout jPanel_AccederLayout = new javax.swing.GroupLayout(jPanel_Acceder);
        jPanel_Acceder.setLayout(jPanel_AccederLayout);
        jPanel_AccederLayout.setHorizontalGroup(
            jPanel_AccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AccederLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel_AccederLayout.setVerticalGroup(
            jPanel_AccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AccederLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 150, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Iniciar Sesión");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel_Cerrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel_Cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancel_20px_1.png"))); // NOI18N
        jLabel_Cerrar.setText("X");
        jLabel_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 20, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 340, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jText_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_UsuarioActionPerformed

    private void jText_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jText_UsuarioMouseClicked
        jText_Usuario.setText("");
    }//GEN-LAST:event_jText_UsuarioMouseClicked

    private void jText_ContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_ContrasenaFocusGained
        // TODO add your handling code here:
        jText_Contrasena.setText("");
    }//GEN-LAST:event_jText_ContrasenaFocusGained

    private void jPanel_AccederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_AccederMouseClicked
        // TODO add your handling code here:
        try {
            //Servicios.Administrador administrador = new Servicios.Administrador();
            Sesion instanciaSesion = Sesion.getInstanciaSesion();
            String nombreUsuario = jText_Usuario.getText();
            //NombreUsuario.setVisible(false);
            String passwordUsuario =  new String (jText_Contrasena.getPassword());
            //ArrayList resultado_autenticacion = administrador.autenticarUsuario(Conexion.obtener(), nombreUsuario, passwordUsuario);
            instanciaSesion.autenticarUsuario(Conexion.obtener(), nombreUsuario, passwordUsuario);
            if (instanciaSesion.sesionActiva()) 
            {
                if(instanciaSesion.getRolAutenticado().equals("Administrador"))
                {
                    //String resultado = resultado_autenticacion.get(0)+":"+resultado_autenticacion.get(1);
                    //ResultadoAutenticacion.setText(resultado);
                    new PrincipalAdmin().setVisible(true);
                    this.setVisible(false);
                    passwordUsuario = "";//Clareo por cuestion de seguridad.
                }
                else
                {
                    //String resultado = resultado_autenticacion.get(0)+":"+resultado_autenticacion.get(1);
                    //ResultadoAutenticacion.setText(resultado);
                    PrincipalRecep obj = new PrincipalRecep();
                    obj.setVisible(true);
                    obj.idRecep = instanciaSesion.getIdentificador();
                    //1new PrincipalRecep().setVisible(true);
                    this.setVisible(false);
                    passwordUsuario = "";//Clareo por cuestion de seguridad.
                }
            }
            else
            {
                passwordUsuario = ""; //Clareo por cuestion de seguridad.
                JOptionPane.showMessageDialog(null,"Error de autenticacion");
                //ResultadoAutenticacion.setText("Error de autenticacion");
                jText_Usuario.setText("");
                jText_Contrasena.setText("");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //setVisible(false);
        //Principal p= new Principal();
        //p.setVisible(true);
    }//GEN-LAST:event_jPanel_AccederMouseClicked

    private void jLabel_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_CerrarMouseClicked

    int xy;
    int xx; 
    private void panel_ImgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ImgMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_panel_ImgMouseDragged

    private void panel_ImgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_ImgMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panel_ImgMousePressed

    
      
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Cerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Acceder;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField jText_Contrasena;
    private javax.swing.JTextField jText_Usuario;
    private javax.swing.JPanel panel_Img;
    // End of variables declaration//GEN-END:variables
}
