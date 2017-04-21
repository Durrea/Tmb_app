/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmb_app;

import Modelos.Administrador;
import Presentacion.AutenticacionPrueba;
import Modelos.Recepcionista;
import Servicios.Conexion;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Tmb_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
        // TODO code application logic here
        
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
            java.util.logging.Logger.getLogger(AutenticacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutenticacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutenticacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutenticacionPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutenticacionPrueba().setVisible(true);
            }
        });
        
       /*try {
         Servicios.Administrador administrador = new Servicios.Administrador();
         Recepcionista recepcionista = new Recepcionista(1, "Sandra", "Ortega", "Sortega", "1046Ortega");
         administrador.guardar(Conexion.obtener(), recepcionista);
         } catch (SQLException ex) {
         System.out.println(ex.getMessage());
         JOptionPane.showMessageDialog(null, "Ha surgido un error y no se ha podido guardar el registro.");
         } catch (ClassNotFoundException ex) {
         System.out.println(ex);
         JOptionPane.showMessageDialog(null, "Ha surgido un error y no se ha podido guardar el registro.");
         }
        try {
            Servicios.Administrador administrador = new Servicios.Administrador();
            ArrayList resultado_autenticacion = administrador.autenticarUsuario(Conexion.obtener(), "Daniel", "1046");
            if (resultado_autenticacion.size() > 0) {
                System.out.println("Identificador:" + resultado_autenticacion.get(0));
                System.out.println("Rol:" + resultado_autenticacion.get(1));
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tmb_app.class.getName()).log(Level.SEVERE, null, ex);
        }
        PruebaPDF generatePDFFileIText = new PruebaPDF();
         generatePDFFileIText.createPDF(new File("C:/Users/hp/Tmb_app/Prueba.pdf"));*/
    }

}
