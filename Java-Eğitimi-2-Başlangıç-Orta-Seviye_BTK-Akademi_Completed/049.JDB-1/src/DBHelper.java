import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper
{
    private String userName ="root";
    private String password = "1234";
    private String dbURL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbURL,userName,password);
    }

    public void showErrorMessage(SQLException exception)
    {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code: " + exception.getErrorCode());
    }
}
