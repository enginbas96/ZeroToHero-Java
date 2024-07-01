package pkg013.staticınitializers;

public class StaticInitializers 
{
    static int i ;
    static int j = 10;
    
    //Program başlatıldığında static block, main metodunda önce çalıştırılır
    static 
    {
        System.out.println("Static Blok");
        i = 20;
        j = 30;
        int k = 200; // main metodundan erişilemez sadece static blogundan erişilebilir
        System.out.println(k);
        System.out.println("------------------------------------");
    }
    
    public static void main(String[] args)
    {
        System.out.println(i);
        System.out.println(j);
    }    
}
