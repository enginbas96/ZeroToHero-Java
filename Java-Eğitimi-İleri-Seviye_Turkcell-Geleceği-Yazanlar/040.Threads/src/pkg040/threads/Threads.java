package pkg040.threads;

class Yazici
{
    public void yazdir(int kopyaSayisi, String dokumanIsmi)
    {
        for (int i = 1; i <= kopyaSayisi; i++) 
        {          
            System.out.println(dokumanIsmi + " yazdiriliyor..." + " - Kopya Sayisi : " + i);
        }
    }
}

class Gorev implements Runnable
{
    Yazici yaziciRef;
    String dokumanIsmi;
    int kopyaSayisi;

    public Gorev(Yazici yaziciRef, String dokumanIsmi, int kopyaSayisi) 
    {
        this.yaziciRef = yaziciRef;
        this.dokumanIsmi = dokumanIsmi;
        this.kopyaSayisi = kopyaSayisi;
    }
    
    @Override
    public void run() 
    {
        synchronized (yaziciRef) //Yaziciyi senkronize etmek için yazıcı referansı kullanılmıştır
        {
            yaziciRef.yazdir(kopyaSayisi, dokumanIsmi);
        }
    }       
}

public class Threads 
{    
    public static void main(String[] args) throws InterruptedException  //Bu throws thread için yerleştirilmiştir
    {
        //Join ile önceliğini arttırma
        Yazici yazici = new Yazici();
        
        Runnable r1 = new Gorev(yazici, "Vize_Dokuman", 5);
        Runnable r2 = new Gorev(yazici, "Final_Dokuman",5);
        Runnable r3 = new Gorev(yazici, "Butunleme_Dokuman",5);
        Thread gorev1 = new Thread(r1);
        Thread gorev2 = new Thread(r2);
        Thread gorev3 = new Thread(r3);
        
        //Görev1 > Görev2 > Görev3 olacak şekilde çalıştırılsın istiyoruz                
        //Join mevcut thread'in görevi tamamlanana kadar diğer thread'e geçmiyor
        gorev1.start();
        gorev1.join(); // görev1 Threadi ölene kadar bekle anlamına gelmektedir
        
        gorev2.start();
        gorev2.join(); // görev2 Threadi ölene kadar bekle anlamına gelmektedir
        
        gorev3.start();
        gorev3.join();
    }    
}