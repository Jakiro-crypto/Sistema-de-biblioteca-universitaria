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
import com.mysql.cj.jdbc.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class FrmPrestamo extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu; 
    /**
     * Creates new form panelbiblioteca
     */
    Conexion cn;
    DefaultTableModel modelo;
    public FrmPrestamo() {
        initComponents();
        cn=new Conexion();
        cn.conectar();
        AñadirBibliotecario();
        AñadirFechayHora();
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(0);
        this.setResizable(false);
        modelo = (DefaultTableModel) Tabla.getModel();
        ListarPrestamos();
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
        Hora_Prestamo = new javax.swing.JLabel();
        Fecha_Limite = new javax.swing.JLabel();
        txt_codlibro = new javax.swing.JTextField();
        cbBibli = new javax.swing.JComboBox<>();
        txtDNI = new javax.swing.JTextField();
        txt_fechaprestamo = new javax.swing.JTextField();
        txt_Hora = new javax.swing.JTextField();
        txt_limite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setPreferredSize(new java.awt.Dimension(933, 759));

        Titulo.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(13, 59, 102));
        Titulo.setText("PRÉSTAMO");

        Tabla.setBackground(new java.awt.Color(153, 153, 255));
        Tabla.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Libro", "Código del Libro", "Bibliotecario", "Hora del préstamo", "Fecha del préstamo", "Fecha límite"
            }
        ));
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
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        PanelOption.setBackground(new java.awt.Color(255, 255, 255));
        PanelOption.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), "Ingresar datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai", 1, 12))); // NOI18N

        Código.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Código.setForeground(new java.awt.Color(74, 74, 74));
        Código.setText(" Código del libro");

        ID_Bibliotecario.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        ID_Bibliotecario.setForeground(new java.awt.Color(74, 74, 74));
        ID_Bibliotecario.setText("Bibliotecario");

        DNI.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        DNI.setForeground(new java.awt.Color(74, 74, 74));
        DNI.setText("DNI del estudiante");

        Fecha_Prestamo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Fecha_Prestamo.setForeground(new java.awt.Color(74, 74, 74));
        Fecha_Prestamo.setText("Fecha del préstamo");

        Hora_Prestamo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Hora_Prestamo.setForeground(new java.awt.Color(74, 74, 74));
        Hora_Prestamo.setText("Hora");

        Fecha_Limite.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Fecha_Limite.setForeground(new java.awt.Color(74, 74, 74));
        Fecha_Limite.setText("Fecha límite");

        txt_codlibro.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        txt_codlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codlibroActionPerformed(evt);
            }
        });

        cbBibli.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        cbBibli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBibliActionPerformed(evt);
            }
        });

        txtDNI.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        txt_fechaprestamo.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        txt_Hora.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        txt_limite.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N

        javax.swing.GroupLayout PanelOptionLayout = new javax.swing.GroupLayout(PanelOption);
        PanelOption.setLayout(PanelOptionLayout);
        PanelOptionLayout.setHorizontalGroup(
            PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionLayout.createSequentialGroup()
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Código, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_codlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(ID_Bibliotecario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbBibli, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(DNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Fecha_Prestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Hora_Prestamo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Fecha_Limite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_limite, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelOptionLayout.setVerticalGroup(
            PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Código, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBibli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_Bibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hora_Prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_limite, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha_Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(PanelOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(PanelSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(Titulo)))
                .addGap(90, 90, 90))
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
        String IDPrestamo = (String) Tabla.getValueAt(row, 0);
        String CodLibro = this.txt_codlibro.getText();
        String DNIN = this.txtDNI.getText();
        String Bibli = this.cbBibli.getSelectedItem().toString();
        String HoraPrestamo = this.txt_Hora.getText();
        String FechaPrestamo = this.txt_fechaprestamo.getText();
        String FechaLimite = this.txt_limite.getText();
        try {
        String ID_B = "SELECT ID_Bibliotecario FROM bibliotecario WHERE Nombres = '" + Bibli + "'";
        Statement st = cn.conectar().createStatement();
        ResultSet rsB = st.executeQuery(ID_B);
        if (rsB.next()) {
            String ID_Bibli = rsB.getString("ID_Bibliotecario");
            String editar = "UPDATE prestamo SET Cod_libro='" + CodLibro + "', DNI='" + DNIN + "', ID_Bibliotecario='" + ID_Bibli + "', Hora_Prestamo='" + HoraPrestamo + "', Fecha_prestamo='" + FechaPrestamo + "', Fecha_limite='" + FechaLimite + "' WHERE ID_Prestamo=" + IDPrestamo;
            Statement ste = cn.conectar().createStatement();
            ste.executeUpdate(editar);
            JOptionPane.showMessageDialog(null, "Préstamo modificado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el bibliotecario.");
        }
        } catch (SQLException ex) {
          Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
        ListarPrestamos();
        Limpiar();
    }//GEN-LAST:event_EditarActionPerformed

    public void AñadirBibliotecario()
    {
        try {
            String listar = "SELECT Nombres FROM bibliotecario";
            Statement st =cn.conectar().createStatement();
            ResultSet rs = st.executeQuery(listar);
            cbBibli.removeAllItems();
            while (rs.next()) {
                String nombre = rs.getString("Nombres");
            cbBibli.addItem(nombre);
        }
        } catch (SQLException ex) {
            Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void AñadirFechayHora()
    {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaActual.format(formatoFecha);
        txt_fechaprestamo.setText(fechaFormateada);
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = horaActual.format(formatoHora);
        txt_Hora.setText(horaFormateada);
    }
    public void Limpiar()
    {
       this.txt_codlibro.setText("");
       this.txtDNI.setText("");
       this.cbBibli.setSelectedIndex(-1); 
       this.txt_limite.setText("");
       LocalDate fechaActual = LocalDate.now();
       DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       String fechaFormateada = fechaActual.format(formatoFecha);
       txt_fechaprestamo.setText(fechaFormateada);
       LocalTime horaActual = LocalTime.now();
       DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
       String horaFormateada = horaActual.format(formatoHora);
       txt_Hora.setText(horaFormateada);
    }
    public void ListarPrestamos()
    {
    try {
        limpiarTabla();
        String listar = "SELECT * FROM prestamo ORDER BY ID_Prestamo";
        Statement st = cn.conectar().createStatement();
        ResultSet rs = st.executeQuery(listar);
        modelo = (DefaultTableModel) this.Tabla.getModel();
        
        while (rs.next()) {
            Object[] persona = new Object[8]; 
            persona[0] = rs.getString("ID_Prestamo");
            persona[1] = rs.getString("DNI");
            String CodLibro = rs.getString("Cod_libro");
            
            String Nombre_libro = "SELECT Titulo FROM libro WHERE Cod_libro = '" + CodLibro + "'";
            Statement stLibro = cn.conectar().createStatement(); 
            ResultSet CLrs = stLibro.executeQuery(Nombre_libro);
            if (CLrs.next()) { 
                persona[2] = CLrs.getString("Titulo");
            } else {
                persona[2] = "Título no encontrado"; 
            }
            CLrs.close(); 
            stLibro.close();
            
            persona[3] = rs.getString("Cod_libro");
            String IDBibli = rs.getString("ID_Bibliotecario");
            
            String Nombre_Bibli = "SELECT Nombres FROM bibliotecario WHERE ID_Bibliotecario = '" + IDBibli + "'";
            Statement stBibli = cn.conectar().createStatement(); // Crear un nuevo Statement
            ResultSet IBrs = stBibli.executeQuery(Nombre_Bibli);
            if (IBrs.next()) { 
                persona[4] = IBrs.getString("Nombres");
            } else {
                persona[4] = "Nombre no encontrado"; 
            }
            IBrs.close();
            stBibli.close();
            
            persona[5] = rs.getString("Hora_Prestamo");
            persona[6] = rs.getString("Fecha_prestamo");
            persona[7] = rs.getString("Fecha_limite");
            modelo.addRow(persona);
        }
        
        Tabla.setModel(modelo);
    } catch (SQLException e) {
        Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, e); // Manejar la excepción
    }
    }
    void limpiarTabla(){
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
    try {
        String cod_libro = this.txt_codlibro.getText();
        String DNIN = this.txtDNI.getText();
        String bibliotecario = this.cbBibli.getSelectedItem().toString();
        String fecha_prestamo = this.txt_fechaprestamo.getText();
        String fecha_limite = this.txt_limite.getText();
        String hora_prestamo = this.txt_Hora.getText();

        Statement st = cn.conectar().createStatement();
        
        String queryBibliotecario = "SELECT ID_Bibliotecario FROM bibliotecario WHERE Nombres = '" + bibliotecario + "' LIMIT 1";
        ResultSet rsB = st.executeQuery(queryBibliotecario);

        if (rsB.next()) {
            
            int Id_Bibliotecario = rsB.getInt("ID_Bibliotecario");
            String callProcedure = String.format("CALL InsertarPrestamo('%s', '%s', '%s', '%s', '%s', '%s')", 
            cod_libro, DNIN, Id_Bibliotecario, hora_prestamo, fecha_prestamo, fecha_limite);
            st.execute(callProcedure);
            JOptionPane.showMessageDialog(null, "Préstamo registrado y ejemplares actualizados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Bibliotecario no encontrado.");
        }
    } catch (SQLException ex) {
        Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
    }
    ListarPrestamos();
    Limpiar();
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
    String cod_libro = this.txt_codlibro.getText();
    int row = Tabla.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(null, "Préstamo no seleccionado.");
        return;
    }
    String IDPrestamo = (String) Tabla.getValueAt(row, 0);
    try {

        Statement st = cn.conectar().createStatement();
        String callProcedure = "CALL EliminarPrestamo(" + Integer.parseInt(IDPrestamo) + ", '" + cod_libro + "')";
        st.execute(callProcedure);

        JOptionPane.showMessageDialog(null, "Préstamo eliminado y ejemplares actualizados correctamente.");
        ListarPrestamos();
        Limpiar();

    } catch (SQLException ex) {
        Logger.getLogger(FrmPrestamo.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al eliminar el préstamo: " + ex.getMessage());
    }
    }//GEN-LAST:event_EliminarActionPerformed

    private void cbBibliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBibliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBibliActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int row = Tabla.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "No se seleccionó");
        }else{
            String DNIN = (String) Tabla.getValueAt(row, 1);
            String CodLibro = (String) Tabla.getValueAt(row, 3);
            String NomBibli = (String) Tabla.getValueAt(row, 4);
            String HoraPrestamo = (String) Tabla.getValueAt(row, 5);
            String FechaPrestamo = (String) Tabla.getValueAt(row, 6);
            String FechaLimite = (String) Tabla.getValueAt(row, 7);
            txtDNI.setText(DNIN);
            txt_codlibro.setText(CodLibro);
            txt_fechaprestamo.setText(FechaPrestamo);
            txt_Hora.setText(HoraPrestamo);
            txt_limite.setText(FechaLimite);
            cbBibli.setSelectedItem(NomBibli);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void txt_codlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codlibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codlibroActionPerformed
    
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
    private javax.swing.JLabel Fecha_Limite;
    private javax.swing.JLabel Fecha_Prestamo;
    private javax.swing.JLabel Hora_Prestamo;
    private javax.swing.JLabel ID_Bibliotecario;
    private javax.swing.JButton Nuevo;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelOption;
    private javax.swing.JPanel PanelSelection;
    private javax.swing.JButton Salir;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> cbBibli;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txt_Hora;
    private javax.swing.JTextField txt_codlibro;
    private javax.swing.JTextField txt_fechaprestamo;
    private javax.swing.JTextField txt_limite;
    // End of variables declaration//GEN-END:variables
}