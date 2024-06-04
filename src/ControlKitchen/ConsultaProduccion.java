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

public class ConsultaProduccion extends javax.swing.JFrame {

    static ResultSet res;
    Conexion cc = new Conexion();
    DefaultTableModel model = new DefaultTableModel();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    public ConsultaProduccion() {
        super("PRODUCCIONES"); //TITULO DE LA VENTANA
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        cargarTabla(); //SE CARGA LA TABLA CADA VEZ QUE SE INICIA EL PROGRAMA
        noProduccion(); //MUESTRA EL ULTIMO ID DE LA VENTA
        txtMax.setVisible(false); //OCULTA EL ULTIMO ID DE VENTA
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNoProduccion = new javax.swing.JTextField();
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
                "No_Producción", "Fecha", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaConsulta);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR PRODUCCIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 13))); // NOI18N

        txtNoProduccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoProduccionKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("No. Producción");

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
                .addComponent(txtNoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtNoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtNoProduccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoProduccionKeyPressed
        //REALIZA LA BUSQUEDA DE LOS REGISTROS POR EL ID Y EL ESTADO DE LA VENTA
        String[] titulos = {"No_Producción", "Fecha_Producción", "Hora_Producción"};
        String[] registros = new String[200];
        //SE CONSULTA LOS DATOS CON BASE A LO QUE SE INSERTA EN EL CAMPO ID O ESTADO
        String sql = "SELECT * FROM gestionproduccion WHERE Id_Produccion LIKE '" + txtNoProduccion.getText() + "%'";
        model = new DefaultTableModel(null, titulos); //AGREGARN LOS TITULOS DE LA VENTANA
        Connection con = cc.getConection();
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
            //SE CARGA LOS DATOS EN EL ARREGLO REGISTROS Y SE MANDA AL MODEL PARA MOSTRAR
            while (rs.next()) {
                registros[0] = rs.getString("Id_Produccion");
                registros[1] = rs.getString("Fecha_Produccion");
                registros[2] = rs.getString("Hora_Produccion");
                model.addRow(registros); //SE AGREGA A UNA NUEVA FILA
            }
            TablaConsulta.setModel(model); //SE CARGA LOS DATOS EN LA TABLA
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR LOS DATOS " + e.getMessage());
        }

    }//GEN-LAST:event_txtNoProduccionKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //RECUPERA LOS DATOS INGRESADOS
        int bus = Integer.parseInt(txtNoProduccion.getText());
        int max = Integer.parseInt(txtMax.getText());
        if (bus < max) { //SE EVALUA SI NO SE HACE UNA BUSQUEDA SUPEIOR A LA EXISTENTE
            gestionproduccion(); //MUESTRA EN LA TABLA DE LA VENTANA RESULTADOPRODUCCION LA GESTIONPRODUCCION
            detalleproduccion(); //MUESTRA EN LA TABLA DE LA VENTANA RESULTADOPRODUCCION LOS DETALLES DE LA PRODUCCION
        } else {
            JOptionPane.showMessageDialog(null, "El No. de Producción Ingresado Es Mayor A La Existente.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //MANDA LOS DATOS DE GESTION VENTA A LA OTRA VENTANA CON BASE AL ID
    private void gestionproduccion() {
        String[] titulos = {"No_Producción", "Usuario", "Fecha_Producción", "Hora_Producción"};
        String[] registros = new String[200];
        //CONSULTA LOS DATOS PARA MOSTRAR
        String sql = "SELECT Id_Produccion, gestionusuarios.Nombre, Fecha_Produccion, Hora_Produccion FROM gestionproduccion INNER JOIN gestionusuarios USING(Id_Usuario) WHERE Id_Produccion = '" + txtNoProduccion.getText() + "'";
        model = new DefaultTableModel(null, titulos); //AGREGA TITULOS A LA VENTANA
        Connection con = cc.getConection();
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
            //SE CARGA LOS DATOS EN EL ARREGLO REGISTROS Y SE MANDA AL MODEL PARA MOSTRAR
            while (rs.next()) {
                registros[0] = rs.getString("Id_Produccion");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Fecha_Produccion");
                registros[3] = rs.getString("Hora_Produccion");
                model.addRow(registros); //SE AGREGA A UNA NUEVA FILA
            }
            //SE ABRE LA VENTANA RESULTADO PRODUCCIÓN PARA MOSTRAR RESULTADOS DE LA CONSULTA ANTERIOR
            ResultadoProduccion RP = new ResultadoProduccion();
            ResultadoProduccion.TablaProduccion.setModel(model); //SE CARGA EN LA TABLA DE LA VENTANA RESULTADO PRODUCCION LOS RESULTADOS.
            RP.setVisible(true); //ABRIR VENTANA
            RP.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
            
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR LOS DATOS " + e.getMessage());
        }
    }

    //MANDA LOS DATOS DE DETALLE DE LA VENTA A LA OTRA VENTANA CON BASE AL ID
    private void detalleproduccion() {
        //TITULOS DE LA VENTANA
        String[] titulos = {"Id_DetalleProduccion", "Id_Produccion", "Producto", "Cantidad", "Costo_Unitario", "Caducidad"};
        String[] registros = new String[200];
        //CONSULTA DE LOS DATOS QUE SERAN MOSTRADOS EN LA TABLA
        String sql = "SELECT Id_DetalleProduccion, Id_Produccion, Nombre, detalleproduccion.Cantidad, Costo_Unitario, detalleproduccion.Caducidad FROM detalleproduccion INNER JOIN gestionproducto USING(Id_Producto) WHERE Id_Produccion = '" + txtNoProduccion.getText() + "'";
        model = new DefaultTableModel(null, titulos); //DA LOS TITULOS A LA TABLA
        Connection con = cc.getConection();
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(sql);
            //SE CARGA LOS DATOS EN EL ARREGLO REGISTROS Y SE MANDA AL MODEL PARA MOSTRAR
            while (rs.next()) {
                registros[0] = rs.getString("Id_DetalleProduccion");
                registros[1] = rs.getString("Id_Produccion");
                registros[2] = rs.getString("Nombre");
                registros[3] = rs.getString("Cantidad");
                registros[4] = rs.getString("Costo_Unitario");
                registros[5] = rs.getString("Caducidad");
                model.addRow(registros); //SE AGREGA A UNA NUEVA FILA
            }
            ResultadoProduccion.TablaDetalle.setModel(model); //SE CARGA LOS RESULTADOS EN LA TABLA DE LA VENTANA RESULTADO VENTAS
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR LOS DATOS " + e.getMessage());
        }
    }

    //CARGA LOS DATOS DE TODAS LAS VENTAS REALIZADAS
    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaConsulta.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 80, 80}; //ANCHOS DE LAS COLUMNAS
        for (int i = 0; i < TablaConsulta.getColumnCount(); i++) {
            TablaConsulta.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            //CONSULTA DE TODAS LAS VENTAS
            ps = con.prepareStatement("SELECT Id_Produccion, Fecha_Produccion, Hora_Produccion FROM gestionproduccion");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila); //SE AGREGA EN UNA NUEVA FILA POR CADA PRODUCCION
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //ARROJA EL ULTIMO NO. DE PRODUCCION PARA PODER PONER EL LIMITE DE BUSQUEDA
    private void noProduccion() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME = 'gestionproduccion'");
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
            java.util.logging.Logger.getLogger(ConsultaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduccion().setVisible(true);
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
    public static javax.swing.JTextField txtNoProduccion;
    // End of variables declaration//GEN-END:variables
}
