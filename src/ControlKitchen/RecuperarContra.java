package ControlKitchen;

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

public class RecuperarContra extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel(); //declarar un tipo Fondo panel

    //CONEXIÓN A LA BASE DE DATOS
    Conexion cc = new Conexion();
    Connection con = cc.getConection();

    public RecuperarContra() {
        super("RECUPERACIÓN"); //TITULO DE LA VENTANA
        this.setContentPane(fondo); //colocarle a la ventana el fondo
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ControlKitchen/img/Logo.png")).getImage()); //CAMBIAR EL ICONO DE LA VENTANA
        setLocationRelativeTo(null); //MOSTRAR EN EL CENTRO

        TextPrompt usu = new TextPrompt("Nombre de usuario", txtUsuario);
        TextPrompt res = new TextPrompt("Respuesta de recuperación", txtRespuesta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnAutorizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        ItemPregunta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205,233,234,140));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECUPERAR MI CONTRASEÑA");

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

        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
            }
        });

        btnAutorizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAutorizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/iniicar.png"))); // NOI18N
        btnAutorizar.setText("Recuperar");
        btnAutorizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnAutorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ControlKitchen/img/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        ItemPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pregunta de recuperación...", "¿Cuál es el nombre de tu mascota?", "¿Cuál es el nombre de tu primera maestra?", "¿Primer lugar a donde viajaste?" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnAutorizar)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ItemPregunta, 0, 260, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(txtRespuesta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(ItemPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAutorizar))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void btnAutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorizarActionPerformed
        if (txtUsuario.getText().isEmpty() || txtRespuesta.getText().equals("") || ItemPregunta.getSelectedItem().equals("Seleccionar...")) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        } else {
        //RECUPERA Y VALIDA LOS DATOS
        String usu = txtUsuario.getText(); //RECUPERA NOMBRE USUARIO
        String res = txtRespuesta.getText(); //RECUPERA LA RESPUESTA

        //SE CREA UN ARREGLO PARA IDENTIFICAR LA PREGUNTA DE RECUPERACIÓN
        String[] info = new String[1]; //CREAMOS UN ARREGLO
        String pregunta = (String) ItemPregunta.getSelectedItem();
        if (pregunta.equals("¿Cuál es el nombre de tu mascota?") || pregunta.equals("¿Cuál es el nombre de tu primera maestra?") || pregunta.equals("¿Primer lugar a donde viajaste?")) {
            info[0] = pregunta; //SE DETERMINA CUAL FUE DESPUES DE LA EVALUACIÓN
        }

        acceder(usu, pregunta, res); //EJECUTA EL METODO PARA EVALUAR DATOS Y ACCEDER
    }
    }//GEN-LAST:event_btnAutorizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    //METODO QUE EVALUA LA INFORMACIÓN INGRESADA Y DAR ACCESO SI ES CORRECTA.
    public void acceder(String usuario, String pregunta, String res) { //PIDE DOS PARAMETROS
        String cap = "";
        //SELECCIONA AL USUARIO DE LA BASE DE DATOS CON LOS DATOS INGRESADOS
        String sql = "SELECT Contrasenia FROM gestionusuarios WHERE Username = '" + usuario + "' && Pregunta = '" + pregunta + "' && Respuesta = '" + res + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("Contrasenia"); //SE MANDA A LA VARIABLE CAP LA CONTRASEÑA
            }
            if (cap.equals("")) {
                JOptionPane.showMessageDialog(null, "Registro no encontrado... \nVerifique su información.");
            } else {
                JOptionPane.showMessageDialog(null, "Su Contraseña es: \n" + cap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecuperarContra.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ItemPregunta;
    private javax.swing.JButton btnAutorizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txtRespuesta;
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
