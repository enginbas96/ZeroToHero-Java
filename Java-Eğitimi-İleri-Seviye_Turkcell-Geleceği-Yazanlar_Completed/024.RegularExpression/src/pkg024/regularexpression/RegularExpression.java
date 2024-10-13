package pkg024.regularexpression;

import java.util.regex.*;

public class RegularExpression
{
    public static void main(String[] args) 
    {
        
        //a veya b veya c harflerinden hiç biri olmayan veya en az bir tanesi olan sorgu
        //Buradaki sorgu sadece 1 harfin sorgusunu yapmaktadır
        System.out.println("a veya b veya c harflerinden hic biri olmayan veya en az bir tanesi olan sorgu");
        System.out.println(Pattern.matches("[abc]?", ""));
        System.out.println(Pattern.matches("[abc]?", "a"));
        System.out.println(Pattern.matches("[abc]?", "b"));
        System.out.println(Pattern.matches("[abc]?", "c"));
        System.out.println(Pattern.matches("[abc]?", "d"));
        System.out.println(Pattern.matches("[abc]?", "aa"));
        System.out.println(Pattern.matches("[abc]?", "abc"));
        
        System.out.println("---------------------------------------");
        
        //a veya b veya c harflerinden en az bir tanesi olan veya bu harflerin farklı kombinasyonlarini sorgulayan sorgu
        System.out.println("a veya b veya c harflerinden en az bir tanesi olan veya bu harflerin farklı kombinasyonlarini sorgulayan sorgu ");
        System.out.println(Pattern.matches("[abc]+", "")); // en az bir tanesini içermesi gerekiyordu -> false
        System.out.println(Pattern.matches("[abc]+", "a"));
        System.out.println(Pattern.matches("[abc]+", "b"));
        System.out.println(Pattern.matches("[abc]+", "c"));
        System.out.println(Pattern.matches("[abc]+", "d")); // a,b,c harfleri yok -> false
        System.out.println(Pattern.matches("[abc]+", "aa")); // sınırsız tane a,b,c arka arkaya eklenebilir -> true
        System.out.println(Pattern.matches("[abc]+", "abcab")); // sınırsız tane a,b,c arka arkaya eklenebilir -> true
        System.out.println(Pattern.matches("[abc]+", "abcdab")); // ifadeye kural dışından bir harf dahil oldu -> false        
        System.out.println(Pattern.matches("[abc]*", "abac aabbca")); //Boşluk karakteri a,b,c karakterleri arasında olmadıgı için -> false         
    }    
}