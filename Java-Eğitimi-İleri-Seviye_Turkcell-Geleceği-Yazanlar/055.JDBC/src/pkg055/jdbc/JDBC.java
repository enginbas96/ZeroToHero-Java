package pkg055.jdbc;

import java.sql.SQLException;

public class JDBC 
{
    public static void main(String[] args) throws SQLException 
    {
        OgrenciDataAccessObject ODAO = new OgrenciDataAccessObject();
        Ogrenci ogrenci = new Ogrenci();
        
        ogrenci.setNo("152356");
        ogrenci.setkAdi("MahTum123");
        ogrenci.setAd("Mahmut");
        ogrenci.setSoyad("Tutam");        
        ogrenci.bilgiVer();
        //ODAO.ogrenciEkle(ogrenci);        
        
        System.out.println("----------------------------------------");        
        
        String numara = "234234";  
        ODAO.getOgrenci(numara).bilgiVer();
        
        System.out.println("----------------------------------------");    
        
        ODAO.ogrenciSil("152356");
    }    
}