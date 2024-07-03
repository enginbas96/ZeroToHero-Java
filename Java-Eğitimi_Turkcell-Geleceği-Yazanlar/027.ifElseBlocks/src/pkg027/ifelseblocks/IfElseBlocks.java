package pkg027.ifelseblocks;

import java.util.Scanner;

public class IfElseBlocks
{
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = sc.nextInt();
        if(sayi >= 0)
        {
            System.out.println("Girilen sayi pozitiftir.");
        }
        else //İf içerisinde girilen koşul doğru değilse else bloğu otomatik olarak çalıştırılır.
        {
            System.out.println("Girilen sayi negatiftir.");
        }
        System.out.println("----------------------------------------------");
        
        System.out.println("Burasinin ifElse bloklariyla alakasi olmadigindan her zaman calisir.");
        System.out.println("----------------------------------------------");
        
        //Bu kadar basit iki sonucu olan işlemler için aşağıdaki kullanımda gerçekleştirilebilir
        System.out.println(sayi >= 0 ? "Sayi Pozitiftir" : "Sayi Negatiftir");
        System.out.println("----------------------------------------------");
    }    
}
