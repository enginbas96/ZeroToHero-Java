package pkg067.ınheritance;
public class Inheritance 
{
    public static void main(String[] args) 
    {
        //Her şekil bir şekildir
        Sekil sekil1 = new Sekil();
        sekil1.setPosX(5);
        System.out.println("X: " + sekil1.getPosX());
        
        System.out.println("-----------------------------------");
        
        //Her kare bir şekildir. kare sınıfı şekil sınıfından türediği için onun özelliklerini kullanabilir.
        Kare kare1 = new Kare();
        kare1.setPosX(5);
        kare1.setPosY(6);
        kare1.setRenk("Kirmizi");
        kare1.setKenarUzunluk(20); // Kenar uzunlugu kare sınıfına ait bir değişkendir ve kare sınıfında tanımlanmıstır bu yüzden şekil sınıfı bu değişkeni kullanamaz
        System.out.println("X: " + kare1.getPosX());
        System.out.println("Y: " + kare1.getPosY());
        System.out.println("Renk: " + kare1.getRenk());
        System.out.println("Uzunluk: " + kare1.getKenarUzunluk());
    }    
}
