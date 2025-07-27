public class Main
{
    public static void main(String[] args)
    {
        int toplam = topla(1,5434,12,34,1343,445,234,675,23,467,234,7);
        System.out.println("Sayıların toplamı : " + toplam);
    }
    // ... ifadesine dikkat edilmeli
    //3 adet nokta (...) burada ki anlamı birden çok parametre verildiğinde otomatik olarak diziye çeviriyor
    //Burada sayiları diziye dönderiyor
    public static int topla(int... sayilar)
    {
        int toplam = 0;
        for(int i:sayilar)
        {
            toplam += i;
        }
        return toplam;
    }
}