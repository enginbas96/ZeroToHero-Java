package pkg085.ınterfaces;

public class Interfaces
{
    public static void main(String[] args) 
    {
        //Arayüzler soyut sınıflara benzer konsept sınıflardır
        //Arayüzler sadece sabitler, soyut metotlar(içi boş) ve default metotlar içerebilir.
        //Birden fazla sınıf tarafından ortak bir özellik kullanılmak istendiğinde tercih edilir
        //Kullanacak sınıf tarafından implement edilmelidir.
        //Çoklu kalıtım fonksiyonu kullanmamızı sağlar. Javada birden fazla extends yapamayız ama implements yapabiliriz
        //Arayüzler yetenek kazandırmak maksadı ile oluşturulurlar        
        
        Surebilir s1 = new Sofor();
        s1.sur();
        
        Surebilir s2 = new Pilot();
        s2.sur();
        
        Surebilir s3 = new Kaptan();
        s3.sur();
        
    }    
}
