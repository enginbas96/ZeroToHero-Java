package pkg035.threads;

class UstGorev
{
    
}
class Gorev extends UstGorev implements Runnable 
//Miras alarak kullanmanın yolu aksi halde Threads sınıfını miras alacaktı ve diğer sınıfı mrias alamayacaktır
{
    @Override
    public void run()
    {
        Thread.currentThread().setName("Gorev Sinifi Thredi");
        for (int i = 0; i < 10; i++) {System.out.println(i);}
        System.out.println("Aktif Thread : " + Thread.activeCount());
        System.out.println("Mevcut Thread Bilgisi : " + Thread.currentThread().getName());
    }
}

public class Threads
{
    public static void main(String[] args) 
    {
        //Thread sınfını miras almadan thread oluşturma 
        System.out.println("Program basladi");
        System.out.println("Aktif Thread : " + Thread.activeCount());
        System.out.println("Mevcut Thread Bilgisi : " + Thread.currentThread().getName());
        
        Runnable g1 = new Gorev();
        Thread gorev =new Thread(g1);
        gorev.start();
        
        System.out.println("Program sonlandi");
        System.out.println("Aktif Thread : " + Thread.activeCount());
        System.out.println("Mevcut Thread Bilgisi : " + Thread.currentThread().getName());
    }    
}