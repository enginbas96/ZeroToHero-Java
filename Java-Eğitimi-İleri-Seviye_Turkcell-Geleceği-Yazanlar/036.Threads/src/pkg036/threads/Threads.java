package pkg036.threads;

class UstGorev{}

class Gorev extends UstGorev implements Runnable
{
    @Override
    public void run() 
    {        
        for (int i = 0; i < 10; i++) {System.out.println("Gorev Sinifi : " + i);}
        System.out.println("Mevcut thread bilgisi : " + Thread.currentThread().getName());
        System.out.println("Gorev - Aktif thread sayisi : " + Thread.activeCount());
    }    
}

class DigerGorev extends UstGorev implements Runnable
{
    @Override
    public void run() 
    {
        for(int i = 1; i <= 30; i++){System.out.println("Diger Gorev Sinifi : " + i);}       
        System.out.println("Mevcut thread bilgisi : " + Thread.currentThread().getName());
        System.out.println("Gorev - Aktif thread sayisi : " + Thread.activeCount());
    }    
}

public class Threads 
{
    public static void main(String[] args) 
    {
        //JOB1
        System.out.println("Program Basladi");
        Thread.currentThread().setName("Main Thread");
        System.out.println("Mevcut thread bilgisi : " + Thread.currentThread().getName());
        System.out.println("Gorev - Aktif thread sayisi : " + Thread.activeCount());
        
        //JOB2
        Runnable g1 = new Gorev();
        Thread gorev1 = new Thread(g1,"Gorev Thread");  //Thread.currentThread().setName("Gorev Sinifi Thread"); yerine kullanılabilir
        gorev1.start();
        
        //JOB3
        Runnable g2 = new DigerGorev();
        Thread gorev2 = new Thread(g2,"Diger Gorev Thread"); //Thread isimlendirirken bu yöntem kullanılabilir
        gorev2.start();
                
        //JOB4
        new Thread(new DigerGorev(), "Diger Gorev Thread 2").start(); //Başka bir thread oluşturup başlatma komutudur       
        
    }    
}