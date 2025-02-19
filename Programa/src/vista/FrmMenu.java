/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmEditorial
     */
    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(Fondo,"src/Recursos/fondo.jpg");
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
        Difuminado = new javax.swing.JPanel();
        Gestion = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Libro = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de inicio");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 400));

        Fondo.setPreferredSize(new java.awt.Dimension(400, 400));

        Difuminado.setBackground(new java.awt.Color(0, 0, 0, 180));
        Difuminado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Gestion.setBackground(new java.awt.Color(153, 102, 0));
        Gestion.setForeground(new java.awt.Color(60, 63, 65));
        Gestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libros_1.png"))); // NOI18N
        Gestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Gestion.setPreferredSize(new java.awt.Dimension(24, 24));
        Gestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionActionPerformed(evt);
            }
        });
        Difuminado.add(Gestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 123, 123));

        Titulo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("MENÚ DE INICIO");
        Titulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Difuminado.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 30));

        Libro.setBackground(new java.awt.Color(0, 102, 102));
        Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Administracion.png"))); // NOI18N
        Libro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        Libro.setPreferredSize(new java.awt.Dimension(24, 24));
        Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroActionPerformed(evt);
            }
        });
        Difuminado.add(Libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 123, 123));

        Salir.setBackground(new java.awt.Color(46, 46, 47));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/close.png"))); // NOI18N
        Salir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Difuminado.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Difuminado, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Difuminado, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroActionPerformed
       FrmMenuLibro Frm = new FrmMenuLibro();
       Frm.setVisible(true);
       this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_LibroActionPerformed

    private void GestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionActionPerformed
      FrmMenuGestion Frm = new FrmMenuGestion();
        Frm.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_GestionActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de salir?");
    if (JOptionPane.OK_OPTION==confirmado)
    {
         this.setVisible(false);
    }      // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Difuminado;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Gestion;
    private javax.swing.JButton Libro;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
