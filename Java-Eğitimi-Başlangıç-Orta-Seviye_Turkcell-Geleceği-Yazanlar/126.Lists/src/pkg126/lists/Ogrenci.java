package pkg126.lists;

public class Ogrenci 
{
    private int numara;
    private String ad;
    private String soyad;

    public Ogrenci() {}
    public Ogrenci(int numara, String ad, String soyad) 
    {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
    }
    
    public int getNumara(){return numara;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    
    public void setNumara(int numara){this.numara = numara;}
    public void setAd(String ad){this.ad = ad;}
    public void setSoyad(String ad){this.soyad = soyad;}
    
    @Override
    public String toString(){return"Numara : " + numara + "\t Ad : " + ad + "\t Soyad : " + soyad;}
    
    @Override
    public int hashCode(){return numara;}
    
    @Override
    public boolean equals(Object o)
    {
        Ogrenci ogrenci = (Ogrenci) o;
        return ogrenci.numara == this.numara;
    }
}
