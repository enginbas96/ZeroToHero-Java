package pkg050.jdbc;

import java.sql.*;

public class JDBC 
{
    public static void main(String[] args) throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/okul";
        String username = "root";
        String password = "";
        String sorgu = "select * from ogrenciler";
        
        Connection conn = null;        
        conn = DriverManager.getConnection(url, username, password);        
        
        //SQL KOMUTLARININ KATEGORİLERİ(DDL, DML, DQL, TCL, DCL)
        //DDL(CREATE, DROP, ALTER, TRUNCATE)
        //DML (INSERT, UPDATE, DELETE, CALL, EXPLAIN CALL, LOCK)
        //DQL (SELECT)
        
        Statement st = conn.prepareStatement(sorgu);
        ResultSet rs = st.executeQuery(sorgu);
        
        while (rs.next())  // "!(rs.last())" olarak da yazılabilir
        {
            //Tabloda ID, ogrenciNo, username, adi, soyadi stunları vardır.
            int ogrenciID = rs.getInt("ID");
            String ogrenciNo = rs.getString("ogrenciNo");
            String ogrenciUsername = rs.getString("username");
            String ad = rs.getString("ad");
            String soyad = rs.getString("soyad");
            
            System.out.println("ID : " + ogrenciID);
            System.out.println("Ogrenci No : " + ogrenciNo);
            System.out.println("Kullanici Adi : " + ogrenciUsername);
            System.out.println("Ad : " + ad);
            System.out.println("Soyad : " + soyad);
            
            System.out.println("-------------------------------------------------------");
        }      
        
        st.close();
        conn.close();        
        
    }    
}