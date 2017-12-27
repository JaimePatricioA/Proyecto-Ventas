package Vista;      /** @author FuzanToko */

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class LogInUser extends javax.swing.JFrame {
    String usuario;
    String pass;
    
    public LogInUser() {
        initComponents();
        this.usuario ="admin";
        this.pass ="admin";
    }

    public String getAdmin() {
        return usuario;
    }

    public void setAdmin(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEnt = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setFont(new java.awt.Font("SamsungImaginationBold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido a Ventas LSR");
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 50));

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setFont(new java.awt.Font("SamsungImaginationBold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 0, 114));
        jLabel2.setText("Bienvenido a Ventas LSR");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 60));

        txtUser.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(14, 0, 0));
        txtUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUser.setOpaque(false);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 170, 30));

        jPass.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPass.setForeground(new java.awt.Color(14, 0, 0));
        jPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPass.setOpaque(false);
        jPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassKeyPressed(evt);
            }
        });
        getContentPane().add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 170, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 100, 20));

        btnEnt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEnt.setForeground(new java.awt.Color(255, 255, 255));
        btnEnt.setText("Entrar");
        btnEnt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnt.setContentAreaFilled(false);
        btnEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, 30));

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(49, 25));
        btnSalir.setMinimumSize(new java.awt.Dimension(49, 25));
        btnSalir.setPreferredSize(new java.awt.Dimension(49, 25));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 70, 30));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/braingridcircuitboard.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 398, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntActionPerformed
        if (validarUsuario()) {
            MenuPrincipal mP = new MenuPrincipal(usuario);
            mP.setVisible(true);
            mP.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Favor verificar datos", "Log-In",JOptionPane.WARNING_MESSAGE);
            txtUser.setText("");
            jPass.setText("");
        }
    }//GEN-LAST:event_btnEntActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (evt.getClickCount() == 2) {
            MenuPrincipal mP = new MenuPrincipal(usuario);
            mP.setVisible(true);
            mP.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (validarUsuario()) {
                MenuPrincipal mP = new MenuPrincipal(usuario);
                mP.setVisible(true);
                mP.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Favor verificar datos", "Log-In",JOptionPane.WARNING_MESSAGE);
                jPass.setText("");
                txtUser.setText("");
                txtUser.requestFocus();
            }
        }
    }//GEN-LAST:event_jPassKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) jPass.requestFocus();
    }//GEN-LAST:event_txtUserKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnt;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private boolean validarUsuario() {
       String password = "";
       char[] passw = jPass.getPassword();
       for (int i=0; i<passw.length; i++) {
           password = password + passw[i];
       }
        return txtUser.getText().equalsIgnoreCase(usuario) && (password.equals(pass));
    }
}
