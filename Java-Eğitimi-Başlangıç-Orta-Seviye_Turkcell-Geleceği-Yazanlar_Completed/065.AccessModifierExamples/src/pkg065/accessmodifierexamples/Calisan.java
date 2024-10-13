package pkg065.accessmodifierexamples;

import java.util.Date;

public class Calisan 
{
    //Set ve Get metotları ile çalışmak
    
    private String isim;
    private double maas;
    private Date iseGirisTarihi;
    
    public void setIsim(String s){isim = s;} 
    public void setMaas(double m){maas = m;} 
    public void setGirisTarih(Date t){iseGirisTarihi = t;} 
    
    public String getIsim(){ return isim;}
    public double getMaas(){ return maas;}
    public Date getGirisTarihi(){ return iseGirisTarihi;}
    
}
