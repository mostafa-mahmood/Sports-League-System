package Register;

import java.awt.Color;
import javax.swing.*;
import Home.*;
public class Register_Main extends javax.swing.JFrame {

    private Login login;
    private Register register;
    
    public void setLogin() {
        login = new Login(); // Always create a new Login instance
        rightPanel.removeAll();
        rightPanel.add(login);
        rightPanel.revalidate(); // Use revalidate() instead of updateComponentTreeUI()
        rightPanel.repaint(); // Always call repaint to refresh the panel
        loginBtn.setBackground(new Color(55,20,70));
        loginBtn.setForeground(new Color(255,255,255));
        registerBtn.setBackground(new Color(255,255,255));
        registerBtn.setForeground(new Color(40,19,59));
    }
    public void setRegister() {
        register = new Register(); // Always create a new Register instance
        rightPanel.removeAll();
        rightPanel.add(register);
        rightPanel.revalidate();
        rightPanel.repaint();
        loginBtn.setBackground(new Color(255,255,255));
        loginBtn.setForeground(new Color(40,19,59));
        registerBtn.setBackground(new Color(55,20,70));
        registerBtn.setForeground(new Color(255,255,255));
    }
    public Register_Main() {
        initComponents();
        setTitle("Premier League");
        ImageIcon icon = new ImageIcon("D:\\Programming\\Projects\\Football-League-Management-System\\src\\admin_dashboard\\src\\Assets\\icon.jpg");
        this.setIconImage(icon.getImage());
        setLocationRelativeTo(null);
        removeButtonDefault(loginBtn);
        removeButtonDefault(registerBtn);

        setLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1121, 644));
        setUndecorated(true);

        leftPanel.setBackground(new java.awt.Color(40, 19, 59));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Dashboard");

        loginBtn.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(40, 19, 59));
        loginBtn.setText("Log In");
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setFocusPainted(false);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(40, 19, 59));
        registerBtn.setText("Register");
        registerBtn.setBorder(null);
        registerBtn.setBorderPainted(false);
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.setFocusPainted(false);
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Premier League");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        rightPanel.setBackground(new java.awt.Color(55, 0, 60));
        rightPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        setLogin();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        setRegister();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void removeButtonDefault(JComponent component) {
        if (component instanceof AbstractButton) {
            AbstractButton button = (AbstractButton) component;
            button.setContentAreaFilled(false);
            button.setOpaque(true);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
        }
    }
    
    public void disposeFrame(){
        dispose();
    }
    public static void main(String args[]) {
        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);

        // Make the splash screen stay visible for 3 seconds (3000 milliseconds)
        try {
            Thread.sleep(3000);  // You can adjust the time as needed
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        // Close the splash screen
        splash.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
