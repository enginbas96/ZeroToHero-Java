package pkg072.ınheritanceexamples;

public class C extends B
{
    public C(String text)
    {
        // B sınıfının yapıcı metodu bir text değer istediği için super anahtar kelimesi ile b sınıfına göndermeliyiz
        // Süper anahtar kelimesi ilk satırda olmak zorundadır çünkü üst sınıfın isteğini karşılamak gerekir
        super(text); 
        System.out.println("C Yapici Metot");
    }    
}
