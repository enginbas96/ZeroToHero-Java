package pkg080.finalsuperthiskeys;

public class FinalSuperThisKeys 
{
    public static void main(String[] args) 
    {
        //Super anahtar kelimesi üst sınıfa referans vermek
        //Üst sınıf metotlarını çağırabilmek ve
        //Alt sınıf ve üst sınıftaki metotlar arasında ayrım yapmaya yarar
        
        Kisi k1 = new Kisi("Mahmut");
        System.out.println("Isim : " + k1.getIsim());
        
        System.out.println("--------------------------------------");
        
        Ogrenci ogrenci1 = new Ogrenci("Mehmet", 1);
        System.out.println("Isim : " + ogrenci1.getIsim());
        System.out.println("No : " + ogrenci1.getNum());
        
        System.out.println("--------------------------------------");
        
        Ogrenci ogrenci2 = new Ogrenci("Engin", 2);
        ogrenci2.bilgileriYazdir();
        System.out.println("-------");
        ogrenci2.ozet();
        
        
    } 
}
