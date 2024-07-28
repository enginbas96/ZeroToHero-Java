package pkg149.functionalınterfaceexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceExamples 
{
    public static void main(String[] args) 
    {
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci(1, "Ali CAN", 80));
        ogrenciler.add(new Ogrenci(3, "Ahmet VUSLAT", 70));
        ogrenciler.add(new Ogrenci(2, "Mehmet BAS", 100));
        ogrenciler.add(new Ogrenci(0, "Mamut SELIM", 100));
        
        ogrenciler.forEach((o) -> System.out.println(o));
        
        System.out.println("-----------------------------------------");
        
        /*
        Collections.sort(ogrenciler, new Comparator<Ogrenci>()
        {
            @Override
            public int compare(Ogrenci o1, Ogrenci o2) //Listenin kendi içerisinde sıralanmasını sağlıyor
            {
                return o1.getNumara() - o2.getNumara();
            }
        });
        */
        
        Collections.sort(ogrenciler, (o1,o2) -> o1.getNumara() - o2.getNumara()); //Listenin kendi içinde sıralanmasını sağlıyor
        ogrenciler.forEach((o) -> System.out.println(o));        
    }    
}