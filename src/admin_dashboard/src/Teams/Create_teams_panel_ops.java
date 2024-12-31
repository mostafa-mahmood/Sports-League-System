package Teams;

import utils.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Create_teams_panel_ops {
    public static void create_team(String name, String points, String captain){
        
        if(name.length() == 0 || points.length() == 0 || captain.length() == 0){
            JOptionPane.showMessageDialog(null, "Field cannot be empty!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        String SQL = "INSERT INTO teams(name,points,captain) VALUES(?,?,?);";
        
        try(Connection connection = DBConnection.getConnection();PreparedStatement pstmt = connection.prepareStatement(SQL)){
            pstmt.setString(1, name);
            pstmt.setString(2, points);
            pstmt.setString(3, captain);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Team was Created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else {
                JOptionPane.showMessageDialog(null, "Operation Failed", "Create Team Failed", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
