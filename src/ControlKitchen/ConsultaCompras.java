package ControlKitchen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaCompras extends javax.swing.JFrame {

    static ResultSet res;
    Conexion cc = new Conexion();
    DefaultTableModel model = new DefaultTableModel();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    public ConsultaCompras() {
        super("VENTAS REALIZADAS"); //TITULO DE LA VENTANA
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        cargarTabla(); //SE CARGA LA TABLA CADA VEZ QUE SE INICIA EL PROGRAMA
        IdCompra(); //MUESTRA EL ULTIMO NO. DE COMPRA
        txtMax.setVisible(false); //OCULTA EL ULTIMO NO. DE COMPRA
        txtNoCompra.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNoCompra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtMax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        TablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No_Compra", "Fecha_Compra", "Hora_Compra", "Monto_Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaConsulta);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR COMPRA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13))); // NOI18N

        txtNoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoCompraKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(" No. Compra");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/atras.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnAtras)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAtras)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose(); //CIERRA LA VENTANA ACTUAL
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNoCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCompraKeyPressed
        //REALIZA LA BUSQUEDA DE LOS REGISTROS POR EL NO DE COMPRA
        String[] titulos = {"No_Compra", "Fecha_Compra", "Hora_Compra", "Monto_Total"};
        String[] registros = new String[200];
        //SE CONSULTA LOS DATOS CON BASE A LO QUE SE INSERTA EN EL CAMPO NO. DE COMPRA
        String sql = "SELECT * FROM gestioncompra WHERE No_Compra LIKE '" + txtNoCompra.getText() + "%'";
        model = new DefaultTableModel(null, titulos); //AGREGARN LOS TITULOS DE LA VENTANA
        Connection con = cc.getConection();
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
            //SE CARGA LOS DATOS EN EL ARREGLO REGISTROS Y SE MANDA AL MODEL PARA MOSTRAR
            while (rs.next()) {
                registros[0] = rs.getString("No_Compra");
                registros[1] = rs.getString("Fecha_Compra");
                registros[2] = rs.getString("Hora_Compra");
                registros[3] = rs.getString("Monto_Total");
                model.addRow(registros); //SE AGREGA A UNA NUEVA FILA
            }
            TablaConsulta.setModel(model); //SE CARGA LOS DATOS EN LA TABLA
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR LOS DATOS " + e.getMessage());
        }

    }//GEN-LAST:event_txtNoCompraKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //RECUPERA LOS DATOS INGRESADOS
        int bus = Integer.parseInt(txtNoCompra.getText());
        int max = Integer.parseInt(txtMax.getText());
        if (bus < max) { //SE EVALUA SI NO SE HACE UNA BUSQUEDA SUPEIOR A LA EXISTENTE
            gestioncompra(); //MUESTRA EN LA TABLA DE LA VENTANA RESULTADOCOMPRAS LA GESTIONCOMPRA
            detallecompra(); //MUESTRA EN LA TABLA DE LA VENTANA RESULTADOCOMPRAS LOS DETALLES DE LA COMPRA
        } else {
            JOptionPane.showMessageDialog(null, "El No_Compra Ingresado Es Mayor A La Existente.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //MANDA LOS DATOS DE GESTION COMPRA A LA OTRA VENTANA CON BASE AL ID
    private void gestioncompra() {
        String[] titulos = {"No_Compra", "Proveedor", "Usuario", "Fecha_Compra", "Hora_Compra", "Monto_Total"};
        String[] registros = new String[200];
        //CONSULTA LOS DATOS PARA MOSTRAR
        String sql = "SELECT No_Compra, gestionproveedor.Nombre, gestionusuarios.Username, Fecha_Compra, Hora_Compra, Monto_Total FROM gestioncompra INNER JOIN gestionproveedor USING(Id_Proveedor) INNER JOIN gestionusuarios USING(Id_Usuario) WHERE No_Compra = '" + txtNoCompra.getText() + "'";
        model = new DefaultTableModel(null, titulos); //AGREGA TITULOS A LA VENTANA
        Connection con = cc.getConection();
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
            //SE CARGA LOS DATOS EN EL ARREGLO REGISTROS Y SE MANDA AL MODEL PARA MOSTRAR
            while (rs.next()) {
                registros[0] = rs.getString("No_Compra");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Username");
                registros[3] = rs.getString("Fecha_Compra");
                registros[4] = rs.getString("Hora_Compra");
                registros[5] = rs.getString("Monto_Total");
                model.addRow(registros); //SE AGREGA A UNA NUEVA FILA
            }
            //SE ABRE LA VENTANA RESULTADO COMPRAS PARA MOSTRAR RESULTADOS DE LA CONSULTA ANTERIOR
            ResultadoCompras rs = new ResultadoCompras();
            ResultadoCompras.TablaCompras.setModel(model); //SE CARGA EN LA TABLA DE LA VENTANA RESULTADO COMPRAS LOS RESULTADOS.
            rs.setVisible(true); //ABRIR VENTANA
            rs.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
            
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR LOS DATOS " + e.getMessage());
        }
    }

    //MANDA LOS DATOS DE DETALLE DE LA COMPRAS A LA OTRA VENTANA CON BASE AL ID
    private void detallecompra() {
        //TITULOS DE LA VENTANA
        String[] titulos = {"Id_DetalleCompra", "No_Compra", "Producto", "Cantidad", "Costo_Unitario", "Caducidad", "SubTotal"};
        String[] registros = new String[200];
        //CONSULTA DE LOS DATOS QUE SERAN MOSTRADOS EN LA TABLA
        String sql = "SELECT Id_DetalleCompra, No_Compra, gestionproducto.Nombre, Cantidad, Costo_Unitario, detallecompra.Caducidad, Subtotal FROM detallecompra INNER JOIN gestionproducto USING(Id_Producto) WHERE No_Compra = '" + txtNoCompra.getText() + "'";
        model = new DefaultTableModel(null, titulos); //DA LOS TITULOS A LA TABLA
        Connection con = cc.getConection();
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
            //SE CARGA LOS DATOS EN EL ARREGLO REGISTROS Y SE MANDA AL MODEL PARA MOSTRAR
            while (rs.next()) {
                registros[0] = rs.getString("Id_DetalleCompra");
                registros[1] = rs.getString("No_Compra");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Cantidad");
                registros[4] = rs.getString("Costo_Unitario");
                registros[5] = rs.getString("Caducidad");
                registros[6] = rs.getString("Subtotal");
                model.addRow(registros); //SE AGREGA A UNA NUEVA FILA
            }
            ResultadoCompras.TablaDetalles.setModel(model); //SE CARGA LOS RESULTADOS EN LA TABLA DE LA VENTANA RESULTADO COMPRAS
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR LOS DATOS " + e.getMessage());
        }
    }

    //CARGA LOS DATOS DE TODAS LAS COMPRAS REALIZADAS
    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaConsulta.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 70, 70, 70, 10}; //ANCHOS DE LAS COLUMNAS
        for (int i = 0; i < TablaConsulta.getColumnCount(); i++) {
            TablaConsulta.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            //CONSULTA DE TODAS LAS COMPRAS
            ps = con.prepareStatement("SELECT No_Compra, Fecha_Compra, Hora_Compra, Monto_Total FROM gestioncompra");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila); //SE AGREGA EN UNA NUEVA FILA POR CADA COMPRA
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //ARROJA EL ULTIMO NO. DE COMPRA PARA PODER PONER EL LIMITE DE BUSQUEDA
    private void IdCompra() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME = 'gestioncompra'");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtMax.setText(rs.getString("AUTO_INCREMENT")); //SE MANDA EL RESULTADO AL CAMPO MAXIMO, OCULTO
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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaConsulta;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtMax;
    public static javax.swing.JTextField txtNoCompra;
    // End of variables declaration//GEN-END:variables
}
