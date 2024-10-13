package pkg004.generics;

class Helper
{
    public static String oldGetType(Object o){return o.getClass().getName();} //objenin bilinmez tipi bilinir bir tipe çeviriyor
    
    //Generic tip metot  tanımlaması
    public static <T> String GetType(T degisken){return degisken.getClass().getName();} //Doğrudan objenin tipi kullanılıyor
}

public class Generics 
{
    public static void main(String[] args) 
    {
        int sayi = 5;
        String isim = "Fatih Kaan";
        System.out.println(Helper.oldGetType(sayi));
        System.out.println(Helper.oldGetType(isim));
        
        System.out.println(Helper.GetType(sayi));
        System.out.println(Helper.GetType(isim));        
    }    
}