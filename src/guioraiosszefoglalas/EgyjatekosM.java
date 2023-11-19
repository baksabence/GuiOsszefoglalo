/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guioraiosszefoglalas;


public class EgyjatekosM extends javax.swing.JFrame {

    public EgyjatekosM() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngpCsalasok = new javax.swing.ButtonGroup();
        btngpJatekMod = new javax.swing.ButtonGroup();
        lblVilag = new javax.swing.JLabel();
        txtVilagElnevezo = new javax.swing.JTextField();
        lblCsalasok = new javax.swing.JLabel();
        rbnNincsCsalas = new javax.swing.JRadioButton();
        rbnVanCsalas = new javax.swing.JRadioButton();
        lblJatekmod = new javax.swing.JLabel();
        rbnKreativ = new javax.swing.JRadioButton();
        rbnTulelo = new javax.swing.JRadioButton();
        rbnHard = new javax.swing.JRadioButton();
        cmbVilagTipusa = new javax.swing.JComboBox<>();
        btnVilagLetre = new javax.swing.JToggleButton();
        lblVilagTipusa = new javax.swing.JLabel();
        HATTER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Egyjátékos mód");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVilag.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblVilag.setForeground(new java.awt.Color(255, 255, 255));
        lblVilag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVilag.setText("Új Világ Neve:");
        getContentPane().add(lblVilag, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 160, 60));

        txtVilagElnevezo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        txtVilagElnevezo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVilagElnevezo.setText("Nevezd el a világod!");
        getContentPane().add(txtVilagElnevezo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 240, -1));

        lblCsalasok.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblCsalasok.setForeground(new java.awt.Color(255, 255, 255));
        lblCsalasok.setText("Csalások engedélyezése:");
        getContentPane().add(lblCsalasok, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        btngpCsalasok.add(rbnNincsCsalas);
        rbnNincsCsalas.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        rbnNincsCsalas.setForeground(new java.awt.Color(255, 255, 255));
        rbnNincsCsalas.setSelected(true);
        rbnNincsCsalas.setText("Nem");
        getContentPane().add(rbnNincsCsalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        btngpCsalasok.add(rbnVanCsalas);
        rbnVanCsalas.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        rbnVanCsalas.setForeground(new java.awt.Color(255, 255, 255));
        rbnVanCsalas.setText("Igen");
        getContentPane().add(rbnVanCsalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        lblJatekmod.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblJatekmod.setForeground(new java.awt.Color(255, 255, 255));
        lblJatekmod.setText("Játékmód:");
        getContentPane().add(lblJatekmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        btngpJatekMod.add(rbnKreativ);
        rbnKreativ.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        rbnKreativ.setForeground(new java.awt.Color(255, 255, 255));
        rbnKreativ.setText("Kreatív");
        getContentPane().add(rbnKreativ, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        btngpJatekMod.add(rbnTulelo);
        rbnTulelo.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        rbnTulelo.setForeground(new java.awt.Color(255, 255, 255));
        rbnTulelo.setText("Túlélő");
        getContentPane().add(rbnTulelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        btngpJatekMod.add(rbnHard);
        rbnHard.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        rbnHard.setForeground(new java.awt.Color(255, 255, 255));
        rbnHard.setText("Hardcore");
        getContentPane().add(rbnHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        cmbVilagTipusa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapos", "Sima" }));
        cmbVilagTipusa.setSelectedIndex(1);
        getContentPane().add(cmbVilagTipusa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        btnVilagLetre.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        btnVilagLetre.setText("Világ Létrehozása");
        getContentPane().add(btnVilagLetre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        lblVilagTipusa.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lblVilagTipusa.setForeground(new java.awt.Color(255, 255, 255));
        lblVilagTipusa.setText("Világ Típusa:");
        getContentPane().add(lblVilagTipusa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        HATTER.setIcon(new javax.swing.ImageIcon("D:\\MinecraftGameHatter.jpg")); // NOI18N
        HATTER.setText("jLabel2");
        getContentPane().add(HATTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 729, -1));

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
            java.util.logging.Logger.getLogger(EgyjatekosM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EgyjatekosM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EgyjatekosM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EgyjatekosM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EgyjatekosM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HATTER;
    private javax.swing.JToggleButton btnVilagLetre;
    private javax.swing.ButtonGroup btngpCsalasok;
    private javax.swing.ButtonGroup btngpJatekMod;
    private javax.swing.JComboBox<String> cmbVilagTipusa;
    private javax.swing.JLabel lblCsalasok;
    private javax.swing.JLabel lblJatekmod;
    private javax.swing.JLabel lblVilag;
    private javax.swing.JLabel lblVilagTipusa;
    private javax.swing.JRadioButton rbnHard;
    private javax.swing.JRadioButton rbnKreativ;
    private javax.swing.JRadioButton rbnNincsCsalas;
    private javax.swing.JRadioButton rbnTulelo;
    private javax.swing.JRadioButton rbnVanCsalas;
    private javax.swing.JTextField txtVilagElnevezo;
    // End of variables declaration//GEN-END:variables
}
