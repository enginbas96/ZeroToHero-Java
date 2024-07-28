package pkg117.collectionsframeworkset;

public class Ogrenci implements Comparable<Ogrenci>
{
    private int numara;
    private String ad;
    
    public Ogrenci(){}
    public Ogrenci(int numara, String ad){this.ad = ad; this.numara = numara;}
    
    public int getNumara(){return numara;}
    public String getAd(){return ad;}
    
    public void setNumara(int numara){this.numara = numara;}
    public void setAd(String ad){this.ad = ad;}
    
    @Override
    public String toString()
    {
        return "Numara : " + numara + " Ad : " + ad;
    }

    @Override
    public int compareTo(Ogrenci o) {
        //return o.numara - this.numara;//Buyukten kucuge sıralama
        //return this.numara - o.numara;//Kucukten buyuge sıralama
        return o.ad.compareTo(this.ad); // Alfabetik olarak sıralama
    }
}
