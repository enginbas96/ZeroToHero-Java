package pkg025.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{    
    public static void main(String[] args) 
    {
        //a veya b veya c harflerinden sonsuz tane kombinasyonlu yazılabilir veya ifadenin içi boş olmalıdır
        System.out.println("[abc]+ 'dan farki sadece ifadenin icinin bos olma durumunu da ekliyor");
        System.out.println(Pattern.matches("[abc]*", ""));
        System.out.println(Pattern.matches("[abc]*", "a"));
        System.out.println(Pattern.matches("[abc]*", "b"));
        System.out.println(Pattern.matches("[abc]*", "c"));
        System.out.println(Pattern.matches("[abc]*", "d"));
        System.out.println(Pattern.matches("[abc]*", "abacaabbca"));
        System.out.println(Pattern.matches("[abc]*", "adbacaabbca")); // d karakteri ifadenin koşulunu sağlamadığı için -> false
        System.out.println(Pattern.matches("[abc]*", "abac aabbca")); //Boşluk karakteri a,b,c karakterleri arasında olmadıgı için -> false    
        
        System.out.println("-----------------------------------------------------------");
        
        //a veya b veya c karakterlerinin olusturdugu kombinasyon sadece n tane karakterli olabilir
        System.out.println("a veya b veya c karakterlerinin olusturdugu kombinasyon sadece n tane karakterli olabilir");
        System.out.println(Pattern.matches("[abc]{3}", "abc"));
        System.out.println(Pattern.matches("[abc]{3}", "bbb"));
        System.out.println(Pattern.matches("[abc]{3}", "cab"));
        System.out.println(Pattern.matches("[abc]{3}", "ccb"));
        System.out.println(Pattern.matches("[abc]{3}", "ab"));
        System.out.println(Pattern.matches("[abc]{3}", "cc"));
        System.out.println(Pattern.matches("[abc]{3}", ""));
        System.out.println(Pattern.matches("[abc]{3}", "abe"));
        
        System.out.println("-----------------------------------------------------------");
        
        //a veya b veya c karakterlerinin olusturdugu kombinasyon en az n tane karakterli veya daha fazla karakterli olabilir
        System.out.println("a veya b veya c karakterlerinin olusturdugu kombinasyon en az n tane karakterli veya daha fazla karakterli olabilir");
        System.out.println(Pattern.matches("[abc]{3,}", ""));
        System.out.println(Pattern.matches("[abc]{3,}", "a"));
        System.out.println(Pattern.matches("[abc]{3,}", "ab"));
        System.out.println(Pattern.matches("[abc]{3,}", "abc"));
        System.out.println(Pattern.matches("[abc]{3,}", "abcccaa"));
        System.out.println(Pattern.matches("[abc]{3,}", "abcaccaccbaa"));
        System.out.println(Pattern.matches("[abc]{3,}", "abcaccacxcbaa")); //ifadedeki  karakterlerden farklı karakter kullanılmış -> false
        
        System.out.println("-----------------------------------------------------------");
        
        //a veya b veya c karakterlerinin olusturdugu kombinasyon en az n tane karakterli veya en fazla m tane karakterli olabilir
        System.out.println("a veya b veya c karakterlerinin olusturdugu kombinasyon en az n tane karakterli veya en fazla m tane karakterli olabilir");
        System.out.println(Pattern.matches("[abc]{3,5}", "")); //karakter sınırları içerisinde değil -> false
        System.out.println(Pattern.matches("[abc]{3,5}", "a")); //karakter sınırları içerisinde değil -> false
        System.out.println(Pattern.matches("[abc]{3,5}", "ab")); //karakter sınırları içerisinde değil -> false
        System.out.println(Pattern.matches("[abc]{3,5}", "abc"));       //true
        System.out.println(Pattern.matches("[abc]{3,5}", "abcaa"));     //true
        System.out.println(Pattern.matches("[abc]{3,5}", "abcccaa")); //karakter sınırları içerisinde değil -> false
        System.out.println(Pattern.matches("[abc]{3,5}", "abcaccaccbaa")); //karakter sınırları içerisinde değil -> false
        System.out.println(Pattern.matches("[abc]{3,5}", "abcaccacxcbaa")); //ifadedeki  karakterlerden farklı karakter kullanılmış -> false
    }    
}