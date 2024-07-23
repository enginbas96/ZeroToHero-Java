package pkg146.lambdaexpressionexamples;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable
{
    public enum Cinsiyet
    {
        ERKEK, KADIN
    }    
    
    private String isim;
    private LocalDate dogumTarihi;
    private String emailAdresi;
    private Cinsiyet cinsiyet;

    public Kisi() {}
    public Kisi(String isim, LocalDate dogumTarihi, String emailAdresi, Cinsiyet cinsiyet) 
    {
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.emailAdresi = emailAdresi;
        this.cinsiyet = cinsiyet;
    }   
    
    public String getIsim(){return isim;}
    public LocalDate getDogumTarihi(){return dogumTarihi;}
    public String getMail(){return emailAdresi;}
    public Cinsiyet getCinsiyet(){return cinsiyet;}
    public int getYas(){return LocalDate.now().getYear() - dogumTarihi.getYear();}
    
    public void setIsim(String isim){this.isim = isim;}
    public void setDogumTarihi(LocalDate dogumTarihi){this.dogumTarihi = dogumTarihi;}
    public void setMail(String emailAdresi){this.emailAdresi = emailAdresi;}
    public void setCinsiyet(Cinsiyet cinsiyet){this.cinsiyet = cinsiyet;}
    
    @Override
    public int hashCode()
    {
        return emailAdresi.hashCode();
    }
    
    @Override
    public boolean equals(Object o)
    {
        Kisi kisi = (Kisi)o;
        return this.emailAdresi.equals(kisi.emailAdresi);
    }
    
    @Override
    public String toString()
    {
        return "Ad : " + isim + "\t Dogum Tarihi : " + dogumTarihi + "\t Email Adresi : " + emailAdresi + "\t Cinsiyet : " + cinsiyet + "\t Yasi : " + getYas();
    }
}
