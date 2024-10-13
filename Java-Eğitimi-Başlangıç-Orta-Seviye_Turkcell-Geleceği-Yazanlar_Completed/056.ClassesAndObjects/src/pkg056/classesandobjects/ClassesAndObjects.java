package pkg056.classesandobjects;

public class ClassesAndObjects 
{
    public static void main(String[] args) 
    {
        Daire daire = new Daire();
        daire.x = 10;
        daire.y = 20;
        daire.r = 3;
        
        System.out.println(daire.x);
        System.out.println(daire.y);
        System.out.println(daire.r);
        
        System.out.println("-------------------------------------------");
        
        double alan = daire.alanHesap();
        double cevre = daire.cevreHesap();
        
        System.out.println(alan);
        System.out.println(cevre);
        
        System.out.println("---------------------------------------------");
        
        Daire daire2 = new Daire();
        daire2.r = 30;
        System.out.println(daire2.alanHesap());
        System.out.println(daire2.cevreHesap());               
        
        System.out.println("----------------------------------------------");
        
        Daire daire3 = daire2;
        daire3.r = 40;
        System.out.println(daire3.alanHesap());
        System.out.println(daire3.cevreHesap());
        System.out.println(daire2.alanHesap());
        System.out.println(daire2.cevreHesap());
        //Daire 2 ve daire 3 bellekte aynı yeri işaret ettiğinden dolayı içindeki parametreleri değiştirmek ikisi içinde değişiklik oluşturur        
    }    
}
