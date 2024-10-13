package pkg037.threads;

class Gorev implements Runnable
{
    @Override
    public void run() 
    {        
        for (int i = 0; i < 10; i++) {System.out.println("Gorev Sinifi : " + i);}
        System.out.println("Mevcut thread bilgisi : " + Thread.currentThread().getName());
        System.out.println("Gorev - Aktif thread sayisi : " + Thread.activeCount());        
    }    
}

public class Threads 
{    
    public static void main(String[] args) 
    {
        //isAlive threadin canlı olup olmadığını gönrüntüleyebiliyoruz
        
        //İçerikten bağımsız oldugundan main thread olarak görünecektir ve main thread için cevap verecektir        
        if(Thread.currentThread().isAlive()) //Main thread
        {
            System.out.println(Thread.currentThread().getName() + " 'i canli."); 
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " 'i cansiz.");
        }
        
        //------------------------------------------------------------------------------------------------
        
        Runnable g1 = new Gorev();
        Thread gorev1 = new Thread(g1, "Gorev Sinifi Thread - 1");        
        gorev1.start();    
        
        Runnable g2 = new Gorev();
        Thread gorev2 = new Thread(g2, "Gorev Sinifi Thread - 2");        
        //gorev2.start();     //Gorev2 thredini başlatmadık ve cansız oldugunu görebiliriz
        
        //Spesifik sorgulama için threadin adı kullanılır 
        if(gorev1.isAlive()){System.out.println(gorev1.getName() + " canli.");}
        else{System.out.println(gorev1.getName() + " cansiz.");}
        
        if(gorev2.isAlive()){System.out.println(gorev2.getName() + " canli.");}
        else{System.out.println(gorev2.getName() + " cansiz.");}
    }    
}