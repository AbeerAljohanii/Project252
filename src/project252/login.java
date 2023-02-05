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
    static String name, password;

    public login() {
        initComponents();
        //make the button(s) transparent 
        login.setContentAreaFilled(false);
        login.setOpaque(false);
        signup.setContentAreaFilled(false);
        signup.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1478, 1024));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1424, 985));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 511, 210, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("User name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 170, 40));

        nameBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });
        jPanel1.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 340, 40));

        login.setBackground(new java.awt.Color(255, 218, 218));
        login.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 790, 160, 80));

        passwordfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 210, 40));

        signup.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 102, 102));
        signup.setText("signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 910, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Don't have an account? ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 910, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/background.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1424, 985));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1330, 1040));

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

        setSize(new java.awt.Dimension(1331, 1032));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String name = nameBox.getText();
        String password = passwordfield.getText();
        if (name.isEmpty() || name.trim().equalsIgnoreCase("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "Please Enter Username");
        } else if (password.isEmpty() || password.trim().equalsIgnoreCase("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "Please Enter Password");
        } else if (password.equalsIgnoreCase("") && name.equalsIgnoreCase("")) { // check if the user and password null
            JOptionPane.showMessageDialog(null, "Please Enter Password and Username");
        } else {
            //check if the username and password valid 
            try {
                Singleton singleton = Singleton.getInstance();
                File database = singleton.getFile(); // Singleton
                Scanner input = new Scanner(database);
                flag = false;
                while(input.hasNext()){
                    if(input.next().equalsIgnoreCase("login")){
                    String nameFile = input.next();
                    String passFile = input.next();
                    if (nameFile.equals(name) && passFile.equals(password)) {
                        flag = true;
                    }
                  
                }
                    else {
                       String line = input.nextLine();
                    }
                }
                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

            /*if the username and password correct 
            show the home frame and close this one 
            else dispaly a massage */
            if (flag) {
                Home homePage = new Home();
                this.show(false);
                homePage.show(true);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry we could not find your account");
            }
          
                    
                    
        }

    }//GEN-LAST:event_loginActionPerformed

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed

    }//GEN-LAST:event_nameBoxActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        signup signupPage = new signup();
        this.show(false);
        signupPage.show(true);
    }//GEN-LAST:event_signupActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    public static javax.swing.JTextField nameBox;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
