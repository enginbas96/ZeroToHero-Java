package pkg139.ıterator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class Iterators 
{
    public static void main(String[] args) 
    {
        //Bir koleksiyonun elemanları üzerinde birer birer ilerlememizi sağlayan soyut veri tipidir
        //Next metodu ile koleksiyonun sıradaki elemanı, eleman yoksa hata durumu döndürür
        //hasNext metodu koleksiyonun içinde daha elemanı varsa true döndürür aksi durumda false döner
        //remove metodu ile iterator tarafından döndürülen son eleman silinir, listeden kaldırılır
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++)
        {
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList.size());
        /*
        //Arraylistler kolaylık olarak for döngüsü ile de yazdırılabilir
        //Ancak set interface'inden türüyen metotlarda get metodu bulunmamaktadır
        for(int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
        */
        
        System.out.println("------------------------");
        
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next);
            if(next > 50)
            {
                iterator.remove();
            }
        }
        
        System.out.println("------------------------");
        
        System.out.println(arrayList.size());
    }    
}
