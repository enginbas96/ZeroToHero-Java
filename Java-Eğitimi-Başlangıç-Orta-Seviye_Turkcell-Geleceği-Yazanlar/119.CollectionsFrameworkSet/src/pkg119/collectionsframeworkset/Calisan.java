package pkg119.collectionsframeworkset;

public class Calisan 
{
    private String tcNo;
    private String isim;
    
    public Calisan(String tcNo, String isim){this.tcNo=tcNo; this.isim = isim;}
    
    public String getIsim(){return isim;}
    public String getTcNo(){return tcNo;}
    
    public void setIsim(String isim){this.isim = isim;}
    public void setTcNo(String tcNo){this.tcNo = tcNo;}
    
    @Override
    public String toString()
    {
        return "TC : " + tcNo + " Isim : " + isim; 
    }
    
    @Override
    public int hashCode()
    {
        return Integer.valueOf(tcNo);
    }    
    
    @Override
    public boolean equals(Object o)
    {
        Calisan calisan = (Calisan)o;
        return calisan.tcNo.equals(this.tcNo);
    }       
}
