package pkg058.classmembers;

public class ClassMembers 
{    
    public static void main(String[] args) 
    {
        Oyuncu oyuncu1 = new Oyuncu();
        oyuncu1.oyuncuSayisi();
        System.out.println(oyuncu1.saglik);
        for(int i = 0; i < 5; i++ )
        {
            oyuncu1.darbe();
            System.out.println(oyuncu1.saglik);
        }
        oyuncu1.yasam();
        System.out.println(oyuncu1.saglik);
        
        System.out.println("-----------------------------------");
        
        Oyuncu oyuncu2 = new Oyuncu();
        oyuncu1.oyuncuSayisi();        
        
        Oyuncu oyuncu3 = new Oyuncu();
        oyuncu1.oyuncuSayisi();
        
    }    
}
