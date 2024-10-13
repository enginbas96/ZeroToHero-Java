package pkg125.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
    public static void main(String[] args) 
    {        
        //LinkledList bağlı listeler veri yapısını sağlar
        //Depolamak için ağaç kullanan koleksiyon yaratır
        //Depolanan elemanları artan sırayla sıralı olarak kayıt eder 
        //Buradaki artan sıra liste elemanını temsil eder içindeki değişkeni değil
        LinkedList<Integer> sayi = new LinkedList<>();
        sayi.add(10);
        sayi.add(20);
        sayi.add(30);
        sayi.add(10);
        
        sayi.addFirst(0);
        sayi.add(2,2);
        sayi.add(3,3);
        sayi.add(5,5);
        sayi.addFirst(22);
        sayi.addLast(55);
        
        System.out.println(sayi.size());//Linkedlistler unique değerler tutmazlar böylece aynı değerleri istenilen kadar verilebilir.
        
        System.out.println("--------------------------");
        
        //Eleman eklendikçe bağlı listelerdeki elemanlar kayacaktır
        //Ekleme sırasına göre ekrana geri döner fakat belirli bir indexine değer eklenmiş ise arada değerler eklenebilir
        Iterator<Integer> iterator = sayi.iterator(); 
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("----------------------------");
        
        System.out.println(sayi.get(5));//Listedeki 5. elemanı ekrana getirir    
        System.out.println(sayi.get(sayi.size()-1)); // Buradaki get metodu içerisinde sanki listenin sonuncu elemanının sayısı girilmiş gibi işlem yaptırır
        System.out.println(sayi.getLast());//sayi.size()-1 ile aynı işleve sahiptir
        System.out.println(sayi.getFirst());
         
        System.out.println("----------------------------");
        
        //0'ıncı indexten başlayarak tüm değerleri dolanır ve ilk gördüğü 10'un indexini ekrana yazdırır
        //ilerideki indexlerde başka bir 10 dahi olsa ilk gördüğünü döndürür ve bırakır
        System.out.println(sayi.indexOf(10));
        
        //Eğer sondan geriye doğru bir tarama yaptırmak istiyorsak lastindexof metodu kullanılır
        System.out.println(sayi.lastIndexOf(10));
        
        //Eğer bir değer bulamazsa -1 değerini dönderir
        System.out.println(sayi.indexOf(123));        
        
        System.out.println("----------------------------");
        
         //Remove metoduna parametre gönderilmediğinde listenin en başındaki elemanı kaldırır
         sayi.remove(); //İstenilen indexteki elemanı kaldırmaya yarıyor
         sayi.remove(1);
         sayi.add(1,1);
         
        iterator = sayi.iterator(); 
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }    
}