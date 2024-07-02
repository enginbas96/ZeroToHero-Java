package pkg021.relationaloperatorsexamples;

import java.util.Scanner;

public class RelationalOperatorsExamples 
{    
    public static void main(String[] args) 
    {
        boolean sonuc = 2 > 5;        
        System.out.println(sonuc);
        
        sonuc = 8 > 5;
        System.out.println(sonuc);
        
        sonuc = 8 >= 8;
        System.out.println(sonuc);
        
        sonuc = 8 == 5;
        System.out.println(sonuc);
        
        sonuc = 8 != 5;
        System.out.println(sonuc);
        System.out.println("------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        System.out.println(str1 == str2); //String değerler ==  ile karşılaştırılamaz, sonuç hep false döner
        System.out.println(str1.equals(str2)); // String değerler == yerine equals metoduunu kullanır
    }    
}
