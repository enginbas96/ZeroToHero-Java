package pkg121.collectionsframeworkset;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsFrameworkSet
{
    public static void main(String[] args) 
    {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Siyah");
        treeSet.add("Mavi");
        treeSet.add("Beyaz");
        treeSet.add("Kirmizi");
        treeSet.add("Kirmizi");
        
        System.out.println(treeSet.size());
        System.out.println("--------------------------");
        
        Iterator<String> iterator =  treeSet.iterator();
        while(iterator.hasNext())
        {
            String next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("--------------------------");
        
        TreeSet<Sehir> treeSet2 = new TreeSet<>();
        treeSet2.add(new Sehir("34", "Istanbul"));
        treeSet2.add(new Sehir("44" , "Malatya"));
        treeSet2.add(new Sehir("55","Samsun"));
        treeSet2.add(new Sehir("55","Samsun"));
        Iterator<Sehir> iterator2 = treeSet2.iterator();
        while(iterator2.hasNext())
        {
            Sehir next = iterator2.next();
            System.out.println(next);
        }
    }    
}