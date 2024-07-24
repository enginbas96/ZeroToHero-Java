package pkg148.functionalınterfaces;

import java.io.Serializable;

public class Urun implements Serializable
{
    private int id;
    private String adi;
    private double fiyat;

    public Urun() { }

    public Urun(int id, String adi, double fiyat) 
    {
        this.id = id;
        this.adi = adi;
        this.fiyat = fiyat;
    }
        
    public int getId(){return id;}
    public String getAd(){return adi;}
    public double getFiyat(){return fiyat;}
    
    public void setId(int id){this.id = id;}
    public void setAd(String adi){this.adi = adi;}
    public void setFiyat(double fiyat){this.fiyat = fiyat;}
    
    @Override
    public int hashCode()
    {
        return id;
    }
        
    @Override
    public boolean equals(Object o)
    {
        Urun urun = (Urun)o;
        return this.id == urun.id;
    }
    
    @Override
    public String toString()
    {
        return "ID: " + id + " Ad: " + adi + " Fiyat: " + fiyat;
    }
    
}
