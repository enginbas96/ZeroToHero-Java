package pkg064.accessmodifiers;

public class AccessModifiers 
{
    public static void main(String[] args) 
    {
         // BURADA ENCAPSULATION ÖRNEĞİ GERÇEKLEŞTİRİLMİŞTİR
        Ogrenci ogr1 = new Ogrenci();
        ogr1.ad = "Mehmet";
        ogr1.soyad = "Ahmet";
        ogr1.numara = 1234;
        // ogr1.yas = -12; burada değişkenin değerini direk değiştirebiliyoruz ve kontrol edilemiyor bunun için metot kullanmalıyız
        ogr1.setYas(12); //Burada istenilen değer girilebilmekte fakat metot içerisindeki kısıtlamalar ile kontrolü sağlanmaktadır
        ogr1.bilgileriYazdir();
    }    
}
