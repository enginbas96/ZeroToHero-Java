package pkg056.jdbc;

import java.sql.SQLException;

public class JDBC 
{
    public static void main(String[] args) throws SQLException 
    {
        OgrenciDataAccessObject ODAO = new OgrenciDataAccessObject();
        Ogrenci ogrenci1 = new Ogrenci();
        
        ogrenci1.setNo("152356");
        ogrenci1.setkAdi("MahTum123");
        ogrenci1.setAd("Mahmut");
        ogrenci1.setSoyad("Tutam");        
        ogrenci1.bilgiVer();
        
        //ODAO.ogrenciEkle(ogrenci1);        
        
        System.out.println("----------------------------------------");        
        
        String numara = "234234";  
        ODAO.getOgrenci(numara).bilgiVer();
        
        System.out.println("----------------------------------------");    
        
        //ODAO.ogrenciSil("152356");
        
        System.out.println("----------------------------------------"); 
        
        Ogrenci ogrenci2 = new Ogrenci();
        
        ogrenci2.setNo("147852");
        ogrenci2.setkAdi("Esper13");
        ogrenci2.setAd("Esin");
        ogrenci2.setSoyad("Perver");
        
        ODAO.ogrenciGuncelle(ogrenci2, "152356");
        
    }    
}