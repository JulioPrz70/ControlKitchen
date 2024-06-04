
package ControlKitchen;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Proveedor extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel
    
    ButtonGroup btnGr;

    public Proveedor() {
        super("REGISTRO DE PROVEEDORES");
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO

        
        txtId.setVisible(false); //OCULTA EL TEXTFIELD ID
        //AGRUPAR LA SELECCION DEL SEXO, PARA SELECCIONAR SOLO UNO
        btnGr = new ButtonGroup();
        btnGr.add(BHombre);
        btnGr.add(BMujer);
        cargarTabla(); //SE CARGA LA TABLA CADA VEZ QUE SE INICIA EL PROGRAMA
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtNombre4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtRfc = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btn_Produccion = new javax.swing.JButton();
        btn_Cliente = new javax.swing.JButton();
        btn_Pedido = new javax.swing.JButton();
        btn_Estadisticas = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BHombre = new javax.swing.JRadioButton();
        BMujer = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtProduServi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Dirección");

        txtNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

        txtRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Dirección");

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/crear.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("GESTIÓN DE PROVEEDORES");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "A_Paterno", "A_Materno", "Contacto", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(Tabla);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Apellido Materno");

        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setToolTipText("CONTROL KITCHEN");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CONTROL KITCHEN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCompras.setBackground(new java.awt.Color(204, 204, 255));
        btnCompras.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/compras.png"))); // NOI18N
        btnCompras.setText("COMPRAS");
        btnCompras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnProducto.setBackground(new java.awt.Color(204, 204, 255));
        btnProducto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/productos.png"))); // NOI18N
        btnProducto.setText("PRODUCTO");
        btnProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btn_Produccion.setBackground(new java.awt.Color(204, 204, 255));
        btn_Produccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Produccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/produccion.png"))); // NOI18N
        btn_Produccion.setText("PRODUCCIÓN");
        btn_Produccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Produccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Produccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProduccionActionPerformed(evt);
            }
        });

        btn_Cliente.setBackground(new java.awt.Color(204, 204, 255));
        btn_Cliente.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/cliente.png"))); // NOI18N
        btn_Cliente.setText("CLIENTE");
        btn_Cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClienteActionPerformed(evt);
            }
        });

        btn_Pedido.setBackground(new java.awt.Color(204, 204, 255));
        btn_Pedido.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/pedido.png"))); // NOI18N
        btn_Pedido.setText("PEDIDO");
        btn_Pedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Pedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PedidoActionPerformed(evt);
            }
        });

        btn_Estadisticas.setBackground(new java.awt.Color(204, 204, 255));
        btn_Estadisticas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/estadistica.png"))); // NOI18N
        btn_Estadisticas.setText("ESTADÍSTICAS");
        btn_Estadisticas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Estadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstadisticasActionPerformed(evt);
            }
        });

        btn_Cerrar.setBackground(new java.awt.Color(204, 204, 255));
        btn_Cerrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/salir.png"))); // NOI18N
        btn_Cerrar.setText("CERRAR");
        btn_Cerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(102, 153, 255));
        btnProveedor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/proveedor.png"))); // NOI18N
        btnProveedor.setText("PROVEEDOR");
        btnProveedor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(204, 204, 255));
        btnUsuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/user.png"))); // NOI18N
        btnUsuario.setText("USUARIOS");
        btnUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Pedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Produccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Estadisticas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Produccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Edad");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Contacto");

        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Sexo");

        BHombre.setBackground(new java.awt.Color(205,233,234,140));
        BHombre.setText("Hombre");
        BHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHombreActionPerformed(evt);
            }
        });

        BMujer.setBackground(new java.awt.Color(205,233,234,140));
        BMujer.setText("Mujer");
        BMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMujerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Producto/Servicio");

        txtProduServi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduServiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("RFC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BHombre))
                                            .addComponent(txtProduServi, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(BMujer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel11)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnCrear)
                        .addGap(121, 121, 121)
                        .addComponent(btnConsultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(BHombre)
                    .addComponent(BMujer)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtProduServi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                     

    private void limpiar() {
        //MANDAMOS TEXTOS VACIOS PARA LIMPIAR LOS TEXFIELD DE REGISTRO
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtEdad.setText("");
        txtProduServi.setText("");
        txtDireccion.setText("");
        txtContacto.setText("");     
        txtRfc.setText("");
        btnGr.clearSelection();
    }
    
     private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabla.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 55, 55, 55, 55, 25};
        for (int i = 0; i < Tabla.getColumnCount(); i++) {
            Tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
       
        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            ps = con.prepareStatement("SELECT Id_Proveedor, Nombre, A_Paterno, A_Materno, Contacto, Sexo FROM gestionproveedor");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }
    
    private void txtNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre4ActionPerformed

    private void txtRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int filaSelec = Tabla.getSelectedRow();
        
        if (filaSelec == -1){
            JOptionPane.showMessageDialog(null, "Debes Seleccionar una Fila de la Tabla");
        }else{
        ConsultaProveedor CP = new ConsultaProveedor();
        CP.setVisible(true); //ABRIR VENTANA
        this.dispose();

        try {
            //CREACION DE VARIABLES
            int fila = Tabla.getSelectedRow();
            int id = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());

            PreparedStatement ps;
            ResultSet rs;
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            //SE HACE LA SELECCION DEL REGISTRO.
            ps = con.prepareStatement("SELECT Nombre, A_Paterno, A_Materno, Contacto, Direccion, Edad, Sexo, Producto_Servicio, RFC FROM gestionproveedor WHERE Id_Proveedor=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            //SE REGRESAN A LOS TEXTFIELD DE LA VENTANA DE CONSULTA LOS DATOS ALMACENADOS A LA BD. TODO ESTO CON BASE AL ID QUE FUE SELECCIONADO

            while (rs.next()) {
               
                ConsultaProveedor.txtId.setText(String.valueOf(id));
                ConsultaProveedor.txtNombre.setText(rs.getString("Nombre")); //ENVIAR EL NOMBRE QUE SE REGISTRO.
                ConsultaProveedor.txtPaterno.setText(rs.getString("A_Paterno"));
                ConsultaProveedor.txtMaterno.setText(rs.getString("A_Materno"));
                ConsultaProveedor.txtContacto.setText(rs.getString("Contacto"));
                ConsultaProveedor.txtDireccion.setText(rs.getString("Direccion"));
                ConsultaProveedor.txtEdad.setText(rs.getString("Edad"));
               // ConsultaProveedor.txtSexo.setText(rs.getString("Sexo"));
                ConsultaProveedor.txtProduServi.setText(rs.getString("Producto_Servicio"));
                ConsultaProveedor.txtRfc.setText(rs.getString("RFC"));
                
                
                //EVALUA EL SEXO SELECCIONADO PARA MANDAR A LA VENTANA DE CONSULTA
                if (rs.getString("Sexo").equals("Hombre")) {
                    ConsultaProveedor.BHombre.setSelected(true);
                } else if (rs.getString("Sexo").equals("Mujer")) {
                    ConsultaProveedor.BMujer.setSelected(true);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
  
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String materno = txtMaterno.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String producto = txtProduServi.getText();
        String direccion = txtDireccion.getText();
        String contacto = txtContacto.getText();
        String rfc = txtRfc.getText();

        //SE APLICA UN IF PARA SABER CUAL OPCI�N ELIGIO EL USUARIO Y PODER GUARDAR EL SEXO.
        String sexo;
        if (BHombre.isSelected() == true) {
            sexo = "Hombre";
        } else if (BMujer.isSelected() == true) {
            sexo = "Mujer";
        } else {
            sexo = "Indeterminado";
        }

        {
            //SE ACTUALIZA LA INFORMACION DE LA BD
            try {
                //SE REALIZA LA CONEXI�N A LA BD
                Conexion cc = new Conexion();
                Connection con = cc.getConection();
                //SE AGREGA EN LA TABLA LOS DATOS QUE FUERON INGRESADOS
                PreparedStatement ps = con.prepareStatement("INSERT INTO gestionproveedor (Nombre, A_Paterno, A_Materno, Contacto, Direccion, Edad, Sexo, Producto_Servicio,RFC) VALUES (?,?,?,?,?,?,?,?,?)");
                
                ps.setString(1, nombre);
                ps.setString(2, paterno);
                ps.setString(3, materno);
                ps.setString(4, contacto);
                ps.setString(5, direccion);
                ps.setInt(6, edad);
                ps.setString(7, sexo);
                ps.setString(8, producto);
                ps.setString(9, rfc);

                ps.executeUpdate(); //SE ACTUALIZA LA INFORMACI�N EN LA BD
                JOptionPane.showMessageDialog(null, "Proveedor Registrado");
                limpiar(); //SE LIMPIAN LOS CAMPOS DE REGISTRO
                cargarTabla(); //SE CARGA EL USUARIO CREADO EN LA TABLA
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        Login L = new Login();
        L.setVisible(true); //ABRIR VENTANA CITAS
        L.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        //ABRE LA VENTANA PROVEEDOR
        Proveedor pr = new Proveedor();
        pr.setVisible(true); //ABRIR VENTANA
        pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        //ABRE LA VENTANA USUARIOS
        UsuariosAdmin usu = new UsuariosAdmin();
        usu.setVisible(true); //ABRIR VENTANA
        usu.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

    private void BHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BHombreActionPerformed

    private void BMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BMujerActionPerformed

    private void txtProduServiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduServiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduServiActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        // TODO add your handling code here:
        Producto Pr = new Producto();
        Pr.setVisible(true); //ABRIR VENTANA CITAS
        Pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        //ABRE LA VENTANA COMPRAS
        Compras com = new Compras();
        com.setVisible(true); //ABRIR VENTANA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btn_ProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProduccionActionPerformed
        //ABRE LA VENTANA PRODUCCION
        Produccion pro = new Produccion();
        pro.setVisible(true); //ABRIR VENTANA
        pro.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btn_ProduccionActionPerformed

    private void btn_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClienteActionPerformed
        //ABRE LA VENTANA CLIENTE
        Cliente ct = new Cliente();
        ct.setVisible(true); //ABRIR VENTANA
        ct.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL

    }//GEN-LAST:event_btn_ClienteActionPerformed

    private void btn_PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PedidoActionPerformed
        //ABRE LA VENTANA PEDIDO
        Ventas vs = new Ventas();
        vs.setVisible(true); //ABRIR VENTANA
        vs.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btn_PedidoActionPerformed

    private void btn_EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstadisticasActionPerformed
        //ABRE LA VENTANA ESTADISTICAS
        Estadisticas et = new Estadisticas();
        et.setVisible(true); //ABRIR VENTANA
        et.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
    }//GEN-LAST:event_btn_EstadisticasActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BHombre;
    private javax.swing.JRadioButton BMujer;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    public static javax.swing.JButton btnUsuario;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Pedido;
    private javax.swing.JButton btn_Produccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtProduServi;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/ControlKitchen/img/fondo.JPG")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
            super.paint(g);
        }
    }
}
