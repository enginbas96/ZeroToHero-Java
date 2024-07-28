package pkg161.streamapı;

import java.io.Serializable;

public class Ogrenci implements Serializable
{
    private int no;
    private String isim;
    private int yas;

    public Ogrenci(){}

    public Ogrenci(int no, String isim, int yas) 
    {
        this.no = no;
        this.isim = isim;
        this.yas = yas;
    }
    
    public int getNo(){return no;}
    public String getIsim(){return isim;}
    public int getYas(){return yas;}
    
    public void setNo(int no){this.no = no;}
    public void setIsim(String isim){this.isim = isim;}
    public void setYas(int yas){this.yas = yas;}    
    
    @Override
    public int hashCode()
    {
        return no;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Ogrenci ogrenci = (Ogrenci)o;
        return ogrenci.no == this.no;
    }
    
    @Override
    public String toString()
    {
        return "No : " + no + " Isim : " + isim + " Yas : " + yas;
    }    
}
