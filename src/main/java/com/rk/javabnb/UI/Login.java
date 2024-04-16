package com.rk.javabnb.UI;

import javax.swing.*;

import com.rk.javabnb.Usuarios.Cliente;
import com.rk.javabnb.db.Database;

import java.util.ArrayList;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        WindowPanel = new javax.swing.JPanel();
        centerPanel = new javax.swing.JPanel();
        formContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        noTienesCuenta = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        loginText = new javax.swing.JLabel();
        northPanel = new javax.swing.JPanel();
        LoginCenterPanel = new javax.swing.JPanel();
        logoDiv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        WindowPanel.setBackground(new java.awt.Color(255, 255, 255));
        WindowPanel.setLayout(new java.awt.BorderLayout());

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));

        formContainer.setBackground(new java.awt.Color(255, 255, 255));
        formContainer.setPreferredSize(new java.awt.Dimension(250, 350));

        jLabel1.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Montserrat", 2, 18)); // NOI18N
        jLabel2.setText("Password");

        email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email.setText("");

        password.setText("");

        noTienesCuenta.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        noTienesCuenta.setText("¿No tienes cuenta?");

        loginBtn.setFont(new java.awt.Font("Mars", 0, 12)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        registerBtn.setText("Registrarse");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formContainerLayout = new javax.swing.GroupLayout(formContainer);
        formContainer.setLayout(formContainerLayout);
        formContainerLayout.setHorizontalGroup(
            formContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formContainerLayout.createSequentialGroup()
                .addGroup(formContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addGroup(formContainerLayout.createSequentialGroup()
                            .addComponent(noTienesCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addComponent(password)
                        .addComponent(email)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        formContainerLayout.setVerticalGroup(
            formContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formContainerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noTienesCuenta)
                    .addComponent(registerBtn))
                .addGap(34, 34, 34)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        loginText.setBackground(new java.awt.Color(255, 255, 255));
        loginText.setFont(new java.awt.Font("Mars", 2, 24)); // NOI18N
        loginText.setText("Login");
        jPanel1.add(loginText, new java.awt.GridBagConstraints());

        northPanel.setBackground(new java.awt.Color(255, 255, 255));
        northPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        northPanel.setLayout(new java.awt.GridBagLayout());

        LoginCenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        LoginCenterPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        LoginCenterPanel.setLayout(new java.awt.GridBagLayout());

        ImageIcon logo = new ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\com\\rk\\javabnb\\resources\\small_logo.png");
        logoDiv.setIcon(logo); // NOI18N
        LoginCenterPanel.add(logoDiv, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 2;
        northPanel.add(LoginCenterPanel, gridBagConstraints);

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(northPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(northPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        WindowPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(WindowPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        //Login logic
        // ¿Existe el usuario con ese nombre?

        //Está loggeado?
        if(Database.getCurrentUser().size() > 0) {
            //MANDAR A PANTALLA PRINCIPAL
            System.out.println(Database.getCurrentUser().get(0));
        }

        ArrayList<Cliente> clientes = Database.getPersonas();
        Cliente intentoLogin = null;
        boolean existe = false;
        boolean claveCorrecta = false;

        for(Cliente c : clientes) {
            if(c.getEmail().equals(this.email.getText())) {
                existe = true;
                intentoLogin = c;
                break;
            }
        }

        if(!existe) {
            JOptionPane.showMessageDialog(this, "No hay un usuario con ese correo.", "Error de registro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(intentoLogin.checkPassword(this.password.getPassword())) {
            JOptionPane.showMessageDialog(this, "Login correcto", "Login correcto", JOptionPane.WARNING_MESSAGE);
            claveCorrecta = true;
        }else {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "Error de registro", JOptionPane.WARNING_MESSAGE);
            this.password.setText("");
        }

        if(claveCorrecta && existe) {
            //POST LOGIN ACTION
            ArrayList current = new ArrayList();
            current.add(intentoLogin);
            Database.setCurrentUser(current);
            Database.save();
        }else {
            return;
        }

    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Register().setVisible(true);
    }//GEN-LAST:event_registerBtnActionPerformed

    public void run() {
        new Login().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginCenterPanel;
    private javax.swing.JPanel WindowPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel formContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField email;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel logoDiv;
    private javax.swing.JLabel noTienesCuenta;
    private javax.swing.JPanel northPanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
