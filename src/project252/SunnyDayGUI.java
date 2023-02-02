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
public class SunnyDayGUI extends javax.swing.JFrame {

    /**
     * Creates new form SimpleChipGUI
     */
    public SunnyDayGUI() {
        initComponents();
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
        home = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        SunnyDayBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(without);
        without.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        without.setText("Without extra");
        without.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withoutActionPerformed(evt);
            }
        });
        jPanel1.add(without, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        buttonGroup1.add(Dark);
        Dark.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Dark.setText("Extra Dark Chocolate");
        jPanel1.add(Dark, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        buttonGroup1.add(white);
        white.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        white.setText("Extra White Chocolate");
        jPanel1.add(white, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 740, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/home.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 80));

        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/shopping cart.png"))); // NOI18N
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartjButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, 120, -1));

        ADD.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 850, 390, 80));

        SunnyDayBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/sunny day backgound.png"))); // NOI18N
        SunnyDayBackground.setText("jLabel1");
        jPanel1.add(SunnyDayBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 960));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withoutActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home h = new Home();
        h.show(true);
        this.show(false);
    }//GEN-LAST:event_homeActionPerformed

    private void cartjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartjButton3ActionPerformed
        CartGUI c = new CartGUI();
        c.show(true);
        this.show(false);
    }//GEN-LAST:event_cartjButton3ActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        if (without.isSelected()) {
            Cart.addarray(Home.cookiesFactory.getCookies("Sunny Day"));
        } else if (white.isSelected()) {
            Cart.addarray(Home.cookiesFactory.getCookies("Sunny Day with extra white"));
        } else if (Dark.isSelected()){
            Cart.addarray(Home.cookiesFactory.getCookies("Sunny Day with extra dark"));
        }
        this.show(false);
        Home h = new Home();
        h.show(true);
    }//GEN-LAST:event_ADDActionPerformed

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
            java.util.logging.Logger.getLogger(SunnyDayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SunnyDayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SunnyDayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SunnyDayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SunnyDayGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JRadioButton Dark;
    private javax.swing.JLabel SunnyDayBackground;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cart;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton white;
    private javax.swing.JRadioButton without;
    // End of variables declaration//GEN-END:variables
}
