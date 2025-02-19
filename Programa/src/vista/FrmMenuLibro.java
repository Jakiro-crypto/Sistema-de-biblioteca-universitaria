
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FrmMenuLibro extends javax.swing.JFrame {

    /**
     * Creates new form FrmBibli
     */
    public FrmMenuLibro() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(Fondo,"src/Recursos/fondo_libro.jpg");
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
        Libro = new javax.swing.JMenu();
        VerLibro = new javax.swing.JMenuItem();
        Categoria = new javax.swing.JMenu();
        VerCategoria = new javax.swing.JMenuItem();
        Editorial = new javax.swing.JMenu();
        VerEditorial = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();
        Dispose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 800, 500));

        BarraMenu.setPreferredSize(new java.awt.Dimension(600, 50));

        Libro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Book.png"))); // NOI18N
        Libro.setText("Libro");
        Libro.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerLibro.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        VerLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Book.png"))); // NOI18N
        VerLibro.setText("Ver Libro");
        VerLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerLibroActionPerformed(evt);
            }
        });
        Libro.add(VerLibro);

        BarraMenu.add(Libro);

        Categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Categorie.png"))); // NOI18N
        Categoria.setText("Categoría");
        Categoria.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerCategoria.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        VerCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Categorie.png"))); // NOI18N
        VerCategoria.setText("Ver Categoría");
        VerCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCategoriaActionPerformed(evt);
            }
        });
        Categoria.add(VerCategoria);

        BarraMenu.add(Categoria);

        Editorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Layout.png"))); // NOI18N
        Editorial.setText("Editorial");
        Editorial.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        VerEditorial.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        VerEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/M_Layout.png"))); // NOI18N
        VerEditorial.setText("Ver Editorial");
        VerEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEditorialActionPerformed(evt);
            }
        });
        Editorial.add(VerEditorial);

        BarraMenu.add(Editorial);

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N

        Dispose.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
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

    private void VerLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerLibroActionPerformed
       // TODO add your handling code here:
    FrmLibro Frm = new FrmLibro();
    Frm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_VerLibroActionPerformed

    private void VerCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCategoriaActionPerformed
        // TODO add your handling code here:
    FrmCategoria Frm = new FrmCategoria();
    Frm.setVisible(true);
    this.dispose();      
    }//GEN-LAST:event_VerCategoriaActionPerformed

    private void VerEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEditorialActionPerformed
        // TODO add your handling code here:
    FrmEditorial Frm = new FrmEditorial();
    Frm.setVisible(true);
    this.dispose();       
    }//GEN-LAST:event_VerEditorialActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu Categoria;
    private javax.swing.JMenuItem Dispose;
    private javax.swing.JMenu Editorial;
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenu Libro;
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem VerCategoria;
    private javax.swing.JMenuItem VerEditorial;
    private javax.swing.JMenuItem VerLibro;
    // End of variables declaration//GEN-END:variables
}
