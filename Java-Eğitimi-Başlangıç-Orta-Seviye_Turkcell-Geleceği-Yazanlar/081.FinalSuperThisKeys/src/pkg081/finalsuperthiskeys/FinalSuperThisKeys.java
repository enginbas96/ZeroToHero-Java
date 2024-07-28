package pkg081.finalsuperthiskeys;

import java.util.Date;

public class FinalSuperThisKeys
{
    public static void main(String[] args) 
    {
        // this key bir metot veya yapıcı metot içindeki değişkenleri daha belirgin yapmak için kullanılır.
        // ayrıca bir sınıf içinde başka bir sınıfın yapıcı metodunu çağırırken kullanılabilir
        
        Calisan c1 = new Calisan("A",2,new Date());
        c1.setIsim("Mehmet");
        c1.setMaas(100000);
        c1.setTarih(new Date());
        c1.yazdir();
        
        System.out.println("----------------------------------------------");
        
        Calisan c2 = new Calisan("Ahmet", 5550, new Date());
        c2.yazdir();
        
        System.out.println("----------------------------------------------");
        
        //Zincirleme çağırım
        Calisan c3 = new Calisan();
        c3.yazdir();  
        System.out.println("---");
        Calisan c4 = new Calisan("Ali Can");
        c4.yazdir();
        System.out.println("---");
        Calisan c5 = new Calisan("Ali Can",55555);
        c5.yazdir();
        System.out.println("---");
        Calisan c6 = new Calisan("Ali Can",55555,new Date());
        c6.yazdir();
    }    
}
