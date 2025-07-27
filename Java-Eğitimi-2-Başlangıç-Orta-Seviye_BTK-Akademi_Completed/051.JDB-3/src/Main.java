import java.sql.*;

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
            String sql1 = "update city set Population = 15999, District = 'Turkey' where id = 4082";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(sql1);
            statement.executeUpdate();


            String sql2 = "update city set Population = 19899, District = 'Karadeniz' where id = ?";
            statement = connection.prepareStatement(sql2);
            statement.setInt(1, 4083);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi.");
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