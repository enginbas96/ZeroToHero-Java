package pkg053.jdbc;

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
    
    private void setID(int ID){this.ID = ID;}
    private void setNo(String no){this.no = no;}
    private void setkAdi(String kAdi){this.kAdi = kAdi;}
    private void setAd(String ad){this.ad = ad;}
    private void setSoyad(String soyad){this.soyad = soyad;}
    
    public void bilgiVer()
    {
        String bilgi = "Ogrenci No: " + no + " Adi Soyad: " + ad + " " + soyad + " Kullanici Adi: " + kAdi;
        System.out.println(bilgi);
    } 
}
