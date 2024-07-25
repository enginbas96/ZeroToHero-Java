package pkg156.methodreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferences 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(5);
        integers.add(2);
        integers.add(7);
        
        integers.forEach((i) -> System.out.println(i)); //Lambda expressions
        System.out.println("-------------------------");
        
        integers.forEach(System.out::println);//Method referances
        System.out.println("--------------------------");
        
        ArrayList<Bisiklet> bisikletler = new ArrayList<>();
        bisikletler.add(new Bisiklet("X Marka", 8));
        bisikletler.add(new Bisiklet("Y Marka", 3));
        bisikletler.add(new Bisiklet("Z Marka", 5));
        bisikletler.add(new Bisiklet("Q Marka", 7));
        bisikletler.add(new Bisiklet("W Marka", 21));
        
        BisikletKarsilastirici bisikletKarsilastirici = new BisikletKarsilastirici(); 
        Collections.sort(bisikletler, bisikletKarsilastirici::compare);//bisikletKarsilastirici::compare instance metoda referans işlemi için syntax compare class içindeki bir metotdur bisiklet nesensini referans olarak aldı ve içindeki compare metodunu çalıştırdı
        bisikletler.forEach((b)->System.out.println(b)); //Lambda
        System.out.println("---------------------------");
        bisikletler.forEach(System.out::println); 
        System.out.println("---------------------------");
        
        List<String> markalar = new ArrayList<>();
        markalar.add("X Marka");
        markalar.add("Y Marka");
        markalar.add("Z Marka");
        
        
        List<Bisiklet> bisikletList = markalar.stream().map(new Function<String, Bisiklet>()
        {
            @Override
            public Bisiklet apply(String t) { return new Bisiklet(t); }            
        }).collect(Collectors.toList());     
        bisikletList.forEach((s)-> System.out.println(s.getMarka()));
        System.out.println("----------------------------------");
        //Yukarıdaki gibi bir uzun yol yerine daha kısa yol olan yöntem aşağıdaki gibidir
        List<Bisiklet> bisikletList2 = markalar.stream().map(Bisiklet::new).collect(Collectors.toList());
        bisikletList2.forEach((s) -> System.out.println(s.getMarka()));
        bisikletList2.forEach(System.out::println);
    }    
}
