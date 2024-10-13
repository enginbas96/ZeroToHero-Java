package pkg006.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Helper
{
    public static String oldGetType(Object o){return o.getClass().getName();}
    
    //Generic tip metot  tanımlaması
    public static <T> String GetType(T degisken)
    {        
        String[] tip = degisken.getClass().getName().split("\\.");
        return tip[2]; //Bana sadece tipini dönderir
    }
    
    //Generic type kullanılarak olusturulacak yeni liste ve dizilerin ayrı ayrı tanımlama yapılmadan tek metot ile gerçekleştirilmesi
    public static <T> void butunDegerleriEkle(List<T> liste, T[] array)
    {
        for(T eleman: array){   liste.add(eleman);  }
    }
}

public class Generics 
{    
    public static void main(String[] args) 
    {
        //Aşağıda diziden elemanları for döngüsü ile bir listeye aktarma kodları 
        Integer[] sayilar = {5, 4, 8, 9, 45, 55, 95, -5, 0};
        List<Integer> sayilarList = new ArrayList<>();
        for(int i: sayilar){    sayilarList.add(i);    }
        System.out.println("Sayilar List : " + sayilarList.size());
        
        //butunDegerleriEkle metodu ile for döngüsünün içindeki parametreleri 
        //sürekli tipini belirlemekle zaman kaybetmek yerine generic type kullanarak çözüme ulaşıldı
        String[] kelimeler = {"Araba", "Kalem", "Kitap", "Masa"};
        List<String> kelimelerList = new ArrayList<>();
        Helper.butunDegerleriEkle(kelimelerList, kelimeler);
        System.out.println("Kelimeler List : " + kelimelerList.size());        
    }   
 }    

