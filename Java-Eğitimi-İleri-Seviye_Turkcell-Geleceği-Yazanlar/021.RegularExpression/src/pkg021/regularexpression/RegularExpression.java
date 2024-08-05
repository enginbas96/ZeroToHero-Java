package pkg021.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        //Karmaşık sorgulamalar
        
        String ifade;
        String regex;
        Pattern pattern;
        Matcher matcher;
        
        //Union
        regex = "[a-e [k-y]]";
        pattern = Pattern.compile(regex);
        
        ifade = "j";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, a-e harfleri arasinda mi veya k-y harfleri arasinda mi ? " + matcher.find());
        
        ifade = "t";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, a-e harfleri arasinda mi veya k-y harfleri arasinda mi ? " + matcher.find());
        
        System.out.println("-------------------------------------------------------------");
        
        //intersection        
        regex = "[a-z && [k-y]]"; //a'dan z'ye hepsi içerdiği için kesişim kısmına bakılır k ve y arasında mı sorgusu yapar
        pattern = Pattern.compile(regex);
        
        ifade = "j";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, k ve y harfleri arasinda mi? " + matcher.find());
        
        ifade = "p";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, k ve y harfleri arasinda mi? " + matcher.find());
        
        System.out.println("-------------------------------------------------------------");
        
        regex = "[a-z && 0[^f-k]]"; // f ve k harfleri arasında olmayan tüm küçük harfleri ifade eder
        pattern = Pattern.compile(regex);
        
        ifade = "l";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, f ve k harfleri arasinda degil mi? " + matcher.find());
        
        ifade = "j";
        matcher = pattern.matcher(ifade);        
        System.out.println(ifade + " ifadesi, f ve k harfleri arasinda degil mi? " + matcher.find());
        
        System.out.println("-------------------------------------------------------------");
        
        //Matcher ve matches arasındaki fark
        //matcher.find bir ifadenin içinde olup olmadığını sorgular
        //matcher.matches bir ifade ile eşleşip eşleşmediğini sorgular
        regex = ".al..";
        ifade = "kalem";
        System.out.println(Pattern.matches(regex, ifade));
        
        regex = "[a-z]";
        ifade = "b";
        System.out.println(Pattern.matches(regex, ifade));
    }    
}