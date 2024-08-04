package pkg018.regularexpression;

import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        Pattern pattern; 
        Matcher matcher;
        String metin = "Benim adim Engin";
        String aranacakMetin = "adim";
        pattern = Pattern.compile(aranacakMetin,Pattern.CASE_INSENSITIVE); //Büyük kucuk harf duyarlılıgını kaldırmak için kullanılır
        matcher = pattern.matcher(metin);
        
        if(matcher.find())
        {
            System.out.println(aranacakMetin + " kelimesi " + metin + " icerisinde bulundu.");
        }
        else
        {
            System.out.println(aranacakMetin + " kelimesi metin icerisinde bulunamadi.");
        }
        
        System.out.println("--------------------------------------------------------------------------------");
        
        System.out.println(Pattern.matches(aranacakMetin, metin)); //Birebir eşleştirmelerde kullanılır veya regex ifadeler yazılırken kullanılır
        System.out.println(Pattern.matches(metin, metin)); // Birebir karşıladığı için true döndürdü
        
        System.out.println("--------------------------------------------------------------------------------");
        
        String ifade = "kedi|kopek|maymun|fil";
        String regex = "\\|"; //Normalde | ifadesi özel bir karakterdir ve bunu \\| şeklinde yazarak özel olmayan bir karaktere dönüştürmüş olduk
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(ifade);
        if(matcher.find())
        {
            String[] kelimeler = ifade.split(regex);
            for(String kelime : kelimeler){System.out.println(kelime);}
        }
        else{System.out.println("Yok");}       
    }    
}