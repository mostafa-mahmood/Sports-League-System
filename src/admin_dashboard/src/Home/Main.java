package Home;

import javax.swing.*;
import java.awt.*;
import Teams.Teams_main;
import Matches.Matches_main;
import Performance.Performance_main;
import Players.Players_main;
import Coaches.Coaches_main;
import Achievements.Achievements_main;

public class Main extends javax.swing.JFrame {
 
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Premier League");
        ImageIcon icon = new ImageIcon("D:\\Programming\\Projects\\Football-League-Management-System\\src\\admin_dashboard\\src\\Assets\\icon.jpg");
        this.setIconImage(icon.getImage());
        setMainPanel();
        removeButtonDefault(Teams);
        removeButtonDefault(Matches);
        removeButtonDefault(Coaches);
        removeButtonDefault(Players);
        removeButtonDefault(Performance);
        removeButtonDefault(Achievements);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Teams = new javax.swing.JButton();
        Players = new javax.swing.JButton();
        Matches = new javax.swing.JButton();
        Performance = new javax.swing.JButton();
        Coaches = new javax.swing.JButton();
        Achievements = new javax.swing.JButton();
        main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1155, 652));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1155, 652));

        jPanel3.setBackground(new java.awt.Color(44, 10, 61));

        Teams.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Teams.setForeground(new java.awt.Color(40, 19, 59));
        Teams.setText("Teams");
        Teams.setBorder(null);
        Teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Teams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamsActionPerformed(evt);
            }
        });

        Players.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Players.setForeground(new java.awt.Color(40, 19, 59));
        Players.setText("Players");
        Players.setBorder(null);
        Players.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayersActionPerformed(evt);
            }
        });

        Matches.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Matches.setForeground(new java.awt.Color(40, 19, 59));
        Matches.setText("Matches");
        Matches.setBorder(null);
        Matches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Matches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchesActionPerformed(evt);
            }
        });

        Performance.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Performance.setForeground(new java.awt.Color(40, 19, 59));
        Performance.setText("Performance");
        Performance.setBorder(null);
        Performance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceActionPerformed(evt);
            }
        });

        Coaches.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Coaches.setForeground(new java.awt.Color(40, 19, 59));
        Coaches.setText("Coaches");
        Coaches.setBorder(null);
        Coaches.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Coaches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoachesActionPerformed(evt);
            }
        });

        Achievements.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Achievements.setForeground(new java.awt.Color(40, 19, 59));
        Achievements.setText("Achievements");
        Achievements.setBorder(null);
        Achievements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Achievements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AchievementsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Teams, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Players, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Matches, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Coaches, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Teams, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Players, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Matches, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Coaches, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Achievements, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        main.setLayout(new java.awt.BorderLayout());
        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamsActionPerformed
        Teams_main panel = new Teams_main(this);
        switchPanel(panel);
    }//GEN-LAST:event_TeamsActionPerformed

    private void MatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchesActionPerformed
        Matches_main panel = new Matches_main();
        switchPanel(panel);
    }//GEN-LAST:event_MatchesActionPerformed

    private void CoachesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoachesActionPerformed
        Coaches_main panel = new Coaches_main();
        switchPanel(panel);
    }//GEN-LAST:event_CoachesActionPerformed

    private void PlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayersActionPerformed
        Players_main panel = new Players_main(this);
        switchPanel(panel);
    }//GEN-LAST:event_PlayersActionPerformed

    private void PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceActionPerformed
        Performance_main panel = new Performance_main();
        switchPanel(panel);
    }//GEN-LAST:event_PerformanceActionPerformed

    private void AchievementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AchievementsActionPerformed
        Achievements_main panel = new Achievements_main();
        switchPanel(panel);
    }//GEN-LAST:event_AchievementsActionPerformed
    
    private void setMainPanel(){
        Main_Panel panel = new Main_Panel();
        main.removeAll();
        main.add(panel);
        main.revalidate();
        main.repaint();
    }
    
    public void switchPanel(JPanel panel) {
        main.removeAll();
        main.add(panel);
        main.revalidate();
        main.repaint();
    }
    
    
    private void removeButtonDefault(JComponent component) {
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            button.setContentAreaFilled(false);
            button.setOpaque(true);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setBackground(new Color(255,255,255));
        }
    }
    
    public JPanel getMainPanel() {
        return main;
    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Achievements;
    private javax.swing.JButton Coaches;
    private javax.swing.JButton Matches;
    private javax.swing.JButton Performance;
    private javax.swing.JButton Players;
    private javax.swing.JButton Teams;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
