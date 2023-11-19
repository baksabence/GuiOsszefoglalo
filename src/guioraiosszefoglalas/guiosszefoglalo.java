/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guioraiosszefoglalas;

import javax.swing.JOptionPane;


public class guiosszefoglalo extends javax.swing.JFrame {

    public guiosszefoglalo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMinecraft = new javax.swing.JLabel();
        lblJavaEdition = new javax.swing.JLabel();
        btnEgyjatekos = new javax.swing.JButton();
        btnTobbjatekos = new javax.swing.JButton();
        btnBeallitasok = new javax.swing.JButton();
        btnKilepes = new javax.swing.JButton();
        lblHatterkep = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minecraft");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinecraft.setBackground(new java.awt.Color(0, 0, 0));
        lblMinecraft.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        lblMinecraft.setForeground(new java.awt.Color(204, 204, 204));
        lblMinecraft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinecraft.setText("MINECRAFT");
        lblMinecraft.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblMinecraft.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMinecraft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinecraft.setName(""); // NOI18N
        getContentPane().add(lblMinecraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 220, 34));

        lblJavaEdition.setBackground(new java.awt.Color(0, 0, 0));
        lblJavaEdition.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        lblJavaEdition.setForeground(new java.awt.Color(204, 204, 204));
        lblJavaEdition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJavaEdition.setText("JAVA EDITION");
        getContentPane().add(lblJavaEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 120, -1));

        btnEgyjatekos.setBackground(new java.awt.Color(0, 51, 51));
        btnEgyjatekos.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        btnEgyjatekos.setForeground(new java.awt.Color(255, 255, 255));
        btnEgyjatekos.setText("Egyjátékos mód");
        btnEgyjatekos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEgyjatekos.setBorderPainted(false);
        btnEgyjatekos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEgyjatekosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEgyjatekos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 120, 30));

        btnTobbjatekos.setBackground(new java.awt.Color(0, 51, 51));
        btnTobbjatekos.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        btnTobbjatekos.setForeground(new java.awt.Color(255, 255, 255));
        btnTobbjatekos.setText("Többjátékos mód");
        btnTobbjatekos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTobbjatekos.setBorderPainted(false);
        btnTobbjatekos.setMaximumSize(new java.awt.Dimension(108, 22));
        btnTobbjatekos.setMinimumSize(new java.awt.Dimension(108, 22));
        btnTobbjatekos.setPreferredSize(new java.awt.Dimension(108, 22));
        btnTobbjatekos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTobbjatekosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTobbjatekos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 120, 30));

        btnBeallitasok.setBackground(new java.awt.Color(0, 51, 51));
        btnBeallitasok.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        btnBeallitasok.setForeground(new java.awt.Color(255, 255, 255));
        btnBeallitasok.setText("Beállítások");
        btnBeallitasok.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBeallitasok.setBorderPainted(false);
        btnBeallitasok.setMaximumSize(new java.awt.Dimension(108, 22));
        btnBeallitasok.setMinimumSize(new java.awt.Dimension(108, 22));
        btnBeallitasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeallitasokActionPerformed(evt);
            }
        });
        getContentPane().add(btnBeallitasok, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, 30));

        btnKilepes.setBackground(new java.awt.Color(0, 51, 51));
        btnKilepes.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        btnKilepes.setForeground(new java.awt.Color(255, 255, 255));
        btnKilepes.setText("Kilépés");
        btnKilepes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKilepes.setBorderPainted(false);
        btnKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKilepesActionPerformed(evt);
            }
        });
        getContentPane().add(btnKilepes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, 30));

        lblHatterkep.setIcon(new javax.swing.ImageIcon("D:\\SULI\\vizualisprog\\GuiOsszefoglalo\\GuiOsszefoglalo\\src\\guioraiosszefoglalas\\gui.gif")); // NOI18N
        lblHatterkep.setText("jLabel4");
        getContentPane().add(lblHatterkep, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTobbjatekosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTobbjatekosActionPerformed
      new TobbjatekosM().setVisible(true);
    }//GEN-LAST:event_btnTobbjatekosActionPerformed

    private void btnKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKilepesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKilepesActionPerformed

    private void btnBeallitasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeallitasokActionPerformed
    new BeallitasokMenu().setVisible(true);
    }//GEN-LAST:event_btnBeallitasokActionPerformed

    private void btnEgyjatekosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEgyjatekosActionPerformed
       new EgyjatekosM().setVisible(true);
    }//GEN-LAST:event_btnEgyjatekosActionPerformed

 
    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(guiosszefoglalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiosszefoglalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiosszefoglalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiosszefoglalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiosszefoglalo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeallitasok;
    private javax.swing.JButton btnEgyjatekos;
    private javax.swing.JButton btnKilepes;
    private javax.swing.JButton btnTobbjatekos;
    private javax.swing.JLabel lblHatterkep;
    private javax.swing.JLabel lblJavaEdition;
    private javax.swing.JLabel lblMinecraft;
    // End of variables declaration//GEN-END:variables
}
