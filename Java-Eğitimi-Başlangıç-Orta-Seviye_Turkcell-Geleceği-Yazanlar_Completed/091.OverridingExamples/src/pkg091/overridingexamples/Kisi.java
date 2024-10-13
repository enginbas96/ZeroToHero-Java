package pkg091.overridingexamples;

public class Kisi 
{
    private String tcNo;
    private String isim;
    
    public Kisi(){}
    public Kisi(String tcNo, String isim){this.tcNo = tcNo; this.isim = isim;}
    
    public String getTcNo(){return tcNo;}
    public String getIsim(){return isim;}
    
    public void setTcNo(String tcNo){this.tcNo = tcNo;}
    public void setIsim(String isim){this.isim = isim;}    
    
    @Override
     public boolean equals(Object other)
    {
        Kisi kisi = (Kisi) other;
        return (kisi.tcNo.equals(this.tcNo)) && (kisi.isim.equals(this.isim)) ;
    }    
    @Override
    public String toString()
    {
        return ("Tc No : " + getTcNo() + " Isim : " + getIsim());
    }
}
