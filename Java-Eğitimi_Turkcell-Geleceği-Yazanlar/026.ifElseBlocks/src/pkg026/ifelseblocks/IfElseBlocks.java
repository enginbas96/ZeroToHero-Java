package pkg026.ifelseblocks;

public class IfElseBlocks 
{
    public static void main(String[] args) 
    {
        int sayi = 10;
        if(sayi > 0) System.out.println("Sayi pozitiftir.");  //Eğer { } blok parantezleri kullanılmazsa sadece ilk komut her zaman çalıştırılır. Komutlar birbirlerinden ; ile ayrılır.      
        System.out.println("Burasi if ile alakali degildir. Her zaman calisir");
        System.out.println("------------------------------------------------------------------");
        if(sayi > 0) //Eğer { } blok parantezleri kullanılmazsa sadece ilk komut her zaman çalıştırılır. Komutlar birbirlerinden ; ile ayrılır.
        System.out.println("Sayi pozitiftir.");        
        System.out.println("Burasi if ile alakali degildir. Her zaman calisir");
        System.out.println("------------------------------------------------------------------");
        if(sayi > 20) System.out.println("Sayi pozitiftir.");   //Şart sağlanmadığından ilk komut çalışmayacaktır.     
        System.out.println("Burasi if ile alakali degildir. Her zaman calisir");
        System.out.println("------------------------------------------------------------------");
        
        if(sayi > 0) //Şart true ise if içerisi işletilir.
        {
            System.out.println("Sayi pozitiftir.");
        }         
        System.out.println("Burasi if blogunun disindadir. Her zaman calisir");
        System.out.println("------------------------------------------------------------------");
        
        boolean sonuc = sayi > 5;
        if(sonuc)
        {
            System.out.println("Sonuc degeri true oldugundan bu yaziyi goruyorsunuz.");
        }     
    }
}
