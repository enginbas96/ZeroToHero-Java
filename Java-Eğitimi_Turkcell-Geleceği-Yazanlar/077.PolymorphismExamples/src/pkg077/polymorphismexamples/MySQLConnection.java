package pkg077.polymorphismexamples;

public class MySQLConnection extends DbConnection
{
    public void openConnection(){System.out.println("MySQL baglantisi acildi.");}
    public void closeConnection(){System.out.println("MySQL baglantisi kapatildi.");}
    public void executeQuery(String sql){System.out.println("MySQL komutlari calistirildi.");}    
}
