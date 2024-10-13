
package pkg135.maps;

import java.io.Serializable;

public class Kisi implements Serializable //Seiralizable diske yazılabilir veya network'te herhangi bir yere gönderilebilir
{
    private String tc;
    private String ad;
    private String soyad;
    private Cinsiyet cinsiyet;

    public Kisi() {}
    public Kisi(String tc, String ad, String soyad, Cinsiyet cinsiyet) 
    {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
    }
    
    public String getTc(){return tc;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public Cinsiyet getCinsiyet(){return cinsiyet;}
    
    public void setTc(String tc){this.tc = tc;}
    public void setAd(String ad){this.ad = ad;}
    public void setSoyad(String soyad){this.soyad = soyad;}
    public void setCinsiyet(Cinsiyet cinsiyet){this.cinsiyet = cinsiyet;}
    
    @Override
    public int hashCode()
    {
        return tc.hashCode();
    }
    @Override
    public String toString()
    {
        return "TC : " + tc + "\t Ad : " + ad + "\t Soyad : " + soyad + "\t Cinsiyet : " + cinsiyet;
    }
    @Override
    public boolean equals(Object o)
    {
        Kisi kisi = (Kisi)o;
        return kisi.tc.equals(this.tc);
    }
}
