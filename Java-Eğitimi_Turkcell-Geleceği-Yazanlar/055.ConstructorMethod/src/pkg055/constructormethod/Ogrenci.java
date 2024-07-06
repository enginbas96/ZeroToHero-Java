package pkg055.constructormethod;

public class Ogrenci 
{
    String ad;
    String soyad;
    int yas;
    
    Ogrenci() //Parametreler farklı olduğu sürece istenildiği kadar yapıcı metot tanımlanabilir.
    {
        System.out.println("Parametresiz.");
    }
    Ogrenci(String a, String b, int y) 
    {
        ad = a;
        soyad = b;
        yas = y;
    }
    
}
