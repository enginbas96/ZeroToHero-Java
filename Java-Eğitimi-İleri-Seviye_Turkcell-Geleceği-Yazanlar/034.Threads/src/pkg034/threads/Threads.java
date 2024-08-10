package pkg034.threads;

public class Threads 
{
    //Main metot main thread'i temsil eder.
    public static void main(String[] args)
    {
        //Main threadi sayacak
        System.out.println("Aktif Threads : " + Thread.activeCount());
        
        
        //İş - 1
        System.out.println("Program basladi.");
        
        //İş - 2
        //Main metodunun threadinden farklı bir thread oluşturuldu ve bu threadler paralel olarak çalışmakta
        //Yani sıra sıra çalışmamaktadır        
        //Thread sınıfını kullanmasaydık ilk önce iş-1 yapılacak sonra iş-2nin yapılması beklenecek ve sonra son iş yapılacaktı
        //Threadler bu beklemeyi ortadan kaldırarak paralel çalışmaya imkan sağlıyor
        Gorev g1 = new Gorev();        
        g1.start();  // Thread sınıfından miras aldıgından start metodu otomatik olarak run metodunu çalıştırır
        //g1 içindeki thread çalışacak
        
        //İş - 3
        System.out.println("Program bitti.");
        System.out.println("Aktif Threads : " + Thread.activeCount());
        System.out.println("Mevcut Threads bilgisi : " + Thread.currentThread().getName());
    }    
}