package pkg062.accessmodifiers;

public class AccessModifiers 
{
    public static void main(String[] args)
    {
        Ogrenci ogr1 = new Ogrenci();
        ogr1.numaraYazdir();  // Örnek bir get metodu 
        /* ad, soyad, numara değişkenleri ogrenci sınıfı içerisinde private olarak tanımlandıgından başka bir sınıfta doğrudan erişilemez
            Daha sonra göreceğimiz get/set metotları ile değişiklikler yapıldıgını göreceğiz
            ogr1.ad = "Mehmet";
            ogr1.soyad = "Ahmet";
            ogr1.numara = "12345";
        */
    }    
}
