package pkg006.stringexamples;

import java.awt.BorderLayout;
import java.util.Scanner;

public class StringExamples 
{
    public static void main(String[] args) 
    {
        String str1 = "Hello";
        System.out.println(str1);
        
        String str2 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        str2 = "HELLO";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz; ");
        String str3 = sc.nextLine();
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.charAt(3));
        System.out.println(str3.length());
        System.out.println(str3.substring(5));
        System.out.println(str3.isEmpty());
        System.out.println(str3.replace("as", "sa"));
        System.out.println(str3.indexOf('a'));
        System.out.println(str3.lastIndexOf("a"));
        System.out.println(str3.trim());
        
        Scanner sc2 = new Scanner(System.in);
        String str4 = sc2.nextLine();
        String str5 = sc2.nextLine();
        System.out.println(str4  +" "+ str5) ;
        
        
    }        
}
