package SwingPackages;

import java.sql.*;

public class DBHelper 
{
    private String username = "root";
    private String password = "1234";
    private String dbURL = "jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbURL,username,password);
    }
    public void showErrorMessage(SQLException e)
    {
        System.out.println("Hata: " + e.getMessage());
        System.out.println("Error Code: " + e.getErrorCode());
    }    
}
