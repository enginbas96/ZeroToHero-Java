package pkg034.threads;

public class Gorev extends Thread
{
    @Override
    public void run() //Thread sınıfının içindeki run metodunun yerine yazılmış metot
    {
        for (int i = 1; i <= 3; i++) 
        {
            System.out.println(i);            
        }
        System.out.println("Mevcut Threads bilgisi : " + Thread.currentThread().getName());
    }
    
    
    
    
    
    
}
