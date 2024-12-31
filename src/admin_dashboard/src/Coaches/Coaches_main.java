package Coaches;

import javax.swing.AbstractButton;
import javax.swing.JComponent;

public class Coaches_main extends javax.swing.JPanel {

    public Coaches_main() {
        initComponents();
        removeButtonDefault(addCoach);
        removeButtonDefault(viewCoach);
        removeButtonDefault(modifyCoach);
        removeButtonDefault(removeCoach);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCoach = new javax.swing.JButton();
        modifyCoach = new javax.swing.JButton();
        removeCoach = new javax.swing.JButton();
        viewCoach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 0, 60));
        setMinimumSize(new java.awt.Dimension(1155, 525));
        setLayout(null);

        addCoach.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        addCoach.setText("Add New Coach");
        addCoach.setBorder(null);
        addCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachActionPerformed(evt);
            }
        });
        add(addCoach);
        addCoach.setBounds(70, 210, 200, 70);

        modifyCoach.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        modifyCoach.setText("Update Coach Info");
        modifyCoach.setBorder(null);
        modifyCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCoachActionPerformed(evt);
            }
        });
        add(modifyCoach);
        modifyCoach.setBounds(600, 210, 200, 70);

        removeCoach.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        removeCoach.setText("Remove Coach");
        removeCoach.setBorder(null);
        removeCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCoachActionPerformed(evt);
            }
        });
        add(removeCoach);
        removeCoach.setBounds(860, 210, 200, 70);

        viewCoach.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        viewCoach.setText("View Coach Details");
        viewCoach.setBorder(null);
        viewCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCoachActionPerformed(evt);
            }
        });
        add(viewCoach);
        viewCoach.setBounds(330, 210, 200, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/transparentBackground.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void addCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCoachActionPerformed

    private void modifyCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyCoachActionPerformed

    private void removeCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeCoachActionPerformed

    private void viewCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCoachActionPerformed

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
    private javax.swing.JButton addCoach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyCoach;
    private javax.swing.JButton removeCoach;
    private javax.swing.JButton viewCoach;
    // End of variables declaration//GEN-END:variables
}
