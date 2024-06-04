package ControlKitchen;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Produccion extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    public Produccion() {
        super("REGISTRO DE PRODUCCIÓN");
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO

        txtId.setEditable(false); //NO PERMITE EDITAR
        txtUsuario.setEditable(false); //NO PERMITE EDITAR
        txtFecha.setEditable(false); //NO PERMITE EDITAR
        txtHora.setEditable(false); //NO PERMITE EDITAR

        txtFecha.setText(fechaAc()); //se carga la fecha cada que el usuario inicie un nuevo registro de producción
        txtHora.setText(HoraAc()); //se carga la Hora cada que el usuario inicie un nuevo registro de producción

        nombreusuario(); //USUARIO ACTIVO
        idusuario(); //ID DEL USUARIO ACTIVO
        IdAutoIncre(); //se encarga de poner el id siguiente para agregar un nuevo producto

        txtIdDetalle.setVisible(false);
        RDate.setVisible(false);
        btnAgregar.setEnabled(false);
        ItemCategoria.setEnabled(false);
        ItemSubCategoria.setEnabled(false);
        jDateChooser.setEnabled(false);
        txtIdR.setVisible(false);
        jImpo1.setVisible(false);
        txtIdDetalle.setVisible(false);
        txtIdProducto.setVisible(false);
        RDate.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btn_Produccion = new javax.swing.JButton();
        btn_Cliente = new javax.swing.JButton();
        btn_Pedido = new javax.swing.JButton();
        btn_Estadisticas = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JNoProducción = new javax.swing.JLabel();
        JFecha = new javax.swing.JLabel();
        jProductor = new javax.swing.JLabel();
        jHora = new javax.swing.JLabel();
        jProducto = new javax.swing.JLabel();
        jCantidad = new javax.swing.JLabel();
        jCategoría = new javax.swing.JLabel();
        jCosto = new javax.swing.JLabel();
        jCaducidad = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        txtCostoUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProduccion = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        ItemCategoria = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jTituloAgregarProductor = new javax.swing.JLabel();
        txtIdDetalle = new javax.swing.JTextField();
        RDate = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        jCategoría1 = new javax.swing.JLabel();
        ItemSubCategoria = new javax.swing.JComboBox<>();
        txtIdR = new javax.swing.JTextField();
        jImpo1 = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        jCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        junidadmedida = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        btnCancelar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        ItemUnidad = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

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
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        btnUsuarios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/user.png"))); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

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

        btn_Produccion.setBackground(new java.awt.Color(102, 153, 255));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Produccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Estadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Produccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Estadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("GESTIÓN DE PRODUCCIÓN");

        JNoProducción.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JNoProducción.setText("No. Producción");

        JFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JFecha.setText("Fecha");

        jProductor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jProductor.setText("Productor");

        jHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jHora.setText("Hora");

        jProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jProducto.setText("Producto");

        jCantidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCantidad.setText("Cantidad");

        jCategoría.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCategoría.setText("Categoría");

        jCosto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCosto.setText("Costo Unitario");

        jCaducidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCaducidad.setText("Caducidad");

        TablaProduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Categoría", "Cantidad", "Precio", "Caducidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProduccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TablaProduccion);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/crear.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/buscar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        ItemCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bebidas", "Alimentos", "Botanas", "Postres" }));
        ItemCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemCategoriaItemStateChanged(evt);
            }
        });

        jTituloAgregarProductor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTituloAgregarProductor.setText("Agregar Productos");

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/iniicar.png"))); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jCategoría1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCategoría1.setText("Sub Categoría");

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });

        jCapacidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCapacidad.setText("Capacidad");

        junidadmedida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        junidadmedida.setText("Unidad_Medida");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        ItemUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "L", "ml", "kg", "gr", "Pza" }));
        ItemUnidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemUnidadItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTituloAgregarProductor)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jProductor))
                                            .addComponent(JNoProducción, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jHora)
                                            .addComponent(JFecha))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jImpo1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(95, 95, 95))
                                            .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jCategoría1))
                                    .addComponent(jCategoría, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jProducto, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtProducto)
                                        .addComponent(ItemCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ItemSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCaducidad)
                                    .addComponent(jCantidad)
                                    .addComponent(jCapacidad))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(junidadmedida))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jCosto)))
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(btnAgregar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RDate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ItemUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2)
                                    .addComponent(jScrollPane1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator1))))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnConsultar)
                        .addGap(157, 157, 157)
                        .addComponent(btnCancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JNoProducción)
                    .addComponent(JFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImpo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProductor)
                    .addComponent(jHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTituloAgregarProductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCosto)
                    .addComponent(txtCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(junidadmedida)
                            .addComponent(jCapacidad)
                            .addComponent(ItemUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCategoría))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jCategoría1)
                                .addComponent(ItemSubCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCaducidad)))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    //manda los datos que se requieren conusltar y aquellos necesitan modificarse en la interfaz
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        //ABRE LA VENTANA DONDE SE VA CONSULTAR LAS PRODUCCIONES
        ConsultaProduccion CP = new ConsultaProduccion();
        CP.setVisible(true); //ABRIR VENTANA CONSULTA PRODUCCION
        CP.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
    }//GEN-LAST:event_btnConsultarActionPerformed

    //realiza la caga de la fecha y la hora en la que se crea una producción
    public static String fechaAc() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");

        return formatofecha.format(fecha);
    }

    public static String HoraAc() {
        Date hora = new Date();
        SimpleDateFormat formatohora = new SimpleDateFormat("HH:mm:ss");

        return formatohora.format(hora);
    }

    //realiza la inserción de datos en las dos tablas restantes de producción y detalle produccion
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String dia = Integer.toString(jDateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooser.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(jDateChooser.getCalendar().get(Calendar.YEAR));
        String fecha = (año + "-" + mes + "-" + dia);
        RDate.setText(fecha);

        nuevoProducto();
        nuevoDetalle();
        cargarTabla();
        limpiar();

        txtFecha.setText(fechaAc()); //se carga la fecha cada que el usuario inicie un nuevo registro de producción
        txtHora.setText(HoraAc()); //se carga la Hora cada que el usuario inicie un nuevo registro de producción

        IdAutoIncreProducto(); //se encarga de poner el id siguiente para agregar un nuevo producto   
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        Login L = new Login();
        L.setVisible(true); //ABRIR VENTANA CITAS
        L.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    //Jala los datos para iniciar el registro de un nuevo producto
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        //nuevos movimientos a la base
        nuevaproduccion();  //manda los datos a la base de datos de gestionproduccion
        cargarTabla();
        IdAutoIncreDetalle(); //conocer el nuevo id del detalle produccion
        IdAutoIncreProducto(); // conocer el nuevo id del producto siguiente

        btnIniciar.setEnabled(false);
        ItemCategoria.setEnabled(true);
        ItemSubCategoria.setEnabled(true);
        jDateChooser.setEnabled(true);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    //CONSULTA Y MUESTRA EL USUARIO CON EL QUE SE INICIO SESIÓN PARA PODER REALIZAR LOS REGISTROS
    private void nombreusuario() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = Login.txtUsuario.getText();
        String cap = "";
        String sql = "SELECT Nombre FROM gestionusuarios WHERE Username = '" + nombre + "'"; //CONSULTA EL NOMBRE

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Nombre");
                txtUsuario.setText(cap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //RECUPERA EL ID DEL USUARIO PARA PODER GUARDAR LOS DATOS EN LA TABLA
    private void idusuario() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String user = Login.txtUsuario.getText();
        String cap = "";
        String sql = "SELECT Id_Usuario FROM gestionusuarios WHERE Username = '" + user + "'"; //CONSULTA EL ID CON BASE AL NOMBRE

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Id_Usuario");
                jImpo1.setText(cap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //recuperamos la clasificacion de los productos que han sido ingresados en la base
    private void ItemCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemCategoriaItemStateChanged
        //SE CREA UN ARREGLO PARA IDENTIFICAR CUAL OPCIÓN SE ELIGIO EN LA CATEGORIA DEL PRODUCTO
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //ABRE LA VENTANA GESTION USUARIOS
        UsuariosAdmin com = new UsuariosAdmin();
        com.setVisible(true); //ABRIR VENTANA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ItemUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemUnidadItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemUnidadItemStateChanged

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //ABRE LA VENTANA USUARIOS
        UsuariosAdmin usu = new UsuariosAdmin();
        usu.setVisible(true); //ABRIR VENTANA
        usu.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        //ABRE LA VENTANA COMPRAS
        Compras com = new Compras();
        com.setVisible(true); //ABRIR VENTANA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        //ABRE LA VENTANA PROVEEDOR
        Proveedor pr = new Proveedor();
        pr.setVisible(true); //ABRIR VENTANA
        pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        //ABRE LA VENTANA PRODUCTO
        Producto pr = new Producto();
        pr.setVisible(true); //ABRIR VENTANA
        pr.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnProductoActionPerformed

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

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    //metodo para realizar el vaciado de las de texto en la interfaz
    private void limpiar() {
        //MANDAMOS TEXTOS VACIOS PARA LIMPIAR LOS TEXFIELD DE REGISTRO
        txtProducto.setText("");
        txtCantidad.setText("");
        txtCostoUnitario.setText("");
        jDateChooser.setCalendar(null);
        ItemCategoria.setSelectedIndex(0);
        RDate.setText("");
        txtIdDetalle.setText("");
        txtCapacidad.setText("");
    }

    //realiza el calculo del siguiente id que sigue en las 3 tablas de la base de datos
    private void IdAutoIncre() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME = 'gestionproduccion'");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(rs.getString("AUTO_INCREMENT"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void IdAutoIncreProducto() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME = 'gestionproducto'");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtIdProducto.setText(rs.getString("AUTO_INCREMENT"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void IdAutoIncreDetalle() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME = 'detalleproduccion'");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtIdDetalle.setText(rs.getString("AUTO_INCREMENT"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //realiza la inserción de los datos en 3 tablas de la base de datos 
    private void nuevaproduccion() {
        int idproduccion = Integer.parseInt(txtId.getText());
        int idusuario = Integer.parseInt(jImpo1.getText());
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();

        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;

            //SE AGREGA EN LA TABLA LOS DATOS QUE FUERON INGRESADOS
            ps = con.prepareStatement("INSERT INTO gestionproduccion (Id_Usuario, Id_Produccion, Fecha_Produccion, Hora_Produccion) VALUES (?,?,?,?)");
            ps.setInt(1, idusuario);
            ps.setInt(2, idproduccion);
            ps.setString(3, fecha);
            ps.setString(4, hora);
            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            txtIdR.setText(txtId.getText());
            btnAgregar.setEnabled(true);
            //   limpiar(); //SE LIMPIAN LOS CAMPOS DE REGISTRO
            // cargarTabla(); //SE CARGA EL USUARIO CREADO EN LA TABLA 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void nuevoDetalle() {
        //SE GUARDAN LOS VALORES DE LA INTERFAZ PARA ENVIARSE A LA BASE
        int idpro = Integer.parseInt(txtIdR.getText());
        int idprod = Integer.parseInt(txtIdProducto.getText());
        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO 
        int cantidad = Integer.parseInt(txtCantidad.getText());
        float costou = Float.parseFloat(txtCostoUnitario.getText());
        String caducidad = RDate.getText();

        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;
            ps = con.prepareStatement("INSERT INTO detalleproduccion (Id_Produccion, Id_Producto, "
                    + "Cantidad, Costo_Unitario, Caducidad) VALUES (?,?,?,?,?)");
            ps.setInt(1, idpro);
            ps.setInt(2, idprod);
            ps.setInt(3, cantidad);
            ps.setFloat(4, costou);
            ps.setString(5, caducidad);
            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BASE
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void nuevoProducto() {
        //SE GUARDAN LOS VALORES DE LA INTERFAZ PARA ENVIARSE A LA BASE 
        int idprod = Integer.parseInt(txtIdProducto.getText());

        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO 
        String nombre = txtProducto.getText();
        float capacidad = Float.parseFloat(txtCapacidad.getText());

        //SE CREA UN ARREGLO PARA IDENTIFICAR CUAL OPCIÓN SE ELIGIO EN LA UNIDAD DEL PRODUCTO
        String[] info = new String[1]; //CREAMOS UN ARREGLO
        String UMedida = (String) ItemUnidad.getSelectedItem();
        if (UMedida.equals("L") || UMedida.equals("Kg") || UMedida.equals("gr") || UMedida.equals("ml") || UMedida.equals("Pza")) {
            info[0] = UMedida; //SE DETERMINA CUAL DESPUES DE LA EVALUACIÓN
        }

        int cantidad = Integer.parseInt(txtCantidad.getText());
        String categoria = (String) ItemCategoria.getSelectedItem();
        String subCategoria = (String) ItemSubCategoria.getSelectedItem();
        float costou = Float.parseFloat(txtCostoUnitario.getText());
        String caducidad = RDate.getText();

        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;
            ps = con.prepareStatement("INSERT INTO gestionproducto (Id_Producto, Nombre, Capacidad, U_Medida, Cantidad_Producto, Categoria, SubCategoria, Precio, Caducidad) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, idprod);
            ps.setString(2, nombre);
            ps.setFloat(3, capacidad);
            ps.setString(4, UMedida);
            ps.setInt(5, cantidad);
            ps.setString(6, categoria);
            ps.setString(7, subCategoria);
            ps.setFloat(8, costou);
            ps.setString(9, caducidad);
            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BASE
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //realiza la carga de la tabla que se miuestra en la interfaz
    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaProduccion.getModel();
        modeloTabla.setRowCount(0);
        int Idproduccion = Integer.parseInt(txtIdR.getText());
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {60, 60, 10, 10, 60};
        for (int i = 0; i < TablaProduccion.getColumnCount(); i++) {
            TablaProduccion.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            ps = con.prepareStatement("SELECT gestionproducto.Nombre, gestionproducto.Categoria, Cantidad, Costo_Unitario, detalleproduccion.Caducidad  FROM detalleproduccion INNER JOIN gestionproducto USING(Id_Producto) WHERE Id_Produccion = '" + Idproduccion + "'");
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
            java.util.logging.Logger.getLogger(Produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ItemCategoria;
    private javax.swing.JComboBox<String> ItemSubCategoria;
    private javax.swing.JComboBox<String> ItemUnidad;
    private javax.swing.JLabel JFecha;
    private javax.swing.JLabel JNoProducción;
    private javax.swing.JTextField RDate;
    public static javax.swing.JTable TablaProduccion;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Pedido;
    private javax.swing.JButton btn_Produccion;
    private javax.swing.JLabel jCaducidad;
    private javax.swing.JLabel jCantidad;
    private javax.swing.JLabel jCapacidad;
    private javax.swing.JLabel jCategoría;
    private javax.swing.JLabel jCategoría1;
    private javax.swing.JLabel jCosto;
    public static com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jHora;
    private javax.swing.JTextField jImpo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jProducto;
    private javax.swing.JLabel jProductor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTituloAgregarProductor;
    private javax.swing.JLabel junidadmedida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtCostoUnitario;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdDetalle;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdR;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtUsuario;
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
