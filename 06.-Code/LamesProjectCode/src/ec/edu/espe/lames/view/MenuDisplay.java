/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class MenuDisplay extends javax.swing.JFrame {

    /**
     * Creates new form MenuDisplay
     */
    public MenuDisplay() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuExit = new javax.swing.JMenu();
        MnuProduct = new javax.swing.JMenu();
        ItmBuy = new javax.swing.JCheckBoxMenuItem();
        MnuList = new javax.swing.JMenu();
        itmProduct = new javax.swing.JCheckBoxMenuItem();
        itmDescription = new javax.swing.JCheckBoxMenuItem();
        MnuHelp = new javax.swing.JMenu();
        itmContact = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        MnuExit.setText("Exit");
        MnuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(MnuExit);

        MnuProduct.setText("Product");

        ItmBuy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        ItmBuy.setSelected(true);
        ItmBuy.setText("Buy");
        ItmBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmBuyActionPerformed(evt);
            }
        });
        MnuProduct.add(ItmBuy);

        jMenuBar1.add(MnuProduct);

        MnuList.setText("List");

        itmProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        itmProduct.setSelected(true);
        itmProduct.setText("Product");
        itmProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProductActionPerformed(evt);
            }
        });
        MnuList.add(itmProduct);

        itmDescription.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        itmDescription.setSelected(true);
        itmDescription.setText("Description");
        itmDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDescriptionActionPerformed(evt);
            }
        });
        MnuList.add(itmDescription);

        jMenuBar1.add(MnuList);

        MnuHelp.setText("Help");

        itmContact.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        itmContact.setSelected(true);
        itmContact.setText("Contact");
        itmContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContactActionPerformed(evt);
            }
        });
        MnuHelp.add(itmContact);

        jMenuBar1.add(MnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuExitMouseClicked
    System.exit(0);
    }//GEN-LAST:event_MnuExitMouseClicked

    private void ItmBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmBuyActionPerformed
       Login login = new Login();
       login.setVisible(true);

    }//GEN-LAST:event_ItmBuyActionPerformed

    private void itmProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProductActionPerformed
       FrmProduct frmProduct = new FrmProduct();
       frmProduct.setVisible(true);
    }//GEN-LAST:event_itmProductActionPerformed

    private void itmDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDescriptionActionPerformed
       FrmDescription frmDescription = new FrmDescription();
       frmDescription.setVisible(true);
    }//GEN-LAST:event_itmDescriptionActionPerformed

    private void itmContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContactActionPerformed
       FrmContact frmContact = new FrmContact();
       frmContact.setVisible(true);
    }//GEN-LAST:event_itmContactActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem ItmBuy;
    private javax.swing.JMenu MnuExit;
    private javax.swing.JMenu MnuHelp;
    private javax.swing.JMenu MnuList;
    private javax.swing.JMenu MnuProduct;
    private javax.swing.JCheckBoxMenuItem itmContact;
    private javax.swing.JCheckBoxMenuItem itmDescription;
    private javax.swing.JCheckBoxMenuItem itmProduct;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
