package pkg053.jdbc;

import java.sql.*;

public class OgrenciDataAccessObject 
{
    private Connection conn = null;
    
    private void veriTabaninaBaglan()
    {
        String url = "jdbc:mysql://localhost:3306/okul";
        String username = "root";
        String password = "";
        try
        {
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    
}
