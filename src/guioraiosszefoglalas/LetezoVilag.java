
package guioraiosszefoglalas;

public class LetezoVilag extends javax.swing.JFrame {

    public LetezoVilag() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSzerverIp = new javax.swing.JLabel();
        txtSzerverIp = new javax.swing.JTextField();
        tgbtnCsatlakozas = new javax.swing.JToggleButton();
        lblJelszo = new javax.swing.JLabel();
        txtJelszo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Csatlakozás");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSzerverIp.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblSzerverIp.setForeground(new java.awt.Color(255, 255, 255));
        lblSzerverIp.setText("Szerver IP:");
        getContentPane().add(lblSzerverIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        getContentPane().add(txtSzerverIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 160, -1));

        tgbtnCsatlakozas.setText("Csatlakozás a szerverhez");
        getContentPane().add(tgbtnCsatlakozas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        lblJelszo.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblJelszo.setForeground(new java.awt.Color(255, 255, 255));
        lblJelszo.setText("Szerver jelszó:");
        getContentPane().add(lblJelszo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, -1));
        getContentPane().add(txtJelszo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/MinecraftGameHatter.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LetezoVilag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetezoVilag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetezoVilag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetezoVilag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetezoVilag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJelszo;
    private javax.swing.JLabel lblSzerverIp;
    private javax.swing.JToggleButton tgbtnCsatlakozas;
    private javax.swing.JTextField txtJelszo;
    private javax.swing.JTextField txtSzerverIp;
    // End of variables declaration//GEN-END:variables
}
