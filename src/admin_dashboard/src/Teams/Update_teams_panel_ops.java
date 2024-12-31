package Teams;

import java.sql.SQLException;
import java.sql.Connection;
import utils.DBConnection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Update_teams_panel_ops {
    public static void Update_team(String id, String points) {
        
        if (id.length() == 0 || points.length() == 0) {
            JOptionPane.showMessageDialog(null, "ID or Points cannot be empty!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }

        String SQL = "UPDATE teams SET points = ? WHERE team_id = ?";

        try (Connection connection = DBConnection.getConnection();PreparedStatement pstmt = connection.prepareStatement(SQL)) {
            
            pstmt.setString(1, points);
            pstmt.setString(2, id);
            
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Team Record was updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Team was not found!", "Update Failed", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
