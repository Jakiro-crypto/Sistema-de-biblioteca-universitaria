/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class FrmMenuGestion extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu; 
    /**
     * Creates new form panelbiblioteca
     */
    public FrmMenuGestion() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(Fondo,"src/Recursos/fondo_gestion.jpg");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(0);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        Prestamo = new javax.swing.JMenu();
        VerPrestamo = new javax.swing.JMenuItem();
        Devolucion = new javax.swing.JMenu();
        VerDevolucion = new javax.swing.JMenuItem();
        Multa = new javax.swing.JMenu();
        VerMulta = new javax.swing.JMenuItem();
        Bibliotecario = new javax.swing.JMenu();
        VerBibliotecario = new javax.swing.JMenuItem();
        Estudiante = new javax.swing.JMenu();
        VerEstudiante = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        Dispose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 800, 500));

        BarraMenu.setPreferredSize(new java.awt.Dimension(700, 50));

        Prestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Prestamo.png"))); // NOI18N
        Prestamo.setText("Préstamo");
        Prestamo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Prestamo.png"))); // NOI18N
        VerPrestamo.setText("Ver Préstamos");
        VerPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPrestamoActionPerformed(evt);
            }
        });
        Prestamo.add(VerPrestamo);

        BarraMenu.add(Prestamo);

        Devolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Devolucion.png"))); // NOI18N
        Devolucion.setText("Devolución");
        Devolucion.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Devolucion.png"))); // NOI18N
        VerDevolucion.setText("Ver Devoluciones");
        VerDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDevolucionActionPerformed(evt);
            }
        });
        Devolucion.add(VerDevolucion);

        BarraMenu.add(Devolucion);

        Multa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Multa.png"))); // NOI18N
        Multa.setText("Multa");
        Multa.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerMulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Multa.png"))); // NOI18N
        VerMulta.setText("Ver Multas");
        VerMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerMultaActionPerformed(evt);
            }
        });
        Multa.add(VerMulta);

        BarraMenu.add(Multa);

        Bibliotecario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Bibliotecario.png"))); // NOI18N
        Bibliotecario.setText("Bibliotecario");
        Bibliotecario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerBibliotecario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Bibliotecario.png"))); // NOI18N
        VerBibliotecario.setText("Ver Bibliotecarios");
        VerBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBibliotecarioActionPerformed(evt);
            }
        });
        Bibliotecario.add(VerBibliotecario);

        BarraMenu.add(Bibliotecario);

        Estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Student.png"))); // NOI18N
        Estudiante.setText("Estudiante");
        Estudiante.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerEstudiante.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        VerEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Student.png"))); // NOI18N
        VerEstudiante.setText("Ver Estudiantes");
        VerEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEstudianteActionPerformed(evt);
            }
        });
        Estudiante.add(VerEstudiante);

        BarraMenu.add(Estudiante);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        Dispose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Exit.png"))); // NOI18N
        Dispose.setText("Salir");
        Dispose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisposeActionPerformed(evt);
            }
        });
        Salir.add(Dispose);

        BarraMenu.add(Salir);

        setJMenuBar(BarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerMultaActionPerformed
        // TODO add your handling code here:
    FrmMulta Frm = new FrmMulta();
    Frm.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_VerMultaActionPerformed

    private void VerPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPrestamoActionPerformed
        // TODO add your handling code here:
    FrmPrestamo Frm = new FrmPrestamo();
    Frm.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_VerPrestamoActionPerformed

    private void VerDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDevolucionActionPerformed
        // TODO add your handling code here:
    FrmDevolucion Frm = new FrmDevolucion();
    Frm.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_VerDevolucionActionPerformed

    private void VerBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBibliotecarioActionPerformed
        // TODO add your handling code here:
    FrmBibliotecario Frm = new FrmBibliotecario();
    Frm.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_VerBibliotecarioActionPerformed

    private void VerEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEstudianteActionPerformed
        // TODO add your handling code here:
    FrmEstudiante Frm = new FrmEstudiante();
    Frm.setVisible(true);
    this.dispose();  
    }//GEN-LAST:event_VerEstudianteActionPerformed

    private void DisposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisposeActionPerformed
        // TODO add your handling code here:
    int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de salir?");
    if (JOptionPane.OK_OPTION==confirmado)
    {
       FrmMenu Frm = new FrmMenu();
       Frm.setVisible(true);
       this.dispose();
         
    } 
    }//GEN-LAST:event_DisposeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuGestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu Bibliotecario;
    private javax.swing.JMenu Devolucion;
    private javax.swing.JMenuItem Dispose;
    private javax.swing.JMenu Estudiante;
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu Multa;
    private javax.swing.JMenu Prestamo;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem VerBibliotecario;
    private javax.swing.JMenuItem VerDevolucion;
    private javax.swing.JMenuItem VerEstudiante;
    private javax.swing.JMenuItem VerMulta;
    private javax.swing.JMenuItem VerPrestamo;
    // End of variables declaration//GEN-END:variables
}
