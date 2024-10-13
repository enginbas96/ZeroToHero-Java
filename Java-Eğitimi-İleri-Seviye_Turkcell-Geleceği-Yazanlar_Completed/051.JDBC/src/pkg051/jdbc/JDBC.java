package pkg051.jdbc;

import java.sql.*;

public class JDBC 
{
    public static void main(String[] args) throws SQLException 
    {
        //Manuel veri girişi yapıldı
        
        String url = "jdbc:mysql://localhost:3306/okul";
        String username = "root";
        String password = "";       

        Connection conn = null;  
        conn = DriverManager.getConnection(url, username, password); 

        String sorgu = "INSERT INTO ogrenciler (ogrenciNo, username, ad, soyad) VALUES (?, ?, ?, ?)";    
        
        PreparedStatement pst = conn.prepareStatement(sorgu);
        
        int ogrenciNo = 1; // Örneğin, öğrenci numarası 1
        String ogrenciUsername = "ahmet123";
        String ogrenciAd = "Ahmet";
        String ogrenciSoyad = "Yılmaz";
        
        pst.setInt(1, ogrenciNo);
        pst.setString(2, ogrenciUsername);
        pst.setString(3, ogrenciAd);
        pst.setString(4, ogrenciSoyad);
        
        pst.executeUpdate();
         
        pst.close();
        conn.close(); 
    }    
}