package pkg088.overloadingoverriding;

public class HesapMakinesi
{
    public int topla(int x, int y){System.out.println("(int x, int y)");return x+y;}
    //public float topla(int x, int y){return x+y;}
    public float topla(float x, float y){System.out.println("(float x, float y)");return x+y;}
    public float topla(int x, float y){System.out.println("(int x, float y)");return x+y;}
    public float topla(float x, int y){System.out.println("(float x, int y)");return x+y;}
}
