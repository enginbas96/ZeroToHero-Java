package pkg135.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maps
{
    public static void main(String[] args) 
    {
        SortedMap<Integer, Kisi> kisi = new TreeMap<>();
        kisi.put(1, new Kisi("123", "Mehmet", "BAS", Cinsiyet.ERKEK));
        kisi.put(2, new Kisi("234", "Engin", "BAS", Cinsiyet.ERKEK));
        kisi.put(3, new Kisi("123", "Ahmet", "MAHMUT", Cinsiyet.ERKEK));
        
        System.out.println(kisi.size());
        
        System.out.println("----------------------------");
        
        Set<Map.Entry<Integer, Kisi>> setKisi = kisi.entrySet();
        Iterator<Map.Entry<Integer, Kisi>> iterator = setKisi.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer, Kisi> next = iterator.next();
            System.out.println(next.getKey() + " : " + next.getValue());
        }
    }    
}
