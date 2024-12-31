package Teams;

import utils.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Delete_teams_panel_ops {
    public static void Delete_team(String id) {
        
        if (id.length() == 0) {
            JOptionPane.showMessageDialog(null, "Team ID cannot be empty!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String SQL = "DELETE FROM teams WHERE team_id = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            
            pstmt.setString(1, id);
            
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Team Record was deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Team not was found!", "Delete Failed", JOptionPane.WARNING_MESSAGE);
                return;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
    }
}
