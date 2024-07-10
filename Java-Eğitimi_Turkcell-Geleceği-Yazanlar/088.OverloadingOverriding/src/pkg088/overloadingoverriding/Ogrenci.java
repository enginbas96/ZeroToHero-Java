package pkg088.overloadingoverriding;

public class Ogrenci 
{
    private String kimlik;
    private String ad;
    private String soyad;
    private String sinif;
    
    //Overloading örnekleri, overloading yapıcı metotlarda da çalışır
    public Ogrenci(){}
    public Ogrenci(String kimlik){this.kimlik = kimlik;}
    public Ogrenci(String kimlik, String ad){this.kimlik = kimlik; this.ad = ad;}
    public Ogrenci(String kimlik, String ad, String soyad, String sinif){this.kimlik = kimlik; this.ad = ad; this.soyad = soyad; this.sinif = sinif;}
    
    public String getKimlik(){return kimlik;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public String getSinif(){return sinif;}
    
    public void setKimlik(String kimlik){this.kimlik = kimlik;}
    public void setAd(String ad){this.ad = ad;}
    public void setSoyad(String soyad){this.soyad = soyad;}
    public void setSinif(String sinif){this.sinif = sinif;}
}
