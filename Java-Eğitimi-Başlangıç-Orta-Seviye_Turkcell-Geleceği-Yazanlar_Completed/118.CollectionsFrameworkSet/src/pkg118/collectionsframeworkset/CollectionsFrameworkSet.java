package pkg118.collectionsframeworkset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsFrameworkSet 
{
    public static void main(String[] args) 
    {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.add(5);
        navigableSet.add(4);
        navigableSet.add(3);
        navigableSet.add(1);
        navigableSet.add(6);
        System.out.println(navigableSet.size()); //Aynı değerleri ekrana bastırmaz, değerler unique olmak zorundadır
        
        System.out.println("-------------------");
        
        Iterator<Integer> iterator = navigableSet.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("---------------------------");
        
        //İçine paremetre olarak verilen değere eşit olanı veya en yakın üst değeri verecektir
        System.out.println(navigableSet.ceiling(2));        
        System.out.println(navigableSet.ceiling(9));//Verilen değer veya üstünde bir değer yoksa null değerini dönderir
        
        System.out.println("---------------------------------");
        
        //Ceiling'in tersine parametre olarak verilen değere eşit veya en yakın alt değeri verecektir
        System.out.println(navigableSet.floor(2));
        System.out.println(navigableSet.floor(9));    
        System.out.println(navigableSet.floor(0));//Verilen değer veya altında bir değer yoksa null değerini dönderir
        
        System.out.println("---------------------------------");
        
        //floor metoduna benzer ama içine girilen değeri önemsemez en yakın alt değeri dönderir
        System.out.println(navigableSet.lower(5));
        //Ceiling metoduna benzer ama girilen değeri önemsemez ve en yakın üst değeri dönderir
        System.out.println(navigableSet.higher(2));
        //Bu metotlar da verilen değerin yakınında değer yoksa null donderir
        System.out.println(navigableSet.higher(9));
        System.out.println(navigableSet.lower(1));
        
        System.out.println("------------------------------------");
        
        // içine girilen parametreye kadar olan değerleri ekrana yazdıran metot headSet'tir ve geriye SortedSet  dönderir
        
        // headSet'in bir diğer parametresi de boolean bir değerdir
        // eğer bu parametreyi true donderirsek içine girilen değeri de dahil ederek ekrana yazdırır
        SortedSet<Integer> sortedSet = navigableSet.headSet(4); 
        //SortedSet<Integer> sortedSet = navigableSet.headSet(4,true); //bool parametre true ise 4 ü de yazdırır false ise 4 e kadar olan degerleri yazdırır
        Iterator<Integer> iterator2 = sortedSet.iterator();
        while(iterator2.hasNext())
        {
            Integer next = iterator2.next();
            System.out.println(next);
        }
    }
}
