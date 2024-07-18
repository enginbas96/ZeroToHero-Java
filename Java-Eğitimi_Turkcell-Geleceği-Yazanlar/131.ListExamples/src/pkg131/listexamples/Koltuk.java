package pkg131.listexamples;

import java.io.Serializable;

public class Koltuk implements Serializable
{
    private int numara;
    private Bilet bilet;

    public Koltuk() {}
    public Koltuk(int numara, Bilet bilet) {this.numara = numara; this.bilet = bilet;}
    
    public int getNumara(){return numara;}
    public Bilet getBilet(){return bilet;}
    
    public void setNumara(int numara){this.numara = numara;}
    public void setBilet(Bilet bilet){this.bilet = bilet;}    
    
    @Override
    public String toString()
    {
        return "Koltun no : " + numara + " Bilet : " + bilet.toString();
    }
    
    @Override
    public boolean equals(Object o)
    {
        Koltuk koltuk = (Koltuk)o;
        return this.numara == koltuk.numara && this.bilet.equals(koltuk.bilet);
    }
    
    @Override
    public int hashCode()
    {
        return numara + bilet.getNumara();
    }
}