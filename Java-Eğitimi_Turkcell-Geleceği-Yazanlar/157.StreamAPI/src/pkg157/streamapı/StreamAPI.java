package pkg157.streamapı;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI
{
    public static void main(String[] args) 
    {
        ArrayList<String> arrayList = new ArrayList<>();
        Stream stream = arrayList.stream();
        
        arrayList.add("Alı");
        arrayList.add("Ahmet");
        arrayList.add("Mehmet");
        arrayList.add("Veli");
        
        //Uygulamamız aşırı derecede kısaldı ve okunaklığı arttı, lambda bize gerçekten kolaylık sağlıyor
        arrayList.stream()
            .filter((s)->s.startsWith("M")) //Stream üzerinde bir filtre uyguladık
            .map((t)->t.toUpperCase()) //Daha sonra haritaladık yani değiştirdik
            .sorted((o1,o2)->o1.compareTo(o2)) //Daha sonra sıralama işlemi yaptık
            .forEach((i)->System.out.println(i)); //Daha sonrada elemanları tek tek gezerek ekrana bastırdık
        
        /*//Yukarıdaki işlemlerin uzun hali anonymous class ile yapımı aşağıdaki gibidir. iki yöntemde doğrudur fakat yukarıdaki daha kısa ve okunaklıdır
        Stream<String> stream2 = stream.filter(new Predicate<String>()
        {
            @Override
            public boolean test(String t)
            {
                return t.startsWith("A");
            }
        });
        
        Stream<String> stream3 = stream2.map(new Function<String, String>()
        {
            @Override
            public String apply(String t)
            {
               return t.toUpperCase();
            }
        });
        
        Stream<String> stream4 = stream3.sorted(new Comparator<String>() //intermediate metod geriye stream değer döndürür
        {
            @Override
            public int compare(String o1, String o2) 
            {
                return o1.compareTo(o2);
            }            
        });
        
        stream4.forEach(new Consumer<String>() //Foreach metodu terminate metod yani geriye bir stream döndürmüyor
        {
            @Override
            public void accept(String t) 
            {
                System.out.println(t);
            }            
        });
        */        
    }    
}