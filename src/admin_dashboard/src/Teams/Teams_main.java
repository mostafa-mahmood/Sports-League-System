package Teams;

import java.awt.Window;
import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import Home.Main;

public class Teams_main extends javax.swing.JPanel {

    private Main mainFrame;
    
    public Teams_main(Main mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        removeButtonDefault(addTeam);
        removeButtonDefault(viewTeam);
        removeButtonDefault(modifyTeam);
        removeButtonDefault(removeTeam);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addTeam = new javax.swing.JButton();
        modifyTeam = new javax.swing.JButton();
        removeTeam = new javax.swing.JButton();
        viewTeam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(55, 0, 60));
        setMinimumSize(new java.awt.Dimension(1155, 525));
        setLayout(null);

        addTeam.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        addTeam.setText("Add New Team");
        addTeam.setBorder(null);
        addTeam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamActionPerformed(evt);
            }
        });
        add(addTeam);
        addTeam.setBounds(70, 210, 200, 70);

        modifyTeam.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        modifyTeam.setText("Modify Team Info");
        modifyTeam.setBorder(null);
        modifyTeam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modifyTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyTeamActionPerformed(evt);
            }
        });
        add(modifyTeam);
        modifyTeam.setBounds(600, 210, 200, 70);

        removeTeam.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        removeTeam.setText("Remove Team");
        removeTeam.setBorder(null);
        removeTeam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTeamActionPerformed(evt);
            }
        });
        add(removeTeam);
        removeTeam.setBounds(860, 210, 200, 70);

        viewTeam.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        viewTeam.setText("View Team Details");
        viewTeam.setBorder(null);
        viewTeam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTeamActionPerformed(evt);
            }
        });
        add(viewTeam);
        viewTeam.setBounds(330, 210, 200, 70);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/transparentBackground.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void addTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamActionPerformed
        Create_teams_panel panel = new Create_teams_panel();
        mainFrame.switchPanel(panel);
    }//GEN-LAST:event_addTeamActionPerformed

    private void modifyTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyTeamActionPerformed
        Update_teams_panel panel = new Update_teams_panel();
        mainFrame.switchPanel(panel);
    }//GEN-LAST:event_modifyTeamActionPerformed

    private void removeTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTeamActionPerformed
        Delete_teams_panel panel = new Delete_teams_panel();
        mainFrame.switchPanel(panel);
    }//GEN-LAST:event_removeTeamActionPerformed

    private void viewTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTeamActionPerformed
        View_teams_panel panel = new View_teams_panel();
        mainFrame.switchPanel(panel);
    }//GEN-LAST:event_viewTeamActionPerformed

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
    private javax.swing.JButton addTeam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyTeam;
    private javax.swing.JButton removeTeam;
    private javax.swing.JButton viewTeam;
    // End of variables declaration//GEN-END:variables
}
