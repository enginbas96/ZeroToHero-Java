package pkg119.collectionsframeworkset;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsFrameworkSet 
{
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Istanbul");
        hashSet.add("Ankara");
        hashSet.add("Izmir");
        hashSet.add("Bursa");
        hashSet.add("Bursa");
        
        System.out.println(hashSet.size()); //İçerisinde unique değerler tuttugu için 2 aynı değeri ayrı saymayacaktır
        Iterator<String> iterator = hashSet.iterator(); //Herhangi bir sıralama yapmaz rastgele değerler gelebilmektedir
        while(iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("-----------------------------------------------------------");
        
        HashSet<Calisan> hashSet2 = new HashSet<Calisan>();
        Calisan c1 = new Calisan("123","Mehmet");
        
        hashSet2.add(c1);
        //Her bir Ahmetin hashCode' u farklı oldugundan hashSet içerisinde listelenmesinde bir problem yoktur.
        //Fakat biz calisan sınıfımız içerisinde hashcode metodunu ve equals metodunu override edip tekrar 
        //düzenlersek bu defa aynı nesneleri göstermemesi için ayarlayabiliriz
        hashSet2.add(new Calisan("145", "Ahmet"));        
        hashSet2.add(new Calisan("187", "Ali"));        
        hashSet2.add(new Calisan("163", "Veli"));        
        hashSet2.add(new Calisan("163", "Veli"));        
        
        Iterator<Calisan> iterator2 = hashSet2.iterator();
        while(iterator2.hasNext())
        {
            Calisan next = iterator2.next();
            System.out.println(next.hashCode());
        }         
    }    
}
