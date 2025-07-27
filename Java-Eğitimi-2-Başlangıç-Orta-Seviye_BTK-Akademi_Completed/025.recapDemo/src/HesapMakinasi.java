public class HesapMakinasi
{
    /* //Sayi dizisi toplama "Topla(5,1,2,56,6,12,35,6);" şeklinde bir kullanıma sahiptir
    public void Topla(int... sayi1)
    {
        int sonuc = 0;
        for(int sayilar:sayi1)
        {
            sonuc += sayilar;
        }
    }*/

    public void Topla(double sayi1, double sayi2)
    {
        double Toplam = sayi1 + sayi2;
        System.out.println("Sayılar Toplamı : " + Toplam);
    }

    public void Cikart(double sayi1, double sayi2)
    {
        double Fark = sayi1 - sayi2;
        System.out.println("Sayılar Toplamı : " + Fark);
    }

    public void Carp(double sayi1, double sayi2)
    {
        double Carpim = sayi1 * sayi2;
        System.out.println("Sayılar Toplamı : " + Carpim);
    }

    public void Bol(double sayi1, double sayi2)
    {
        double Bolum = sayi1 / sayi2;
        System.out.println("Sayılar Toplamı : " + Bolum);
    }
}
