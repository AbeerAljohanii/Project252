/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    static boolean flag;
    static String Sname, Spass;

    public login() {
        initComponents();
        login.setContentAreaFilled(false);
        login.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1478, 1024));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 511, 210, 40));

        password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 250, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("User name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 170, 40));

        User.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 340, 40));

        login.setBackground(new java.awt.Color(255, 218, 218));
        login.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 800, 160, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (User.getText().isEmpty() || User.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The user name is mandatory");
        } else if (password.getText().isEmpty() || password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The password is mandatory");
        } else {
            try {
                login(User.getText(), password.getText());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag) {
            Home h = new Home();
            login.show(false);
            h.show(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sorry we could not find yout account");
        }

    }//GEN-LAST:event_loginActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed

    }//GEN-LAST:event_UserActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    public void login(String name, String pass) throws FileNotFoundException {
        Sname = name;
        Spass = pass;

        Singleton s = Singleton.getInstance();
        File F1 = s.getFile(); // Singleton

        login l = new login();
        Scanner input = new Scanner(F1);

        int size = input.nextInt();
        boolean check = false;
        do {
            String nameFile = input.next();
            String passFile = input.next();
            if (nameFile.equals(Sname) && passFile.equals(Spass)) {
                check = true;
            }
            size--;
        } while (size != 0);
        l.getcheck(check);
        input.close();
    }

    void getcheck(boolean check) {
        flag = check;
    }

    public static void main(String args[]) {

        login l = new login();
        l.show();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField User;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    public static javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
