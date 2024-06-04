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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Ventas extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    ButtonGroup btnGr; //SE AGRUPA PARA PODER SELECCIONAR UNA SOLA OPCION EN EL APARTADO DE SEXO

    public Ventas() {
        super("REGISTRO DE COMPRAS"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO

        btnAgregar.setEnabled(false); //SE BLOQUEA EL BOTON AGREGAR
        btnFinalizar.setEnabled(false); //SE BLOQUE EL BOTON FINALIZAR
        jespera.setVisible(false); //NO SE VISUALIZA EL CAMPO ESPERA
        Lcostouni.setVisible(false); //NO SE VISUALIZA EL CAMPO COSTOUNITARIO
        txtId.setEditable(false); //SE BLOQUE EL CAMPO ID
        txtUsuario.setEditable(false); //SE BLOQUE EL CAMPO USUARIO
        txtIdProducto.setVisible(false); //NO SE VISUALIZA EL CAMPO
        txtFecha.setEditable(false); //SE BLOQUE EL CAMPO FECHA
        txtHora.setEditable(false); //SE BLOQUE EL CAMPO HORA
        txtTotal.setEditable(false); //SE BLOQUE EL CAMPO TOTAL
        txtTotal.setText("0"); //SE LE DA EL VALOR DE 0
        txtCambio.setEditable(false); //SE BLOQUE EL CAMPO CAMBIO
        txtFecha.setText(fecha()); //SE LE DA LA FECHA DEL SISTEMA AL CAMPO
        txtIdUsuario.setVisible(false); //NO SE VISUALIZA EL CAMPO DEL ID DEL USUARIO
        txtIdCliente.setVisible(false); //NO SE VISUALIZA EL CAMPO DEL ID DEL CLIENTE
        txtIdR.setVisible(false); //NO SE VISUALIZA EL CAMPO ID RECUPERADO
        hora(); //CARGAR LA HORA DEL SISTEMA
        ItemClie(ItemCliente); //SE CARGAN LOS CLIENTES EN EL COMBOBOX
        nombreusuario(); //RECUPERA EL NOMBRE DEL USUARIO PARA MOSTRAR EN PANTALLA
        idusuario(); //RECUPERA EL ID DEL USUARIO CON EL QUE SE INICIO SESIÓN PARA LOS REGISTROS
        noIncrementableventa(); //CARGA EL NO DE REGISTRO SIGUIENTE
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
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabladetalleventa = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ItemCliente = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ItemCategoria = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        ItemProducto = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        jespera = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        txtDisponible = new javax.swing.JLabel();
        txtIdR = new javax.swing.JTextField();
        Lcostouni = new javax.swing.JLabel();
        txtCantidadR = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

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

        btn_Pedido.setBackground(new java.awt.Color(102, 153, 255));
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
                .addGap(29, 29, 29)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("GESTIÓN DE PEDIDO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha");

        Tabladetalleventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Descripción", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
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
        jScrollPane1.setViewportView(Tabladetalleventa);

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Id Venta");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Cliente");

        ItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClienteActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Usuario");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Hora");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Agregar Pedido");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Categoría");

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

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Producto");

        ItemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProductoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Disponible:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/Finalizar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jespera.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jespera.setText("Espera");
        jespera.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Total");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Pago");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Cambio");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });

        txtCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioActionPerformed(evt);
            }
        });

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/agregar.png"))); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        txtDisponible.setText(" ");

        Lcostouni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jespera))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ItemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                .addComponent(btnIniciar))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ItemCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ItemProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(txtDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCantidadR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAgregar))))))
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addGap(68, 68, 68)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Lcostouni, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(ItemCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel19)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jespera)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(ItemCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadR, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Lcostouni, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar)
                            .addComponent(btnConsultar)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int confirmacion;
        int disponible = Integer.parseInt(txtDisponible.getText());
        int salida = Integer.parseInt(txtCantidad.getText());
        if (disponible == 0) {
            JOptionPane.showMessageDialog(null, "Ya No Hay En Existencia.");
        } else {
            if (salida > disponible) { //SE EVALUA LA CANTIDAD QUE SE VA VENDER CON LA DISPONIBLE
                confirmacion = JOptionPane.showConfirmDialog(null, "La cantidad ingresada es mayor a la cantidad disponible, ¿Desea corregir la cantidad?");
                if (confirmacion == 0) {
                    txtCantidad.setText(""); //VACIA EL CAMPO DE CANTIDAD
                    txtCantidad.setFocusable(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Para poder completar la venta es necesario ingresar la cantidad a vender!");
                    txtCantidad.setText(""); //VACIA EL CAMPO DE CANTIDAD
                }
            } else {
                detallepedido(); //AGREGAR EN LA BD EL NUEVO REGISTRO
                VentaTotal(); //SE ACTUALIZA EL TOTAL DE LA VENTA POR CADA REGISTRO NUEVO
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        //ABRE LA VENTANA DONDE SE VA CONSULTAR LAS VENTAS
        ConsultaVentas cv = new ConsultaVentas();
        cv.setVisible(true); //ABRIR VENTANA CONSULTA VENTAS
        cv.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        //CIERRA SESIÓN Y ABRE LA VENTANA LOGIN
        Login L = new Login();
        L.setVisible(true); //ABRIR VENTANA LOGIN
        L.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        estadoact(); //CAMBIA EL ESTADO DE LA VENTA A FINALIZADO
        //ABRE LA VENTANA DE VENTAS
        Ventas v = new Ventas();
        v.setVisible(true); //ABRIR VENTANA VENTAS
        v.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA LA VENTANA ACTUAL
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //ABRE LA VENTANA DE GESTION DE USUARIOS
        UsuariosAdmin u = new UsuariosAdmin();
        u.setVisible(true); //ABRIR VENTANA 
        u.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        //ABRE LA VENTA DE COMPRAS
        Compras com = new Compras();
        com.setVisible(true); //ABRIR VENTANA DE COMPRAS
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnComprasActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        //SE CALCULA EL CAMBIO 
        float total = Float.parseFloat(txtTotal.getText());
        float pago = Float.parseFloat(txtPago.getText());
        float cambio;
        cambio = pago - total;
        String res = Float.toString(cambio);
        txtCambio.setText(res); //SE MANDA EL RESULLTADO AL CAMPO CAMBIO.
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioActionPerformed

    private void ItemCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemCategoriaItemStateChanged
        //AGREGUPAMOS LA VISTA DE LOS PRODUCTOS CON BASE A LA CATEGORIA SELECCIONADA
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            ItemProducto.removeAllItems(); //VACIA LA SELECCION ENTRE ALIMENTOS O BEBIDAS
            ItemProducto.addItem("Seleccionar..."); //SE AGREGA
            String[] tip = new String[1]; //CREAMOS UN ARREGLO
            String tipo = (String) ItemCategoria.getSelectedItem();
            if (tipo.equals("Bebidas") || tipo.equals("Bebidas")) {
                tip[0] = tipo; //SE DETERMINA CUAL DESPUES DE LA EVALUACIÓN
                //Prepara la consulta SQL
                ps = con.prepareStatement("SELECT * FROM gestionproducto WHERE Categoria='" + tip[0] + "'");
                rs = ps.executeQuery();

                //Llenamos el combobox
                while (rs.next()) {
                    ItemProducto.addItem(rs.getString("Nombre")); //SE MUESTRA EL NOMBRE YA QUE ES EL QUE SE INDICA
                }
            } else if (tipo.equals("Alimentos") || tipo.equals("Alimentos")) {
                tip[0] = tipo; //SE DETERMINA CUAL DESPUES DE LA EVALUACIÓN
                //Prepara la consulta SQL
                ps = con.prepareStatement("SELECT * FROM gestionproducto WHERE Categoria='" + tip[0] + "'");
                rs = ps.executeQuery();

                //Llenamos el combobox
                while (rs.next()) {
                    ItemProducto.addItem(rs.getString("Nombre")); //SE MUESTRA EL NOMBRE YA QUE ES EL QUE SE INDICA
                }
            } else if (tipo.equals("Botanas") || tipo.equals("Botanas")) {
                tip[0] = tipo; //SE DETERMINA CUAL DESPUES DE LA EVALUACIÓN
                //Prepara la consulta SQL
                ps = con.prepareStatement("SELECT * FROM gestionproducto WHERE Categoria='" + tip[0] + "'");
                rs = ps.executeQuery();

                //Llenamos el combobox
                while (rs.next()) {
                    ItemProducto.addItem(rs.getString("Nombre")); //SE MUESTRA EL NOMBRE YA QUE ES EL QUE SE INDICA
                }
            } else if (tipo.equals("Postres") || tipo.equals("Postres")) {
                tip[0] = tipo; //SE DETERMINA CUAL DESPUES DE LA EVALUACIÓN
                //Prepara la consulta SQL
                ps = con.prepareStatement("SELECT * FROM gestionproducto WHERE Categoria='" + tip[0] + "'");
                rs = ps.executeQuery();

                //Llenamos el combobox
                while (rs.next()) {
                    ItemProducto.addItem(rs.getString("Nombre")); //SE MUESTRA EL NOMBRE YA QUE ES EL QUE SE INDICA
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            if (con != null) {
                try {
                    con.close(); //SE CIERRA LA CONEXIÓN
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }//GEN-LAST:event_ItemCategoriaItemStateChanged

    private void ItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCategoriaActionPerformed

    private void ItemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProductoActionPerformed
        idproducto(); //LLAMAMOS AL METODO PARA RECUPERAR EL ID CON BASE AL ITEM SELECCIONADO
        disponibles(); //METODO PARA MOSTRAR EL TOTAL DISPONIBLE DEL PRODUCTO SELECCIONADO
    }//GEN-LAST:event_ItemProductoActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        nuevopedido(); //SE INICIA UNA NUEVA VENTA
        btnIniciar.setEnabled(false); //SE BLOQUE EL BOTON INICIAR
        btnFinalizar.setEnabled(true); //SE HABILITA EL BOTON FINALIZAR
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //ABRE LA VENTANA DE GESTION USUARIOS
        UsuariosAdmin com = new UsuariosAdmin();
        com.setVisible(true); //ABRIR VENTANA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClienteActionPerformed
        idcliente(); //SE LLAMA AL METODO - RECUPERA EL ID DEL CLIENTE
    }//GEN-LAST:event_ItemClienteActionPerformed

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
    
    //RESCATAMOS EL ID DEL PRODUCTO CON BASE AL NOMBRE DEL PRODUCTO SELECCIONADO EN EL ITEM
    private void idproducto() {
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = (String) ItemProducto.getSelectedItem();
        String cap = "";
        String sql = "SELECT Id_Producto FROM gestionproducto WHERE Nombre = '" + nombre + "'"; //CONSULTA EL ID DEL PRODUCTO CON BASE AL NOMBRE   

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Id_Producto");
                txtIdProducto.setText(cap); //SE MANDA EL ID AL CAMPO ID PRODUCTO
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //AUTOINCREMENTA EL SIGUIENTE REGISTRO EN LA BD
    private void noIncrementableventa() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME = 'gestionventa'");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(rs.getString("AUTO_INCREMENT")); //SE MANDA EL RESULTADO AL CAMPO ID
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //MUESTRA EN EL COMBO BOX LOS CLIENTES QUE HAN SIDO REGISTRADOS A LA BD
    private void ItemClie(JComboBox<String> ItemCliente) {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT Nombre FROM gestioncliente ORDER BY Nombre ASC");
            rs = ps.executeQuery();

            //Llenamos el combobox
            ItemCliente.addItem("Seleccionar...");
            while (rs.next()) {
                ItemCliente.addItem(rs.getString("Nombre")); //SE MUESTRA EL NOMBRE YA QUE ES EL QUE SE INDICA
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            if (con != null) {
                try {
                    con.close(); //SE CIERRA LA CONEXIÓN
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }

    //RECUPERA EL ID DEL CLIENTE CON BASE A LO SELECCIONADO PARA PODER GUARDAR LOS DATOS EN LA TABLA
    private void idcliente() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = (String) ItemCliente.getSelectedItem();
        if (nombre.equals("Seleccionar...") == false) {
            String cap = "";
            String sql = "SELECT Id_Cliente FROM gestioncliente WHERE Nombre = '" + nombre + "'"; //CONSULTA EL ID CON BASE AL NOMBRE

            try {
                Statement st = con.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    cap = rs.getString("Id_Cliente");
                    txtIdCliente.setText(cap); //SE MANDA EL ID CLIENTE AL CAMPO
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            txtIdCliente.setText(""); //SE VACIA EL CAMPO ID CLIENTE
        }
    }

    //CONSULTA Y MUESTRA EL USUARIO CON EL QUE SE INICIO SESIÓN PARA PODER REALIZAR LOS REGISTROS
    private void nombreusuario() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = Login.txtUsuario.getText();
        String cap = "";
        String sql = "SELECT Nombre FROM gestionusuarios WHERE Username = '" + nombre + "'"; //CONSULTA EL NOMBRE CON BASE AL USERNAME

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Nombre");
                txtUsuario.setText(cap); //SE MANDA AL CAMPO EL NOMBRE RECUPERADO
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
        String sql = "SELECT Id_Usuario FROM gestionusuarios WHERE Username = '" + user + "'"; //CONSULTA EL ID CON BASE AL USERNAME

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Id_Usuario");
                txtIdUsuario.setText(cap); //SE MANDA EL RESULTADO AL CAMPO
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //REALIZA EL REGISTRO DE LA GESTION DE LA VENTA
    private void nuevopedido() {
        //SE CREA LAS VARIABLES
        int idventa = Integer.parseInt(txtId.getText());
        int cliente = Integer.parseInt(txtIdCliente.getText());
        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO 
        int usuario = Integer.parseInt(txtIdUsuario.getText());
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        String espera = jespera.getText();
        Float total = Float.parseFloat(txtTotal.getText());

        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;

            //SE AGREGA EN LA TABLA LOS DATOS QUE FUERON INGRESADOS
            ps = con.prepareStatement("INSERT INTO gestionventa (Id_Cliente, Id_Usuario, Id_Venta, Fecha_Venta, Hora_Venta, Estado, Monto_Total) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, cliente);
            ps.setInt(2, usuario);
            ps.setInt(3, idventa);
            ps.setString(4, fecha);
            ps.setString(5, hora);
            ps.setString(6, espera);
            ps.setFloat(7, total);
            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            JOptionPane.showMessageDialog(null, "Pedido agregado");
            txtIdR.setText(txtId.getText()); //SE MANDA AL ID EN OTRO CAMPO PARA RESPALDAR
            btnAgregar.setEnabled(true); //SE HABILITA EL BOTON AGREGAR
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //REALIZA EL REGISTRO DE LOS DETALLES DE LA VENTA
    private void detallepedido() {
        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO 
        int idventa = Integer.parseInt(txtIdR.getText());
        int producto = Integer.parseInt(txtIdProducto.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());

        String idpro = txtIdProducto.getText(); //SE RECUPERA EL ID DEL PRODUCTO PARA RECUPERAR SU PRECIO UNITARIO
        String cap = "";
        String sql = "SELECT Precio FROM gestionproducto WHERE Id_Producto = '" + idpro + "'"; //CONSULTA EL PRECIO CON BASE AL ID SELECCIONADO EN EL ITEM DE PRODUCTOS
        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            ResultSet rs;
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Precio"); //SE GUARDA EL PRECIO DEL PRODUCTO
                Lcostouni.setText(cap); //SE MANDA AL JLABEL EL PRECIO DEL PRODUCTO PARA PODER RECUPERAR LUEGO
                Float preciouni = Float.parseFloat(Lcostouni.getText()); //SE RECUPERA EL PRECIO GUARDADO EN EL JLABEL
                //SE AGREGA EN LA TABLA LOS DATOS QUE FUERON INGRESADOS
                ps = con.prepareStatement("INSERT INTO detalleventa (Id_Venta, Id_Producto, Cantidad, Costo_Unitario, SubTotal) VALUES (?,?,?,?,Cantidad*Costo_Unitario)");
                ps.setInt(1, idventa);
                ps.setInt(2, producto);
                ps.setInt(3, cantidad);
                ps.setFloat(4, preciouni);
                ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
                cargarTabla();
                restarpro();
                ItemCategoria.setSelectedIndex(0); //Posiciona a la opcion "Seleccionar..." en el Item
                ItemProducto.setSelectedIndex(0); //Posiciona a la opcion "Seleccionar..." en el Item
                txtDisponible.setText(""); //VACIA EL CAMPO
                txtCantidad.setText(""); //VACIA EL CAMPO
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public void VentaTotal() {
        int idventa = Integer.parseInt(txtIdR.getText());
        String cap = "";
        //SE HACE LA SUMA DE LOS SUBTOTALES CON BASE AL ID DE LA VENTA
        String sql = "SELECT SUM(SubTotal) AS MontoTotal FROM detalleventa WHERE Id_Venta = '" + idventa + "'"; //CONSULTA EL PRECIO CON BASE AL ID SELECCIONADO EN EL ITEM DE PRODUCTOS
        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            ResultSet rs;
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("MontoTotal"); //SE GUARDA EL MONTO TOTAL
                txtTotal.setText(cap); //SE MANDA AL JLABEL EL MONTO TOTAL
                Float totalact = Float.parseFloat(txtTotal.getText()); //SE RECUPERA EL MONTO TOTAL
                //SE ACTUALIZA EL COSTO TOTAL CADA VEZ QUE SE AGREGA UN PRODUCTO
                ps = con.prepareStatement("UPDATE gestionventa SET Monto_Total=? WHERE Id_Venta = '" + idventa + "'");
                ps.setFloat(1, totalact);
                ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //RECUPERA EL ID DEL PRODCUTO PARA MOSTRAR CUANTOS HAY DISPONIBLES
    private void disponibles() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = (String) ItemProducto.getSelectedItem();
        String cap = "";
        String sql = "SELECT Cantidad_Producto FROM gestionproducto WHERE Nombre = '" + nombre + "'"; //CONSULTA LA CANTIDAD CON BASE AL NOMBRE

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Cantidad_Producto");
                txtDisponible.setText(cap); //SE MANDA LA CANTIDAD AL CAMPO DISPONIBLE
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //RESTAMOS DE LA TABLA DE PRODUCTOS LA CANTIDAD QUE FUE VENDIDA
    private void restarpro() {
        //SE REALIZA LA CONEXIÓN A LA BD
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        PreparedStatement ps;
        ResultSet rs;

        int idpro = Integer.parseInt(txtIdProducto.getText());
        try {
            int total = Integer.parseInt(txtCantidad.getText()); //SE RECUPERA LA CANTIDAD
            int dis = Integer.parseInt(txtDisponible.getText());
            //SE ACTUALIZA LA CANTIDAD DEL PRODUCTO AL HACERCE UNA VENTA
            ps = con.prepareStatement("UPDATE gestionproducto SET Cantidad_Producto = '" + dis + "' - ? WHERE Id_Producto = '" + idpro + "'");
            ps.setInt(1, total);
            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            txtCantidad.setText(""); //VACIA EL CAMPO
            txtCantidadR.setText(""); //VACIA EL CAMPO

            Statement st = con.createStatement();
            String cap = "";
            String sql = "SELECT Cantidad_Producto FROM gestionproducto WHERE Id_Producto = '" + idpro + "'"; //CONSULTA LA CANTIDAD CON BASE AL ID DEL PRODUCTO
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Cantidad_Producto"); //SE GUARDA LA CANTIDAD DEL PRODUCTO
                txtDisponible.setText(cap); //SE MANDA AL CAMPO DISPONIBLE PARA ACTUALIZAR
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //CARGA LA TABLA CON BASE A LAS VENTAS DE LOS PRODUCTOS QUE SE VAN REALIZANDO
    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabladetalleventa.getModel();
        modeloTabla.setRowCount(0);
        int venta = Integer.parseInt(txtIdR.getText());
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {10, 80, 10}; //ANCHO DE LAS COLUMNAS
        for (int i = 0; i < Tabladetalleventa.getColumnCount(); i++) {
            Tabladetalleventa.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            //CONSULTA PARA MOSTRAR LOS DATOS QUE SE REQUIEREN
            ps = con.prepareStatement("SELECT Cantidad, Nombre, Precio FROM detalleventa INNER JOIN gestionproducto USING(Id_Producto) WHERE Id_Venta = '" + venta + "'");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila); //SE AGREGA A UNA NUEVA FILA
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    //ACTUALIZA EL ESTADO DE LA VENTA DE EN ESPERA A FINALIZADO
    private void estadoact(){
        //CREACION DE VARIABLES DONDE SE RECUPERA LOS DATOS INGRESADOS EN EL TEXTFIELD
        int idventa = Integer.parseInt(txtIdR.getText());
        jespera.setText("Finalizado"); //SE MANDA EL TEXTO PARA GUARDAR
        String estado = jespera.getText();
            try {
                Conexion cc = new Conexion();
                Connection con = cc.getConection();
                //SE HACE LA ACTUALIZACIÓN DEL ESTADO AL SER FINALIZADO LA VENTA
                PreparedStatement ps = con.prepareStatement("UPDATE gestionventa SET Estado=? WHERE Id_Venta=?");
                ps.setString(1, estado);
                ps.setInt(2, idventa);
                    ps.executeUpdate(); //SE ACTUALIZA
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
    }

    //CARGAR LA FECHA DEL SISTEMA
    public static String fecha() {
        Date fe = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatofecha.format(fe);
    }

    //DAR HORA DEL SISTEMA
    private void hora() {
        Calendar cal = Calendar.getInstance();
        String hora;
        hora = cal.get(cal.HOUR_OF_DAY) + ":" + cal.get(cal.MINUTE) + ":" + cal.get(cal.SECOND);
        this.txtHora.setText(hora);
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ItemCategoria;
    private javax.swing.JComboBox<String> ItemCliente;
    private javax.swing.JComboBox<String> ItemProducto;
    private javax.swing.JLabel Lcostouni;
    private javax.swing.JTable Tabladetalleventa;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Pedido;
    private javax.swing.JButton btn_Produccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jespera;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JLabel txtCantidadR;
    private javax.swing.JLabel txtDisponible;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtIdCliente;
    public static javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdR;
    public static javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtUsuario;
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
