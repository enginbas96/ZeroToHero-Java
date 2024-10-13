package pkg158.streamapı;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI 
{    
    public static void main(String[] args) 
    {
        int [] numaralar = {2,1,6,4,7,5,9};
        Arrays.stream(numaralar)
                .filter((x) -> x>3)
                .map((x) -> x*2)
                .sorted() //default olarak küçükten büyüğe sıralama yapıyor
                .forEach(System.out::println);
        
        System.out.println("-------------------------------");
        
        Stream.of("c","a","e","b")
                .findFirst() //İlk değernini döndürür
                .ifPresent(System.out::println); //ifPresent eğer bir değer döndürüyorsa
    }    
}
