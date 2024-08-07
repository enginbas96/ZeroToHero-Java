package pkg026.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args)
    {
        //RegEx metacharacters
        
        //.(nokta) karakteri herhangi bir karakter kontrolü yapar -> .alem
        //d rakam olan karakterlerin sorgulamasını yapar (digit)
        //D rakam olmayan karakterlerin sorgulamasını yapar(non-digit)
        //s boşluk olan karakter sorgusu
        //S boşluk olmayan karakter sorgusu
        //w kelime karakteri sorgulaması yapar -> [a-zA-Z_0-9]
        //W kelime karakteri olmayan sorgulamaları yapar
        //b kelime karakteri olan sınır kontrolü
        //B kelime karakteri olmayan sınır kontrolü
        
        //.(nokta) karakteri herhangi bir karakter kontrolü yapar -> .alem
        System.out.println(". (nokta) -> herhangi bir karakter oldugunu kontrol eden meta karakter");
        System.out.println(Pattern.matches(".", " ")); // boşluk ifadesini de sayıyor
        System.out.println(Pattern.matches(".", "."));
        System.out.println(Pattern.matches(".", "1"));
        System.out.println(Pattern.matches(".", "3"));
        System.out.println(Pattern.matches(".", "a"));
        System.out.println(Pattern.matches(".", "g"));
        System.out.println(Pattern.matches("....", "gasd"));
        System.out.println(Pattern.matches("......", "5char "));
        System.out.println("Tek nokta her turlu tekli ifadeleri kabul eder, tek nokta sorgusunun ifadesi tek karakter olmalidir aksi halde false doner");
        
        System.out.println("--------------------------------------------------------------");
        
         //d rakam olan karakterlerin sorgulamasını yapar (digit)
         System.out.println("d -> Rakam kontrolu yapan meta karakter");
         System.out.println(Pattern.matches("\\d", "1")); // d normal şartlarda özel olmayan bir karakterdi fakat bunu \\ koyarak özellik kazandırdık
         System.out.println(Pattern.matches("\\d", "3"));
         System.out.println(Pattern.matches("\\d", "-1"));
         System.out.println(Pattern.matches("-\\d", "-1"));
         System.out.println(Pattern.matches("-\\d", "-12"));
         System.out.println(Pattern.matches("-\\d*", "-1243535")); 
         System.out.println(Pattern.matches("\\d+", "21"));
         System.out.println(Pattern.matches("\\d*", ""));
         System.out.println(Pattern.matches("\\d", "a"));
        
        System.out.println("--------------------------------------------------------------");
        
        //D rakam olmayan karakterlerin sorgulamasını yapar(non-digit)
        System.out.println("D -> rakam olmayan karakterlerin kontrolunu yapan meta karakter");
        System.out.println(Pattern.matches("\\D", "A"));
        System.out.println(Pattern.matches("\\D", " "));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "12"));
        System.out.println("Rakam olmayan her karakterde true donderir.");
        
        System.out.println("--------------------------------------------------------------");
        
        //s boşluk olan karakter sorgusu
        System.out.println("s -> Bosluk olan karakterlerin kontrolunu saglayan meta karakter");
        System.out.println(Pattern.matches("\\s", "")); // -> herhangi bir karakter olmadıgından false doner, regex \\s* olsaydı true donerdi
        System.out.println(Pattern.matches("\\s*", ""));
        System.out.println(Pattern.matches("\\s", " ")); // -> sadece 1 bosluk ifadesi oldugundan true doner
        System.out.println(Pattern.matches("\\s", "  ")); // -> 2 boşluk var dolayısıyla false doner, regex \\s* veua \\s+ olsaydı true donerdi 
        System.out.println(Pattern.matches("\\s", "a"));
        
        System.out.println("--------------------------------------------------------------");
        
        //S boşluk olmayan karakter sorgusu
        System.out.println("S -> bosluk olmayan karakterlerin kontrolunu saglayan meta karakter");
        System.out.println(Pattern.matches("\\S", ""));
        System.out.println(Pattern.matches("\\S", " "));
        System.out.println(Pattern.matches("\\S", "  "));
        System.out.println(Pattern.matches("\\S", "a"));
        System.out.println("Bosluk gordugu yerde false donderen bir meta karakterdir.");
        
    }    
}