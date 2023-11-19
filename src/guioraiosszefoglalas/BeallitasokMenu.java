/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guioraiosszefoglalas;

import javax.swing.JOptionPane;


public class BeallitasokMenu extends javax.swing.JFrame {

 
    public BeallitasokMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtngrpNehezsegek = new javax.swing.ButtonGroup();
        lblLatotav = new javax.swing.JLabel();
        lblNehezseg = new javax.swing.JLabel();
        rbtnKonnyu = new javax.swing.JRadioButton();
        rbtnKozepes = new javax.swing.JRadioButton();
        rtbnNehez = new javax.swing.JRadioButton();
        lblFenyero = new javax.swing.JLabel();
        sldrFenyero = new javax.swing.JSlider();
        lblMinFenyero = new javax.swing.JLabel();
        lblMaxFenyero = new javax.swing.JLabel();
        lblGrafikai = new javax.swing.JLabel();
        lblJatekHang = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        lblMaxHang = new javax.swing.JLabel();
        lblMinHang = new javax.swing.JLabel();
        lblAntiAliasing = new javax.swing.JLabel();
        lblTextMin = new javax.swing.JLabel();
        lblFelbontas = new javax.swing.JLabel();
        cmbFelbontas = new javax.swing.JComboBox<>();
        chbAntiAliasing = new javax.swing.JCheckBox();
        cmbTextMin = new javax.swing.JComboBox<>();
        HATTER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beállítások");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLatotav.setBackground(new java.awt.Color(255, 255, 255));
        lblLatotav.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        lblLatotav.setForeground(new java.awt.Color(255, 255, 255));
        lblLatotav.setText("Látótáv (Chunk):");
        getContentPane().add(lblLatotav, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblNehezseg.setBackground(new java.awt.Color(255, 255, 255));
        lblNehezseg.setFont(new java.awt.Font("Segoe UI Black", 3, 15)); // NOI18N
        lblNehezseg.setForeground(new java.awt.Color(255, 255, 255));
        lblNehezseg.setText("Nehézség:");
        getContentPane().add(lblNehezseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 30));

        rbtngrpNehezsegek.add(rbtnKonnyu);
        rbtnKonnyu.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbtnKonnyu.setForeground(new java.awt.Color(255, 255, 255));
        rbtnKonnyu.setText("Könnyű");
        getContentPane().add(rbtnKonnyu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        rbtngrpNehezsegek.add(rbtnKozepes);
        rbtnKozepes.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rbtnKozepes.setForeground(new java.awt.Color(255, 255, 255));
        rbtnKozepes.setSelected(true);
        rbtnKozepes.setText("Közepes");
        getContentPane().add(rbtnKozepes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 30));

        rbtngrpNehezsegek.add(rtbnNehez);
        rtbnNehez.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        rtbnNehez.setForeground(new java.awt.Color(255, 0, 0));
        rtbnNehez.setText("Nehéz");
        rtbnNehez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtbnNehezActionPerformed(evt);
            }
        });
        getContentPane().add(rtbnNehez, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 30));

        lblFenyero.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        lblFenyero.setForeground(new java.awt.Color(255, 255, 255));
        lblFenyero.setText("Fényerő:");
        getContentPane().add(lblFenyero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        sldrFenyero.setBackground(new java.awt.Color(255, 255, 255));
        sldrFenyero.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        sldrFenyero.setForeground(new java.awt.Color(204, 204, 204));
        sldrFenyero.setPaintLabels(true);
        sldrFenyero.setPaintTicks(true);
        sldrFenyero.setSnapToTicks(true);
        sldrFenyero.setToolTipText("Alacsony - Maximum");
        sldrFenyero.setName(""); // NOI18N
        getContentPane().add(sldrFenyero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, -1));
        sldrFenyero.getAccessibleContext().setAccessibleName("");

        lblMinFenyero.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        lblMinFenyero.setForeground(new java.awt.Color(255, 255, 255));
        lblMinFenyero.setText("Min");
        getContentPane().add(lblMinFenyero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 30, -1));

        lblMaxFenyero.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        lblMaxFenyero.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxFenyero.setText("Max");
        getContentPane().add(lblMaxFenyero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 40, -1));

        lblGrafikai.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        lblGrafikai.setForeground(new java.awt.Color(255, 255, 255));
        lblGrafikai.setText("Grafikai");
        getContentPane().add(lblGrafikai, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        lblJatekHang.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        lblJatekHang.setForeground(new java.awt.Color(255, 255, 255));
        lblJatekHang.setText("Hangerő:");
        getContentPane().add(lblJatekHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(12, 1, 30, 1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 70, -1));

        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        lblMaxHang.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        lblMaxHang.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxHang.setText("Max");
        getContentPane().add(lblMaxHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        lblMinHang.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        lblMinHang.setForeground(new java.awt.Color(255, 255, 255));
        lblMinHang.setText("Min");
        getContentPane().add(lblMinHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblAntiAliasing.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        lblAntiAliasing.setForeground(new java.awt.Color(255, 255, 255));
        lblAntiAliasing.setText("Anti-Aliasing:");
        getContentPane().add(lblAntiAliasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblTextMin.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        lblTextMin.setForeground(new java.awt.Color(255, 255, 255));
        lblTextMin.setText("Textúrák Minősége:");
        getContentPane().add(lblTextMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblFelbontas.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        lblFelbontas.setForeground(new java.awt.Color(255, 255, 255));
        lblFelbontas.setText("Felbontás:");
        getContentPane().add(lblFelbontas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        cmbFelbontas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "640 x 480", "1280 x 720", "1920 x 1080", "2560 x 1440", "2048 x 1080", "3840 x 2160", "7680 x 4320" }));
        cmbFelbontas.setSelectedIndex(2);
        cmbFelbontas.setToolTipText("");
        getContentPane().add(cmbFelbontas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        chbAntiAliasing.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        chbAntiAliasing.setForeground(new java.awt.Color(255, 255, 255));
        chbAntiAliasing.setText("Ki/Be");
        getContentPane().add(chbAntiAliasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 30));

        cmbTextMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alacsony", "Közepes", "Magas", "Ultra" }));
        cmbTextMin.setSelectedIndex(1);
        getContentPane().add(cmbTextMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, 30));

        HATTER.setIcon(new javax.swing.ImageIcon("D:\\MinecraftGameHatter.jpg")); // NOI18N
        HATTER.setText("jLabel1");
        getContentPane().add(HATTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rtbnNehezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtbnNehezActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Vigyázz, mire vállalkozol!");
    }//GEN-LAST:event_rtbnNehezActionPerformed

 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BeallitasokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeallitasokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeallitasokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeallitasokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeallitasokMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HATTER;
    private javax.swing.JCheckBox chbAntiAliasing;
    private javax.swing.JComboBox<String> cmbFelbontas;
    private javax.swing.JComboBox<String> cmbTextMin;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblAntiAliasing;
    private javax.swing.JLabel lblFelbontas;
    private javax.swing.JLabel lblFenyero;
    private javax.swing.JLabel lblGrafikai;
    private javax.swing.JLabel lblJatekHang;
    private javax.swing.JLabel lblLatotav;
    private javax.swing.JLabel lblMaxFenyero;
    private javax.swing.JLabel lblMaxHang;
    private javax.swing.JLabel lblMinFenyero;
    private javax.swing.JLabel lblMinHang;
    private javax.swing.JLabel lblNehezseg;
    private javax.swing.JLabel lblTextMin;
    private javax.swing.JRadioButton rbtnKonnyu;
    private javax.swing.JRadioButton rbtnKozepes;
    private javax.swing.ButtonGroup rbtngrpNehezsegek;
    private javax.swing.JRadioButton rtbnNehez;
    private javax.swing.JSlider sldrFenyero;
    // End of variables declaration//GEN-END:variables
}
