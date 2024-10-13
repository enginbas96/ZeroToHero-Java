package pkg078.polymorphismexamples;

public class MsSQLConnection extends DbConnection
{
    public void openConnection(){System.out.println("MsSQL baglantisi acildi.");}
    public void closeConnection(){System.out.println("MsSQL baglantisi kapatildi.");}
    public void executeQuery(String sql){System.out.println("MsSQL komutlari calistirildi.");}
}
