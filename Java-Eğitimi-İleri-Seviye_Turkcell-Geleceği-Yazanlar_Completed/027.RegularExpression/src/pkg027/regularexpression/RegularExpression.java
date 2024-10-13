package pkg027.regularexpression;

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
        
        //w kelime karakteri sorgulaması yapar -> [a-zA-Z_0-9]
        System.out.println("w -> kelimenin a-z, A-Z, _ , 0-9  aralıgında olup olmadıgını kontrol eder");
        System.out.println(Pattern.matches("\\w", "A"));
        System.out.println(Pattern.matches("\\w", "V"));
        System.out.println(Pattern.matches("\\w", "0"));
        System.out.println(Pattern.matches("\\w", "_"));
        System.out.println(Pattern.matches("\\w", "-"));
        System.out.println(Pattern.matches("\\w", "."));
        
        System.out.println("----------------------------------------------------");
        
        //W kelime karakteri olmayan sorgulamaları yapar [^a-zA-Z0-9]
        System.out.println("W ->  Karakter olmayan yani \\w' metasinin icermedigi karakterleri sorgular ");
        System.out.println(Pattern.matches("\\W", ""));
        System.out.println(Pattern.matches("\\W", " ")); // ->true
        System.out.println(Pattern.matches("\\W", "A"));
        System.out.println(Pattern.matches("\\W", "a"));
        System.out.println(Pattern.matches("\\W", "1"));
        System.out.println(Pattern.matches("\\W", "2"));
        System.out.println(Pattern.matches("\\W", "*"));
        System.out.println(Pattern.matches("[^a-zA-Z0-9]", "2")); // \\W ile aynı işleve sahiptir
        
        System.out.println("----------------------------------------------------");
        
        //b kelime karakteri ile başlayıp başlamadığını kontrol eder
        System.out.println("b -> Kelime karakteri ile baslayip baslamadigini kontrol eder, kelime karakteri disinda ise false doner");
        System.out.println(Pattern.matches("\\b", ""));
        System.out.println(Pattern.matches("\\b", " "));
        System.out.println(Pattern.matches("\\b", "a"));
        System.out.println(Pattern.matches("\\b", "Abi"));
        System.out.println(Pattern.matches("\\bAbiler", "Abile"));
        System.out.println(Pattern.matches("\\bAbi", "Abi")); // -> birebir aynı girdinin olması gerekmektedir
        System.out.println(Pattern.matches("\\bAbi1", "Abi1")); // -> ayrıca kelime karakterleri dışında karakterleri gorurse false doner
        System.out.println(Pattern.matches("\\bAbi-1", "Abi-1")); // kelime karakterleri ifadenin başında değilse true donderir bu \\b nin pozisyonu ile ilgilidir
        System.out.println(Pattern.matches("Abi-1", "Abi-1")); // ->true        
        System.out.println(Pattern.matches("Abi\\b", "Abi")); // ->true        
        System.out.println(Pattern.matches("Abi-\\b", "Abi-")); // ->false       
        System.out.println(Pattern.matches("\\bAbi-1-", "Abi-1-")); // -> true
        System.out.println(Pattern.matches("\\b-Abi-1", "-Abi-1")); // -> ayrıca kelime karakterleri dışında karakterleri gorurse false doner
        
        System.out.println("----------------------------------------------------");
        
        //B kelime karakteri olmayan sınır kontrolü
        System.out.println("B -> Kelime karakteri ile baslayip baslamadigini kontrol eder, kelime karakteri disinda ise true doner");
        System.out.println(Pattern.matches("\\B", "")); //true
        System.out.println(Pattern.matches("\\B ", " ")); //true \\B'nin önünde bir boşluk karakteri var
        System.out.println(Pattern.matches("\\BA ", "A ")); //false
        System.out.println(Pattern.matches("\\B", " ")); //false
        System.out.println(Pattern.matches("\\B", "a")); //false
        System.out.println(Pattern.matches("\\B", "Abi")); //false
        System.out.println(Pattern.matches("\\bAbiler", "Abile")); //false
        System.out.println(Pattern.matches("\\BAbi", "Abi")); // false
        System.out.println(Pattern.matches("\\BAbi1", "Abi1")); // -> false
        System.out.println(Pattern.matches("\\BAbi-1", "Abi-1")); //false
        System.out.println(Pattern.matches("Abi\\B", "Abi")); // ->false        
        System.out.println(Pattern.matches("Abi-\\B", "Abi-")); // ->true       
        System.out.println(Pattern.matches("\\BAbi-1-", "Abi-1-")); // -> false
        System.out.println(Pattern.matches("\\B-Abi-1", "-Abi-1")); // -> true
        System.out.println(Pattern.matches("\\B#Abi-1", "#Abi-1")); // -> true
    }    
}