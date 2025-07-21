import java.sql.*;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        /// Delete işlemleri yapılacak
        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement statement = null;
        try
        {
            String sql1 = "delete from city where id = 4082";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(sql1);
            statement.executeUpdate();


            String sql2 = "delete from city where id = ?";
            statement = connection.prepareStatement(sql2);
            statement.setInt(1, 4083);
            statement.executeUpdate();
            System.out.println("Kayıt silindi.");
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