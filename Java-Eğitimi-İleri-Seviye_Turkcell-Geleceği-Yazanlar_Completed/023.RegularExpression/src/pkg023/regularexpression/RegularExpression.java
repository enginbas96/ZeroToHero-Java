package pkg023.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{    
    public static void main(String[] args) 
    {
        //RegEx Quantifiers : Birşeyin ne kadar devam ettiğini söylediğimiz ifadelerdir
        
        //a? -> a bir defa vardır ya da hiç yoktur //Hiç olmaya bilir
        //a+ -> a bir defa vardır ya  da birden fazla vardır //En az bir defa olacak
        //a* -> a hiç tekrar etmez ya da bir ya da birden fazla tekrar edebilir // hiç olmayabilir yada birden fazla olabilir
        //a{n} -> a sadece n defa vardır  // n defadan fazla varsa false döndürür
        //a{n,} -> a n defa ya da daha fazla vardır.
        //a{n,m} -> a en az n tane en fazla m tane vardır.
        
        
        //a? -> a bir defa vardır ya da hiç yoktur //Hiç olmaya bilir
        System.out.println("a? ornekleri");
        System.out.println(Pattern.matches("a?", "")); //a 1 defa vardır veya hiç olmama durumu
        System.out.println(Pattern.matches("a?", "a")); //a 1 defa vardır veya hiç olmama durumu
        System.out.println(Pattern.matches("a?", "aa")); //a 1 defa vardır veya hiç olmama durumu
        System.out.println(Pattern.matches("a?", "b")); //a 1 defa vardır veya hiç olmama durumu
        
        System.out.println("------------------------------------------------");
        
        //a+ -> a bir defa vardır ya  da birden fazla vardır //En az bir defa olacak   
        System.out.println("a+ ornekleri");
        System.out.println(Pattern.matches("b+", "")); //a+ -> a bir defa vardır ya  da birden fazla vardır //En az bir defa olacak    
        System.out.println(Pattern.matches("b+", "b")); //a+ -> a bir defa vardır ya  da birden fazla vardır //En az bir defa olacak    
        System.out.println(Pattern.matches("b+", "bb"));  //a+ -> a bir defa vardır ya  da birden fazla vardır //En az bir defa olacak    
        System.out.println(Pattern.matches("b+", "bbb")); //a+ -> a bir defa vardır ya  da birden fazla vardır //En az bir defa olacak    
        System.out.println(Pattern.matches("b+", "aba")); //burada false döndürecek çünkü a'nın sorgulamasını yaptırıyoruz
        
        System.out.println("------------------------------------------------");        
        
        //a* -> a hiç tekrar etmez ya da bir ya da birden fazla tekrar edebilir // hiç olmayabilir yada birden fazla olabilir
        System.out.println("a* ornekleri");
        System.out.println(Pattern.matches("c*", "")); //a* -> a hiç tekrar etmez ya da bir ya da birden fazla tekrar edebilir
        System.out.println(Pattern.matches("c*", "c")); //a* -> a hiç tekrar etmez ya da bir ya da birden fazla tekrar edebilir
        System.out.println(Pattern.matches("c*", "ccc")); //a* -> a hiç tekrar etmez ya da bir ya da birden fazla tekrar edebilir
        System.out.println(Pattern.matches("c*", "cca")); //a* -> a hiç tekrar etmez ya da bir ya da birden fazla tekrar edebilir
        
        System.out.println("------------------------------------------------");   
        
        //a{n} -> a sadece n defa vardır  // n defadan fazla varsa false döndürür
        System.out.println("a{n} ornekleri");
        System.out.println(Pattern.matches("d{3}", "")); //a{n} -> a sadece n defa vardır  // n defadan fazla veya az varsa false döndürür
        System.out.println(Pattern.matches("d{3}", "d")); //a{n} -> a sadece n defa vardır  // n defadan fazla veya az varsa false döndürür
        System.out.println(Pattern.matches("d{3}", "dd")); //a{n} -> a sadece n defa vardır  // n defadan fazla veya az varsa false döndürür
        System.out.println(Pattern.matches("d{3}", "ddd")); //a{n} -> a sadece n defa vardır  // n defadan fazla veya az varsa false döndürür
        System.out.println(Pattern.matches("d{3}", "dddd")); //a{n} -> a sadece n defa vardır  // n defadan fazla veya az varsa false döndürür
        
        System.out.println("------------------------------------------------"); 
        
        //a{n,} -> a n defa ya da daha fazla vardır.
        System.out.println("a{n,} ornekleri");
         System.out.println(Pattern.matches("e{2,}", "")); //a{n,} -> a n defa ya da daha fazla vardır.
         System.out.println(Pattern.matches("e{2,}", "e")); //a{n,} -> a n defa ya da daha fazla vardır.
         System.out.println(Pattern.matches("e{2,}", "ee")); //a{n,} -> a n defa ya da daha fazla vardır.
         System.out.println(Pattern.matches("e{2,}", "eee")); //a{n,} -> a n defa ya da daha fazla vardır.
         System.out.println(Pattern.matches("e{2,}", "eeee")); //a{n,} -> a n defa ya da daha fazla vardır.
         System.out.println(Pattern.matches("e{2,}", "eebee")); //a{n,} -> a n defa ya da daha fazla vardır.
         
         System.out.println("------------------------------------------------"); 
         
         //a{n,m} -> a en az n tane en fazla m tane vardır.
         System.out.println("a{n,m} ornekleri");
         System.out.println(Pattern.matches("f{1,3}", "")); //a{n,m} -> a en az n tane en fazla m tane vardır.
         System.out.println(Pattern.matches("f{1,3}", "f")); //a{n,m} -> a en az n tane en fazla m tane vardır.
         System.out.println(Pattern.matches("f{1,3}", "ff")); //a{n,m} -> a en az n tane en fazla m tane vardır.
         System.out.println(Pattern.matches("f{1,3}", "fff")); //a{n,m} -> a en az n tane en fazla m tane vardır.
         System.out.println(Pattern.matches("f{1,3}", "ffff")); //a{n,m} -> a en az n tane en fazla m tane vardır.
         System.out.println(Pattern.matches("f{1,3}", "fffff")); //a{n,m} -> a en az n tane en fazla m tane vardır.
    }    
}