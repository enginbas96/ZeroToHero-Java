package pkg089.overloadingoverriding;

public class Araba 
{
    private String marka;
    private String model;
    private int yil;
    
    public Araba(){}
    public Araba(String marka, String model, int yil){this.marka = marka; this.model = model; this.yil = yil;}
    
    public String getMarka(){return marka;}
    public String getModel(){return model;}
    public int getYil(){return yil;}
    
    public void setMarka(String marka){this.marka = marka;}
    public void setModel(String model){this.model = model;}
    public void setYil(int yil){this.yil = yil;}
    
    @Override
    public String toString() //String sınıfının toString metodunu ezmiş olduk
    {
        return ("Marka: " + getMarka() + " Model : " + getModel() + " Yil : " + getYil());
    }
}
