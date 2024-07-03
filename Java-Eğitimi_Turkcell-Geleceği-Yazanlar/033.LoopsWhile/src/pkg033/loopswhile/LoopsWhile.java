package pkg033.loopswhile;

import java.util.Date;
import java.util.Scanner;

public class LoopsWhile 
{
    public static void main(String[] args) throws InterruptedException 
    {
        //while döngüsünde koşul doğru ise döngü çalışmaya devam eder.
        int i = 0;
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        while(true)
        {
            System.out.println("Isim girin: ");
            String text = sc1.nextLine();
            System.out.println(text.toUpperCase());
            
            System.out.println("----------------------------------------- ");
            
            System.out.println("Sayi girin: ");
            int sayi = sc2.nextInt();
            System.out.println(Math.pow(sayi, 2));
        }
        
        
        /*while (true) // Yukarıdaki while asla bitmeyeceği için bu while hata verir
        {
            System.out.println(new Date());
            Thread.sleep(1000);
        }*/
        
        
        
    }    
}
