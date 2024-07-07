package pkg063.accessmodifiers;
import pkg063.accessexample.Araba; // Farklı paketlerden bir sınıf kullandıgımızda yazımın daha kolay olması için paketi import ederiz

public class AccessModifiers 
{
    public static void main(String[] args) 
    {
        /*
        Erişim Belirleyici	Aynı Sınıf	Aynı Paket	Alt Sınıf (inheritance)	Diğer Paketler
            public	Evet	Evet                    Evet                                   Evet
            protected	Evet	Evet                    Evet                                   Hayır
            default	Evet	Evet                    Hayır                                  Hayır
            private	Evet	Hayır                  Hayır                                   Hayır
        */
        
        // iki yazımda dogrudur fakat birisi import etmeden kullanırken diğeri import ettikten sonra kullanılır ve ciddi kolaylık sağlar
        pkg063.accessexample.Araba araba1 = new pkg063.accessexample.Araba(); 
        Araba araba2 = new Araba();
        
        // araba1.marka = "Honda";  bu kod satırı Araba sınıfında marka değişkeni default olarak tanımlandığından başka paketlerden erişilemez
        araba1.publicMarka = "Fiat"; //değişken farklı paket olmasına rağmen public olarak işaretlendiğinden erişim sağlanabilir.
        System.out.println(araba1.publicMarka);
    }    
}
