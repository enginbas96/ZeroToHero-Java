package pkg086.ınterfaces;

public class Karga implements Ucabilir, Yuruyebilir
{
    @Override
    public void uc() 
    {
        System.out.println("Karga ucabilir.");
    }    
    @Override
    public void yuru()
    {
        System.out.println("Kargalar yurur.");
    }    
}
