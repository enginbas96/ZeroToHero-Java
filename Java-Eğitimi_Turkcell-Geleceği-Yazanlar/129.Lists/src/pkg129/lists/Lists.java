package pkg129.lists;

import java.util.Vector;

public class Lists 
{    
    public static void main(String[] args)
    {
        //Vektorlerde eleman sayısı önceden berirlenebilir
        //Belirlenen eleman sayısının altında bir değer girilirse herhangi bir sorun teşkil etmez 
        //Fakat eleman sayısını mevcut olan vektorun 2 katına çıkartıp yeni bir vektor nesnesi olusturacak ve değişkenleri ona aktaracaktır
        Vector<String> vector = new Vector<>(2);
        System.out.println("Kapasite : " + vector.capacity());// 2 ile başlayan kapasite eleman eklendikçe arttığını gözlemleyebiliriz
        
        vector.add("Kedi");
        vector.add("Kopek");
        vector.add("Kus");
        
        System.out.println("Kapasite : " + vector.capacity());// 2 ile başlayan kapasite eleman eklendikçe arttığını gözlemleyebiliriz
        
        vector.add("Balik");
        vector.add("At");
        
        System.out.println("Kapasite : " + vector.capacity());// 2 ile başlayan kapasite eleman eklendikçe arttığını gözlemleyebiliriz
        for(int i = 0; i < vector.size(); i++)
        {
            System.out.println(i + "\t" +vector.get(i));
        }
        System.out.println("-----------------------------------");
        System.out.println("Kapasite : " + vector.capacity());
        System.out.println("-----------------------------------");
        
        //Vektor içinde istediğimiz bir eleman var mı yok mu kontrol etmek için contains metodu kullanılır        
        System.out.println(vector.contains("Kedi")); //True-false döndüren bir metotdur
        System.out.println(vector.contains("Karga")); //True-false döndüren bir metotdur
        
        //İstenilen elemanın indexine erişmek için indexOf metodunu kullanabiliriz
        System.out.println(vector.indexOf("Kopek"));//Geriye int değer dönderir eleman yoksa -1 değeri dönderir
        System.out.println(vector.indexOf("Aslan"));//Geriye int değer dönderir eleman yoksa -1 değeri dönderir
        
        System.out.println("-----------------------------------");
        
        vector.clear();//Vektor içindeki tüm elemanlar temizlendi
        System.out.println("Eleman sayisi : " + vector.size());//Vektorun içinde kal değer oldugu ekrana dönderildi
        System.out.println("Kapasite : " + vector.capacity());//Kapasite önceden arttığından içindekiler temizlense bile aynı kalacaktır
    }  
}
