package pkg046.methods;

import java.util.Scanner;

public class Methods 
{
    public static void main(String[] args) 
    {
        Methods mtds = new Methods();
        mtds.merhaba();//merhaba metodu static olmadıgından bu şekilde tanımlanmalıdır.
        
        mtds.topla(5, 4); // Buradan geriye dönen değer 9 olur, metot içerisinde sout kullanılmadııgından ekrana bir yazı yazdırılmaz sadece 9 degeri döner
        System.out.println(mtds.topla(5, 4)); // Bu şekilde dönen degeri görebiliriz
        
        int sonuc = mtds.topla(5, 7); // 12 degerini sonuc degiskenine aktarır
        System.out.println("Sonuc = " + sonuc);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilk Sayiyi Giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println("Toplam = " + (sayi1 + sayi2));
        
    }    
    //Public erişime sahip metotlara paket içindeki her sınıftan erişilebilir.
    //Private erişime sadece sınıf içerisinden erişilir.
    //İki tip metot vardır, birisi geriye dönüş gerektiren metotlardır, diğeri void metotlardır.
    
    
    public void merhaba()
    {
        System.out.println("Merhaba.");
    }
    
    public int topla(int x, int y)
    {
        int toplam = x + y;
        return toplam;
    }   
}
