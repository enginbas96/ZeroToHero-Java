package pkg147.functionalınterfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces 
{
    public static void main(String[] args) 
    {
        Matematik matematik1 = new Matematik() 
        {
            @Override
            public void islem(double a, double b) 
            {
                System.out.println(a+b);
            }
        };
        matematik1.islem(5, 6);
        
        System.out.println("-------------------------------------");
        
        Matematik matematik2 = (x,y) ->System.out.println(x+y);
        matematik2.islem(5, 3);
        
        Matematik matematik3 = (x,y) -> System.out.println(x-y);
        matematik3.islem(5, 2);
        
        System.out.println("--------------------------------------------");
        
        ArrayList<String> sehirler =  new ArrayList<>();
        sehirler.add("Bursa");
        sehirler.add("Istanbul");
        sehirler.add("Ankara");
        sehirler.add("Ordu");
        sehirler.add("Samsun");
        
        //Consumer anonymous class
        sehirler.forEach(new Consumer<String>()
        {
            @Override
            public void accept(String t) 
            {
                System.out.println(t);
            }
        });
        
        System.out.println("---------------------------");
        
        //Consumer lambda
        sehirler.forEach((s)->System.out.println(s));
        
        System.out.println("---------------------------");
        
        //B ile başlayan şehirler ekrana yazdırılır, anonymous class
        //Predicate'in amacı kendisine verilen değeri bir koşul içerisinde değerlendirip boolean değer döndürmektir.
        Predicate<String> predicate = new Predicate<String>()
        {
            @Override
            public boolean test(String t)
            {
                return t.startsWith("B");
            }
        };
        
        for(int i = 0; i < sehirler.size(); i++)        
        {
            String sehir = sehirler.get(i);
            if(predicate.test(sehir))
            {
                System.out.println(sehir);
            }
        }
        
        //B ile başlayan şehirler ekrana yazdırılır, Lambda
        Predicate<String> predicate2 = (s) -> s.startsWith("B");
        for(int i = 0; i < sehirler.size(); i++)
        {
            String sehir = sehirler.get(i);
            if(predicate2.test(sehir))
            {
                System.out.println(sehir);
            }
        }        
    }    
}
