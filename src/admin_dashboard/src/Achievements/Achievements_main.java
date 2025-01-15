package Achievements;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class Achievements_main extends javax.swing.JPanel {

    public Achievements_main() {
        initComponents();
        removeButtonDefault(addAchievement);
        removeButtonDefault(viewAchievements);
        removeButtonDefault(modifyAchievements);
        removeButtonDefault(removeAcheivement);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAchievement = new javax.swing.JButton();
        modifyAchievements = new javax.swing.JButton();
        removeAcheivement = new javax.swing.JButton();
        viewAchievements = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 0, 60));
        setMinimumSize(new java.awt.Dimension(1155, 525));
        setLayout(null);

        addAchievement.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        addAchievement.setText("Add New Achievement");
        addAchievement.setBorder(null);
        addAchievement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addAchievement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAchievementActionPerformed(evt);
            }
        });
        add(addAchievement);
        addAchievement.setBounds(70, 210, 200, 70);

        modifyAchievements.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        modifyAchievements.setText("Modify Achievement");
        modifyAchievements.setBorder(null);
        modifyAchievements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyAchievements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyAchievementsActionPerformed(evt);
            }
        });
        add(modifyAchievements);
        modifyAchievements.setBounds(600, 210, 200, 70);

        removeAcheivement.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        removeAcheivement.setText("Remove Achievement");
        removeAcheivement.setBorder(null);
        removeAcheivement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeAcheivement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAcheivementActionPerformed(evt);
            }
        });
        add(removeAcheivement);
        removeAcheivement.setBounds(860, 210, 200, 70);

        viewAchievements.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        viewAchievements.setText("View Achievements");
        viewAchievements.setBorder(null);
        viewAchievements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewAchievements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAchievementsActionPerformed(evt);
            }
        });
        add(viewAchievements);
        viewAchievements.setBounds(330, 210, 200, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/transparentBackground.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void addAchievementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAchievementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addAchievementActionPerformed

    private void modifyAchievementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyAchievementsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyAchievementsActionPerformed

    private void removeAcheivementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAcheivementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeAcheivementActionPerformed

    private void viewAchievementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAchievementsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAchievementsActionPerformed

        private void removeButtonDefault(JComponent component) {
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            button.setContentAreaFilled(false);
            button.setOpaque(true);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAchievement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyAchievements;
    private javax.swing.JButton removeAcheivement;
    private javax.swing.JButton viewAchievements;
    // End of variables declaration//GEN-END:variables
}
