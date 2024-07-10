package pkg093.anonymousclasses;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousClasses 
{
    public static void main(String[] args) 
    {
        //Anonim sınıflar kodu okunabilir hale getirir
        //Aynı anda deklare edilir ve ilklendirilir (yapıcı metotlar gibi)
        //Bir sınıf veya arayüz kullanılarak ilklendirme yapılabilir.
        //Sabit (final) değişkenler haricinde değişkene sahip olamazlar
        
        Elma[] elmalar = 
        {
            new Elma(10),
            new Elma(30),
            new Elma(20),
            new Elma(40),
        };
        
        System.out.println(Arrays.toString(elmalar));
        Arrays.sort(elmalar, new ElmaKarsilastir());
        System.out.println(Arrays.toString(elmalar));
        System.out.println("-------------------------------------");
        
        Arrays.sort(elmalar, new Comparator() //Anon Sınıf Sadece burada kullanılacak sınıflar için oluşturulur aksi halde çok maliyetlidir
        {
            @Override
            public int compare(Object o1, Object o2) 
            {
                Elma e1 = (Elma) o1;
                Elma e2 = (Elma) o2;
                return e1.getAgirlik() - e2.getAgirlik();
            }
        });
        System.out.println(Arrays.toString(elmalar));
    }    
}
