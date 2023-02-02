/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project252;

public class Home extends javax.swing.JFrame {

    static CookiesFactory cookiesFactory = new CookiesFactory();

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PinkVelvet = new javax.swing.JButton();
        ChocolateChip = new javax.swing.JButton();
        BirthdayCake = new javax.swing.JButton();
        SunnyDay = new javax.swing.JButton();
        backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 1024));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/signout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 90));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/shopping cart.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 120, 90));

        PinkVelvet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/pinkVelvet.png"))); // NOI18N
        PinkVelvet.setText("jButton2");
        PinkVelvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinkVelvetActionPerformed(evt);
            }
        });
        jPanel1.add(PinkVelvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 330, 380));

        ChocolateChip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/chocolate chip.png"))); // NOI18N
        ChocolateChip.setText("jButton2");
        ChocolateChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocolateChipActionPerformed(evt);
            }
        });
        jPanel1.add(ChocolateChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 340, 390));

        BirthdayCake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/BirthdayCake.png"))); // NOI18N
        BirthdayCake.setText("jButton2");
        BirthdayCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthdayCakeActionPerformed(evt);
            }
        });
        jPanel1.add(BirthdayCake, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, 330, 380));

        SunnyDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/SunnyDay.png"))); // NOI18N
        SunnyDay.setText("jButton2");
        SunnyDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SunnyDayActionPerformed(evt);
            }
        });
        jPanel1.add(SunnyDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 340, 370));

        backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/backgound.png"))); // NOI18N
        backgound.setText("jLabel2");
        jPanel1.add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 1020));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login l = new login();
        l.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cart cart = new Cart();
        CartGUI c = new CartGUI();
        for (int i = 0; i < cart.getCookie().size(); i++) {
           c.jTextArea1.append(cart.getCookie().get(i).information()+"\n");
         
        }  
        c.show();
        this.show(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ChocolateChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocolateChipActionPerformed
        ChocolateChipGUI c = new ChocolateChipGUI();
        c.show();
        this.show(false);
    }//GEN-LAST:event_ChocolateChipActionPerformed

    private void PinkVelvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinkVelvetActionPerformed
        PinkVelvetGUI p = new PinkVelvetGUI();
        p.show();
        this.show(false);
    }//GEN-LAST:event_PinkVelvetActionPerformed

    private void SunnyDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SunnyDayActionPerformed
        SunnyDayGUI s = new SunnyDayGUI();
        s.show();
        this.show(false);
    }//GEN-LAST:event_SunnyDayActionPerformed

    private void BirthdayCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthdayCakeActionPerformed
        BirthdayCakeGUI b = new BirthdayCakeGUI();
        b.show();
        this.show(false);
    }//GEN-LAST:event_BirthdayCakeActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BirthdayCake;
    private javax.swing.JButton ChocolateChip;
    private javax.swing.JButton PinkVelvet;
    private javax.swing.JButton SunnyDay;
    private javax.swing.JLabel backgound;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
