package pkg074.polymorphism;

public class Kare extends Sekil
{    
    private int kenarUzunluk;
    
    public Kare(int u){kenarUzunluk = u;}
    public void setUzunluk(int ku){kenarUzunluk = ku;}
    public int getUzunluk(){return kenarUzunluk;}    
    public void Alan(){System.out.println("Alan = " + (kenarUzunluk * kenarUzunluk));}    
}
