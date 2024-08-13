package pkg039.threads;

public class Gorev implements Runnable
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