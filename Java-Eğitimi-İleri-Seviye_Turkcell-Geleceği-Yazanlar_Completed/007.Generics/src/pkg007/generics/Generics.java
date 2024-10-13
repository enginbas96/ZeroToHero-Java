package pkg007.generics;

import java.util.ArrayList;
import java.util.List;

class Helper
{    
    public static <T> void butunDegerleriEkle(List<T> liste, T[] array)
    {
        for(T eleman: array){   liste.add(eleman);  }
    }
    
    public static <T> void degerleriYazdir(List<T> liste)
    {
        for(T deger: liste){System.out.print(deger + "  ");}
        System.out.println("");
    }
    
    //<?> kullanmak aynı <T> tanımlaması yapmaya benzer ama burada metoda bir kat daha esneklik ve okunaklık sağladık
    public static void ListeyiYazdir(List<?> liste) 
    {
        for(Object deger: liste){System.out.print(deger + "  ");} //Object deger yapmadaki amaç herşeyin bir obje olmasıdır
        System.out.println("");
    }
}

public class Generics 
{    
    public static void main(String[] args) 
    {
        Integer[] sayilar = {5, 4, 8, 9, 45, 55, 95, -5, 0};
        List<Integer> sayilarList = new ArrayList<>();
        for(int i: sayilar){    sayilarList.add(i);    }
        System.out.println("Sayilar List : " + sayilarList.size());             
        /*for(int i = 0; i < sayilarList.size(); i++){System.out.print(sayilarList.get(i) + "  ");}
        System.out.println("");
        for(int i : sayilarList){System.out.print(i + "  ");}
        System.out.println("");*/
        Helper.degerleriYazdir(sayilarList);
        
        //Metodumuz sayesinde esneklik kazandık.
        List<String> isimler = new ArrayList<>()
        {
            {
                add("Ali");
                add("Veli");
                add("Mehmet");
            }
        };        
        Helper.degerleriYazdir(isimler);
        
        System.out.println("----------------------------------");
        
        Helper.ListeyiYazdir(sayilarList);
        Helper.ListeyiYazdir(isimler);
    }   
 }    

