package pkg161.streamapı;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI 
{
    public static void main(String[] args)
    {
        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci(1, "Mehmet", 21));
        ogrenciler.add(new Ogrenci(2, "Engin", 20));
        ogrenciler.add(new Ogrenci(3, "Ali", 17));
        ogrenciler.add(new Ogrenci(4, "Erkan", 19));
        ogrenciler.add(new Ogrenci(5, "Sadi", 17));
        
        //Bu kodu yazdığımızda bize filtrelenmiş bir liste dönecek
        List<Ogrenci> collect = ogrenciler.stream().filter((o) -> o.getIsim().startsWith("E")).collect(Collectors.toList()); 
        collect.forEach(System.out::println);
        
        System.out.println("-----------------------------------------");
        
        List<Ogrenci> collect2 = ogrenciler.stream().filter((o) -> o.getYas() > 19).collect(Collectors.toList()); 
        collect2.forEach(System.out::println);
        
        System.out.println("-----------------------------------------");
        
        Map<Integer, List<Ogrenci>> ogrenciGrup= ogrenciler
                .stream()
                .collect(Collectors.groupingBy((o) -> o.getYas()));
        
        Set<Integer> keySet = ogrenciGrup.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        iterator.forEachRemaining((o) -> System.out.println(o + " " + ogrenciGrup.get(o)));
        
        System.out.println("----------------------------------------");
        
        //YasOrtalamasi        
        double yasOrtalamasi = ogrenciler.stream().collect(Collectors.averagingInt((o) -> o.getYas()));
        System.out.println(yasOrtalamasi);
        
        System.out.println("----------------------------------------");
        
        IntSummaryStatistics Statistics = ogrenciler.stream().collect(Collectors.summarizingInt(o->o.getYas()));
        System.out.println(Statistics);
    }    
}