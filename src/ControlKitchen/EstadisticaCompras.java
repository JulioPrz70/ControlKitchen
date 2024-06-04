
package ControlKitchen;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class EstadisticaCompras extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    public EstadisticaCompras() {
        super("REPORTE DE COMPRAS"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        this.setLocationRelativeTo(null);

        FechaI.setVisible(false);
        FechaF.setVisible(false);
        txtCategoria.setVisible(false);

    }

    boolean bandera = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        btnGraficarV = new javax.swing.JButton();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        FechaFin = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FechaI = new javax.swing.JTextField();
        FechaF = new javax.swing.JTextField();
        ComboCategoria = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

        jLabel5.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel5.setText(" ESTADÍSTICAS COMPRAS");

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/atras.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        TablaReporte.setBackground(new java.awt.Color(204, 204, 204));
        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Proveedor", "No_Compra", "Id_Producto", "Nombre_Proveedor", "Nombre", "Categoria", "Fecha_Compra", "Monto_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaReporte);

        btnGraficarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/grafica.png"))); // NOI18N
        btnGraficarV.setText("Graficar");
        btnGraficarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarVActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/iniicar.png"))); // NOI18N
        jButton1.setText("Generar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Hasta");

        jLabel2.setText("Desde");

        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Alimentos", "Bebidas", "Postres", "Botanas", " " }));
        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Seleccionar Datos para Iniciar");

        jLabel4.setText("Categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(532, 532, 532)
                .addComponent(btnGraficarV)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                            .addComponent(jSeparator3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButton1)
                    .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraficarV)
                    .addComponent(btnRegresar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Estadisticas P = new Estadisticas();
        P.setVisible(true); //ABRIR VENTANA CITAS
        P.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGraficarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarVActionPerformed
        try {
            PreparedStatement ps;
            ResultSet rs;
            //obtenemos los valores insertados para realizar el filtrado de datos
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            Date fechaD = FechaInicio.getDate();
            Date fechaH = FechaFin.getDate();
            String fecD = sdf.format(fechaD);
            String fecH = sdf.format(fechaH);
            String Cat = txtCategoria.getText();

            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            String sql = ("SELECT gestioncompra.Id_Proveedor, gestioncompra.No_Compra, gestionproducto.Id_Producto, gestionproveedor.Nombre AS Nombre_Proveedor, gestionproducto.Nombre, gestionproducto.Categoria, gestioncompra.Fecha_Compra, gestioncompra.Monto_Total AS Total\n"
                    + "FROM gestioncompra INNER JOIN detallecompra USING (No_Compra)\n"
                    + "INNER JOIN gestionproducto USING (Id_Producto) \n"
                    + "INNER JOIN gestionproveedor USING (Id_Proveedor)\n"
                    + "WHERE Fecha_Compra BETWEEN ? AND ? && Categoria=?");

            ps = con.prepareStatement(sql);
            ps.setString(1, fecD);
            ps.setString(2, fecH);
            ps.setString(3, Cat);

            rs = ps.executeQuery();

            DefaultPieDataset dataset = new DefaultPieDataset();
            while (rs.next()) {
                dataset.setValue(rs.getString("Nombre_Proveedor"), rs.getInt("Total"));
            }

            JFreeChart jf = ChartFactory.createPieChart("Mayores Compras a Proveedores", dataset);
            ChartFrame f = new ChartFrame("Estadísticas De Compras", jf);
            f.setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage());
            f.setSize(800, 700);
            f.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
            f.setVisible(true);

        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }//GEN-LAST:event_btnGraficarVActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //llamamos a los metodos para recuperar la fecha inicial y final
        FechaInicial();
        FechaFinal();
        FiltrarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
        txtCategoria.setText(ComboCategoria.getSelectedItem().toString());
    }//GEN-LAST:event_ComboCategoriaActionPerformed

    private void FechaInicial() {
        String dia = Integer.toString(FechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(FechaInicio.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(FechaInicio.getCalendar().get(Calendar.YEAR));
        String fecha = (año + "-" + mes + "-" + dia);
        FechaI.setText(fecha);
    }

    private void FechaFinal() {
        String dia = Integer.toString(FechaFin.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(FechaFin.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(FechaFin.getCalendar().get(Calendar.YEAR));
        String fecha = (año + "-" + mes + "-" + dia);
        FechaF.setText(fecha);
    }

    private void FiltrarDatos() {
        //obtenemos los valores insertados para realizar el filtrado de datos
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date fechaD = FechaInicio.getDate();
        Date fechaH = FechaFin.getDate();
        String fecD = sdf.format(fechaD);
        String fecH = sdf.format(fechaH);
        String Cat = txtCategoria.getText();

        try {
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TablaReporte.setModel(modeloTabla);

            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion cc = new Conexion();
            Connection con = cc.getConection();

            String sql = ("SELECT gestioncompra.Id_Proveedor, gestioncompra.No_Compra, gestionproducto.Id_Producto, gestionproveedor.Nombre AS Nombre_Proveedor, gestionproducto.Nombre, gestionproducto.Categoria, gestioncompra.Fecha_Compra, gestioncompra.Monto_Total\n"
                    + "FROM gestioncompra INNER JOIN detallecompra USING (No_Compra)\n"
                    + "INNER JOIN gestionproducto USING (Id_Producto) \n"
                    + "INNER JOIN gestionproveedor USING (Id_Proveedor)\n"
                    + "WHERE Fecha_Compra BETWEEN ? AND ? && Categoria=?");

            ps = con.prepareStatement(sql);
            ps.setString(1, fecD);
            ps.setString(2, fecH);
            ps.setString(3, Cat);

            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modeloTabla.addColumn("Id_Proveedor");
            modeloTabla.addColumn("No_Compra");
            modeloTabla.addColumn("Id_Producto");
            modeloTabla.addColumn("Nombre_Proveedor");
            modeloTabla.addColumn("Nombre_Producto");
            modeloTabla.addColumn("Categoría");
            modeloTabla.addColumn("Fecha_Compra");
            modeloTabla.addColumn("Monto_Total");

            int[] anchos = {10, 10, 10, 60, 60, 60, 60, 60};
            for (int i = 0; i < cantidadColumnas; i++) {
                TablaReporte.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int indice = 0; indice < cantidadColumnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

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
            java.util.logging.Logger.getLogger(EstadisticaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JTextField FechaF;
    private com.toedter.calendar.JDateChooser FechaFin;
    private javax.swing.JTextField FechaI;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JButton btnGraficarV;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/ControlKitchen/img/Hambur.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
}
