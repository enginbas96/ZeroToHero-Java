package pkg074.polymorphism;


public class Dikdortgen extends Sekil
{
    private int genislik, yukseklik;
    public Dikdortgen(int g, int y){genislik=g; yukseklik=y;}
    public void setGenislik(int g){genislik=g;}
    public void setYukseklik(int y){yukseklik=y;}
    public int getGenislik(){return genislik;}
    public int getYukseklik(){return yukseklik;}
    public void Alan(){System.out.println("Alan = " + (genislik * yukseklik));}
    
}
