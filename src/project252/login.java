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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1478, 1024));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1424, 985));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 511, 210, 40));

        passwordBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBoxActionPerformed(evt);
            }
        });
        jPanel1.add(passwordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 250, 40));

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
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 800, 160, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/background.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1424, 985));
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 1330, 1040));

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

        setSize(new java.awt.Dimension(1331, 985));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (nameBox.getText().isEmpty() || nameBox.getText().equals("")) {//check if the user did not enter name 
            JOptionPane.showMessageDialog(null, "The user name is mandatory");
        } else if (passwordBox.getText().isEmpty() || passwordBox.getText().equals("")) {//check if the user did not enter password 
            JOptionPane.showMessageDialog(null, "The password is mandatory");
        } else {
            try {
                login(nameBox.getText(), passwordBox.getText());
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
                JOptionPane.showMessageDialog(null, "Sorry we could not find yout account");
            }
        }


    }//GEN-LAST:event_loginActionPerformed

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed

    }//GEN-LAST:event_nameBoxActionPerformed

    private void passwordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBoxActionPerformed

    }//GEN-LAST:event_passwordBoxActionPerformed

    //check if the username and password valid 
    public void login(String name, String pass) throws FileNotFoundException {
        this.name = name;
        this.password = pass;

        Singleton singleton = Singleton.getInstance();
        File loginFile = singleton.getFile(); // Singleton

        login login = new login();
        Scanner input = new Scanner(loginFile);

        int size = input.nextInt();
        boolean check = false;
        do {
            String nameFile = input.next();
            String passFile = input.next();
            if (nameFile.equals(name) && passFile.equals(password)) {
                check = true;
            }
            size--;
        } while (size != 0);
        login.setFlag(check);
        input.close();
    }

    void setFlag(boolean check) {
        flag = check;
    }

    public static void main(String args[]) {

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
    public javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    public static javax.swing.JTextField nameBox;
    public static javax.swing.JTextField passwordBox;
    // End of variables declaration//GEN-END:variables
}
