package pkg057.jdbc;

public class Ogrenci 
{    
    private int ID;
    private String no;
    private String kAdi;
    private String ad;
    private String soyad;   
    
    public int getID(){return ID;}
    public String getNo(){return no;}
    public String getkAdi(){return kAdi;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    
    public void setID(int ID){this.ID = ID;}
    public void setNo(String no){this.no = no;}
    public void setkAdi(String kAdi){this.kAdi = kAdi;}
    public void setAd(String ad){this.ad = ad;}
    public void setSoyad(String soyad){this.soyad = soyad;}
    
    public void bilgiVer()
    {
        String bilgi = "Ogrenci No: " + no + " Adi Soyad: " + ad + " " + soyad + " Kullanici Adi: " + kAdi;
        System.out.println(bilgi);
    } 
}
