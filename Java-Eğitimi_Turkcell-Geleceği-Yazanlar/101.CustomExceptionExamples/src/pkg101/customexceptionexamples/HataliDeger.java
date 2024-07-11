package pkg101.customexceptionexamples;

public class HataliDeger extends Exception //Tüm exceptionların base sınıfıdır tanımlanırken kullanılacak yerde throws anahtar kelimesi ile tanıtmak gerekir
{
    public HataliDeger(String degiskenAdi, Object deger) 
    {
        super(degiskenAdi + " " + deger + " olamaz");
    }        
}
