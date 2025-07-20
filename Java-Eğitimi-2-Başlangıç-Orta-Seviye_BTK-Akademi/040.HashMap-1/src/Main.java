import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String,String> sozluk = new HashMap<String, String>();
        sozluk.put("Book", "Kitap");
        sozluk.put("Table", "Masa");
        sozluk.put("Computer", "Bilgisayar");
        System.out.println(sozluk);
        System.out.println(sozluk.get("Computer"));
        System.out.println("Eleman sayısı: " + sozluk.size());
        System.out.println("--------------------------------------");

        System.out.println("Anahtar elemanları liste şeklinde döndürür: " + sozluk.keySet());
        System.out.println("Değer elemanlarını liste şeklinde döndürür: " +sozluk.values());
        System.out.println("--------------------------------------");

        for(String s: sozluk.keySet())
        {
            System.out.println(s + " : " + sozluk.get(s));
        }
        System.out.println("--------------------------------------");

        sozluk.remove("Computer");
        System.out.println(sozluk.get("Computer")); /// Referansı silindiği için null değerini verir
        System.out.println(sozluk);
        System.out.println("Eleman sayısı: " + sozluk.size());
        System.out.println("--------------------------------------");

        sozluk.clear(); /// İçeriği tamamen sıfırladı.
        System.out.println(sozluk);
        System.out.println("Eleman sayısı: " + sozluk.size());
        System.out.println("--------------------------------------");
    }
}