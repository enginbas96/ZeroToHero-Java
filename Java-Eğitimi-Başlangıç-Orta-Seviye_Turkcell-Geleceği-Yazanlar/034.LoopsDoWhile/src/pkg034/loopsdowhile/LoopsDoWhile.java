package pkg034.loopsdowhile;

import java.util.Scanner;

public class LoopsDoWhile
{
    public static void main(String[] args)
    {
        //Do while dongusu while döngüsünün aynısıdır ama en az 1 kere çalışır
        int i = 0;
        int j = 0;
        do // çalıştırılır ve şart kontrol edilir
        {
            System.out.println("Do While " + i);
            i++;
        } 
        while(i < 0); 
        
        System.out.println("------------------------------------------------");
        
        while(j < 0) // şart kontrol edilir ve çalıştırılır
        {
            System.out.println("While " + j);
            j++;
        }
       
        System.out.println("------------------------------------------------");
        
        //Basit bir do while örneği
        
        Scanner sc = new Scanner(System.in); 
        String sifre;
        do
        {
            System.out.println("Lutfen sifrenizi giriniz: "); 
            sifre = sc.nextLine();
        }
        while(!(sifre.equals("1234"))); // Değilini alıyoruz
        System.out.println("Sifre dogru sekilde girilmistir. Sisteme hosgeldiniz.");
        
    }       
}
