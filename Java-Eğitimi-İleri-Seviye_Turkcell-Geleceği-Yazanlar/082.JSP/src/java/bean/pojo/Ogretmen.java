
package bean.pojo;

public class Ogretmen 
{
    private int no;
    private String ad;
    private String soyad;
    private String brans;

    public Ogretmen(){}

    public Ogretmen(int no, String ad, String soyad, String brans) 
    {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
    }
    
    public int getNo(){return no;}
    public String getAd(){return ad;}
    public String getSoyad(){return soyad;}
    public String getBrans(){return brans;}
    
    public void setNo(int no){this.no=no;}
    public void setAd(String ad){this.ad=ad;}
    public void setSoyad(String soyad){this.soyad=soyad;}
    public void setBrans(String brans){this.brans=brans;}
    
}
