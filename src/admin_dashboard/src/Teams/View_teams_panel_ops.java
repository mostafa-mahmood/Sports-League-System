package Teams;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JTable;
import utils.DBConnection;
import utils.DBRead;

public class View_teams_panel_ops {
    public static void view_team(String selected, JTable tableToUpdate){
        try{
            Connection connection = DBConnection.getConnection();
            String SQL;
            PreparedStatement pstmt;

            if (selected.equals("All Teams")) {
                SQL = "SELECT team_id, name, points, captain FROM teams";
                pstmt = connection.prepareStatement(SQL);
            } else {
                SQL = "SELECT team_id, name, points, captain FROM teams WHERE name = ?";
                pstmt = connection.prepareStatement(SQL);
                pstmt.setString(1, selected);
            }
            
            ResultSet rs = pstmt.executeQuery();
            DBRead.ReadFromResultSet(rs, tableToUpdate);
            
        }
        catch(SQLException e){
            System.out.println("Database error: " + e.getMessage());
           
        }
    }
}
