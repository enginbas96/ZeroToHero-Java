package pkg079.finalsuperthiskeys;

public class FinalSuperThisKeys 
{
    public static void main(String[] args)
    {
        //final ile tanımlanan bir değişken sabit bir değer olarak kalır ve değiştirilemezler
        //final ile yapılan metotlar ezilemezler yani miras alınan metodun içeriği değiştirilemez
        //final tanımlanan sınıflar miras alınamaz
        Ogrenci ogrenci1 = new Ogrenci(151413);
        System.out.println("No : " + ogrenci1.getNum());
        
        UniOgrenci uniOgrenci1 = new UniOgrenci(123456);
        System.out.println("No : " + uniOgrenci1.getNum());
        
        System.out.println("----------------------------------------------");
        
        Ogrenci ogrenci2 = new Ogrenci(151413);
        ogrenci2.yazdir();
        
        UniOgrenci uniOgrenci2 = new UniOgrenci(123456);
        uniOgrenci2.yazdir();
        uniOgrenci2.yazdir2();
    }    
}
