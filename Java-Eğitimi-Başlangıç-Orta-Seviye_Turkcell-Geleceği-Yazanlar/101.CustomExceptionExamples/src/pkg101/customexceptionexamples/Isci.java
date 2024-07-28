package pkg101.customexceptionexamples;

public class Isci 
{
    private String isim;
    private double maas;
    
    public String getIsim(){return isim;}
    public double getMaas(){return maas;}
    
    //public class HataliDeger extends Exception kullanıldıgından throws u belirtmek gerkiyor
    public void setIsim(String isim) throws HataliDeger 
    {
        if(isim == null || isim.trim().length() == 0)
        {
            throw new HataliDeger("Isim", isim);
        }   
        this.isim = isim;
    }
    //public class HataliDeger extends Exception kullanıldıgından throws u belirtmek gerkiyor
    public void setMaas(double maas) throws HataliDeger
    {
        if(maas <= 0)
        {
            throw new HataliDeger("Maas", maas);
        }
        this.maas = maas;
    }
    
    @Override
    public String toString()
    {
        return "Isim : " + getIsim() + " Maas : " + getMaas();
    }
}
