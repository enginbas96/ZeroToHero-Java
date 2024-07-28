package pkg039.loopsforeach;

import java.util.Scanner;

public class LoopsForEach 
{
    public static void main(String[] args) 
    {
        //Başlangıç ve bitiş değeri girmeyi gerektirmez, ilk elemandan başlar ve son elemana kadar devam eder.
        
        int[] sayilar = {3,2,6,1,8,0,1,-3};        
        for(int i : sayilar) // ForEach syntax'ı
        {
            System.out.println(i);
        }      
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi buyuklugunu giriniz: ");
        int[] sayilar2 = new int[sc.nextInt()];
        int a = 0;
        for(int i : sayilar2)      
        {
            System.out.print(a+1 +". sayiyi giriniz: ");
            sayilar2[a] = sc.nextInt();   
            a++;
        }
        
        System.out.println("---------------------------------------------------------");
        
        a = 1;
        for(int i : sayilar2)
        {
            System.out.println(a+". sayi = " + i);
            a++;
            if(i == 5)
            {
                break;
            }
        }
    }    
}
