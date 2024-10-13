package pkg120.collectionsframeworkset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionsFrameworkSet 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(7);
        hashSet.add(8);
        System.out.println(hashSet.size());
        System.out.println(hashSet.isEmpty());
        
        System.out.println("------------------------------");
        
        //Normalde setlerin içine eklenen elemanların sırayla gelme gibi bir zorunluluğu yoktu rastgele geliyordu
        //Fakat LinkedHashSet bağlı liste oldugundan dolayı ekleme sırasına göre ekrana döndürecektir
        Iterator<Integer> iterator = hashSet.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("----------------------------------");
        
        LinkedHashSet<Araba> hashSet2 = new LinkedHashSet<>();
        hashSet2.add(new Araba("34ABC123", "X Marka", "Y Model"));
        hashSet2.add(new Araba("52ABG142", "F Marka", "G Model"));
        hashSet2.add(new Araba("34ABC124", "E Marka", "A Model"));
        hashSet2.add(new Araba("34ABC124", "E Marka", "A Model"));
        Iterator<Araba> iterator2 = hashSet2.iterator();
        while(iterator2.hasNext())
        {
            Araba next = iterator2.next();
            System.out.println(next);
        }
    }    
}
