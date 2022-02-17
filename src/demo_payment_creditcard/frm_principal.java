/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demo_payment_creditcard;

/**
 *
 * @author kalemadanieljonathan
 */
public class frm_principal extends javax.swing.JFrame {

    /**
     * Creates new form frm_principal
     */
    public frm_principal() {
        initComponents();
        debut();
    }
    
    private void debut(){
        //mettre le formulaire au centre
        this.setLocationRelativeTo(null);
        //mettre le formulaire au devant des autres
        this.setAlwaysOnTop(true);
        //donner une taille a son formulaire
        this.setSize(804, 538);
        //Initialiser les champs 
        
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
        jLabel2 = new javax.swing.JLabel();
        txtTypecarte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtcodecmd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Account = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmontantdu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtmontantpay = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblpaypal = new javax.swing.JLabel();
        lblmastercard = new javax.swing.JLabel();
        lblvisa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Type de carte de crédit :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 40));

        txtTypecarte.setEditable(false);
        txtTypecarte.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtTypecarte.setToolTipText("");
        jPanel1.add(txtTypecarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 390, 40));

        jLabel4.setText("Nom du proprietaire du compte :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 40));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField3.setText("Kalema Daniel Jonathan");
        jTextField3.setToolTipText("");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 390, 40));

        jTextField4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField4.setText("XXXX-XXXX-6546-0067");
        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 300, 40));

        jLabel5.setText("Numéro carte de crédit :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 40));

        jTextField5.setBackground(new java.awt.Color(0, 153, 153));
        jTextField5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("243");
        jTextField5.setToolTipText("");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 90, 40));

        jLabel6.setText("Validité de la carte de crédit :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 200, 40));

        jButton1.setText("Annuler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 130, 40));

        jButton2.setText("Payer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 130, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Code Commande :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        txtcodecmd.setEditable(false);
        txtcodecmd.setBackground(new java.awt.Color(0, 51, 153));
        txtcodecmd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtcodecmd.setForeground(new java.awt.Color(255, 255, 255));
        txtcodecmd.setText("CMD-0987CD-022");
        jPanel2.add(txtcodecmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 180, 40));

        jLabel7.setText("Déscription :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 40));

        txt_Account.setEditable(false);
        txt_Account.setBackground(new java.awt.Color(0, 51, 153));
        txt_Account.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txt_Account.setForeground(new java.awt.Color(255, 255, 255));
        txt_Account.setText("Rétroprojecteur Amazon");
        txt_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccountActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 40));

        jLabel8.setText("Montant du :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 40));

        txtmontantdu.setEditable(false);
        txtmontantdu.setBackground(new java.awt.Color(153, 153, 0));
        txtmontantdu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtmontantdu.setForeground(new java.awt.Color(255, 255, 255));
        txtmontantdu.setText("1430 USD");
        jPanel2.add(txtmontantdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 180, 40));

        jLabel9.setText("Ce payement :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 110, 40));

        txtmontantpay.setEditable(false);
        txtmontantpay.setBackground(new java.awt.Color(255, 102, 51));
        txtmontantpay.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtmontantpay.setForeground(new java.awt.Color(255, 255, 255));
        txtmontantpay.setText("1400 USD");
        jPanel2.add(txtmontantpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 180, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 620, 120));

        jTextField6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField6.setText("10/11/2023");
        jTextField6.setToolTipText("");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 160, 40));

        jTextField7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jTextField7.setText("09/11/2021");
        jTextField7.setToolTipText("");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, 40));

        jLabel10.setForeground(new java.awt.Color(204, 153, 0));
        jLabel10.setText("Au :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 40, 40));

        jLabel11.setForeground(new java.awt.Color(204, 153, 0));
        jLabel11.setText("Du :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 290, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 660, 420));

        lblpaypal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblpaypal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpaypalMouseClicked(evt);
            }
        });
        getContentPane().add(lblpaypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 230, 60));

        lblmastercard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblmastercard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmastercardMouseClicked(evt);
            }
        });
        getContentPane().add(lblmastercard, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 110, 60));

        lblvisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblvisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblvisaMouseClicked(evt);
            }
        });
        getContentPane().add(lblvisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 140, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visamcpay.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 640, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccountActionPerformed

    private void lblvisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblvisaMouseClicked
        // TODO add your handling code here:
        txtTypecarte.setText("Carte Visa");
    }//GEN-LAST:event_lblvisaMouseClicked

    private void lblmastercardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmastercardMouseClicked
        // TODO add your handling code here:
        txtTypecarte.setText("Carte MasterCard");
    }//GEN-LAST:event_lblmastercardMouseClicked

    private void lblpaypalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpaypalMouseClicked
        // TODO add your handling code here:
        txtTypecarte.setText("Carte PayPal");
    }//GEN-LAST:event_lblpaypalMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblmastercard;
    private javax.swing.JLabel lblpaypal;
    private javax.swing.JLabel lblvisa;
    private javax.swing.JTextField txtTypecarte;
    private javax.swing.JTextField txt_Account;
    private javax.swing.JTextField txtcodecmd;
    private javax.swing.JTextField txtmontantdu;
    private javax.swing.JTextField txtmontantpay;
    // End of variables declaration//GEN-END:variables
}
