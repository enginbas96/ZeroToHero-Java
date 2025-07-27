import java.sql.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        Connection connection = null;
        DBHelper hepler = new DBHelper();
        try
        {
            connection = hepler.getConnection();
            System.out.println("Bağlantı sağlandı.");
        }
        catch (SQLException e)
        {
            hepler.showErrorMessage(e);
        }
        finally
        {
            connection.close();
            System.out.println("Bağlantı kapatıldı.");
        }

        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Country> countries = new ArrayList<>();
        try
        {
            connection = hepler.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from country");
            while (resultSet.next())
            {
                countries.add(new Country(resultSet.getString("Code"),resultSet.getString("Name"),resultSet.getString("Continent"),resultSet.getString("Region")));
            }
        }
        catch (SQLException e)
        {
            hepler.showErrorMessage(e);
        }
        finally
        {
            connection.close();
            System.out.println(countries.size());
            for (Country c: countries)
            {
                System.out.println(c);
            }
        }
    }
}