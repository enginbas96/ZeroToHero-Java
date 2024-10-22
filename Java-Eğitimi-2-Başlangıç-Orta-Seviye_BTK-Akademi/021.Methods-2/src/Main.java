public class Main
{
    public static void main(String[] args)
    {
        ekle();
        guncelle();
        sil();

        System.out.println("-----------------------------------------------------");

        String gelenMesaj = beniSelamla("Mahmut");
        System.out.println(gelenMesaj);

        System.out.println("-----------------------------------------------------");

        System.out.println(yilVer());

        System.out.println("-----------------------------------------------------");

        int toplam = topla(15,20);
        System.out.println("Sayıların toplamı : " + toplam);
    }

    //Geri dönüşü olmayan metotlar VOİD metotlar olarak adlandırılır
    public static void ekle()
    {
        System.out.println("Müşteri eklendi.");
    }
    public static void sil()
    {
        System.out.println("Müşteri silindi.");
    }
    public static void guncelle()
    {
        System.out.println("Müşteri güncellendi.");
    }

    //Geri dönüş veren metotlar RETURN anahtar kelimesi ile dönüt verir
    public static String beniSelamla(String ad)
    {
        return "Selam sana " + ad;
    }

    public static int yilVer()
    {
        return 2024;
    }
    public static int topla(int sayi1, int sayi2)
    {
        return sayi1+sayi2;
    }
}