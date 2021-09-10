/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.awt.Graphics;
import java.awt.Image;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class InterfaceSystem extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    DB db;
    DBCollection tabla;
    /**
     * Creates new form InterfaceSystem
     */
    public InterfaceSystem() {
        this.setContentPane(fondo);
        initComponents();
        this.jTable1.setModel(model1);
        this.model1.addColumn("Product");
        this.model1.addColumn("Fabricator");
        this.model1.addColumn("Id");
        this.model1.addColumn("Quantity");
        this.model1.addColumn("Price");
        this.model1.addColumn("Total Price");
        try {
            Mongo mongo = new Mongo("Localhost",27017);
            db=mongo.getDB("basededatos1");
            tabla=db.getCollection("tabla");
            //Product" : "Capacitor", "ID" : 2162, "Fabricator" : "B", "Cost" : "$0.60", "Quantity" : 2 }
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(InterfaceSystem.class.getName()).log(Level.SEVERE, null, ex);

        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlText = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnEnlist = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PnlButtons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnTotalPrice = new javax.swing.JButton();
        txtTotalPrice = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnA = new javax.swing.JRadioButton();
        btnB = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        txtProducts = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlText.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 2, 24)); // NOI18N
        jLabel1.setText("Inventory");

        jLabel2.setText("Product:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel3.setText("ID:");

        jLabel4.setText("Price:");

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });

        jLabel5.setText("Fabricator:");

        jLabel6.setText("Quantity");

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        btnEnlist.setText("Enlist");
        btnEnlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnlistActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(211, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase Detail"));
        jPanel1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        PnlButtons.setBackground(new java.awt.Color(236, 236, 151));
        PnlButtons.setOpaque(false);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnTotalPrice.setText("Total Price");
        btnTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPriceActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlButtonsLayout = new javax.swing.GroupLayout(PnlButtons);
        PnlButtons.setLayout(PnlButtonsLayout);
        PnlButtonsLayout.setHorizontalGroup(
            PnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtonsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAdd)
                .addGap(62, 62, 62)
                .addComponent(btnDelete)
                .addGap(87, 87, 87)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnTotalPrice)
                .addGap(18, 18, 18)
                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlButtonsLayout.setVerticalGroup(
            PnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnTotalPrice)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(PnlButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PnlButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setText("Total:");

        btnA.setText("A");

        btnB.setText("B");

        jEditorPane1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jEditorPane1.setText("Products available\n1. Arduino\n2. Battery(9V)\n3. Capacitor\n4. Dispswitch\n5. Integrated Circuit\n6. Led Diodes\n7. Lizard Wire\n8. Multimeter\n9. Potenciometer\n10. Protoboard\n11. Resistor\n12. Transistor\n13. UTP Cable");
        jScrollPane3.setViewportView(jEditorPane1);

        txtProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PnlTextLayout = new javax.swing.GroupLayout(PnlText);
        PnlText.setLayout(PnlTextLayout);
        PnlTextLayout.setHorizontalGroup(
            PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTextLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlTextLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTextLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnB)
                            .addComponent(btnA)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlTextLayout.createSequentialGroup()
                                .addComponent(btnEnlist)
                                .addGap(76, 76, 76)
                                .addComponent(btnClear))
                            .addGroup(PnlTextLayout.createSequentialGroup()
                                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(41, 41, 41)
                                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(txtPrice)
                                    .addComponent(txtTotal))))))
                .addGap(38, 38, 38))
            .addGroup(PnlTextLayout.createSequentialGroup()
                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTextLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txtProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTextLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlTextLayout.setVerticalGroup(
            PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlTextLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlTextLayout.createSequentialGroup()
                        .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlTextLayout.createSequentialGroup()
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear))
                            .addGroup(PnlTextLayout.createSequentialGroup()
                                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlTextLayout.createSequentialGroup()
                                        .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(btnA))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlTextLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addComponent(btnEnlist)
                                .addGap(23, 23, 23)
                                .addGroup(PnlTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlTextLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnlistActionPerformed

        arduinoPrice();
        batteryPrice();
        capacitorPrice();
        dipswitchPrice();
        integratedPrice();
        diodesPrice();

        if (this.btnA.isSelected()) {
            this.model1.addRow(new Object[]{
                this.txtProducts.getText(),
                "A", this.txtId.getText(), this.txtQuantity.getText(),
                this.txtPrice.getText(), this.txtTotal.getText()});
        }

        if (this.btnB.isSelected()) {
            this.model1.addRow(new Object[]{
                this.txtProducts.getText(),
                "B", this.txtId.getText(), this.txtQuantity.getText(),
                this.txtPrice.getText(), this.txtTotal.getText()});
        }

    }//GEN-LAST:event_btnEnlistActionPerformed

    DefaultTableModel model1 = new DefaultTableModel();

    public void arduinoPrice() {
        double product,price, total, quantity, id;

        

            if (this.btnA.isSelected() || this.btnB.isSelected()) {

                quantity = Double.parseDouble(this.txtQuantity.getText());
                price = Double.parseDouble(this.txtPrice.getText());
                total = price * quantity;
                this.txtTotal.setText(String.valueOf(total));
            }

        

    }

    public void batteryPrice() {
        double product,price, total, quantity, id;

       

            if (this.btnA.isSelected() || this.btnB.isSelected()) {

                quantity = Double.parseDouble(this.txtQuantity.getText());
                price = Double.parseDouble(this.txtPrice.getText());
                total = price * quantity;
                this.txtTotal.setText(String.valueOf(total));
            }



    }
    
    public void capacitorPrice() {
        double product,price, total, quantity, id;

        

            if (this.btnA.isSelected() || this.btnB.isSelected()) {

                quantity = Double.parseDouble(this.txtQuantity.getText());
                price = Double.parseDouble(this.txtPrice.getText());
                total = price * quantity;
                this.txtTotal.setText(String.valueOf(total));
            }

        

    }
    
    public void dipswitchPrice() {
        double product,price, total, quantity, id;

        

            if (this.btnA.isSelected() || this.btnB.isSelected()) {

                quantity = Double.parseDouble(this.txtQuantity.getText());
                price = Double.parseDouble(this.txtPrice.getText());
                total = price * quantity;
                this.txtTotal.setText(String.valueOf(total));
            }

        

    }
    
    public void integratedPrice() {
        double product,price, total, quantity, id;


            if (this.btnA.isSelected() || this.btnB.isSelected()) {

                quantity = Double.parseDouble(this.txtQuantity.getText());
                price = Double.parseDouble(this.txtPrice.getText());
                total = price * quantity;
                this.txtTotal.setText(String.valueOf(total));
            }

    }
    
    public void diodesPrice() {
        double product,price, total, quantity, id;

       

            if (this.btnA.isSelected() || this.btnB.isSelected()) {

                quantity = Double.parseDouble(this.txtQuantity.getText());
                price = Double.parseDouble(this.txtPrice.getText());
                total = price * quantity;
                this.txtTotal.setText(String.valueOf(total));
            }

    }
    
    
    
    
    


    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        this.txtProducts.setText("");
        if (this.btnA.isSelected()) {
        }
        if (this.btnB.isSelected()) {
        }
        this.txtQuantity.setText("");
        this.txtPrice.setText("");
        this.txtTotal.setText("");
        this.txtId.setText("");      
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPriceActionPerformed
        // TODO add your handling code here:
        double sum;
        double sum1 = 0;
        int totalrow = jTable1.getRowCount();
        totalrow -= 1;
        
        for(int i = 0; i <= (totalrow); i++){
            sum = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 5)));
            sum1 += sum;
        }
        txtTotalPrice.setText("$ " + String.valueOf(sum1));
        
    }//GEN-LAST:event_btnTotalPriceActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int x = this.model1.getRowCount();
        for(int y = 0; y <=10;y++){
            this.model1.removeRow(0);
   
        }
        this.txtTotalPrice.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        //SystemController.view(txtAdatosSystem);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        BasicDBObject document= new BasicDBObject();

       
       document.put("Product","'"+ txtProducts.getText()+"'");
       document.put("ID",txtId.getText());
       document.put("Fabricator","'"+ btnA.getActionCommand()+"'");
       document.put("Fabricator","'"+ btnB.getActionCommand()+"'");
       document.put("Price","'"+txtPrice.getText()+"'");     
       document.put("Quantity",txtQuantity.getText());
       document.put("Total",txtTotal.getText());
       tabla.insert(document);
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtProductsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductsKeyTyped
        char c = evt.getKeyChar();
        
        if ((c < 'a' || c > 'z') && (c<'A' || c > 'Z') && (c != ' '))evt.consume();

    }//GEN-LAST:event_txtProductsKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        char c = evt.getKeyChar();
        
        if ((c < '0' || c > '9'))evt.consume();

    }//GEN-LAST:event_txtIdKeyTyped

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        char c = evt.getKeyChar();
        
        if ((c < '0' || c > '9'))evt.consume();

    }//GEN-LAST:event_txtQuantityKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char c = evt.getKeyChar();
        
        if ((c < '0' || c > '9'))evt.consume();

    }//GEN-LAST:event_txtPriceKeyTyped

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
            java.util.logging.Logger.getLogger(InterfaceSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfaceSystem().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlButtons;
    private javax.swing.JPanel PnlText;
    private javax.swing.JRadioButton btnA;
    private javax.swing.JButton btnAdd;
    private javax.swing.JRadioButton btnB;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEnlist;
    private javax.swing.JButton btnTotalPrice;
    private javax.swing.JButton btnView;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProducts;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
    {
        private Image imagen;
        
       public void paint(Graphics g)
       {
        imagen = new ImageIcon(getClass().getResource("/Images/acuarela1.jpg")).getImage(); 
        
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
        setOpaque(false);
        
        super.paint(g);
       }
    }




}
