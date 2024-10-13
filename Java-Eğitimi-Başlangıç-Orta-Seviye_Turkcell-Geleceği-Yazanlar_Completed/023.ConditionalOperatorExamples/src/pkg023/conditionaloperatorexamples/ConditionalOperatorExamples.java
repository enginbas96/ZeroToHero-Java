package pkg023.conditionaloperatorexamples;

import java.util.Scanner;

public class ConditionalOperatorExamples
{
    public static void main(String[] args) 
    {
        int x  = 30;
        int y = 20;
        
        if(x > y){ System.out.println("X, Y'den buyuktur.");}
        else {System.out.println("X, Y'ye esit veya kucuktur.");}    
        System.out.println("--------------------------------------------");
        
        System.out.println(x > y ? "X, Y'den buyuktur." : "X, Y'ye esit veya kucuktur.");
        System.out.println("--------------------------------------------");
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("K degerini giriniz: ");
        int k = sc.nextInt();
        System.out.println(x > k ? "X buyuktur." : "X kucuktur.");
    }    
}
