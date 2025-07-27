public class KronometreThread implements Runnable
{
    private Thread thread;
    private String threadName;


    public KronometreThread(String threadName)
    {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName );
    }

    @Override
    public void run()
    {
        System.out.println("Çalıştırılıyor: " + threadName);
        try
        {
            for(int i =1; i<=10; i++)
            {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
                System.out.println("------------");
            }
        }
        catch (Exception e)
        {
            System.out.println("Thread bozuldu : " + threadName);
        }

        System.out.println("Thread bitti : " + threadName);
    }

    public void Start()
    {
        System.out.println("Thread nesnesi oluşturuluyor");
        if(thread == null)
        {
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
