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

public class Compras extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    ButtonGroup btnGr;

    //CONEXIÓN A LA BASE DE DATOS
    Conexion cc = new Conexion();
    Connection con = cc.getConection();

    public Compras() {
        super("REGISTRO DE COMPRAS"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO

        btnAgregar.setEnabled(false); //SE BLOQUEA EL BOTON AGREGAR
        btnFinalizar.setEnabled(false); //SE BLOQUEA EL BOTON FINALIZAR
        txtNo.setEditable(false); //SE BLOQUEA LA EDICION DEL CAMPO NÚMERO DE COMPRA
        txtUsuario.setEditable(false);  //SE BLOQUEA LA EDICION DEL CAMPO USUARIO
        txtTot.setText("0"); //SE MANDA 0 AL CAMPO TOTAL
        txtFecha.setEditable(false); //SE BLOQUEA LA EDICION DEL CAMPO FECHA
        txtHora.setEditable(false); //SE BLOQUEA LA EDICION DEL CAMPO HORA
        txtTot.setEditable(false);  //SE BLOQUEA LA EDICION DEL CAMPO TOTAL
        txtCamb.setEditable(false); //SE BLOQUEA LA EDICION DEL CAMPO CAMBIO
        txtFecha.setText(fecha()); //SE LE DA LA FECHA DEL SISTEMA AL CAMPO FECHA
        txtIdUsuario.setVisible(false); //NO SE VISUALIZA EL CAMPO DEL ID DEL USUARIO
        txtIdProveedor.setVisible(false); //NO SE VISUALIZA EL CAMPO DEL ID DEL PROVEEDOR
        txtIdProducto.setVisible(false); //NO SE VISUALIZA EL CAMPO DEL ID DEL PRODUCTO
        txtCan.setVisible(false); //NO SE VISUALIZA EL CAMPO DE LA CANTIDAD RECUPERADA
        txtCos.setVisible(false); //NO SE VISUALIZA EL CAMPO DEL COSTO RECUPERADO
        txtNoR.setVisible(false); //NO SE VISUALIZA EL CAMPO DE NUMERO DE COMPRA
        txtCaducidad.setVisible(false); //NO SE VISUALIZA EL CAMPO DE CADUCIDAD

        //SE CARGAN LO METODOS AL INICIAR LA VENTANA
        hora(); //CARGAR LA HORA 
        noIncrementablecompra(); //CARGA EL NO DE REGISTRO SIGUIENTE
        ItemProv(ItemProveedor); //SELECCION DEL PROVEEDOR
        ItemProducto(ItemProducto); //SELECCION DEL CLIENTE
        nombreusuario(); //USUARIO ACTIVO
        idusuario(); //ID DEL USUARIO ACTIVO
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabladetallecompra = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtNo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ItemProveedor = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCostouni = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        txtNoR = new javax.swing.JTextField();
        txtIdProveedor = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtTot = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtPag = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtCamb = new javax.swing.JTextField();
        ItemProducto = new javax.swing.JComboBox<>();
        txtIdProducto = new javax.swing.JLabel();
        txtExiste = new javax.swing.JLabel();
        btnNuevopro = new javax.swing.JButton();
        txtCaducidad = new javax.swing.JLabel();
        txtCos = new javax.swing.JLabel();
        txtCan = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Total");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Pago");

        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagoKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Cambio");

        txtCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioActionPerformed(evt);
            }
        });

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

        btnCompras.setBackground(new java.awt.Color(102, 153, 255));
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
                .addGap(29, 29, 29)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("GESTIÓN DE COMPRAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Caducidad");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Existente:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        Tabladetallecompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad Comprada", "Descripción", "Existencia", "Precio", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
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
        jScrollPane1.setViewportView(Tabladetallecompra);

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
        jLabel16.setText("No. Compra");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Proveedor");

        ItemProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProveedorActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Usuario");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Hora");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("AGREGAR PRODUCTO");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Producto");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Cantidad");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Costo Unitario");

        txtCostouni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostouniActionPerformed(evt);
            }
        });

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/Finalizar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/agregar.png"))); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Total");

        txtTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Pago");

        txtPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagActionPerformed(evt);
            }
        });
        txtPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Cambio");

        txtCamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambActionPerformed(evt);
            }
        });

        ItemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemProductoActionPerformed(evt);
            }
        });

        txtIdProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtExiste.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        btnNuevopro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevopro.setText("New Product");
        btnNuevopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoproActionPerformed(evt);
            }
        });

        txtCaducidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtCos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtCan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

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
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ItemProducto, 0, 204, Short.MAX_VALUE)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCostouni, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(btnNuevopro)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNoR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ItemProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                        .addComponent(jLabel18)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnIniciar)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnFinalizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultar)
                                .addGap(71, 71, 71)
                                .addComponent(btnCancelar)
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCamb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(229, 229, 229)
                        .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(ItemProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel19)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(ItemProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExiste, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregar)
                            .addComponent(btnNuevopro))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)
                                .addComponent(txtCostouni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnCancelar)
                    .addComponent(btnFinalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtCamb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //SE RECUPERA LA FECHA SELECCIONADA EN EL JDATECHOOSE PARA MANDAR AL CAMPO CADUCIDAD
        String dia = Integer.toString(jDateChooser.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jDateChooser.getCalendar().get(Calendar.MONTH) + 1);
        String anio = Integer.toString(jDateChooser.getCalendar().get(Calendar.YEAR));
        String fecha = (anio + "-" + mes + "-" + dia);
        txtCaducidad.setText(fecha);
        detallecompra(); //METODO DEL DETALLE DE COMPRA
        actualizarpro(); //METODO PARRA ACTUALIZAR LA CANTIDAD DE PRODUCTOS
        VentaTotal(); //ACTUALIZA LA COMPRA CADA VEZ QUE SE AGREGA UN PRODUCTO
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        //ABRE LA VENTANA PARA CONSULTAR COMPRAS
        ConsultaCompras cc = new ConsultaCompras();
        cc.setVisible(true); //ABRIR VENTANA 
        cc.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        //CIERRA SESION Y ABRE LA VENTANA LOGIN
        Login L = new Login();
        L.setVisible(true); //ABRIR VENTANA 
        L.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void txtCostouniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostouniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostouniActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        //FINALIZA LA COMPRA Y REFRESCA LA VENTANA PARA NUEVO REGISTRO
        Compras com = new Compras();
        com.setVisible(true); //ABRIR VENTANA COMPRAS
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose(); //CIERRA VENTANA ACTUAL
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void ItemProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProveedorActionPerformed
        idproveedor(); //RECUPERA EL ID CON BASE A LA SELECCION DEL COMBOBOX
    }//GEN-LAST:event_ItemProveedorActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //ABRE LA VENTANA GESTION USUARIOS
        UsuariosAdmin u = new UsuariosAdmin();
        u.setVisible(true); //ABRIR VENTANA CITAS
        u.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        //ABRE LA VENTANA COMPRAS
        Compras com = new Compras();
        com.setVisible(true); //ABRIR VENTANA COMPRA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        agregarcompra(); //CREA UNA COMPRA NUEVA
        btnIniciar.setEnabled(false); //SE BLOQUEA EL BOTON INICIAR
        btnFinalizar.setEnabled(true); //SE HABILITA EL BOTON FINALIZAR
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed

    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyReleased

    }//GEN-LAST:event_txtPagoKeyReleased

    private void txtCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioActionPerformed

    private void txtTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotActionPerformed

    private void txtPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagActionPerformed
        //SE HACE EL CALCULO DEL CAMBIO.
        float total = Float.parseFloat(txtTot.getText());
        float pago = Float.parseFloat(txtPag.getText());
        float cambio;
        cambio = pago - total;
        String res = Float.toString(cambio);
        txtCamb.setText(res); //SE MANDA AL CAMPO CAMBIO EL RESULTADO
    }//GEN-LAST:event_txtPagActionPerformed

    private void txtPagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagKeyReleased

    }//GEN-LAST:event_txtPagKeyReleased

    private void txtCambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambActionPerformed

    private void ItemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemProductoActionPerformed
        idproducto(); //RECUPERA EL ID PRODUCTO CON BASE A LA SELECCION EN EL COMBOBOX
        existencia(); //MUESTRA LA CANTIDAD EXISTENTE
    }//GEN-LAST:event_ItemProductoActionPerformed

    private void btnNuevoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoproActionPerformed
        //ABRE LA VENTANA GESTION PRODUCTO PARA REGISTRO NUEVO
        Producto com = new Producto();
        com.setVisible(true); //ABRIR VENTANA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnNuevoproActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //ABRE LA VENTANA GESTION USUARIOS
        UsuariosAdmin com = new UsuariosAdmin();
        com.setVisible(true); //ABRIR VENTANA
        com.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    //MUESTRA EN EL COMBO BOX LOS PROVEEDORES QUE HAN SIDO REGISTRADOS A LA BD
    private void ItemProducto(JComboBox<String> ItemProducto) {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT Nombre FROM gestionproducto ORDER BY Nombre ASC");
            rs = ps.executeQuery();

            //Llenamos el combobox
            ItemProducto.addItem("Seleccionar...");
            while (rs.next()) {
                ItemProducto.addItem(rs.getString("Nombre")); //SE CARGAN LOS NOMBRES AL ITEM
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

    //RECUPERA EL ID DEL PRODUCTO CON BASE A LO SELECCIONADO PARA CONSULTAR EXISTENCIA
    private void existencia() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = (String) ItemProducto.getSelectedItem();
        String cap = "";
        String sql = "SELECT Cantidad_Producto FROM gestionproducto WHERE Nombre = '" + nombre + "'"; //CONSULTA EL ID CON BASE AL NOMBRE DEL PRODUCTO

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Cantidad_Producto");
                txtExiste.setText(cap); //SE MANDA AL CAMPO EXISTENTE
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //RESCATAMOS EL ID DEL PRODUCTO CON BASE AL NOMBRE DEL PRODUCTO SELECCIONADO EN EL ITEM
    private void idproducto() {
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = (String) ItemProducto.getSelectedItem();
        String cap = "";
        String sql = "SELECT Id_Producto FROM gestionproducto WHERE Nombre = '" + nombre + "'"; //CONSULTA EL ID CON BASE AL NOMBRE DEL PRODUCTO

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Id_Producto"); //SE GUARDA EL RESULTADO
                txtIdProducto.setText(cap); //SE MANDA AL CAMPO IDPRODUCTO EL RESULTADO
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //AUTOINCREMENTA EL SIGUIENTE REGISTRO DE COMPRA EN LA BD
    private void noIncrementablecompra() {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT AUTO_INCREMENT FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'controlkitchen' AND TABLE_NAME= 'gestioncompra'");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtNo.setText(rs.getString("AUTO_INCREMENT"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //MUESTRA EN EL COMBO BOX LOS PROVEEDORES QUE HAN SIDO REGISTRADOS A LA BD
    private void ItemProv(JComboBox<String> ItemProveedor) {
        //CREACION DE VARIABLES
        PreparedStatement ps;
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        try {
            //Prepara la consulta SQL
            ps = con.prepareStatement("SELECT Nombre FROM gestionproveedor ORDER BY Nombre ASC");
            rs = ps.executeQuery();

            //Llenamos el combobox
            ItemProveedor.addItem("Seleccionar...");
            while (rs.next()) {
                ItemProveedor.addItem(rs.getString("Nombre")); //SE MUESTRA EL NOMBRE YA QUE ES EL QUE SE INDICA
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

    //RECUPERA EL ID DEL PROVEEDOR CON BASE A LO SELECCIONADO PARA PODER GUARDAR LOS DATOS EN LA TABLA
    private void idproveedor() {
        //CREACION DE VARIABLES
        ResultSet rs;
        Conexion cc = new Conexion();
        Connection con = cc.getConection();
        String nombre = (String) ItemProveedor.getSelectedItem();
        if (nombre.equals("Seleccionar...") == false) {
            String cap = "";
            String sql = "SELECT Id_Proveedor FROM gestionproveedor WHERE Nombre = '" + nombre + "'"; //CONSULTA EL ID CON BASE AL NOMBRE DEL PROVEEDOR

            try {
                Statement st = con.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    cap = rs.getString("Id_Proveedor");
                    txtIdProveedor.setText(cap);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        } else {
            txtIdProveedor.setText("");
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
                txtIdUsuario.setText(cap);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //REALIZA EL REGISTRO DE LA COMPRA
    private void agregarcompra() {
        //SE CREA LAS VARIABLES
        int nocompra = Integer.parseInt(txtNo.getText());
        int pro = Integer.parseInt(txtIdProveedor.getText());
        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO        
        int usuario = Integer.parseInt(txtIdUsuario.getText());
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        Float total = Float.parseFloat(txtTot.getText());

        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;

            //SE AGREGA EN LA TABLA LOS DATOS QUE FUERON INGRESADOS
            ps = con.prepareStatement("INSERT INTO gestioncompra (Id_Proveedor, Id_Usuario, No_Compra, Fecha_Compra, Hora_Compra, Monto_Total) VALUES (?,?,?,?,?,?)");
            ps.setInt(1, pro);
            ps.setInt(2, usuario);
            ps.setInt(3, nocompra);
            ps.setString(4, fecha);
            ps.setString(5, hora);
            ps.setFloat(6, total);
            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            JOptionPane.showMessageDialog(null, "Registro agregado");
            txtNoR.setText(txtNo.getText());
            btnAgregar.setEnabled(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //REALIZA EL REGISTRO DE LOS DETALLES DE LA COMPRA
    private void detallecompra() {
        //SE RECUPERA LOS DATOS QUE FUERON TECLEADOS POR EL USUARIO        
        int nocompra = Integer.parseInt(txtNoR.getText());
        int idpro = Integer.parseInt(txtIdProducto.getText());
        int cantidad = Integer.parseInt(txtCantidad.getText());
        Float costouni = Float.parseFloat(txtCostouni.getText());
        String caducidad = txtCaducidad.getText();

        txtCan.setText(txtCantidad.getText());
        txtCos.setText(txtCostouni.getText());
        txtCaducidad.setText(txtCaducidad.getText());

        try {
            //SE REALIZA LA CONEXIÓN A LA BD
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;

            //SE AGREGA EN LA TABLA LOS DATOS QUE FUERON INGRESADOS
            ps = con.prepareStatement("INSERT INTO detallecompra (No_Compra, Id_Producto, Cantidad, Costo_Unitario, Caducidad, Subtotal) VALUES (?,?,?,?,?,Cantidad*Costo_Unitario)");
            ps.setInt(1, nocompra);
            ps.setInt(2, idpro);
            ps.setInt(3, cantidad);
            ps.setFloat(4, costouni);
            ps.setString(5, caducidad);

            ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            cargarTabla(); //SE CARGA EL USUARIO CREADO EN LA TABLA 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //ACTUALIZA LOS DATOS EN LA TABLA GESTION PRODUCTOS
    private void actualizarpro() {
        ///CREACION DE VARIABLES DONDE SE RECUPERA LOS DATOS INGRESADOS EN EL TEXTFIELD
        int idpro = Integer.parseInt(txtIdProducto.getText());
        int existente = Integer.parseInt(txtExiste.getText());
        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            PreparedStatement ps;
            int cantidad = Integer.parseInt(txtCan.getText());
            Float costouni = Float.parseFloat(txtCos.getText()); //SE RECUPERA
            String caducidad = txtCaducidad.getText();
            int totalexis = existente + cantidad;
            //SE ACTUALIZA EL COSTO TOTAL CADA VEZ QUE SE AGREGA UN PRODUCTO
            ps = con.prepareStatement("UPDATE gestionproducto SET Cantidad_Producto=?, Precio=?, Caducidad=? WHERE Id_Producto=?");
            ps.setInt(1, totalexis);
            ps.setFloat(2, costouni);
            ps.setString(3, caducidad);
            ps.setInt(4, idpro);
            ps.executeUpdate(); //SE ACTUALIZA 

            //SE VACIAN LOS CAMPOS DE REGISTRO
            ItemProducto.setSelectedIndex(0); //Posiciona a la opcion "Seleccionar..." en el Item
            txtExiste.setText("");
            jDateChooser.setCalendar(null);
            txtCantidad.setText("");
            txtCostouni.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //SE HACE LA SUMA DEL TOTAL DE LO QUE SE HA COMPRADO
    public void VentaTotal() {
        int nocompra = Integer.parseInt(txtNoR.getText());
        String cap = "";
        //SE HACE LA SUMA DE LOS SUBTOTALES CON BASE AL ID DE LA VENTA
        String sql = "SELECT SUM(Subtotal) AS MontoTotal FROM detallecompra WHERE No_Compra = '" + nocompra + "'"; //CONSULTA EL PRECIO CON BASE AL ID SELECCIONADO EN EL ITEM DE PRODUCTOS
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
                txtTot.setText(cap); //SE MANDA AL JLABEL EL MONTO TOTAL
                Float totalact = Float.parseFloat(txtTot.getText()); //SE RECUPERA EL MONTO TOTAL
                //SE ACTUALIZA EL COSTO TOTAL CADA VEZ QUE SE AGREGA UN PRODUCTO
                ps = con.prepareStatement("UPDATE gestioncompra SET Monto_Total=? WHERE No_Compra = '" + nocompra + "'");
                ps.setFloat(1, totalact);
                ps.executeUpdate(); //SE ACTUALIZA LA INFORMACIÓN EN LA BD
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    //SE CARGA EN LA TABLA LOS REGISTROS QUE SE VAN HACIENDO
    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) Tabladetallecompra.getModel();
        modeloTabla.setRowCount(0);
        int compra = Integer.parseInt(txtNoR.getText());
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] anchos = {50, 80, 50, 50, 50}; //ANCHO DE LAS COMLUMAS
        for (int i = 0; i < Tabladetallecompra.getColumnCount(); i++) {
            Tabladetallecompra.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {
            Conexion cc = new Conexion();
            Connection con = cc.getConection();
            //CONSULTA DE LOS DATOS QUE SE MOSTRARAN EN LA TABLA - SE HACE USO DE INNER JOIN
            ps = con.prepareStatement("SELECT Cantidad, Nombre, Cantidad_Producto, Costo_Unitario, Subtotal FROM detallecompra INNER JOIN gestionproducto USING(Id_Producto) INNER JOIN gestioncompra USING(No_Compra) WHERE No_Compra = '" + compra + "'");
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

    //CARGAR LA FECHA DEL SISTEMA
    public static String fecha() {
        Date fe = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatofecha.format(fe);
    }

    //CARGA LA HORA DEL SISTEMA
    private void hora() {
        Calendar cal = Calendar.getInstance();
        String hora;
        hora = cal.get(cal.HOUR_OF_DAY) + ":" + cal.get(cal.MINUTE) + ":" + cal.get(cal.SECOND);
        this.txtHora.setText(hora); //SE ENVIA AL CAMPO HORA
    }

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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ItemProducto;
    private javax.swing.JComboBox<String> ItemProveedor;
    private javax.swing.JTable Tabladetallecompra;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNuevopro;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Cliente;
    private javax.swing.JButton btn_Estadisticas;
    private javax.swing.JButton btn_Pedido;
    private javax.swing.JButton btn_Produccion;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txtCaducidad;
    private javax.swing.JTextField txtCamb;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JLabel txtCan;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtCos;
    private javax.swing.JTextField txtCostouni;
    private javax.swing.JLabel txtExiste;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JLabel txtIdProducto;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNoR;
    private javax.swing.JTextField txtPag;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtTot;
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
