package pkg074.polymorphism;

public class Polymorphism 
{
    public static void main(String[] args) 
    {
        Sekil sekil = new Sekil();
        sekil.Alan();
        
        System.out.println("------------------------------------");
        
        Kare kare = new Kare(5);
        kare.Alan();
        kare.setUzunluk(3);
        kare.Alan();
        
        System.out.println("------------------------------------");
        
        Daire daire = new Daire(6);
        daire.Alan();
        daire.setYariCap(5);
        daire.Alan();
        
        System.out.println("------------------------------------");
        
        Dikdortgen dd = new Dikdortgen(6, 5);
        dd.Alan();
        dd.setGenislik(7);
        dd.setYukseklik(2);
        dd.Alan();
        
        System.out.println("------------------------------------");
        
        Sekil s1 = new Kare(5);
        s1.Alan();
        s1 = new Daire(3);
        s1.Alan();
        s1 = new Dikdortgen(7, 1);
        s1.Alan();
        s1 = new Sekil();
        s1.Alan();
        
    }    
}
