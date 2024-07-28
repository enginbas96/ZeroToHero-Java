package pkg042.loopexamples;

import java.util.Scanner;

public class LoopExamples 
{
    public static void main(String[] args)
    {
        //Kullanıcının girdiği yazıyı tersten yazdırma.
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Lutfen tersten yazilacak metni giriniz: ");
        String text = sc1.nextLine();
        String textTers = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            textTers += text.charAt(i);
        }
        System.out.println(textTers);
        
        System.out.println("----------------------------------------------");
        
        //Girilen sayının faktoriyelini hesaplayan uygulama
        
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Lutfen faktoriyeli alinacak sayiyi giriniz: ");
        int sayi = sc2.nextInt();
        int faktoriyel = 1;
        for(int i = 1; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i ;
        }
        System.out.println("Girilen sayinin faktoriyeli: " + faktoriyel);
        
        
    }    
}
