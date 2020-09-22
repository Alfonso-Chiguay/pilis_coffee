/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorUsuario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Usuario;

/**
 *
 * @author Alfonso
 */
public class Login extends javax.swing.JFrame {
    private boolean ventanaAbierta;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.ventanaAbierta=false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_pilisCoffee = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_loginOk = new javax.swing.JButton();
        img_cafeCorazon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pili's Coffee | Iniciar Sesion");
        setBackground(new java.awt.Color(255, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1080, 1920));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(null);

        lbl_pilisCoffee.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lbl_pilisCoffee.setText("Pili's Coffee");
        getContentPane().add(lbl_pilisCoffee);
        lbl_pilisCoffee.setBounds(610, 350, 183, 42);

        lbl_login.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_login.setText("INICIAR SESIÓN");
        getContentPane().add(lbl_login);
        lbl_login.setBounds(46, 166, 286, 42);

        lbl_username.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Nombre de usuario:");
        getContentPane().add(lbl_username);
        lbl_username.setBounds(46, 226, 166, 25);

        lbl_password.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Contraseña:");
        getContentPane().add(lbl_password);
        lbl_password.setBounds(46, 316, 99, 25);
        getContentPane().add(txt_username);
        txt_username.setBounds(46, 257, 341, 29);

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        getContentPane().add(txt_password);
        txt_password.setBounds(46, 347, 341, 29);

        btn_loginOk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btn_loginOk.setText("Aceptar");
        btn_loginOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginOkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_loginOk);
        btn_loginOk.setBounds(183, 424, 168, 79);

        img_cafeCorazon.setForeground(new java.awt.Color(255, 255, 255));
        img_cafeCorazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cafeHeart.png"))); // NOI18N
        getContentPane().add(img_cafeCorazon);
        img_cafeCorazon.setBounds(400, 190, 220, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1067, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginOkActionPerformed
        String username = txt_username.getText();
        String password = txt_password.getText();
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ControladorUsuario ctrlUsuario = new ControladorUsuario();
        usuarios = ctrlUsuario.credencialesLogin();
        boolean logrado=false;
        
        for (Usuario u: usuarios){
            if(username.equalsIgnoreCase(u.getUsername()) && password.equals(u.getPassword())){
                MainWindow ventana = new MainWindow(u);
                ventana.setVisible(true);                
                logrado=true;
                txt_username.setText("");
                txt_password.setText("");
                
                break;
            }
        }
        if(logrado == false){
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecto");
            txt_username.setText("");
            txt_password.setText("");
            txt_username.requestFocus();
        }
        
        
    }//GEN-LAST:event_btn_loginOkActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)        
            btn_loginOk.doClick();
    }//GEN-LAST:event_txt_passwordKeyPressed

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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JButton btn_loginOk;
    private javax.swing.JLabel img_cafeCorazon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_pilisCoffee;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}