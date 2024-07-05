package pkg045.methods;

public class Methods 
{
    public static void main(String[] args)
    {
        //Static olmayan bir metodu static bir metotda çağıramayız bu yüzden sınıfın belirleyicisini kullanmamız gerekir        
        new Methods().helloWorld(); //Methods sınıfının helloWorld metodunu çağırdık.
        
        //Metotlara daha kolay erişmek için sınıftan bir nesne oluşturalım
        Methods mtds = new Methods(); // Artık new Methods(); yerine mtds nesnesini kullanabiliriz.
        
        int sonuc = mtds.topla(5, 3);
        System.out.println("Sonuc = " + sonuc);
    }      
    //Ekrana bir yazı yazdıran metot tanımlayalım    
    private void helloWorld()
    {
        System.out.println("Hello World");
    }
    //Topla metodu 1;
    private int topla(int x, int y)
    {
        int toplam = x + y;
        return toplam; 
        //void olmayan metotlar geriye bir değer döndürmek zorundadır bunu return anahtar kelimesi ile yaparız. 
    }
    //Topla metodu 2; parametre tipleri farklı
    private float topla(float x, int y) //Parametrelerin tipleri birbirinden farklı oldugundan dolayı java bu kullanıma izin veriyor
    {
        float toplam = x + y;
        return toplam;         
    }
    //Topla metodu 3; parametre tipleri farklı
    private float topla(float x, float y) 
    {
        float toplam = x + y;
        return toplam;         
    }
    //Metotların imazına geri dönüş tipleri dahil değildir.
    //Aynı isim ve aynı parametrelerle metot tanımlanamaz.
    //Metodu float olarak dondursek bile aynı isim ve aynı parametlere sahip oldugundan hata verir
    //Bunun sebebi program çalışırken hangi metoda erişim yapacağını bilemediğindendir
    /*private float topla(int x, int y) 
    {
        int toplam = x + y;
        return (float)toplam;         
    }*/
}
