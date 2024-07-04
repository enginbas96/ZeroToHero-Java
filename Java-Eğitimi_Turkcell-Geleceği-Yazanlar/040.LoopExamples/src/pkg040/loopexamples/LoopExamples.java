package pkg040.loopexamples;

import java.util.Random;
import java.util.Scanner;

public class LoopExamples 
{
    public static void main(String[] args) 
    {
        //Klavyeden 0 girilene kadar değer alan bir program
        Scanner sc1 = new Scanner(System.in);
        int toplam = 0, sayi = 1;
        do
        {
            System.out.print("Lutfen toplanacak rakami giriniz: ");            
            sayi = sc1.nextInt();
            toplam = toplam + sayi ;            
        }
        while(sayi != 0);
        System.out.println("Sayilar toplami: " + toplam);
        
        System.out.println("-----------------------------------------------------");
        
        //Kullanıcı doğru şifre girene kadar şifre isteyen program
        Scanner sc2 = new Scanner(System.in);
        String parola = "1234";
        while(true)
        {
            System.out.println("Lutfen parolanizi giriniz: ");
            String girilenParola = sc2.nextLine();
            if(girilenParola.equals(parola))
            {                
                System.out.println("Sisteme hosgeldiniz.");
                break;
            }            
        }      
        
        System.out.println("-----------------------------------------------------");
        
        // Kullanıcıdan bir deger alınacak bu deger kadar rastgele rakamların ortalaması alınacak
        Scanner sc3 = new Scanner(System.in);    
        Random rand = new Random();
        System.out.print("Kac degerin ortalamasi alinsin:");
        int adet = sc3.nextInt();
        int sayilarToplami = 0;
        for(int i = 0; i < adet; i++)
        {            
            sayilarToplami += rand.nextInt(100);
        }        
        System.out.println("Sayilar toplami: " + sayilarToplami);
        System.out.println("Sayilar ortalamasi: " + ((double)sayilarToplami / (double)adet));
    }    
}
