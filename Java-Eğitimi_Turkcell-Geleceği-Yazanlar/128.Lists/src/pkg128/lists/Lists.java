package pkg128.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class Lists 
{
    public static void main(String[] args) 
    {
        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(new Film("A Filmi","A Yonetmeni",FilmTip.Korku,1999));
        filmList.add(new Film("B Filmi","B Yonetmeni",FilmTip.Aksiyon,2000));
        filmList.add(new Film("C Filmi","C Yonetmeni",FilmTip.Macera,2020));
        filmList.add(new Film("A Filmi","A Yonetmeni",FilmTip.Korku,1999));
        System.out.println("Listedeki eleman sayisi : " + filmList.size());
        System.out.println("-------------------------------");
        for(int i = 0; i < filmList.size(); i++)
        {
            System.out.println(filmList.get(i));
        }
        System.out.println("---------------------------------");
        
        //İstenildiği taktirde istenilen indexteki elemana erişilebilir.
        System.out.println(filmList.get(3));
        //Dizilerde olmayan bir indexe erişilmeye çalışıldıgında hata ile karşılaşılıyordu
        //Arraylistlerde de aynı hatayı alıyoruz herhangi bir değişiklik yok
        System.out.println(filmList.get(6));        
    }    
}
