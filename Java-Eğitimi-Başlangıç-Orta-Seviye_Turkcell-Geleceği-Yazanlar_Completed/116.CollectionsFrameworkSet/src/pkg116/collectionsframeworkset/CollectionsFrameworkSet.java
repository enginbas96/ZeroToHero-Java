package pkg116.collectionsframeworkset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsFrameworkSet
{
    public static void main(String[] args) 
    {
        //Sorted setin içine girilen değerler sıralanmış olarak verilir
        //Adından da anlaşılacağı gibi içerisine atılan elemanları sıralayarak tutar
        SortedSet<Integer> sortedSet = new TreeSet<>(); 
        sortedSet.add(3);
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(0);
        
        //iterator collectionlar içerisinde sırayla dönmeyi yarayan bir nesnedir
        Iterator<Integer> iterator = sortedSet.iterator();
        while(iterator.hasNext())//İteratörün dönülecek değeri var ise döngü devam eder
        {
            Integer next = iterator.next(); //İteratörün o anki değerini almak için iterator.next() metodu kullanılır
            System.out.println(next);         
        }
        
        System.out.println("---------------------------------------");
        
        SortedSet<String> sortedSet2 = new TreeSet<>(); //Değerler string olunca alfabetik sıralama yapmaktadır
        sortedSet2.add("Ahmet");
        sortedSet2.add("Mehmet");
        sortedSet2.add("Ali");
        sortedSet2.add("Veli");
        
        //iterator collectionlar içerisinde sırayla dönmeyi yarayan bir nesnedir
        Iterator<String> iterator2 = sortedSet2.iterator();
        while(iterator2.hasNext())//İteratörün dönülecek değeri var ise döngü devam eder
        {
            String next = iterator2.next(); //İteratörün o anki değerini almak için iterator.next() metodu kullanılır
            System.out.println(next);         
        }
    }    
}
