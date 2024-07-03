package pkg031.switchcaseexamples;

import java.util.Scanner;


public class SwitchCaseExamples 
{
    public static void main(String[] args) 
    {
        //Basit hesap makinesi
        Scanner sc = new Scanner(System.in);
        
        float sonuc;
        System.out.println("Lutfen birinci sayiyi giriniz: ");
        float sayi1 = sc.nextFloat();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        float sayi2 = sc.nextFloat();   
        System.out.println("|-------------------------------------------------------------------|");  
        System.out.println("|Toplama-> + | Cikarma-> - | Carpma-> * | Bolme-> / |");   
        System.out.println("|-------------------------------------------------------------------|");   
        System.out.println("Lutfen yapilacak islemi giriniz: ");
        String islem = sc.next();
        //char islem1 = sc.next().charAt(0); case '+' şekline de gerçekleşebilir
        
        switch(islem)
        {
            case "+" : 
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama islemi sonucu = " + (int)sonuc );
                break;
            case "-" : 
                sonuc = sayi1 - sayi2;
                System.out.println("Cikarma islemi sonucu = " + (int)sonuc);
                break;
            case "*" : 
                sonuc = sayi1 * sayi2;
                System.out.println("Carpma islemi sonucu = " + (int)sonuc);
                break;
            case "/" : 
                sonuc = sayi1 / sayi2;
                System.out.println("Bolme islemi sonucu = " + sonuc);
                break;
            default :
                System.out.println("Yapmak istediginiz islem tanimli degil.");
                break;
        }        
    }    
}
