package pkg156.methodreferences;

import java.io.Serializable;

public class Bisiklet implements Serializable
{
    private String marka;
    private int vitesSayisi;

    public Bisiklet(){}
    
    public Bisiklet(String marka){this.marka = marka;}

    public Bisiklet(String marka, int vitesSayisi) 
    {
        this.marka = marka;
        this.vitesSayisi = vitesSayisi;
    }
    
    public int getVitesSayisi(){return vitesSayisi;}
    public String getMarka(){return marka;}
    
    @Override
    public String toString()
    {
        return "Marka : " + marka + "\t Vites Sayisi : " + vitesSayisi;
    }
    
    @Override
    public int hashCode(){return marka.hashCode() + vitesSayisi;}
    
    @Override
    public boolean equals(Object o)
    {
        Bisiklet bisiklet = (Bisiklet) o;
        return marka.equals(bisiklet.marka) && vitesSayisi == bisiklet.vitesSayisi;
    } 
}
