package pkg133.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps 
{    
    public static void main(String[] args) 
    {
        HashMap<Integer, Sehir> hashMap = new HashMap<>();
        hashMap.put(1, new Sehir("Adana", 321550));
        hashMap.put(6, new Sehir("Ankara", 1321550));
        hashMap.put(52, new Sehir("Ordu", 521550));
        hashMap.put(34, new Sehir("Istanbul", 1521550));
        
        System.out.println(hashMap.size());
        
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next + " " + hashMap.get(next));
        }
        
        System.out.println("----------------------------------------");
               
        //Eğer bize sadece sehirler lazım ise
        
        Collection<Sehir> deger = hashMap.values();
        Iterator<Sehir> iterator1 = deger.iterator();
        while(iterator1.hasNext())
        {
            Sehir next = iterator1.next();
            System.out.println(next);
        }
        
        System.out.println("----------------------------------------");
        
        //Eğer hem keyi hemde değerleri almak istersek
        Set<Map.Entry<Integer, Sehir>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Integer,Sehir>> iterator2 = entries.iterator();
        while(iterator2.hasNext())
        {
            Map.Entry<Integer,Sehir> next = iterator2.next();
            System.out.print(next.getKey() + " ");
            System.out.println(next.getValue());
        }
    }    
}
