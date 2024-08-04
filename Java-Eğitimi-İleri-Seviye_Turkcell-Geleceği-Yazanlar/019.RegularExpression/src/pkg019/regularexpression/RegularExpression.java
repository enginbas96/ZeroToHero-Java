package pkg019.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{    
    public static void main(String[] args) 
    {
        //. karakteri kullanımı
        
        Pattern pattern;
        Matcher matcher;
        String ifade = "kalem";
        String regex = ".al..";
        
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(ifade);
        System.out.println("5 harfi bir string'te 2.Harf = 'a' ve 3.Harf = 'l' mi? sorgusu");
        System.out.println(matcher.find() + "\t" + ifade); 
        System.out.println(matcher.matches() + "\t" + ifade); 
        
        System.out.println("----------------------------------------------");
        
        ifade = "talip";
        matcher = pattern.matcher(ifade);
        System.out.println(matcher.find() + "\t" + ifade); 
        System.out.println(matcher.matches() + "\t" + ifade); 
        
        System.out.println("----------------------------------------------");
        
        ifade = "kiraz";
        matcher = pattern.matcher(ifade);
        System.out.println(matcher.find() + "\t" + ifade); 
        System.out.println(matcher.matches() + "\t" + ifade); 
        
        System.out.println("----------------------------------------------");
        
        System.out.println("5 harfli bir stringin son 2 harfi 'az' mi? sorgusu");
        ifade = "kiraz";
        regex = "...az";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(ifade);
        System.out.println(matcher.find() + "\t" + ifade); 
        System.out.println(matcher.matches() + "\t" + ifade);         
    }    
}