package pkg069.ınheritance;

public class Inheritance 
{
    public static void main(String[] args)
    {
        Kare kare1 = new Kare();
        kare1.setKenarUzunluk(15);
        kare1.alanHesapla();
        
        System.out.println("------------------------------------");
        
        Dikdortgen dd1 = new Dikdortgen();
        dd1.setYukseklik(4);
        dd1.setGenislik(5);
        dd1.alanHesapla();
        
        System.out.println("-------------------------------------");
        
        Daire daire1 = new Daire();
        daire1.setYaricap(3);
        daire1.alanHesapla();
        
        System.out.println("-------------------------------------");
        
        Sekil sekil1 = new Sekil();
        sekil1.alanHesapla();
    }    
}
