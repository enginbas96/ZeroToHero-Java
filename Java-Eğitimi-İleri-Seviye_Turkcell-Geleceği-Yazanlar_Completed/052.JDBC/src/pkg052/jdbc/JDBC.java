package pkg052.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBC 
{
    public static void main(String[] args) throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/okul";
        String username = "root";
        String password = "";       

        Connection conn = null;  
        conn = DriverManager.getConnection(url, username, password); 

        String sorgu = "INSERT INTO ogrenciler (ogrenciNo, username, ad, soyad) VALUES (?, ?, ?, ?)";      
        PreparedStatement pst = conn.prepareStatement(sorgu);
        
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            int ogrenciNo;
            String ogrenciUsername;
            String ogrenciAd;
            String ogrenciSoyad;
            
            System.out.print("Lutfen ogrenci numarasini giriniz: ");   
            ogrenciNo = sc.nextInt();
            
            System.out.print("Lutfen kullanici adini giriniz: ");
            ogrenciUsername = sc.next();
            
            System.out.print("Lutfen ad giriniz: ");
            ogrenciAd = sc.next();
            
            System.out.print("Lutfen soyad giriniz: ");
            ogrenciSoyad = sc.next();
            
            pst.setInt(1, ogrenciNo);
            pst.setString(2, ogrenciUsername);
            pst.setString(3, ogrenciAd);
            pst.setString(4, ogrenciSoyad);
            
            pst.executeUpdate();         
            
            System.out.println("************************************************");
            System.out.print("Devam etmek icin 0, bitirmek icin 1 yaziniz: " );
            if(sc.next().equals("1"))
            {
                System.out.println("Program sonlandiriliyor."); 
                System.out.println("************************************************");
                break;                
            }
            System.out.println("************************************************");
        }
        pst.close();
        conn.close(); 
    }    
}