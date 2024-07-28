package pkg117.collectionsframeworkset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsFrameworkSet 
{
    public static void main(String[] args) 
    {
        SortedSet<Ogrenci> sortedSet = new TreeSet<>();
        sortedSet.add(new Ogrenci(8, "Muhammer"));
        sortedSet.add(new Ogrenci(4, "Ayşe"));
        sortedSet.add(new Ogrenci(5, "Fatma"));
        sortedSet.add(new Ogrenci(9, "Mustafa"));
        sortedSet.add(new Ogrenci(1, "Cengiz"));
        sortedSet.add(new Ogrenci(7, "Cengiz")); 
        // Farklı bir numarada olmasına rağmen isim sıralaması yaptırdıgımızda değerlerde bir değişiklik olmaz
        //compareTo metodu değerin unique olup olmadığını kontrol eder
        //Ama numara sıralaması yapsaydık farklı numaralarda oldugundan çıktı olarak ekranda görecektik
        //Yani karşılaştırdığı değerlerde bir tane aldığı değerden bir daha almıyor
        System.out.println(sortedSet.size());
        
        Iterator<Ogrenci> iterator = sortedSet.iterator();
        while(iterator.hasNext())
        {
            Ogrenci next = iterator.next();
            System.out.println(next);
        }        
    }    
}
