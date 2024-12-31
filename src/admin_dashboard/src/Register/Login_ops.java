package Register;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utils.DBConnection;
import javax.swing.JOptionPane;

public class Login_ops {
    public static boolean loginAdmin(String Name, char[] Password){
        String sPassword = new String(Password);
        if(Name.length() == 0 || sPassword.length() == 0){
            JOptionPane.showMessageDialog(null, "All fields are required!", "Invalid Inputs", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String SQL = "SELECT user_name,password FROM admin WHERE user_name = ? AND password = ?";
        try(Connection connection = DBConnection.getConnection()){
            PreparedStatement pstmt = connection.prepareStatement(SQL);
            pstmt.setString(1, Name);
            pstmt.setString(2,sPassword);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                System.out.print("Admin Login was Successfull");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong user name or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
