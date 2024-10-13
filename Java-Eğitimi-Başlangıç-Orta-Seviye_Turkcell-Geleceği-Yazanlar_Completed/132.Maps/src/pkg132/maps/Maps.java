package pkg132.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Maps 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(34, "Istanbul");
        hashMap.put(52, "Ordu");
        hashMap.put(6, "Ankara");        
        hashMap.put(6, "Ankara 2"); //Hashmap'te sıra numaraları unique olmalıdır
        System.out.println(hashMap.size());
        
        System.out.println("--------------------------");
        
        System.out.println(hashMap.get(6)); //6 sıra numarasına sahip atanmış son değeri ekrana yazdırır
        System.out.println(hashMap.get(20)); // Eğer sahip olmadığı bir değeri döndürmek istersek null değerini dönderir
        
        System.out.println("--------------------------");
        
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next + " " +hashMap.get(next));
        }
    }    
}
