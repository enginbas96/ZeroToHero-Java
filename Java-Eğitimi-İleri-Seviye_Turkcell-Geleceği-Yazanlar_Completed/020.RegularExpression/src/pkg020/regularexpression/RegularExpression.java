package pkg020.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{    
    public static void main(String[] args) 
    {        
        //Karakter sorgulama-regex örnekleri        
        String ifade;
        String regex;
        Pattern pattern;
        Matcher matcher;
        
        regex = "[abc]";
        pattern = Pattern.compile(regex);
        
        ifade = "c";        
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " harfi, 'a, b, c' harflerinden birisi mi? " + matcher.matches());
        
        ifade = "d";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " harfi, 'a, b, c' harflerinden birisi mi? " + matcher.matches());
        
        System.out.println("---------------------------------------------");
        
        regex = "[^abc]";
        pattern = Pattern.compile(regex);
        
        ifade = "d";        
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " harfi, 'a, b, c' harflerinden farkli bir harf mi? " + matcher.matches());
        
        ifade = "c";        
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " harfi, 'a, b, c' harflerinden farkli bir harf mi? " + matcher.matches());
        
        System.out.println("---------------------------------------------");
        
         regex = "[a-zA-Z]"; //Bütün harfleri kapsadığı için soru bir harf mi olacaktır
        pattern = Pattern.compile(regex);
        
        ifade = "d";        
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, bir harf mi? " + matcher.matches());
        
        ifade = "K";        
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, bir harf mi? " + matcher.matches());
        
        ifade = "9";        
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, bir harf mi? " + matcher.matches());
    }    
}