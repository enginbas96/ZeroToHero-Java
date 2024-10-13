package pkg094.exceptions;

import java.util.Scanner;

public class Exceptions 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
         //Burada istenilen değer bir sayıdır, biz burada sayı yerine harf girersek bir exception(istisna) ile karşılaşırız
         //Exception in thread "main" java.util.InputMismatchException hatası bize dönderilir
        int x  = sc.nextInt();
        System.out.println("Sonuc : " + x*2);
        
        System.out.println("-------------------------------");
        
        System.out.print("Pay : ");
        int y = sc.nextInt();
        System.out.print("Payda : ");
        int z = sc.nextInt();
        System.out.println("Sonuc : " + y/z);
        //Buradaki bölme işleminde payda kısmını 0 verdiğimizde bir istisna ile karşılaşırız, bir sayının sıfıra bölümünün tanımlanmamıs 55olması
        //Exception in thread "main" java.lang.ArithmeticException: / by zero hatasını alırız
    }
}
