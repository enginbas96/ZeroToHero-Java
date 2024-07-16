package pkg120.collectionsframeworkset;

public class Araba 
{
    private String plaka;
    private String marka;
    private String model;
    
    public Araba(){}
    
    public Araba(String plaka, String marka, String model)
    {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
    }
    
    public String getPlaka(){return plaka;}
    public String getMarka(){return marka;}
    public String getModel(){return model;}
    
    public void setPlaka(String plaka){this.plaka = plaka;}
    public void setMarka(String marka){this.marka = marka;}
    public void setModel(String model){this.model = model;}
    
    @Override
    public boolean equals(Object o)
    {
        Araba araba = (Araba) o;
        return araba.plaka.equals(this.plaka);
    }
    
    @Override
    public int hashCode()
    {
        return this.plaka.hashCode();
    }    
    
    @Override
    public String toString()
    {
        return "Plaka : " + plaka + " Marka : " + marka + " Model : " + model;
    }
}
