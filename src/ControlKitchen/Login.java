package ControlKitchen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Login extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    //CONEXIÓN A LA BASE DE DATOS
    Conexion cc = new Conexion();
    Connection con = cc.getConection();

    public Login() {
        super("LOGIN"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
        TextPrompt nom = new TextPrompt("Nombre de usuario", txtUsuario);
        TextPrompt con = new TextPrompt("Contraseña", txtContra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelregistro = new javax.swing.JLabel();
        labelolvide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL KITCHEN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtContra.setBackground(new java.awt.Color(219, 235, 235));
        txtContra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));

        txtUsuario.setBackground(new java.awt.Color(219, 235, 235));
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 102, 102)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/iniicar.png"))); // NOI18N
        btnIngresar.setText("Iniciar sesión ");
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/logini.png"))); // NOI18N

        labelregistro.setBackground(new java.awt.Color(205,233,234,140));
        labelregistro.setForeground(new java.awt.Color(0, 0, 255));
        labelregistro.setText("Registrarse");
        labelregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelregistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelregistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelregistroMouseExited(evt);
            }
        });

        labelolvide.setBackground(new java.awt.Color(205,233,234,140));
        labelolvide.setForeground(new java.awt.Color(0, 0, 255));
        labelolvide.setText("Olvidé mi contraseña");
        labelolvide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelolvideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelolvideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelolvideMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(labelregistro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelolvide))
                        .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelolvide)
                    .addComponent(labelregistro))
                .addGap(36, 36, 36)
                .addComponent(btnIngresar)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (txtUsuario.getText().isEmpty() || txtContra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese su Usuario y Contraseña.");
        } else {
            //AL PRESIONAR EL BOTON INGRESAR, EVALUA EL NOMBRE DEL USUARIO Y LA CONTRASELA PARA VERIFICAR Y DAR ACCESO.
            String usu = txtUsuario.getText(); //RECUPERA NOMBRE USUARIO
            String pas = new String(txtContra.getPassword()); //RECUPERA CONTRASEÑA
            acceder(usu, pas); //EJECUTA EL METODO PARA EVALUAR DATOS Y ACCEDER
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void labelregistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelregistroMouseEntered
        labelregistro.setForeground(Color.RED); //COLOR DEL TEXTO AL PONER EL CURSOR SOBRE EL TEXTO
    }//GEN-LAST:event_labelregistroMouseEntered

    private void labelregistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelregistroMouseExited
        labelregistro.setForeground(Color.BLUE); //COLOR DEL TEXTO AL PONER EL CURSOR SOBRE EL TEXTO
    }//GEN-LAST:event_labelregistroMouseExited

    private void labelolvideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelolvideMouseEntered
        labelolvide.setForeground(Color.RED); //COLOR DEL TEXTO AL PONER EL CURSOR SOBRE EL TEXTO
    }//GEN-LAST:event_labelolvideMouseEntered

    private void labelolvideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelolvideMouseExited
        labelolvide.setForeground(Color.BLUE); //COLOR DEL TEXTO AL PONER EL CURSOR SOBRE EL TEXTO
    }//GEN-LAST:event_labelolvideMouseExited

    private void labelregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelregistroMouseClicked
        Autorizar auto = new Autorizar();
        auto.setVisible(true);
        auto.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_labelregistroMouseClicked

    private void labelolvideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelolvideMouseClicked
        RecuperarContra re = new RecuperarContra();
        re.setVisible(true);
        re.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_labelolvideMouseClicked

    //METODO QUE EVALUA LA INFORMACIÓN INGRESADA Y DAR ACCESO SI ES CORRECTA.
    public void acceder(String usuario, String pass) { //PIDE DOS PARAMETROS
        String cap = "";
        //SELECCIONA AL USUARIO DE LA BASE DE DATOS CON ESE USUARIO Y CONTRASEÑA
        String sql = "SELECT * FROM gestionusuarios WHERE Username='" + usuario + "' && Contrasenia='" + pass + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("TipoUser"); //SE MANDA A LA VARIABLE CAP EL TIPO DE USUARIO
            }
            //SI ES ADAMINISTRADOR, SE INICIA COMO ADMINISTRADOR, DE LO CONTRARIO INICIA EN MODO INVITADO
            if (cap.equals("Administrador")) { //ADMINISTRADOR
                this.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + txtUsuario.getText()); //BIENVENIDA
                //ABRE LA VENTANA DE GESTION USUARIOS
                UsuariosAdmin U = new UsuariosAdmin();
                U.setVisible(true); //ABRIR VENTANA
                U.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
                this.dispose(); //CIERRA LA VENTANA LOGIN
            }
            if (cap.equals("Invitado")) { //INVITADO
                this.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + txtUsuario.getText()); //BIENVENIDA
                //ABRE LA VENTANA DE COMPRAS PARA INVITADOS
                ComprasInv compra = new ComprasInv();
                compra.setVisible(true); //ABRIR VENTANA
                compra.setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO
                this.dispose(); //CIERRA LA VENTANA LOGIN
            }
            //SI NO HAY REGISTRO CON ESOS DATOS SE LE NOTIFICA AL USUARIO
            if ((!cap.equals("Administrador") && (!cap.equals("Invitado")))) {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta, Intentelo de nuevo.");
                txtUsuario.requestFocus(); //MANDAMOS EL | EN EL CAMPO DE TEXTO DE USUARIO PARA MODIFICAR
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelolvide;
    private javax.swing.JLabel labelregistro;
    public static javax.swing.JPasswordField txtContra;
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
