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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;

public class EstadisticasCliente extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    public EstadisticasCliente() {
        super("REPORTE DE CLIENTES"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        this.setLocationRelativeTo(null);

        FechaI.setVisible(false);
        FechaF.setVisible(false);

    }

    boolean bandera = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegresar1 = new javax.swing.JButton();
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
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

        jLabel5.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel5.setText(" ESTADÍSTICAS CLIENTE");

        btnRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/atras.png"))); // NOI18N
        btnRegresar1.setText("Regresar");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });

        TablaReporte.setBackground(new java.awt.Color(204, 204, 204));
        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Venta", "Id_Cliente", "Nombre", "Fecha_Venta", "Estado", "Monto_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jSeparator3.setBackground(new java.awt.Color(0, 0, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Seleccionar Datos para la Estadística");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnRegresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(572, 572, 572)
                                .addComponent(btnGraficarV)
                                .addGap(44, 44, 44))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(FechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar1)
                    .addComponent(btnGraficarV))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        Estadisticas P = new Estadisticas();
        P.setVisible(true); //ABRIR VENTANA CITAS
        P.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnRegresar1ActionPerformed

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

            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            String sql = ("SELECT gestionventa.Id_Venta, gestionventa.Id_Cliente, gestioncliente.Nombre AS Nombre, gestionventa.Fecha_Venta, gestionventa.Estado, gestionventa.Monto_Total AS Total\n"
                    + "FROM gestionventa INNER JOIN gestioncliente USING (Id_Cliente)\n"
                    + "Where Fecha_Venta between ? AND ?");

            ps = con.prepareStatement(sql);
            ps.setString(1, fecD);
            ps.setString(2, fecH);

            rs = ps.executeQuery();

            DefaultPieDataset dataset = new DefaultPieDataset();
            while (rs.next()) {
                dataset.setValue(rs.getString("Nombre"), rs.getInt("Total"));
            }

            JFreeChart jf = ChartFactory.createPieChart("Mayores Compras de Clientes", dataset);
            ChartFrame f = new ChartFrame("Estadísticas De Clientes", jf);
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

        try {
            DefaultTableModel modeloTabla = new DefaultTableModel();
            TablaReporte.setModel(modeloTabla);

            PreparedStatement ps = null;
            ResultSet rs = null;
            
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            String sql = ("SELECT gestionventa.Id_Venta, gestionventa.Id_Cliente, gestioncliente.Nombre, gestionventa.Fecha_Venta, gestionventa.Estado, gestionventa.Monto_Total\n"
                    + "FROM gestionventa INNER JOIN gestioncliente USING (Id_Cliente)\n"
                    + "Where Fecha_Venta between ? AND ?");

            ps = con.prepareStatement(sql);
            ps.setString(1, fecD);
            ps.setString(2, fecH);

            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();

            modeloTabla.addColumn("Id_Venta");
            modeloTabla.addColumn("Id_Cliente");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Fecha_Venta");
            modeloTabla.addColumn("Estado");
            modeloTabla.addColumn("Monto_Total");

            int[] anchos = {10, 10, 60, 60, 60, 60};
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
            java.util.logging.Logger.getLogger(EstadisticasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadisticasCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FechaF;
    private com.toedter.calendar.JDateChooser FechaFin;
    private javax.swing.JTextField FechaI;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JButton btnGraficarV;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
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
