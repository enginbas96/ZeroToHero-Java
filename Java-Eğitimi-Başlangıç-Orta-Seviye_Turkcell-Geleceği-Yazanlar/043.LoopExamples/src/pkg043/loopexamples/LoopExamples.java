package pkg043.loopexamples;

import java.util.Scanner;

public class LoopExamples 
{
    public static void main(String[] args) 
    {        
        //Yarı capı verilen bir dairenin çevresini ve alanını bulan uygulama
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Lutfen dairenizin yari capini giriniz: ");
        float r = sc1.nextFloat();
        System.out.println("Dairenin alani: " + (Math.PI * Math.pow(r, 2)));
        System.out.println("Dairenin cevresi: " + 2 * Math.PI * r);
        
        System.out.println("-------------------------------------------------------------");
        
        //Karenin alanını ve çevresini hesaplama
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Lutfen karenin bir kenar uzunlugunu giriniz: ");
        float a = sc2.nextFloat();
        System.out.println("Karenin alani:  " + Math.pow(a, 2));
        System.out.println("Karenin cevresi: " + (4 * a));
    }    
}
