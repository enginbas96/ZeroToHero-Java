package pkg035.whileexamples;

import java.util.Scanner;

public class WhileExamples
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kac adet yildiz basilsin: ");
        int yildizSayi = sc.nextInt();
        int i = 1;        
        while(i <= yildizSayi)
        {
            System.out.print("*");
            i++;            
        }
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        //İç içe while ile üçgen yapımı
        int j = 1;
        while (j<=yildizSayi)
        {
            int k = 1;
            while(k <= j)
            {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            j++;
        }        
        System.out.println("--------------------------------------------");
        
        int toplam = 0;
        System.out.println("Eklenecek sayiyi giriniz: ");
        int sayi1 = sc.nextInt();
        // While içinde break kullanımı
        //Kullanıcıdan sayı girmesi istenicek 0 girildiğinde tüm sayılar toplanacak
        while(sayi1 != 0)
        {
            System.out.println("Eklenecek sayiyi giriniz: ");
            sayi1 = sc.nextInt();
            toplam =  toplam + sayi1;
        }
        System.out.println("Toplam degeriniz: " + toplam);
        System.out.println("--------------------------------------------");
        
        // Break komutu ile döngüyü kırmak
        System.out.println("Sayiyi giriniz: ");
        int sayi2 = sc.nextInt();
        int toplam1 = 0;
        while(true)
        {
            System.out.println("Sayiyi giriniz: ");
            sayi2 = sc.nextInt();
            toplam1 = toplam1 + sayi2;            
            if(sayi2 == 0){break;} //sayi2 == 0 ise döngüyü kırar
        }
        System.out.println("Toplam = " + toplam1);
        
        
        
    }    
}
