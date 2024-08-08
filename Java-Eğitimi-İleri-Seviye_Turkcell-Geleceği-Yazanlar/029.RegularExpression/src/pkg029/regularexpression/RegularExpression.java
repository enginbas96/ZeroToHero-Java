package pkg029.regularexpression;

import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        System.out.println("Sorgulama Programina Hos Geldiniz");
        
        Pattern pattern;
        Matcher matcher;        
        String regex;
        String ifade;
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.print("Regex sorgusu giriniz : ");
            regex = sc.nextLine();   
            pattern = Pattern.compile(regex);
            
            System.out.print("Bir metin giriniz : ");
            ifade = sc.nextLine();
            matcher = pattern.matcher(ifade);   
            
            while(matcher.find())
            {
                if(matcher.group() != "")
                {
                    System.out.println("Baslangic indeksi : " + matcher.start());
                    System.out.println("Bitis indeksi : " + matcher.end());
                    System.out.println("Bulunan metin : " + matcher.group());
                    System.out.println("-------------------------------------------");
                }
            }                
        }        
    }    
}