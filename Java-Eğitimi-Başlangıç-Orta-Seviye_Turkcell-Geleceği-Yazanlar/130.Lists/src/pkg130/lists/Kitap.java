package pkg130.lists;

import java.io.Serializable;

public class Kitap implements Serializable
{
    private String ad;
    private int yil;
    private Yazar yazar;
    
    public Kitap(){}
    public Kitap(String ad, int yil, Yazar yazar){this.ad = ad; this.yil = yil; this.yazar = yazar;}
    
    public String getAd(){return ad;}
    public int getYil(){return yil;}
    public Yazar getYazar(){return yazar;}
    
    public void setAd(String ad){this.ad = ad;}
    public void setYil(int yil){this.yil = yil;}
    public void setYazar(Yazar yazar){this.yazar = yazar;}    
    
    @Override
    public boolean equals(Object o)
    {
        Kitap kitap = (Kitap)o;
        return kitap.ad.equals(this.ad) && kitap.yazar.equals(this.yazar);
    }
        
    @Override
    public String toString()
    {
        return "Ad : " + ad + " Yazar : " + yazar + " Yil : " + yil;
    }
}
