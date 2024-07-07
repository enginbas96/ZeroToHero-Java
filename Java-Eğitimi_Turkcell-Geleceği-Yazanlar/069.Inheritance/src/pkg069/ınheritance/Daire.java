package pkg069.ınheritance;

public class Daire extends Sekil
{
    private int yariCap;
    
    public int getYaricap(){return yariCap;}
    public void setYaricap(int yc){yariCap = yc;}
    public void alanHesapla(){System.out.println("Alan: " + (Math.PI * yariCap * yariCap));}
}
