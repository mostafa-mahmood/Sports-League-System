package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String SERVER_NAME = "KHEDR\\SQLEXPRESS";
    private static final String DB_NAME = "FLMS";
    private static final String CONNECTION_URL = "jdbc:sqlserver://" + SERVER_NAME + 
                                                 ":1433;DatabaseName=" + DB_NAME + 
                                                 ";integratedSecurity=true;trustServerCertificate=true";
    
    // Static method to get connection
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(CONNECTION_URL);
        } catch (ClassNotFoundException e) {
            throw new SQLException("SQL Server JDBC Driver not found", e);
        }
    }
}