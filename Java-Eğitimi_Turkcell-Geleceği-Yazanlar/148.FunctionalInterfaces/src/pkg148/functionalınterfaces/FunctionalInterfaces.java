package pkg148.functionalınterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfaces 
{
    public static void main(String[] args) 
    {
        
        Supplier<Urun> supplier1 = new Supplier<Urun>() 
        {
            @Override
            public Urun get() 
            {
                Urun urun = new Urun(1,"Laptop", 5500);
                return urun;
            }
        };
        
        System.out.println(supplier1.get());
        
        System.out.println("-------------------");
        
        //Lambda ile 
        Supplier<Urun> supplier2 = () -> new Urun(2, "Telefon", 7000);
        System.out.println(supplier2.get());
        
        System.out.println("-------------------");
        
        Supplier<List<Urun>> supplier3 = () -> //Lambda expressionlarda kullanılacak satır sayısı 1'den fazlaysa süslü parantezler kullanılır
        {
          List<Urun> urunList = new ArrayList<>();
          urunList.add(new Urun(3, "Tablet", 5000));
          urunList.add(new Urun(4, "Desktop", 30000));
          urunList.add(new Urun(5, "Mouse", 250));
          return urunList;
        };
        supplier3.get().forEach((u) -> System.out.println(u));
    }    
}
