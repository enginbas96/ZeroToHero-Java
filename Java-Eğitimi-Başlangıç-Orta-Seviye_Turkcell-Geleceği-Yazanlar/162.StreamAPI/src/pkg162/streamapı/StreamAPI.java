package pkg162.streamapı;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPI
{
    public static void main(String[] args)
    {        
        //Büyük verilerle uğraşırken paralel streamlarla işlem yapmak performans artışı sağlayacaktır
        Arrays.asList("Istanbul","Ankara","Izmir","Ordu","Samsun")
                .parallelStream()
                .filter(new Predicate<String>()
                {
                    @Override
                    public boolean test(String t)
                    {
                        System.out.println("Test : " + Thread.currentThread().getName());
                        return true;
                    }
                })
                .map(new Function<String, String>()
                {
                    @Override
                    public String apply(String t)
                    {
                        System.out.println("Apply : " + Thread.currentThread().getName());
                        return t.toUpperCase();
                    }                    
                })
                .forEach(new Consumer<String>()
                {
                    @Override
                    public void accept(String t)
                    {
                        System.out.println("Accept : " + Thread.currentThread().getName());                        
                    }                    
                });
    }    
}
