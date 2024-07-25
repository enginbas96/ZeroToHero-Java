package pkg154.datetimeexamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeExamples 
{
    public static void main(String[] args)
    {
        //Tarih için hesap makinesi
        Scanner sc = new Scanner(System.in);
        System.out.print("Tarih : ");
        LocalDate tarih = LocalDate.parse(sc.nextLine());
        
        System.out.print("Saat : ");
        LocalTime saat = LocalTime.parse(sc.nextLine());
        
        LocalDateTime tarihSaat = LocalDateTime.of(tarih, saat);
        System.out.println("Tarih ve Saat : " + tarihSaat);
        
        System.out.println("Islem (0 : Ekle) (1 : Cikar)");
        String islem = sc.nextLine();               
        System.out.println("-------------------");
        if(islem.equals("0") || islem.equals("1"))
        {
            ChronoUnit[] chronoUnits = ChronoUnit.values();
            System.out.println("Birimler ve Kodlari");
            for(int i = 0; i < chronoUnits.length; i++)
            {                
                System.out.print(chronoUnits[i] + " : " + (i) + "  -  ");
            }
            System.out.println("-------------------");
            System.out.print("Islem Yapmak Istediginiz Birimin Kodunu Giriniz : ");
            ChronoUnit birim = chronoUnits[Integer.parseInt(sc.nextLine())];
            System.out.println("Secilen Birim : " + birim);
            System.out.println("-------------------");
            System.out.print("Eklenecek veya Cikarilacak Deger : ");
            int deger = Integer.parseInt(sc.nextLine());
            
            if(islem.equals("0"))
            {
                System.out.println("Son Tarih : " + tarihSaat.plus(deger,birim));
            }                    
            else
            {
                 System.out.println("Son Tarih : " + tarihSaat.minus(deger,birim));
            }
        }
        else
        {
            System.out.print("Lutfen 0 veya 1 giriniz : ");
        }        
    }    
}