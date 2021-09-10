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
public class FrmDescription extends javax.swing.JFrame {

    /**
     * Creates new form FrmDescription
     */
    public FrmDescription() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnuA = new javax.swing.JMenu();
        ItmArduino = new javax.swing.JCheckBoxMenuItem();
        MnuB = new javax.swing.JMenu();
        ItmBattery = new javax.swing.JCheckBoxMenuItem();
        MnuC = new javax.swing.JMenu();
        ItmCapacitor = new javax.swing.JCheckBoxMenuItem();
        MnuD = new javax.swing.JMenu();
        ItmDipswitch = new javax.swing.JCheckBoxMenuItem();
        MnuI = new javax.swing.JMenu();
        ItmIntegratedCircuit = new javax.swing.JCheckBoxMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("PRODUCT DESCRIPTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        MnuA.setText("A");

        ItmArduino.setSelected(true);
        ItmArduino.setText("Arduino");
        ItmArduino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmArduinoActionPerformed(evt);
            }
        });
        MnuA.add(ItmArduino);

        jMenuBar1.add(MnuA);

        MnuB.setText("B");

        ItmBattery.setSelected(true);
        ItmBattery.setText("Battery (9)");
        ItmBattery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmBatteryActionPerformed(evt);
            }
        });
        MnuB.add(ItmBattery);

        jMenuBar1.add(MnuB);

        MnuC.setText("C");

        ItmCapacitor.setSelected(true);
        ItmCapacitor.setText("Capacitor");
        ItmCapacitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCapacitorActionPerformed(evt);
            }
        });
        MnuC.add(ItmCapacitor);

        jMenuBar1.add(MnuC);

        MnuD.setText("D");

        ItmDipswitch.setSelected(true);
        ItmDipswitch.setText("Dipswitch");
        ItmDipswitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmDipswitchActionPerformed(evt);
            }
        });
        MnuD.add(ItmDipswitch);

        jMenuBar1.add(MnuD);

        MnuI.setText("I");

        ItmIntegratedCircuit.setSelected(true);
        ItmIntegratedCircuit.setText("Integrated Circuit");
        ItmIntegratedCircuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmIntegratedCircuitActionPerformed(evt);
            }
        });
        MnuI.add(ItmIntegratedCircuit);

        jMenuBar1.add(MnuI);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ItmArduinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmArduinoActionPerformed
        FrmArduino frmArduino = new FrmArduino();
        frmArduino.setVisible(true);
    }//GEN-LAST:event_ItmArduinoActionPerformed

    private void ItmBatteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmBatteryActionPerformed
        FrmBattery frmBattery = new FrmBattery();
        frmBattery.setVisible(true);
    }//GEN-LAST:event_ItmBatteryActionPerformed

    private void ItmCapacitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCapacitorActionPerformed
        FrmCapacitor frmCapacitor = new FrmCapacitor();
        frmCapacitor.setVisible(true);
    }//GEN-LAST:event_ItmCapacitorActionPerformed

    private void ItmDipswitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmDipswitchActionPerformed
        FrmDipswitch frmDipswitch = new FrmDipswitch();
        frmDipswitch.setVisible(true);
    }//GEN-LAST:event_ItmDipswitchActionPerformed

    private void ItmIntegratedCircuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmIntegratedCircuitActionPerformed
        FrmIntegratedCircuit frmIntegratedCircuit = new FrmIntegratedCircuit();
        frmIntegratedCircuit.setVisible(true);
    }//GEN-LAST:event_ItmIntegratedCircuitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem ItmArduino;
    private javax.swing.JCheckBoxMenuItem ItmBattery;
    private javax.swing.JCheckBoxMenuItem ItmCapacitor;
    private javax.swing.JCheckBoxMenuItem ItmDipswitch;
    private javax.swing.JCheckBoxMenuItem ItmIntegratedCircuit;
    private javax.swing.JMenu MnuA;
    private javax.swing.JMenu MnuB;
    private javax.swing.JMenu MnuC;
    private javax.swing.JMenu MnuD;
    private javax.swing.JMenu MnuI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
