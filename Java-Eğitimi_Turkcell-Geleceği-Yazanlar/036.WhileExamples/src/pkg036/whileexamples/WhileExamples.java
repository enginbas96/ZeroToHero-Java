package pkg036.whileexamples;

import java.util.Scanner;

public class WhileExamples 
{
    public static void main(String[] args) 
    {
        //1 ile 100 arasındaki çift sayıları ekrana yazdıran kod
        int i = 1;
        while(true)
        {
            if(i > 100){break;}
            else if(i % 2 == 0){System.out.println(i + " cifttir.");}   
            i++;
        }
        
        int x = 1, y = 100;
        while(x <= y)
        {
            if(x > y){break;}
            else if(x % 2 == 0){System.out.println(x + " cifttir.");}   
            x++;
        }
        System.out.println("-------------------------------------------------------------");
        //Kullanıcıdan 10 tane sayı alınacak bu sayılardan en büyüğü ve en küçüğü ekrana yazdırılacak
        Scanner sc = new Scanner(System.in);        
        int enBuyuk = Integer.MIN_VALUE; // int'in alabileceği minimum değer
        int enKucuk = Integer.MAX_VALUE; // int'in alabileceği maximum değer
        int sayac1 = 1;
        while(sayac1 <= 1)
        {
            System.out.print("Lutfen bir sayi giriniz: ");
            int sayi = sc.nextInt();
            if(sayi > enBuyuk){ enBuyuk = sayi; }
            if(sayi < enKucuk){ enKucuk = sayi; }
            sayac1++;
        }
        System.out.println("En Buyuk = " + enBuyuk + " En Kucuk = " + enKucuk);
        System.out.println("-------------------------------------------------------------");
        
        //Kullanıcı 0 girilene kadar girilen sayıların toplamını alan ve ortalamasını ekrana bastıran program        
        int toplam = 0;
        double ortalama;
        int sayac2 = 0;
        while(true)
        {
            System.out.print("Lutfen bir sayi giriniz: ");
            int sayi = sc.nextInt();
            if(sayi == 0){break;}             
            toplam = toplam + sayi;               
            sayac2++;
        }  
        ortalama = (double)toplam / sayac2;
        System.out.println(ortalama);
        System.out.println("-------------------------------------------------------------");
        
        //Kullanıcının console'dan girdiği kaç değer negatif onu bulan program        
        int negatifSayilar = 0, pozitifSayilar = 0;
        while(true)
        {
            System.out.println("Bir sayi giriniz: ");
            int sayi = sc.nextInt();
            if(sayi == 0){ break; }            
            if(sayi > 0){pozitifSayilar++;}
            if(sayi < 0){negatifSayilar++;}
        } 
        System.out.println("Pozitif Sayi Adedi: " + pozitifSayilar);
        System.out.println("Negatif Sayi Adedi: " + negatifSayilar);        
    }
}
