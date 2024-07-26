package pkg159.streamapı;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI 
{
    public static void main(String[] args)
    {
        //Primitive tipler için stream oluşturma yöntemi
        
        //Start ve stop değerleri verilir
        //ilk parametre dahil ikinci parametre dahil değildir yani aşağıdaki 1 ve 10 değerlerinden ekrana 1 2 3 4 5 6 7 8 9 döndürür
        IntStream.range(1, 10)
                .forEach(System.out::println);
        
        System.out.println("--------------------");
        
        Arrays.stream(new int[] {2,6,3,7,4,8})
                .map((x)->x*2)
                .average() //Ortalamasını geri dönderir
                .ifPresent(System.out::println);
        
        System.out.println("--------------------");
        
        int toplam = IntStream.range(1, 101).sum(); //Sum metodu stream içindeki değerleri toplamaya yarar ve terminate bir metotdur
        System.out.println(toplam);
        
        System.out.println("--------------------");
          
        //Object streamleri privimitive streamlere dönüştürmek
        Stream.of("1","2","3","4","5")
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
                 
        System.out.println("--------------------");
        
        //Privimitive değerleri object değerlere dönültürmek
        IntStream.range(1, 10)
                .mapToObj((i) -> i + "a")
                .forEach(System.out::println);
        
        System.out.println("--------------------");
        
        //Primitive streamleri birbirleri arasında dönüştürmek istersek şayet
        Stream.of(5,1,2,6,8)
                .mapToDouble((i) -> (double)i)
                .forEach(System.out::println);
        
        System.out.println("--------------------");
        
        Stream.of(1.1, 2.2, 3.3, 4.4)
                .mapToInt(Double::intValue)
                .max()
                .ifPresent(System.out::println);
        
        System.out.println("--------------------");
        
        Stream.of("Ali", "Ahmet", "Cem", "Burak")
                .filter(new Predicate<String>()
                {
                    @Override
                    public boolean test(String t)
                    {   
                        System.out.println("Calisti");
                        return true;
                    }
                })
                .forEach(System.out::println);
    }    
}