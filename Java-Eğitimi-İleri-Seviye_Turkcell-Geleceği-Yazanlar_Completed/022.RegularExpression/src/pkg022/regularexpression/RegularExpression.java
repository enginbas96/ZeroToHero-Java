package pkg022.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        String regex;
        String ifade;
        Pattern pattern;
        Matcher matcher;
        
        //a veya b veya c bulunur
        regex = "[a|b|c]"; // aslında [abc] ile aynı ifadeyi temsil eder '|' karakteri veya anlamına gelmektedir
        
        ifade = "b";
        System.out.println(ifade + " ifadesi '" + regex + "' kurallari icerisinde mi? : "  + Pattern.matches(regex, ifade));
        
        ifade = "d";
        System.out.println(ifade + " ifadesi '" + regex + "' kurallari icerisinde mi? : "  + Pattern.matches(regex, ifade));
        
        System.out.println("---------------------------------------------------------------");
        
        //a veya b veya c dışında bir harf bulunur
        regex = "[^abc]";
        ifade = "k";
        System.out.println(ifade + " ifadesi '" + regex + "' kurallari icerisinde mi? : "  + Pattern.matches(regex, ifade));
        
        ifade = "b";
        System.out.println(ifade + " ifadesi '" + regex + "' kurallari icerisinde mi? : "  + Pattern.matches(regex, ifade));
        
        System.out.println("---------------------------------------------------------------");
        
        regex = "[a-z && [fr]]";
        ifade = "k";
        System.out.println(ifade + " ifadesi '" + regex + "' kurallari icerisinde mi? : "  + Pattern.matches(regex, ifade));
        
        regex = "[a-z && [f-r]]";
        ifade = "k";
        System.out.println(ifade + " ifadesi '" + regex + "' kurallari icerisinde mi? : "  + Pattern.matches(regex, ifade));
    }    
}