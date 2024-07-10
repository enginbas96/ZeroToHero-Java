package pkg090.overloadingexamples;

import java.util.Date;

public class OverloadingExamples 
{
    public static void main(String[] args) 
    {
        Calisan c1 = new Calisan();
        c1.bilgileriYazdir();
        Calisan c2 = new Calisan("Ahmet");
        c2.bilgileriYazdir();
        Calisan c3 = new Calisan("Ali", "IT");
        c3.bilgileriYazdir();
        Calisan c4 = new Calisan("Mehmet", "CEO", new Date());
        c4.bilgileriYazdir();
    }    
}
