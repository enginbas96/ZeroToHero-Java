package pkg030.regularexpression;

import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        Pattern pattern;
        Matcher matcher;
        String regex;
        String ifade;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Regex modeli giriniz : ");
            regex = sc.nextLine();
            pattern = Pattern.compile(regex);
            
            System.out.print("Bir metin giriniz : ");
            ifade = sc.nextLine(); // kod içerisinde yazılan \\ çift ters cizgi isareti scanner ile alınırken \ tek ters çizgi olarak alınmalıdır
            matcher = pattern.matcher(ifade);
            
            boolean varMi = false;
            while (matcher.find())
            {        
                System.out.println("Baslangic index : " + matcher.start());
                System.out.println("Bitis index : " + matcher.end());
                System.out.println("Bulunan metin : " + matcher.group());
                System.out.println("-------------------------------------------------");
                varMi = true;
            }
            if(!varMi)
            {
                System.out.println("Girilen RegEx'e uygun eslesme bulunamadi!");
            }
        }      
    }    
}