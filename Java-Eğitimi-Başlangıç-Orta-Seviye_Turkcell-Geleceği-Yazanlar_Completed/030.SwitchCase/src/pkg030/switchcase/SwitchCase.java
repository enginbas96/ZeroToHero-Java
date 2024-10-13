package pkg030.switchcase;

import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String[] args) 
    {
        // Switchler çoklu koşul ifadesidir. uzun if else bloklarından daha iyi olabilir.
        // Case ifadeleri aynı olamaz. Switch içindeki koşula bakılır ve direk ilgili case'e gidilir
        // Switch ile if arasındaki fark birisi if true-false kontrolü yapar; switch case sadece eşitlik kontrolü yapar
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Haftanin Gunu: ");
        int gun = sc.nextInt();
        
        switch(gun)
        {
            case 1: 
                System.out.println("Pazartesi");
            break;
            case 2: 
                System.out.println("Sali");
            break;
            case 3: 
                System.out.println("Carsamba");
            break;
            case 4: 
                System.out.println("Persembe");
            break;
            case 5: 
                System.out.println("Cuma");
            break;
            case 6 : 
                System.out.println("Cumartesi");
            break;
            case 7: 
                System.out.println("Pazar");                
            break;
            default: 
                System.out.println("Yanlis deger girdiniz.");
            break;
        }
        
        System.out.println("Burasi her zaman calisir.");
        
    }
}
