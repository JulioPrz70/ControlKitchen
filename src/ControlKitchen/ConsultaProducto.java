package ControlKitchen;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ConsultaProducto extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel
    
    public ConsultaProducto() {
        super("CONSULTA PRODUCTOS"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        txtId.setEditable(false);
        txtFecha.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JButton();
        btn_Produccion = new javax.swing.JButton();
        btn_Cliente = new javax.swing.JButton();
        btn_Pedido = new javax.swing.JButton();
        btn_Estadisticas = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ItemUnidad = new javax.swing.JComboBox<>();
        ItemSubCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ItemCategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("CONSULTA DE PRODUCTOS");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
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

        btnProveedor.setBackground(new java.awt.Color(204, 204, 255));
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

        btnProducto.setBackground(new java.awt.Color(102, 153, 255));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Produccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Produccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Id Producto");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Unidad");

        ItemUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "L", "ml", "Kg", "gr", "Pza" }));
        ItemUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUnidadActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("SubCategoria");

        ItemCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bebidas", "Alimentos", "Postres", "Botanas" }));
        ItemCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemCategoriaItemStateChanged(evt);
            }
        });
        ItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCategoriaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Categoria");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cantidad");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Capacidad");

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnregresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/atras.png"))); // NOI18N
        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Caducidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ItemSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ItemCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ItemUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel4))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)))
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(118, 118, 118)
                        .addComponent(btnregresar)
                        .addGap(146, 146, 146))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(ItemCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(ItemSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnregresar)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar))
                        .addGap(127, 127, 127))))
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

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        Login L = new Login();
        L.setVisible(true); //ABRIR VENTANA CITAS
        L.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        //ABRE LA VENTANA USUARIOS
        UsuariosAdmin usu = new UsuariosAdmin();
        usu.setVisible(true); //ABRIR VENTANA
        usu.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
        Proveedor Pr = new Proveedor();
        Pr.setVisible(true); //ABRIR VENTANA CITAS
        Pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
      //ABRE LA VENTANA PRODUCTO
        Producto pr = new Producto();
        pr.setVisible(true); //ABRIR VENTANA
        pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnProductoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void ItemUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemUnidadActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
//para enviar la fecha que está introducida en el jDateChooser
        String dia = Integer.toString(jDateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooser.getCalendar().get(Calendar.MONTH) + 1);
        String año= Integer.toString(jDateChooser.getCalendar().get(Calendar.YEAR));
        String fecha = (año + "-" + mes + "-" + dia);
        txtFecha.setText(fecha);         
//CREACION DE VARIABLES DONDE SE RECUPERA LOS DATOS INGRESADOS EN EL TEXTFIELD
        int confirmacion;
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        float capacidad = Float.parseFloat(txtCapacidad.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        float precio = Float.parseFloat(txtPrecio.getText());
        String caducidad = txtFecha.getText();
        
        String[] info = new String[1]; //CREAMOS UN ARREGLO
        String seleccionado = (String) ItemUnidad.getSelectedItem();
        if (seleccionado.equals("L") || seleccionado.equals("Kg") || seleccionado.equals("gr") || seleccionado.equals("Pza") || seleccionado.equals("ml")) {
            info[0] = seleccionado;
        }
         String cat = (String) ItemCategoria.getSelectedItem();
        String subcat = (String) ItemSubCategoria.getSelectedItem();


        {
            //SE ACTUALIZA LA INFORMACION DE LA BD
            try {
                Conexion cc = new Conexion();
                Connection con = cc.getConection();
                PreparedStatement ps = con.prepareStatement("UPDATE gestionproducto SET Nombre=?, Capacidad=?, U_Medida=?, Cantidad_Producto=?, Categoria=?, SubCategoria=?, Precio=?, Caducidad=? WHERE Id_Producto=?");
                ps.setString(1, nombre);
                ps.setString(1, nombre);
                ps.setFloat(2, capacidad);
                ps.setString(3, seleccionado);
                ps.setInt(4, cantidad);
                ps.setString(5, cat);
                ps.setString(6, subcat);
                ps.setFloat(7, precio);
                ps.setString(8, caducidad);
                ps.setInt(9, id);

                //MANDA UN DIALOGO EN VENTANA PARA QUE EL USUARIO CONFIRME LA OPERACION
                confirmacion = JOptionPane.showConfirmDialog(null, "¿Realmente desea Modificar?");
                if (confirmacion == 0) {
                    ps.executeUpdate(); //SE ACTUALIZA
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
                    Producto Pro = new Producto();
                    Pro.setVisible(true); //
                    Pro.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Registro No Modificado");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        Producto p = new Producto();
        p.setVisible(true); //ABRIR VENTANA
        p.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int id = Integer.parseInt(txtId.getText());

        try {//CONECTA A LA BASE DE DATOS
            Conexion cc = new Conexion();
            Connection con = cc.getConection();

            //MANDA UN DIALOGO EN VENTANA PARA QUE EL USUARIO CONFIRME LA OPERACION
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Realmente desea Eliminar?");
            if (confirmacion == 0) {
                //BORRA EL REGISTRO DEL USUARIO CON AYUDA DEL ID
                PreparedStatement ps = con.prepareStatement("DELETE FROM gestionproducto WHERE Id_Producto=?");
                ps.setInt(1, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                Producto pr = new Producto();
                pr.setVisible(true); //
                pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Registro No Eliminado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCategoriaActionPerformed

    private void ItemCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemCategoriaItemStateChanged
        // TODO add your handling code here:
         String[] info2 = new String[1]; //CREAMOS UN ARREGLO
        ItemSubCategoria.removeAllItems();
        ItemSubCategoria.addItem("Seleccionar...");
        String seleccionado2 = (String) ItemCategoria.getSelectedItem();
        
        if (seleccionado2.equals("Bebidas")) {
            ItemSubCategoria.addItem("Original");
            ItemSubCategoria.addItem("Light");
            ItemSubCategoria.addItem("Sin Azúcar");
        } else {
            if (seleccionado2.equals("Alimentos")) {
                ItemSubCategoria.addItem("Caldo");
                ItemSubCategoria.addItem("Asado");
                ItemSubCategoria.addItem("Frito");
                ItemSubCategoria.addItem("Lácteo");

            } else {
                if (seleccionado2.equals("Postres")) {
                    ItemSubCategoria.addItem("Horneado");
                    ItemSubCategoria.addItem("Frito");
                    ItemSubCategoria.addItem("Seco");
                    ItemSubCategoria.addItem("Lácteo");
               
                } else {
                    if (seleccionado2.equals("Botanas")) {
                        ItemSubCategoria.addItem("Dulce");
                        ItemSubCategoria.addItem("Simple");
                        ItemSubCategoria.addItem("Picante");
                        ItemSubCategoria.addItem("Galleta");
                    }
                }
                
            }
        }

    }//GEN-LAST:event_ItemCategoriaItemStateChanged

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
            java.util.logging.Logger.getLogger(ConsultaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> ItemCategoria;
    public static javax.swing.JComboBox<String> ItemSubCategoria;
    public static javax.swing.JComboBox<String> ItemUnidad;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Pedido;
    private javax.swing.JButton btn_Produccion;
    private javax.swing.JButton btnregresar;
    public static com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtCapacidad;
    private javax.swing.JLabel txtFecha;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPrecio;
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
