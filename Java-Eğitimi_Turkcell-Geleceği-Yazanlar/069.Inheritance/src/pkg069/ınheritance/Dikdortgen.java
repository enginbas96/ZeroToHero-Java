package pkg069.ınheritance;

public class Dikdortgen extends Sekil
{
    private int genislik;
    private int yukseklik;
    
    public int getGenislik(){return genislik;}
    public int getYukseklik(){return yukseklik;}    
    public void setGenislik(int g){ genislik = g;}
    public void setYukseklik(int y){yukseklik = y;}
    public void alanHesapla(){System.out.println("Alan: " + (genislik + yukseklik));}
}
