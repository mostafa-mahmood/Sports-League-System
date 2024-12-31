package Players;

import utils.DBConnection;
import utils.DBRead;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class View_players_panel_ops {
    
    static void viewPlayer(String playerName, JTable tableToUpdate){
        if(playerName.length() == 0){
            JOptionPane.showMessageDialog(null, "Enter player name", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
        try(Connection connection = DBConnection.getConnection()){
            String SQL = "SELECT team_id, name, salary, nationality, position, shirt_number FROM players WHERE name = ?";
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            pstmt.setString(1, playerName);
            ResultSet rs = pstmt.executeQuery();
            if(rs.isBeforeFirst()){
                DBRead.ReadFromResultSet(rs, tableToUpdate);
            }
            else{
                JOptionPane.showMessageDialog(null, "Player doesn't exist", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
