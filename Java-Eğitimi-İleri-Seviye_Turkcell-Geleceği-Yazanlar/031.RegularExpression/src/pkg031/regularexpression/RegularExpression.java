package pkg031.regularexpression;

import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        // Email dogrulayıcı regex
        
        String regex;
        String mailText = "";
        Pattern pattern;
        Matcher matcher;        
        Scanner sc = new Scanner(System.in);
        
        regex = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9]+.[a-zA-Z]{1,3}$";
        // ^ -> başlangıç oldugu anlamına geliyor
        //[a-zA-Z_0-9]* -> istenildigi kadar a-z, A-Z, 0-9, _-. gibi karakterleri içerebilir
        //+@[a-zA-Z0-9]* -> + işareti eklenecek anlamında, @ işareti ile başlayacak koyulması zorunldur ve a-zA-Z0-9 aralıgında olmalıdır
        //+.[a-zA-Z]{1,3} -> + işareti eklenecek anlamında, .(nokta)işareti ile başlayacak koyulması zorunludur ve sonu en az 1 en çok 3 karakterli olmalıdır
        // $ -> son oldugu anlamına geliyor
        while(!(mailText.equals("0000")))
        {
            System.out.print("E-Mail adresinizi giriniz : ");
            mailText = sc.nextLine();
            pattern = Pattern.compile(regex);  
            matcher = pattern.matcher(mailText);
            if(matcher.find())
            {
                System.out.println("Ifade mail adresi olmaya uygundur.");
            }
            else
            {
                System.out.println("Ifade mail adresi olmaya uygun degildir.");
            }
        }       
    }
}