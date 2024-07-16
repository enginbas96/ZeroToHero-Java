package pkg124.setexamples;

public class Ogrenci implements Comparable<Ogrenci>
{
    private int numara;
    private String ad;
    private String soyad;
    private String sinif;
    
    public Ogrenci(){}
    
    public Ogrenci(int numara, String ad, String soyad, String sinif)
    {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }
    
    public int getNumara(){return numara;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public String getSinif(){return sinif;}
    
    public void setNumara(int numara){this.numara = numara;}
    public void setAd(String ad){this.ad =ad;}
    public void setSoyad(String soyad){this.soyad =soyad;}
    public void setSinif(String sinif){this.sinif =sinif;}
    
    @Override
    public boolean equals(Object o)
    {
        Ogrenci ogrenci = (Ogrenci) o ;
        return ogrenci.numara == this.numara;
    }
    
    @Override
    public int hashCode()
    {
        return this.numara;
    }
    
    @Override
    public String toString()
    {
        return "Numara : " + numara + " Sinif : " + sinif + " Ad : " + ad + " Soyad : " + soyad;
    }

    @Override
    public int compareTo(Ogrenci o) 
    {
        return this.numara - o.numara;
        //Buradan geriye 0 dönerse iki öğrencinin numarası aynı oldugu anlasılacak
        //Eğer ilk öğrencinin numarası ikinci öğrencinin numarasından çıkarıldığında negatif ise ilk öğrencinin numarası geride, pozitif ise ileride demektir
    }
}
