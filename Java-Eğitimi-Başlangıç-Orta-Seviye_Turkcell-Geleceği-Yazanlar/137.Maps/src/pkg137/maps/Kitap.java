package pkg137.maps;

import java.io.Serializable;
import java.util.Date;

public class Kitap implements Serializable
{
    private String ad;
    private Date yayinTarihi;
    private String yazar;

    public Kitap() {}
    public Kitap(String ad, Date yayinTarihi, String yazar) 
    {
        this.ad = ad;
        this.yayinTarihi = yayinTarihi;
        this.yazar = yazar;
    }
    
    public String getAd(){return ad;}
    public Date getYayinTarihi(){return yayinTarihi;}
    public String getYazar(){return yazar;}
    
    public void setAd(String ad){this.ad = ad;}
    public void setYayinTarihi(Date yayinTarihi){this.yayinTarihi = yayinTarihi;}
    public void setYazar(String yazar){this.yazar = yazar;}
    
    @Override
    public boolean equals(Object o)
    {
        Kitap kitap = (Kitap)o;
        return kitap.ad.equals(this.ad) && kitap.yazar.equals(this.yazar) && kitap.yayinTarihi.equals(this.yayinTarihi);
    }
    
    @Override
    public int hashCode()
    {
        return ad.hashCode() + yayinTarihi.hashCode() + yazar.hashCode();
    }
    
    @Override
    public String toString()
    {
        return"Ad : " + ad + "\t Yazar : " + yazar + "\t Yayin Tarihi : " + yayinTarihi;
    }
}
