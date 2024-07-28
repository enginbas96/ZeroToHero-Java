package pkg066.accessmodifierexamples;

public class Kare 
{
    private int kenarUzunlugu;
    private int x;
    private int y;
    
    public int getX(){return x;}
    public int getY(){return y;}
    public int getUzunluk(){return kenarUzunlugu;}
    
    public void setX(int _x)
    {
        if(_x >= 0){x = _x;}
        else { System.out.println("X degeri 0 veya 0'dan buyuk olmali."); }        
    }
    
    public void setY(int _y)
    {
        if(_y >= 0){y = _y;}
        else { System.out.println("Y degeri 0 veya 0'dan buyuk olmali."); }        
    }
    
    public void setUzunluk(int uzunluk)
    {
         if(uzunluk > 0){kenarUzunlugu = uzunluk;}
        else { System.out.println("Uzunluk degeri 0'dan buyuk olmali."); }       
    }   
    
    public void ekranaBastir()
    {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Uzunluk: " + kenarUzunlugu);
    }
}
