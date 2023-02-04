/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class signup extends javax.swing.JFrame {

    boolean flag;

    public signup() {
        initComponents();
        login.setContentAreaFilled(false);
        login.setOpaque(false);
        signup.setContentAreaFilled(false);
        signup.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameSpace = new javax.swing.JTextField();
        passwordfield2 = new javax.swing.JTextField();
        passwordfield = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        usernameText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        haveaccounttext = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        signupBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1290, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 985));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSpaceActionPerformed(evt);
            }
        });
        jPanel1.add(nameSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 310, 40));
        jPanel1.add(passwordfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 310, 40));
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 310, 40));

        signup.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        signup.setText("signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 700, 240, 110));

        usernameText.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        usernameText.setText("User name");
        jPanel1.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, -1, -1));

        passwordText.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        passwordText.setText("Password");
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Password Conformation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 510, -1, -1));

        haveaccounttext.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        haveaccounttext.setText("Have an account?");
        jPanel1.add(haveaccounttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 830, -1, -1));

        login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 102, 102));
        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 830, -1, 30));

        signupBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/signup (3).png"))); // NOI18N
        signupBackground.setText("jLabel1");
        signupBackground.setPreferredSize(new java.awt.Dimension(1270, 985));
        jPanel1.add(signupBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        Singleton singleton = Singleton.getInstance();
        File loginFile = singleton.getFile(); // Singleton

        String name = nameSpace.getText();
        String password = passwordfield.getText();
        String password2 = passwordfield2.getText();
        if (name.isEmpty() || name.trim().equalsIgnoreCase("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (password2.isEmpty() || password2.trim().equalsIgnoreCase("")) {//check if the user did not enter password confirmation
            JOptionPane.showMessageDialog(null, "Please Enter confirmation of the Password");
        } else if (password.equalsIgnoreCase("") && name.equalsIgnoreCase("")) { // check if the user and password null
            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
        } else if (!password.equals(password2)) { // check if the passwords don't match 
            JOptionPane.showMessageDialog(null, "passwords don't match");
        } else {//if all the fields are filled 
            try {
                Scanner input = new Scanner(loginFile);
                flag = true;
                while (input.hasNext()) {
                    String nameFile = input.next();
                    String passFile = input.next();
                    if (nameFile.equals(name)) {//check if the username already exists 
                        flag = false;
                        break;
                    }
                }
                if (flag) {//if the user name doesn't exitsts in the system 
                    try {
                        FileWriter fileWritter = new FileWriter(loginFile.getName(), true);
                        BufferedWriter bw = new BufferedWriter(fileWritter);
                        bw.write(name + " " + password + "\n");//write the new username and password to the login file 
                        bw.close();

                    } catch (IOException e) {
                        //exception handling left as an exercise for the reader
                    }
                    //open home page and close this page 
                    Home homePage = new Home();
                    this.show(false);
                    homePage.show(true);
                } else {//the username already taken 
                    JOptionPane.showMessageDialog(null, "already existed username ");
                }

                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);


    }//GEN-LAST:event_signupActionPerformed
        }
    }
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        login loginPage = new login();
        this.show(false);
        loginPage.show(true);
    }//GEN-LAST:event_loginActionPerformed

    private void nameSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSpaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSpaceActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel haveaccounttext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField nameSpace;
    private javax.swing.JLabel passwordText;
    private javax.swing.JTextField passwordfield;
    private javax.swing.JTextField passwordfield2;
    private javax.swing.JButton signup;
    private javax.swing.JLabel signupBackground;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
