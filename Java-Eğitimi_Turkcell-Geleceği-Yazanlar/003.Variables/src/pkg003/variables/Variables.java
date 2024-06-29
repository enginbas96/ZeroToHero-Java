package pkg003.variables;

public class Variables
{
    public static void main(String[] args) 
    {
        byte b; // 1 Byte
        b = 10;
        System.out.println(b);
        
        short s; // 2 Byte
        s = 20;
        System.out.println(s);
        
        int i; // 4 Byte
        i = 30;
        System.out.println(i);
        
        long l; // 8 Byte
        l = 40;
        System.out.println(l);
        
        float pi; // 4 Byte
        pi = 3.14f; // Sonuna f eklemezsek float olduğunu algılayamaz.
        System.out.println(pi);
        
        double d; // 8 Byte
        d = 123.456789; // Sonuna herhangi birşey yazmaya gerek yok otomatik olarak noktalı sayılar double olarak tanımlı olur.
        System.out.println(d);
        
        char c;
        c = 'A';
        System.out.println(c);
        
        boolean bool;
        bool = true; // True yada False değerlerini alır.
        System.out.println(bool);
        
        /* 
            Değişken tanımamalarının kuralları vardır
            Değişkenler sayı ile başlayamaz, $ işareti, _ işareti ve alfabetik karakterler ile başlayabilir
            Bir metodun içerisinde aynı isimde iki değişken tanımlanamaz.
            Bir değişkene başlangıç değişkeni vermezseniz o değişkeni kullanamazsınız.
        */
    }    
}
