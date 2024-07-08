package pkg074.polymorphism;

public class Daire extends Sekil
{
    private int yaricap;
    public Daire(int r){yaricap = r;}
    public void setYariCap(int r){yaricap = r;}
    public int getYariCap(){return yaricap;}    
    public void Alan(){System.out.println("Alan = " + (Math.PI * Math.pow(yaricap, 2)));}  
    
}
