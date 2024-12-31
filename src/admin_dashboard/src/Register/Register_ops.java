package Register;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import utils.DBConnection;
import javax.swing.JOptionPane;

public class Register_ops {
    
    public static boolean registerAdmin(String name, String email, char[] password) {
        String spassword = new String(password);
        
        if (name.length() == 0 || email.length() == 0 || spassword.length() == 0) {
            JOptionPane.showMessageDialog(null, "All fields are required!", "Invalid Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String SQL = "INSERT INTO admin (user_name, email, password) VALUES (?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, spassword);
            
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.print("Admin registered successfully!");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Admin registration failed!", "Failure", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
