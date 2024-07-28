package pkg149.functionalınterfaceexamples;

import java.io.Serializable;

public class Ogrenci implements Serializable
{
    private int numara;
    private String ad;
    private int notOrtalamasi;

    public Ogrenci() {}

    public Ogrenci(int numara, String ad, int notOrtalamasi) 
    {
        this.numara = numara;
        this.ad = ad;
        this.notOrtalamasi = notOrtalamasi;
    }
    
    public int getNumara(){return numara;}
    public String getAd(){return ad;}
    public int getOrtalama(){return notOrtalamasi;}
    
    public void setNumara(int numara){this.numara = numara;}
    public void setAd(String ad){this.ad = ad;}
    public void setOrtalama(int notOrtalamasi){this.notOrtalamasi = notOrtalamasi;}
    
    @Override
    public int hashCode()
    {
        return numara;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Ogrenci ogrenci = (Ogrenci) o;
        return this.numara == ogrenci.numara;
    }
    
    @Override
    public String toString()    
    {
        return "Numara : " + numara + "\t Ad : " + ad + "\t Ortalama : " + notOrtalamasi;
    }
}
