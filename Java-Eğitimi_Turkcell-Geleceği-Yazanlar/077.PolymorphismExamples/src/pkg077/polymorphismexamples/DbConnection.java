package pkg077.polymorphismexamples;

public class DbConnection
{
    public void openConnection(){System.out.println("Veritabani baglantisi acildi.");}
    public void closeConnection(){System.out.println("Veritabani baglantisi kapatildi.");}
    public void executeQuery(String sql){System.out.println("SQL komutlari calistirildi.");}    
}
