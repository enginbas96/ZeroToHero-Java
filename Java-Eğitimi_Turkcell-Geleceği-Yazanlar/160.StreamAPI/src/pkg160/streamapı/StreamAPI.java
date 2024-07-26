package pkg160.streamapı;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI 
{
    public static void main(String[] args)
    {
        /*Stream.of(1,4,5,6,11)
                .filter(new Predicate<Integer>()
                {
                    @Override
                    public boolean test(Integer t) 
                    {
                        System.out.println("-------------------");
                        System.out.println("Tested");
                        return t > 2;
                    }
                })
                /*.forEach(new Consumer<Integer>()
                {
                    @Override
                    public void accept(Integer t) 
                    {
                        System.out.println("Accept");
                        System.out.println(t);
                    }                    
                })
                .anyMatch(new Predicate<Integer>()
                {
                    @Override
                    public boolean test(Integer t)
                    {
                        System.out.println("Tested 2");
                        return t == 5;
                    }
                });
        
        System.out.println("-------------------------------------------------------");
        
        Stream.of("b1","a2","d3","e1")
                .map(new Function<String, String>() //Değiştirme yani map işlemi
                {
                    @Override
                    public String apply(String t) 
                    {
                        System.out.println("--------------");
                        System.out.println("MAP");
                        return t.toUpperCase();
                    }                    
                })
                .filter(new Predicate<String>() //Filtreleme işlemi                
                {
                    @Override
                    public boolean test(String t) 
                    {
                        System.out.println("FILTER");
                        return t.startsWith("A");
                    }
                    
                })
                .forEach(new Consumer<String>()
                {
                    @Override
                    public void accept(String t) 
                    {
                        System.out.println(t);                        
                    }                    
                });
        
        //Yukarıdaki kodda ilk önce map işlemi daha sonra filter işlemi çalıştırıldığından tüm verileri mapliyor 
        //yani bu da büyük sayıdaki verilerde sorun teşkil edecek hale gelebilir
        //Ama önce Filter işlemini yaparsak map işlemini en aza indirgeyeceğiz çünkü filtreden geçen veriler maplenmiş olacak
        
        Stream.of("b1","a2","d3","e1")
                .filter(new Predicate<String>() //Filtreleme işlemi                
                {
                    @Override
                    public boolean test(String t) 
                    {
                        System.out.println("--------------");                        
                        System.out.println("FILTER");
                        return t.startsWith("a");
                    }                    
                })
                .map(new Function<String, String>() //Değiştirme yani map işlemi
                {
                    @Override
                    public String apply(String t) 
                    {
                        System.out.println("MAP");
                        return t.toUpperCase();
                    }                    
                })                
                .forEach(new Consumer<String>()
                {
                    @Override
                    public void accept(String t) 
                    {
                        System.out.println(t);                        
                    }                    
                });*/
        
        System.out.println("-------------------------------------------------------");
        
        Stream.of("b1","a2","d3","e1")
                .sorted(new Comparator<String>()
                {
                    @Override
                    public int compare(String o1, String o2) 
                    {
                        System.out.println("SORTED");
                        return o1.compareTo(o2);
                    }                    
                })
                .filter(new Predicate<String>() //Filtreleme işlemi                
                {
                    @Override
                    public boolean test(String t) 
                    {                        
                        System.out.println("FILTER");
                        return t.startsWith("a");
                    }                    
                })
                .map(new Function<String, String>() //Değiştirme yani map işlemi
                {
                    @Override
                    public String apply(String t) 
                    {                        
                        System.out.println("MAP");
                        return t.toUpperCase();
                    }                    
                })                
                .forEach(new Consumer<String>()
                {
                    @Override
                    public void accept(String t) 
                    {
                        System.out.println(t);                        
                    }                    
                });
        
        System.out.println("----------------------------------------------------------");
        
        Stream.of("b1","a2","d3","e1")
                .filter(new Predicate<String>() //Filtreleme işlemi                
                {
                    @Override
                    public boolean test(String t) 
                    {                        
                        System.out.println("FILTER");
                        return t.startsWith("a");
                    }                    
                })
                .sorted(new Comparator<String>()
                {
                    @Override
                    public int compare(String o1, String o2) 
                    {
                        System.out.println("SORTED");
                        return o1.compareTo(o2);
                    }                    
                })
                .map(new Function<String, String>() //Değiştirme yani map işlemi
                {
                    @Override
                    public String apply(String t) 
                    {                        
                        System.out.println("MAP");
                        return t.toUpperCase();
                    }                    
                })                
                .forEach(new Consumer<String>()
                {
                    @Override
                    public void accept(String t) 
                    {
                        System.out.println(t);                        
                    }                    
                });
        //FİLTRELEME İŞLEMLERİ KAYNAKLARI VERİMLİ KULLANMAK İÇİN MÜMKÜNSE EN BAŞTA YAPILMALI
    }    
}