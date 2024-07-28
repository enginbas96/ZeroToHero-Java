package pkg075.polymorphism;

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        Calisan c1 = new Calisan("Engin", "IT", 25200);
        c1.Ozet();
        
        System.out.println("--------------------------------------");
        
        Memur m1 = new Memur("Ahmet", "Yazilim", 20000, "E-Ticaret");
        m1.Ozet();
        
        System.out.println("--------------------------------------");
        
        Calisan m2 = new Memur("Mehmet", "Ogretmen", 47000, "Hayat");
        m2.Ozet();
    }    
}
