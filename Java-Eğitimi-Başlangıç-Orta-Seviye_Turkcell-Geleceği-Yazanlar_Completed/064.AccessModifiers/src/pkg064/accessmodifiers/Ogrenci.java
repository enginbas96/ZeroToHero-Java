package pkg064.accessmodifiers;

public class Ogrenci
{    
    // BURADA ENCAPSULATION ÖRNEĞİ GERÇEKLEŞTİRİLMİŞTİR
    public int numara = 10;
    public String ad;
    public String soyad;
    private int yas; //Kullanıcı yaş değerini istemeden eksi değerler girebilir bunun için bu değişkeni private yaptım
    
    public void setYas(int y) // Kullanıcının yas degerini değiştmek için set metodunu kullansın
    {
        if(y<6)
        {
            System.out.println("Yas degerini dogru giriniz");
        }
        else
        {
            yas = y;
        }
    }
    
    public void bilgileriYazdir()
    {
        System.out.println("Numara: " + numara);
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yas: " + yas);
    }    
}
