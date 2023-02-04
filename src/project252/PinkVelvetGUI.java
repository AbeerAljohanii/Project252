/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

/**
 *
 * @author ra52m
 */
public class PinkVelvetGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChocolatePeanutsGUI
     */
    public PinkVelvetGUI() {
        initComponents();
        //make the button(s) transparent 
        ADD.setContentAreaFilled(false);
        ADD.setOpaque(false);
        home.setContentAreaFilled(false);
        home.setOpaque(false);
        cart.setContentAreaFilled(false);
        cart.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        without = new javax.swing.JRadioButton();
        Dark = new javax.swing.JRadioButton();
        white = new javax.swing.JRadioButton();
        ADD = new javax.swing.JButton();
        home = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        pinkVelvetBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(without);
        without.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        without.setText("Without extra");
        without.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withoutActionPerformed(evt);
            }
        });
        jPanel1.add(without, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        buttonGroup1.add(Dark);
        Dark.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Dark.setText("Extra Dark Chocolate");
        jPanel1.add(Dark, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, 60));

        buttonGroup1.add(white);
        white.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        white.setText("Extra White Chocolate");
        jPanel1.add(white, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, -1, -1));

        ADD.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 850, 380, 90));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/home.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/shopping cart.png"))); // NOI18N
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartjButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, 120, -1));

        pinkVelvetBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/pink velvet backgound.png"))); // NOI18N
        pinkVelvetBackground.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(pinkVelvetBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -40, 1480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void withoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withoutActionPerformed
    
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        if (without.isSelected()) {
            Cart.addToCart(Home.cookiesFactory.getCookies("Pink Velvet")); // add the type of cookies without extra to arraylist in Cart class 
        } else if (white.isSelected()) {
            Cart.addToCart(Home.cookiesFactory.getCookies("Pink Velvet with extra white")); // add the type of cookies with white chocolate extra to arraylist in Cart class 
        } else if (Dark.isSelected()){
            Cart.addToCart(Home.cookiesFactory.getCookies("Pink Velvet with extra dark")); // add the type of cookies with dark chocolate extra to arraylist in Cart class 
        }
        Home homePage = new Home();
        homePage.show(true);
        this.show(false);    }//GEN-LAST:event_ADDActionPerformed
    //open the home frame and close this one 
    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home homePage = new Home();
        homePage.show(true);
        this.show(false);
    }//GEN-LAST:event_homeActionPerformed
    //open the cart frame and close this one 
    private void cartjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartjButton3ActionPerformed
        CartGUI cartPage = new CartGUI(); 
        cartPage.show(true);
        this.show(false);
    }//GEN-LAST:event_cartjButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PinkVelvetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PinkVelvetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PinkVelvetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PinkVelvetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PinkVelvetGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JRadioButton Dark;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cart;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pinkVelvetBackground;
    private javax.swing.JRadioButton white;
    private javax.swing.JRadioButton without;
    // End of variables declaration//GEN-END:variables
}
