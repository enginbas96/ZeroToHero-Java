package pkg041.threads;

public class Threads 
{
    public static void main(String[] args) 
    {
        //Bir kaynak oluşturuldu ve bu kaynak üretici ve tüketici tarafından kullanılacak
        Kaynak kaynak = new Kaynak();
        new Producer(kaynak);
        new Consumer(kaynak);     
    }    
}