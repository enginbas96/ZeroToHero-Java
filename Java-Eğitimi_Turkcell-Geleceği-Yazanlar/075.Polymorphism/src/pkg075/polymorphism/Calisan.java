package pkg075.polymorphism;

public class Calisan 
{
    private String isim;
    private String gorev;
    private int maas;
    
    public Calisan(String i, String g, int m)
    {
        isim = i;
        gorev = g;
        maas = m;        
    }
   
    public void setIsım(String i){isim = i;}
    public void setGorev(String g){gorev = g;}
    public void setMaas(int m){maas = m;}
    
    public String getIsım(){return isim;}
    public String getGorev(){return gorev;}
    public int getMaas(){return maas;}    
    
    public void Ozet()
    {
        System.out.println("Isim : " + isim);
        System.out.println("Gorev : " + gorev);
        System.out.println("Maas : " + maas);
    }
}
