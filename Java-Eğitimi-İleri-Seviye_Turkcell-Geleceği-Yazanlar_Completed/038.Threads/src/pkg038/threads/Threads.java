package pkg038.threads;

class Gorev implements Runnable
{
    @Override
    public void run() 
    {        
        for (int i = 0; i < 15; i++) {System.out.println(Thread.currentThread().getName() + " Gorev Sinifi : " + i);}
        System.out.println("Mevcut thread bilgisi : " + Thread.currentThread().getName());
        System.out.println("Gorev - Aktif thread sayisi : " + Thread.activeCount());        
    }    
}

public class Threads 
{    
    public static void main(String[] args) 
    {
        //Öncelik ayarlamak .setPriority(5); default değer olarak 5 atanmaktadır
        //1 ile 10 arasında numaralandırılır
        //10 numara > 1 numara
        //ilk 10 yapılır sonra 1 yapılır 
        //bunun anlamı ilk en yüksek olanı bitirip diğer threade başlamak değil sadece boş olan threadleri ilk önce 10'a yakın olana atamakatır
        //ki bu atama işlemi olsa bile bazen düşük öncelikli threadler önce çalışabilmektedir
        
        Runnable g1 = new Gorev();
        Thread gorev1 = new Thread(g1, "Gorev Sinifi Thread - 1");       
        gorev1.setPriority(2);
        gorev1.start();    
        
        Runnable g2 = new Gorev();
        Thread gorev2 = new Thread(g2, "Gorev Sinifi Thread - 2");        
        gorev2.setPriority(9);
        gorev2.start();
    }    
}