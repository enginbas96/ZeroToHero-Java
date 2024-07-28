package pkg025.operatorexamples;

import java.util.Scanner;

public class OperatorExamples 
{
    public static void main(String[] args) 
    {
        int x; //Tanımlama ifadesi 
        x = 10; // Atama ifadesi
        x++; // x = x + 1;
        System.out.println(x); // 11
        
        System.out.println(x++); //11 Yazılır sonra x e 1 eklenir x 12 olur
        System.out.println(x); // 12
        
        System.out.println(--x); // x i 1 azaltır ve ekrana yazdırır 11
        System.out.println(x--); // x ekrana yazdırılır ardından 1 eksiltilir x 10 olur
        System.out.println(x); //10
        System.out.println("-----------------------------------------");
        
        System.out.println(5659%6); // 6 ya bölümden kalan ifadeyi ekrana yazar
        System.out.println("-----------------------------------------");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int a = sc.nextInt();
        System.out.println(a % 2 == 0 ? "Cift sayidir" : "Tek sayidir.");
        System.out.println("-----------------------------------------");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yeni sifrenizi giriniz: ");
        String sifre1 = input.nextLine();        
        System.out.print("Lutfen yeni sifrenizi giriniz(T): ");
        String sifre2 =  input.nextLine();
        boolean isTrue = sifre1.equals(sifre2);
        System.out.println(isTrue ? "Sifreniz basari ile degistirilmistir." : "Girilen sifreler birbiri ile uyusmuyor, tekrar deneyin");
    }    
}
