package pkg137.maps;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Maps
{
    public static void main(String[] args)
    {
        HashMap<Integer, Kitap> hashMap = new HashMap<>();
        hashMap.put(1, new Kitap("X Kitabi", new Date(), "X Yazari"));
        hashMap.put(2, new Kitap("Y Kitabi", new Date(), "Y Yazari"));
        hashMap.put(3, new Kitap("Z Kitabi", new Date(), "Z Yazari"));
        
        System.out.println(hashMap.size());
        
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next + " : " + hashMap.get(next));
        }       
    }    
}
