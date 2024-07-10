package pkg090.overloadingexamples;

import java.util.Date;

public class Calisan
{
    private String isim;
    private String bolum;
    private Date iseGirisTarihi;
    
    //Aynı sınıf içerisinde aynı metotların farklı parametrelerde çağırılabilmesine overloading olayı denir.
    public Calisan(){}
    public Calisan(String isim){this.isim = isim;}
    public Calisan(String isim, String bolum ){this.isim = isim; this.bolum = bolum;}
    public Calisan(String isim, String bolum, Date iseGirisTarihi){this.isim = isim; this.bolum = bolum; this.iseGirisTarihi = iseGirisTarihi;}
    
    public String getIsim(){return isim;}
    public String getBolum(){return bolum;}
    public Date getIseGirisTarihi(){return iseGirisTarihi;}
    
    public void setIsim(String isim){this.isim = isim;}
    public void setBolum(String bolum){this.bolum = bolum;}
    public void setIseGirisTarihi(Date iseGirisTarihi){this.iseGirisTarihi = iseGirisTarihi;}
    
    public void bilgileriYazdir()
    {
        System.out.println("Ad : " + getIsim());
        System.out.println("Bolum : " + getBolum());
        System.out.println("Giris Tarihi : " + getIseGirisTarihi());
        System.out.println("-------------------------------------------------------");
    }    
}
