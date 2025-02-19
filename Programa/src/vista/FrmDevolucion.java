/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.sql.Statement;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import biblioteca.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class FrmDevolucion extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu; 
    /**
     * Creates new form panelbiblioteca
     */
    Conexion cn;
    DefaultTableModel modelo;
    public FrmDevolucion() {
        initComponents();
        cn=new Conexion();
        cn.conectar();
        AñadirFecha();
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(0);
        this.setResizable(false);
        modelo = (DefaultTableModel) Tabla.getModel();
        ListarDevoluciones();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        PanelSelection = new javax.swing.JPanel();
        Editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Añadir = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        PanelOption = new javax.swing.JPanel();
        Código = new javax.swing.JLabel();
        ID_Bibliotecario = new javax.swing.JLabel();
        DNI = new javax.swing.JLabel();
        Fecha_Prestamo = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        txtObservaciones = new javax.swing.JTextField();
        txt_fechadevolucion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(933, 759));

        Titulo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(13, 59, 102));
        Titulo.setText("DEVOLUCIÓN");

        Tabla.setBackground(new java.awt.Color(153, 153, 255));
        Tabla.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Código del préstamo", "Fecha", "Estado", "Observaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setSelectionBackground(new java.awt.Color(102, 153, 255));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        Scroll.setViewportView(Tabla);

        PanelSelection.setBackground(new java.awt.Color(255, 255, 255));
        PanelSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Opciones ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 12))); // NOI18N

        Editar.setBackground(new java.awt.Color(204, 0, 255));
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-editar.png"))); // NOI18N
        Editar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-eliminar.png"))); // NOI18N
        Eliminar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Añadir.setBackground(new java.awt.Color(153, 255, 102));
        Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar.png"))); // NOI18N
        Añadir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        Nuevo.setBackground(new java.awt.Color(255, 255, 102));
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/boton-de-nuevo-documento.png"))); // NOI18N
        Nuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(0, 204, 153));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/REGRE.png"))); // NOI18N
        Salir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSelectionLayout = new javax.swing.GroupLayout(PanelSelection);
        PanelSelection.setLayout(PanelSelectionLayout);
        PanelSelectionLayout.setHorizontalGroup(
            PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelectionLayout.createSequentialGroup()
                .addGroup(PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelSelectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelSelectionLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        PanelSelectionLayout.setVerticalGroup(
            PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        PanelOption.setBackground(new java.awt.Color(255, 255, 255));
        PanelOption.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Ingresar datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 12))); // NOI18N

        Código.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Código.setForeground(new java.awt.Color(74, 74, 74));
        Código.setText("Código del préstamo");

        ID_Bibliotecario.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        ID_Bibliotecario.setForeground(new java.awt.Color(74, 74, 74));
        ID_Bibliotecario.setText("Estado del libro");

        DNI.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DNI.setForeground(new java.awt.Color(74, 74, 74));
        DNI.setText("Observaciones");

        Fecha_Prestamo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Fecha_Prestamo.setForeground(new java.awt.Color(74, 74, 74));
        Fecha_Prestamo.setText("Fecha de devolución");

        txt_cod.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txt_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codActionPerformed(evt);
            }
        });

        cbEstado.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Dañado", "Perdido" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        txtObservaciones.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        txt_fechadevolucion.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        javax.swing.GroupLayout PanelOptionLayout = new javax.swing.GroupLayout(PanelOption);
        PanelOption.setLayout(PanelOptionLayout);
        PanelOptionLayout.setHorizontalGroup(
            PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addComponent(DNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addComponent(ID_Bibliotecario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelOptionLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(Fecha_Prestamo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_fechadevolucion))
                        .addGroup(PanelOptionLayout.createSequentialGroup()
                            .addComponent(Código, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelOptionLayout.setVerticalGroup(
            PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Código, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechadevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_Bibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(Titulo))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(PanelOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(PanelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 933, 759));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        int row = Tabla.getSelectedRow();
        String ID_Devolucion = (String) Tabla.getValueAt(row, 0);
        String Cod_prestamo = this.txt_cod.getText();
        String Fecha_entrega = this.txt_fechadevolucion.getText();
        String Estado = this.cbEstado.getSelectedItem().toString();
        String Observaciones = this.txtObservaciones.getText();
        String editar = "UPDATE devolucion SET ID_Prestamo='" + Cod_prestamo + "', Fecha_entregado='" + Fecha_entrega + "', Estado_libro='" + Estado + "', Observaciones='" + Observaciones + "' WHERE ID_Devolucion=" + ID_Devolucion;
        try{
        Statement st = cn.conectar().createStatement();
        st.executeUpdate(editar);
        }catch(SQLException ex){
            Logger.getLogger(FrmDevolucion.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Devolución modificada correctamente.");
        ListarDevoluciones();
        Limpiar();
    }//GEN-LAST:event_EditarActionPerformed

    public void AñadirFecha()
    {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaActual.format(formatoFecha);
        txt_fechadevolucion.setText(fechaFormateada);
    }
    public void Limpiar()
    {
       this.txt_cod.setText("");
       this.txtObservaciones.setText("");
       this.cbEstado.setSelectedIndex(-1); 
       LocalDate fechaActual = LocalDate.now();
       DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       String fechaFormateada = fechaActual.format(formatoFecha);
       txt_fechadevolucion.setText(fechaFormateada);
    }
    public void ListarDevoluciones()
    {
    try {
        limpiarTabla();
        String listar = "SELECT * FROM devolucion ORDER BY ID_Devolucion";
        Statement st = cn.conectar().createStatement();
        ResultSet rs = st.executeQuery(listar);
        modelo = (DefaultTableModel) this.Tabla.getModel();
        
        while (rs.next()) {
            Object[] persona = new Object[5]; 
            persona[0] = rs.getString("ID_Devolucion");
            persona[1] = rs.getString("ID_Prestamo");
            persona[2] = rs.getString("Fecha_entregado");
            persona[3] = rs.getString("Estado_libro");
            persona[4] = rs.getString("Observaciones");
            modelo.addRow(persona);
        }
        Tabla.setModel(modelo);
    } catch (SQLException e) {
        Logger.getLogger(FrmDevolucion.class.getName()).log(Level.SEVERE, null, e); // Manejar la excepción
    }
    }
    void limpiarTabla(){
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        try {
        String Cod_prestamo = this.txt_cod.getText();
        String fecha_devolucion = this.txt_fechadevolucion.getText();
        String Estado = this.cbEstado.getSelectedItem().toString();
        String Observaciones = this.txtObservaciones.getText();
        
        Statement st = cn.conectar().createStatement();
        String callProcedure = String.format("CALL InsertarDevolucion('%s', '%s', '%s', '%s')", Cod_prestamo, fecha_devolucion, Estado, Observaciones);
        st.execute(callProcedure);


        JOptionPane.showMessageDialog(null, "Devolución registrada y ejemplares actualizados correctamente.");

        ListarDevoluciones();
        Limpiar();

    } catch (SQLException ex) {
        Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al registrar la devolución: " + ex.getMessage());
    } 
    }//GEN-LAST:event_AñadirActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        FrmMenuGestion verpanel= new FrmMenuGestion();
        verpanel.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
    Limpiar();
    }//GEN-LAST:event_NuevoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
     
    try {
        String Cod_prestamo = this.txt_cod.getText();
        int fila = Tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Devolución no seleccionada");
            return;
        }

        String ID_Devolucion = (String) Tabla.getValueAt(fila, 0);
        
        Statement st = cn.conectar().createStatement();
        String callProcedure = "CALL EliminarDevolucion(" + Integer.parseInt(ID_Devolucion) + ", '" + Cod_prestamo + "')";
        st.execute(callProcedure);

        JOptionPane.showMessageDialog(null, "Devolución eliminada y ejemplares actualizados correctamente.");

        ListarDevoluciones();
        Limpiar();

    } catch (SQLException ex) {
        Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al eliminar la devolución: " + ex.getMessage());
    }
    }//GEN-LAST:event_EliminarActionPerformed

    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int row = Tabla.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó");
        }else{
            String Cod_prestamo = (String) Tabla.getValueAt(row, 1);
            String Fecha_entrega = (String) Tabla.getValueAt(row, 2);
            String Estado = (String) Tabla.getValueAt(row, 3);
            String Observaciones = (String) Tabla.getValueAt(row, 4);
            txtObservaciones.setText(Observaciones);
            txt_cod.setText(Cod_prestamo);
            txt_fechadevolucion.setText(Fecha_entrega);
            cbEstado.setSelectedItem(Estado);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void txt_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir;
    private javax.swing.JLabel Código;
    private javax.swing.JLabel DNI;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Fecha_Prestamo;
    private javax.swing.JLabel ID_Bibliotecario;
    private javax.swing.JButton Nuevo;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelOption;
    private javax.swing.JPanel PanelSelection;
    private javax.swing.JButton Salir;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_fechadevolucion;
    // End of variables declaration//GEN-END:variables
}
