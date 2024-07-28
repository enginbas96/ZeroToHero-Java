package pkg134.maps;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maps 
{
    public static void main(String[] args) 
    {        
        //Sortedmap sıralı bir maptir bu sebeple key değerlerini sıralayarak dönderir
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("Araba", "Car");
        sortedMap.put("Ev", "Home");
        sortedMap.put("Kalem", "Pencil");
        
        System.out.println(sortedMap.size());
        System.out.println(sortedMap.get("Araba"));
        
        String value = sortedMap.get("Kalem");
        System.out.println(value);
        
        System.out.println("----------------------------------");
        
        Set<String> keySet = sortedMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next + " : " + sortedMap.get(next));
        }
    }    
}
