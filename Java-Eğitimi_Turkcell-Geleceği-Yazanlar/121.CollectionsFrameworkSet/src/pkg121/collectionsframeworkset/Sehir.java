package pkg121.collectionsframeworkset;

public class Sehir implements Comparable<Sehir>
{
    private String plakaKodu;
    private String isim;
    
    public Sehir(){}
    public Sehir(String plakaKodu, String isim){this.plakaKodu = plakaKodu; this.isim = isim;}
    
    public String getPlakaKodu(){return plakaKodu;}
    public String getIsim(){return isim;}
    
    public void setPlakaKodu(String plakaKodu){this.plakaKodu = plakaKodu;}
    public void setIsim(String isim){this.isim = isim;}
    
    @Override
    public String toString()
    {
        return "Plaka kodu : " + plakaKodu + " Sehir : " + isim;
    }

    @Override
    public int compareTo(Sehir o)
    {        
        return this.plakaKodu.compareTo(o.plakaKodu);
    }
}
