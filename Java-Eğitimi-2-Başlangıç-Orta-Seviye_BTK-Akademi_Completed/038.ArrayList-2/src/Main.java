import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        /// Tip Güvenli ArrayListler
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(52);
        sayilar.add(15);
        sayilar.add(75);
        sayilar.add(1);

        Collections.sort(sayilar); ///Tüm listeler birer koleksiyondur sort islemi sıralama yapmaya yarar.

        for(Integer e : sayilar)
        {
            System.out.println(e);
        }

        System.out.println("------------------------------------------------------");

        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Ordu");
        sehirler.add("Manisa");
        sehirler.add("Adana");

        sehirler.remove("İstanbul");

        Collections.sort(sehirler);

        for(String s : sehirler)
        {
            System.out.println(s);
        }
    }
}