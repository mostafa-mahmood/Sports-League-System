package Players;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import Home.Main;
public class Players_main extends javax.swing.JPanel {
    
    private Main mainFrame;
    
    public Players_main(Main mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        removeButtonDefault(addPlayer);
        removeButtonDefault(viewPlayer);
        removeButtonDefault(modifyPlayer);
        removeButtonDefault(removePlayer);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPlayer = new javax.swing.JButton();
        modifyPlayer = new javax.swing.JButton();
        removePlayer = new javax.swing.JButton();
        viewPlayer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 0, 60));
        setMinimumSize(new java.awt.Dimension(1155, 525));
        setLayout(null);

        addPlayer.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        addPlayer.setText("Add New Player");
        addPlayer.setBorder(null);
        addPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerActionPerformed(evt);
            }
        });
        add(addPlayer);
        addPlayer.setBounds(70, 210, 200, 70);

        modifyPlayer.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        modifyPlayer.setText("Modify Player Info");
        modifyPlayer.setBorder(null);
        modifyPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyPlayerActionPerformed(evt);
            }
        });
        add(modifyPlayer);
        modifyPlayer.setBounds(600, 210, 200, 70);

        removePlayer.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        removePlayer.setText("Remove Player Record");
        removePlayer.setBorder(null);
        removePlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlayerActionPerformed(evt);
            }
        });
        add(removePlayer);
        removePlayer.setBounds(860, 210, 200, 70);

        viewPlayer.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        viewPlayer.setText("View Player Details");
        viewPlayer.setBorder(null);
        viewPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPlayerActionPerformed(evt);
            }
        });
        add(viewPlayer);
        viewPlayer.setBounds(330, 210, 200, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/transparentBackground.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void addPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPlayerActionPerformed

    private void modifyPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyPlayerActionPerformed

    private void removePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removePlayerActionPerformed

    private void viewPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPlayerActionPerformed
        View_players_panel panel = new View_players_panel();
        mainFrame.switchPanel(panel);
    }//GEN-LAST:event_viewPlayerActionPerformed

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
    private javax.swing.JButton addPlayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyPlayer;
    private javax.swing.JButton removePlayer;
    private javax.swing.JButton viewPlayer;
    // End of variables declaration//GEN-END:variables
}
