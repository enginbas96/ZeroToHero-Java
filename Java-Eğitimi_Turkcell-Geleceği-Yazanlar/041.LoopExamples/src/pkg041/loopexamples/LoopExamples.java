package pkg041.loopexamples;

import java.util.Scanner;

public class LoopExamples 
{
    public static void main(String[] args) 
    {/*
        //Kullanıcının girdiği vize ve final notuna göre geçti kaldı döndüren program        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Lutfen vize notunuzu giriniz: ");
        float vizeNot = sc1.nextFloat();
        System.out.println("Lutfen final notunuzu giriniz: ");
        float finalNot = sc1.nextFloat();
        float ortalama =  (vizeNot * 0.4f)+(finalNot * 0.6f);
        if((ortalama >= 0 && ortalama < 50) || finalNot < 50)
        {
            System.out.println("Malesef kaldiniz.");
        }
        else if(ortalama >= 50 && ortalama <= 100 && finalNot >= 50)
        {
            System.out.println("Tebrikler gectiniz.");
        }
        else
        {
            System.out.println("Girilen notunuz belirli deger araliginda olmadigindan bir hata ile karsilasildi lutfen notlarinizi tekrar giriniz.");
        }        */
        
        //Girilen sayıların tek mi çift mi oldugunu bulan program
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Programi sonlandirmak icin 0 degerini giriniz.");
        System.out.println("-------------------------------------------------------");
        while (true)
        {   
            System.out.print("Sayiyi giriniz: ");
            int sayi = sc2.nextInt();
            if(sayi == 0){break;}
            if(sayi % 2 == 0)
            {
                System.out.println("Sayi cifttir.");
            }
            else
            {
                System.out.println("Sayi tektir.");
            }      
        }     
        System.out.println("0 rakamını girdiniz. Program sonlandirildi.");
    }    
}
