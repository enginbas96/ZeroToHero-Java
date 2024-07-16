package pkg124.setexamples;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        SortedSet<Ogrenci> sortedSet = new TreeSet<>();
        System.out.print("Ogrenci eklemek icin (E), uygulamadan cikmak icin (X) giriniz : ");
        String giris = sc.nextLine();             
        while(giris.equals("E"))     
        {
            System.out.print("Numara : ");
            int numara = Integer.parseInt(sc.nextLine());
            System.out.print("Ad : ");
            String ad = sc.nextLine();
            System.out.print("Soyad : ");
            String soyad = sc.nextLine();
            System.out.print("Sinif : ");
            String sinif = sc.nextLine();   
            sortedSet.add(new Ogrenci(numara, ad, soyad, sinif));
            System.out.print("Ogrenci eklemek icin (E), uygulamadan cikmak icin (X) giriniz.");
            giris = sc.nextLine(); 
        }
        System.out.println("Toplan Ogrenci Sayisi : " + sortedSet.size());
        
        Iterator<Ogrenci> iterator = sortedSet.iterator();        
        while(iterator.hasNext())
        {
            Ogrenci next = iterator.next();
            System.out.println(next);
        }
        
        
        
        
    }    
}
