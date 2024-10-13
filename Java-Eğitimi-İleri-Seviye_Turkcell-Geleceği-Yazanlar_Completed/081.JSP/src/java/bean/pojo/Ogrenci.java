package bean.pojo;
public  class Ogrenci
{
    private String no;
    private String ad;
    private String soyad;
    private int sinif;
    private char sube;

    public Ogrenci() {}    
    
    public Ogrenci(String no, String ad, String soyad, int sinif, char sube)
    {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        this.sube = sube;
    }
    
    public String getNo(){return no;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public int getSinif(){return sinif;}
    public char getSube(){return sube;}
    
    public void setNo(String no){this.no=no;}
    public void setAd(String ad){this.ad=ad;}
    public void setSoyad(String soyad){this.soyad=soyad;}
    public void setSinif(int sinif){this.sinif=sinif;}
    public void setSube(char sube){this.sube=sube;}    
}