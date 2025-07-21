import java.sql.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        /// İnsert işlemleri yapılacak
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        try
        {
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("insert into city (Name,CountryCode,District,Population) values('Düzce2','TUR','Düzce',60000)");
            statement.executeUpdate();

            statement = connection.prepareStatement(sql);
            statement.setString(1,"ASD");
            statement.setString(2,"TUR");
            statement.setString(3,"ASD");
            statement.setInt(4,60000);
            statement.executeUpdate();

            statement = connection.prepareStatement(dbHelper.getSQL("Ahmet","TUR","Ahmet",1000));
            statement.executeUpdate();
            System.out.println("Kayıt eklendi.");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
           connection.close();
        }
    }
}