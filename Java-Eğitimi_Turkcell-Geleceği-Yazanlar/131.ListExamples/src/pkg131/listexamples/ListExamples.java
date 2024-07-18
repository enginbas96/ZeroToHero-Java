package pkg131.listexamples;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ListExamples 
{    
    public static void main(String[] args) 
    {        
        Random random = new Random();
        ArrayList<Bilet> biletList = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            Bilet bilet =  new Bilet(random.nextInt(1000), new Date(), random.nextFloat() * 100);
            biletList.add(bilet);
        }

        ArrayList<Koltuk> koltukList = new ArrayList<>();        
        Scanner sc = new Scanner(System.in);
        int secim = 0;
        int KoltukNumarasi = 0;
        System.out.print("Lutfen secim yapiniz (1 Bilet al), (0 Cikis yap) : ");
        while((secim = sc.nextInt()) != 0)
        {
            Bilet bilet = biletList.get(random.nextInt(biletList.size()));
            biletList.remove(bilet);
            Koltuk koltuk = new Koltuk(++KoltukNumarasi, bilet);
            koltukList.add(koltuk);
            System.out.print("Lutfen secim yapiniz (1 Bilet al), (0 Cikis yap) : ");
        }
        System.out.println("Satilan bilet sayisi : " + koltukList.size());
        
        Iterator<Koltuk> iterator = koltukList.iterator();        
        while(iterator.hasNext())
        {
            Koltuk koltuk = iterator.next();
            System.out.println(koltuk);
        }
    }    
}
