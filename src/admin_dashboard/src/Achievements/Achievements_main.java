package Achievements;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class Achievements_main extends javax.swing.JPanel {

    public Achievements_main() {
        initComponents();
        removeButtonDefault(addMatch);
        removeButtonDefault(viewMatch);
        removeButtonDefault(modifyMatch);
        removeButtonDefault(removeMatch);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMatch = new javax.swing.JButton();
        modifyMatch = new javax.swing.JButton();
        removeMatch = new javax.swing.JButton();
        viewMatch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 0, 60));
        setMinimumSize(new java.awt.Dimension(1155, 525));
        setLayout(null);

        addMatch.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        addMatch.setText("Add New Achievement");
        addMatch.setBorder(null);
        addMatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMatchActionPerformed(evt);
            }
        });
        add(addMatch);
        addMatch.setBounds(70, 210, 200, 70);

        modifyMatch.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        modifyMatch.setText("Modify Achievement");
        modifyMatch.setBorder(null);
        modifyMatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyMatchActionPerformed(evt);
            }
        });
        add(modifyMatch);
        modifyMatch.setBounds(600, 210, 200, 70);

        removeMatch.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        removeMatch.setText("Remove Achievement");
        removeMatch.setBorder(null);
        removeMatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMatchActionPerformed(evt);
            }
        });
        add(removeMatch);
        removeMatch.setBounds(860, 210, 200, 70);

        viewMatch.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        viewMatch.setText("View Achievements");
        viewMatch.setBorder(null);
        viewMatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMatchActionPerformed(evt);
            }
        });
        add(viewMatch);
        viewMatch.setBounds(330, 210, 200, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/transparentBackground.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void addMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addMatchActionPerformed

    private void modifyMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyMatchActionPerformed

    private void removeMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMatchActionPerformed

    private void viewMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewMatchActionPerformed

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
    private javax.swing.JButton addMatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyMatch;
    private javax.swing.JButton removeMatch;
    private javax.swing.JButton viewMatch;
    // End of variables declaration//GEN-END:variables
}
