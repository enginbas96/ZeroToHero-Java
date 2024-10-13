package pkg028.ifelseblocks;

import java.util.Scanner;

public class IfElseBlocks 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = sc.nextInt();
        
        //İçiçe if kullanımı
        if(sayi < 100)
        {
            System.out.println("Sayi 100'den kucuk.");
            if(sayi < 50)
            {
                System.out.println("Sayi 50'den de kucuk.");
            }
            else
            {
                System.out.println("Ama sayi 50'den buyuk.");
            }
        }
        else
        {
            System.out.println("Sayi 100'den buyuk.");
        }
        
        System.out.println("----------------------------------------------------");
        
        if(sayi < 10 && sayi >= 0)
        {
            System.out.println("Sayi tek basamaklidir.");
        }
        else if (sayi < 100 && sayi > 9) //Değilse eğer bloğudur arka arkaya if kullanmak tüm ifleri kontrol ettirir ama elseif ustteki if sartları saglanmadıgında calısır.
        {
            System.out.println("Sayi iki basamaklidir.");
        }
        else if(sayi < 1000 && sayi > 99)
        {
            System.out.println("Sayi uc basamaklidir.");
        }
        else
        {
            System.out.println("Girilen sayi 0 ve 999 arasinda yer almamaktadir.");
        }
    }    
}
