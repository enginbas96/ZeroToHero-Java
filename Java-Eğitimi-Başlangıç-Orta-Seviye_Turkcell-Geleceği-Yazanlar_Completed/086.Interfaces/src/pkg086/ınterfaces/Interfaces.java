package pkg086.ınterfaces;

public class Interfaces
{
    public static void main(String[] args) 
    {
        Yuzebilir balik = new Balik();
        balik.yuz();
        
        Yuzebilir penguen = new Penguen();
        penguen.yuz();
        
        Yuruyebilir zebra = new Zebra();
        zebra.yuru();
        
        System.out.println("----------------------------------------");
        
        Karga karga = new Karga();
        karga.uc();
        karga.yuru();
    }    
}
