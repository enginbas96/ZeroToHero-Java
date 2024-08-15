package pkg041.threads;

public class Consumer implements Runnable
{
    private Kaynak kaynak;
    public Consumer(Kaynak kaynak)
    {
        this.kaynak = kaynak;
        Thread gorev = new Thread(this, "Consumer");
        gorev.start();
    }

    @Override
    public void run() 
    {
        while(true)
        {
            System.out.println(kaynak.getTuketimNo() + " deger tuketildi.");
            try 
            {
                Thread.sleep(500);
            } 
            catch (Exception e)
            {
                e.printStackTrace();
            } 
        }        
    }    
}