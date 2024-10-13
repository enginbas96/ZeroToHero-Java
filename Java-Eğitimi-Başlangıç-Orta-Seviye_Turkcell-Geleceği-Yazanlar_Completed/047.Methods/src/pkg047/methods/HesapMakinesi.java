package pkg047.methods;
public class HesapMakinesi 
{
    //Hesap makinesi yapalım
    public float topla(float x, float y)
    {
        return (x+y);
    }
    public float cikar(float x, float y)
    {
        return (x-y);
    }
    public float carp(float x, float y)
    {
        return (x*y);
    }
    public float bol(float x, float y)
    {
        return (x/y);
    } 
    private float mod(float x, float y) //private yapılmasındaki amaç sadece kendi sınıfı içerisinde yazdırılabilmesidir.
    {
        return (x%y);
    } 
    public float kare(float x)
    {
        return (float)Math.pow(x,2); //Math.pow donuşu double oldugundan float dönüşümü yapmak gerekmektedir
    }    
    public float kareKok(float x)
    {
        return (float)Math.sqrt(x);
    }
}
