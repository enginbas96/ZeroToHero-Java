package pkg015.staticexamples;

import java.util.Random;

public class StaticExamples 
{
    
    
    public static void main(String[] args) 
    {
        System.out.println(Math.PI); //Ekrana tanımlı olan pi sayısını yazdıracak
        System.out.println(Math.pow(2, 3)); //İçerisine verilen ilk değerin ikinci değer kadar kuvvetini alır
        System.out.println(Math.sqrt(9)); //İçerisine verilen sayının karekökünü bulur
        System.out.println(Math.min(2, 4)); //İçerisine verilen verilerden küçük olanı bulur
        System.out.println(Math.max(6, 3)); //İçerisine verilen verilerden büyük olanını bulur
        
        System.out.println("-------------------------------------");
        
        float f = 1.49f;
        float f2 = 1.50f;
        float f3 = 3.01f;
        System.out.println(Math.ceil(f)); //İçerisine tanımlanan float değişkeni üst tam sayıya yuvarlar
        System.out.println(Math.floor(f)); //İçerisinde tanımlanan float değişkenini alt tam sayıya yuvarlar        
        
        //İçerisinde bulunan değişken x.50 ve x.99 küsüratlı değerleri üst tam sayıya yuvarlar, x.49 ve altını ise alt tam sayıya yuvarlar
        System.out.println(Math.round(f)); 
        System.out.println(Math.round(f2));
        System.out.println(Math.round(f3));
        
        System.out.println("-------------------------------------");
        
        //0 ve 1 arasında random bir değer atamaya yardımcı olur
        System.out.println(Math.random());
        
        //Random değişkenlerin farklı kullanımlarıda mevcuttur
        Random random = new Random(); //Random sınıfından bir nesne üretiyoruz
        System.out.println(random.nextInt()); //Random bir int değer oluşturur
        System.out.println(random.nextInt(100)); // 0 ile 100 arası random bir değer atar değerlere 0 ile 99 dahildir
        int max = 36;
        int min = 7;
        System.out.println(random.nextInt((max-min)+1)+min);
    }    
}
