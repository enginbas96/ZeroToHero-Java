package pkg041.threads;

public class Kaynak
{
    private int tuketimNo;
    private boolean uretimMi = true;
    
    public synchronized int getTuketimNo()
    {
        while(uretimMi)
        {
            try 
            {
                wait();
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }            
        }        
        uretimMi = true;
        notify();
        return tuketimNo;
    }
    
    public synchronized void setTuketimNo(int tuketimNo)
    {
        while(!uretimMi)
        {
            try 
            {
                wait();
            }
            catch (Exception e) 
            {
                e.printStackTrace();
            }            
        }
        this.tuketimNo = tuketimNo;
        System.out.println(tuketimNo + " degeri uretildi.");
        uretimMi = false;
        notify();
    }    
}