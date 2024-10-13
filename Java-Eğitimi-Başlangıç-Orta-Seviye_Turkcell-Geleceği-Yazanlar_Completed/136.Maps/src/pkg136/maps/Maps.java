package pkg136.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Maps 
{
    public static void main(String[] args)
    {
        //Herhangi bir sıralama yok rastgele gelebilir
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Bilgisayar", 2200.0);
        hashMap.put("Telefon", 1400.0);
        hashMap.put("Tablet", 1700.0);
        hashMap.put("Araba", 20000.0);
        
        System.out.println(hashMap.size());        
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next + " : " + hashMap.get(next));
        }        
        
        System.out.println("-------------------------------------------------");
        
        
        hashMap.remove("Araba");      
        System.out.println(hashMap.size());
        iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next + " : " + hashMap.get(next));
        }        
        
        System.out.println("-------------------------------------------------");
        
        System.out.println(hashMap.isEmpty());//Eğer içi boş ise true değeri dönderir, içinde değer varsa false dönderir
        
        System.out.println("-------------------------------------------------");
        
        hashMap.replace("Telefon", 5555.0);
        iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next + " : " + hashMap.get(next));
        }  
    }    
}
