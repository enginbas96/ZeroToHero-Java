public class Main
{
    public static void main(String[] args)
    {
        //Hesap makinası uygulaması
        HesapMakinasi hm = new HesapMakinasi();
        double sayi1 = 23, sayi2 = 13;
        hm.Topla(sayi1,sayi2);
        hm.Cikart(sayi1,sayi2);
        hm.Carp(sayi1,sayi2);
        hm.Bol(sayi1,sayi2);
    }
}