package pkg005.generics;

class Helper
{
    public static String oldGetType(Object o){return o.getClass().getName();}
    
    //Generic tip metot  tanımlaması
    public static <T> String GetType(T degisken)
    {
        //return degisken.getClass().getName();// java.lang.**** olarak bir çıktı veriyor örnek olarak java.lang.Integer, java.lang.String
        
        String[] tip = degisken.getClass().getName().split("\\.");  //Noktaya göre ayırma işlemi yapıldı ve java ve lang ve Integer değerlerini aldı
        return tip[2]; //Bana sadece tipini gösterir
        //return tip[tip.length-1]; //2 yerine sonuncu ifadeyi almayı bu şekilde kullanabiliriz, dizide indexler 0 dan başladığından uzunluk -1 inci elemanı aldık
    }
}

public class Generics 
{
    public static void main(String[] args) 
    {
        int sayi =5;
        System.out.println(Helper.GetType(sayi));
    }    
}
