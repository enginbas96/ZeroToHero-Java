package pkg009.generics;

class Araba<T>
{
    private T marka;
    private T model;
    private T yil;

    public Araba() {}

    public Araba(T marka, T model, T yil) 
    {
        System.out.println(Helper.getType(marka));
        System.out.println(Helper.getType(model));
        System.out.println(Helper.getType(yil));
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    
    public void bilgiVer()
    {
        String bilgi = "Marka : " + marka + " Model : " + model + " Yil : " + yil;
        System.out.println(bilgi);
    }
    
    @Override
    public String toString()
    {
        return "Marka : " + marka + " Model : " + model + " Yil : " + yil;
    }    
}

class Helper
{
    public static void bilgiVer(String bilgi)
    {
        System.out.println(bilgi);
    }
    
    public static <T> String getType(T degisken)
    {
        String[] kelimeler =  degisken.getClass().getName().split("\\.");
        String sinifIsmi = kelimeler[kelimeler.length-1];
        return sinifIsmi;   
    }
}

public class Generics
{
    public static void main(String[] args) 
    {
        Araba a1 = new Araba("X Marka", "Y Model", 1996);
        a1.bilgiVer();//Bilgiver metodunun döndüsünü alır
        
        System.out.println("--------------------------------------");
        
        Araba a2 =  new Araba("Z Marka", 5, 2003);
        System.out.println(a2); //ToString metodunun çıktısını döndürecektir
        
        System.out.println("--------------------------------------");
        
        Araba a3 =  new Araba<String>("Z Marka", "T Model", "2000");
        System.out.println(a3);  
    }    
}