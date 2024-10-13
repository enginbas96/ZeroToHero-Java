package pkg048.methods;
public class HesapMakinesi 
{
    static int x = 5;
    //Hesap makinesi yapalım
    public static float topla(float x, float y)
    {
        return (x+y);
    }
    public static float cikar(float x, float y)
    {
        return (x-y);
    }
    public static float carp(float x, float y)
    {
        return (x*y);
    }
    public static float bol(float x, float y)
    {
        return (x/y);
    } 
    private static float mod(float x, float y) //private yapılmasındaki amaç sadece kendi sınıfı içerisinde yazdırılabilmesidir.
    {
        return (x%y);
    } 
    public static float kare(float x)
    {
        return (float)Math.pow(x,2); //Math.pow donuşu double oldugundan float dönüşümü yapmak gerekmektedir
    }    
    public static float kareKok(float x)
    {
        return (float)Math.sqrt(x);
    }
}