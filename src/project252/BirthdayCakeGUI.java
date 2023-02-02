
package project252;

/**
 *
 * @author ra52m
 */
public class BirthdayCakeGUI extends javax.swing.JFrame {

    /**
     * Creates new form BirthdayCakeGUI
     */
    public BirthdayCakeGUI() {
        initComponents();
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
        white = new javax.swing.JRadioButton();
        Dark = new javax.swing.JRadioButton();
        home = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        BirthdayCakeBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(without);
        without.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        without.setText("Without Extra");
        without.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withoutActionPerformed(evt);
            }
        });
        jPanel1.add(without, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 260, -1));

        buttonGroup1.add(white);
        white.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        white.setText("Extra White Chocolate");
        jPanel1.add(white, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 740, -1, -1));

        buttonGroup1.add(Dark);
        Dark.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Dark.setText("Extra Dark Chocolate");
        Dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkActionPerformed(evt);
            }
        });
        jPanel1.add(Dark, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/home.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 860, 190, 70));

        cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/shopping cart.png"))); // NOI18N
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartjButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, 120, -1));

        BirthdayCakeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/birthday cake backgound.png"))); // NOI18N
        BirthdayCakeBackground.setText("jLabel1");
        jPanel1.add(BirthdayCakeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1440, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withoutActionPerformed

    private void DarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DarkActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        Home h = new Home();
        h.show(true);
        this.show(false);
    }//GEN-LAST:event_homeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (without.isSelected()) {
            Cart.addarray(Home.cookiesFactory.getCookies("Birthday Cake"));
        } else if (white.isSelected()) {
            Cart.addarray(Home.cookiesFactory.getCookies("Birthday Cake with extra white"));
        } else if (Dark.isSelected()){
            Cart.addarray(Home.cookiesFactory.getCookies("Birthday Cake with extra dark"));
        }
        this.show(false);
        Home h = new Home();
        h.show(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cartjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartjButton3ActionPerformed
        CartGUI c = new CartGUI();
        c.show(true);
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
            java.util.logging.Logger.getLogger(BirthdayCakeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BirthdayCakeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BirthdayCakeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BirthdayCakeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BirthdayCakeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BirthdayCakeBackground;
    private javax.swing.JRadioButton Dark;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cart;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton white;
    private javax.swing.JRadioButton without;
    // End of variables declaration//GEN-END:variables
}
