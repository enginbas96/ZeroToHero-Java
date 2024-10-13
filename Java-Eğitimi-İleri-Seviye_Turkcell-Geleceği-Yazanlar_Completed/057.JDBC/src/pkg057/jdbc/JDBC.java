package pkg057.jdbc;

import java.sql.SQLException;
import java.util.Objects;

public class JDBC 
{
    public static void main(String[] args) throws SQLException
    {
        OgrenciDataAccessObject ODAO = new OgrenciDataAccessObject();        
        
        //Aranacak öğrenci : 1111
        Ogrenci arananOgrenci = ODAO.getOgrenci("1111");
        if(arananOgrenci != null){arananOgrenci.bilgiVer();}
        else{System.out.println("Ogrenci bulunamadi!");}
        
        Ogrenci arananOgrenci2 = ODAO.getOgrenci("11112");
        if(arananOgrenci2 != null){arananOgrenci2.bilgiVer();}
        else{System.out.println("Ogrenci bulunamadi!");}
        
        System.out.println("------------------------------------------");
        
        //Veri eklemek        
        //Eklenecek ogrenci : 178451      
        Ogrenci eklenecekOgrenci = new Ogrenci();
        Ogrenci ogrenciVarmi = ODAO.getOgrenci("178451");
        
        if(ogrenciVarmi != null)
        {    
            System.out.println("Bu numaraya ait ogrenci zaten mevcuttur.");                   
        }
        else
        {        
            eklenecekOgrenci.setNo("178451");
            eklenecekOgrenci.setAd("Veli");
            eklenecekOgrenci.setSoyad("Koc");
            eklenecekOgrenci.setkAdi("Velko12");
            ODAO.ogrenciEkle(eklenecekOgrenci);  
        }
        
        System.out.println("------------------------------------------");
        
        //Veri Silmek        
        //Silinecek ogrenci : 1234551      
        Ogrenci silinecekOgrenci = new Ogrenci();
        silinecekOgrenci.setNo("1234551");
        ogrenciVarmi = ODAO.getOgrenci("1234551");
        
        if(ogrenciVarmi == null)
        {    
            System.out.println("Bu numaraya ait ogrenci zaten mevcut degil.");                   
        }
        else
        {        
           ODAO.ogrenciSil(silinecekOgrenci.getNo());
        }
        
        System.out.println("------------------------------------------");
        
        //Veri Güncelleme        
        //Güncellenecek ogrenci : 1784551      
        Ogrenci guncellenecekOgrenci = new Ogrenci();
        ogrenciVarmi = ODAO.getOgrenci("1784551");
        
        if(ogrenciVarmi == null)
        {    
            System.out.println("Bu numaraya ait ogrenci mevcut degil.");                   
        }
        else
        {  
            guncellenecekOgrenci.setAd("AAA");
            guncellenecekOgrenci.setSoyad("BBB");
            guncellenecekOgrenci.setNo("765321");
            guncellenecekOgrenci.setkAdi("CCCC");
            ODAO.ogrenciGuncelle(guncellenecekOgrenci, "1784551");
        }        
        
        System.out.println("------------------------------------------");
        
        ODAO = null;
        System.gc();
    }    
}