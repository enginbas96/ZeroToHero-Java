package pkg053.jdbc;

import java.sql.SQLException;

public class JDBC 
{
    public static void main(String[] args) throws SQLException 
    {
        Ogrenci ogrenci = new Ogrenci();
        
        ogrenci.setNo("152356");
        ogrenci.setkAdi("MahTum123");
        ogrenci.setAd("Mahmut");
        ogrenci.setSoyad("Tutam");        
        ogrenci.bilgiVer();
        
        System.out.println("----------------------------------------");
        
        OgrenciDataAccessObject ODAO = new OgrenciDataAccessObject();
        String numara = "234234";  
        ODAO.getOgrenci(numara).bilgiVer();
    }    
}