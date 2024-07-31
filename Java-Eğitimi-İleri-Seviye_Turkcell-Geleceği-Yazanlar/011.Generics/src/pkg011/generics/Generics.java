package pkg011.generics;

class Elma <T,U,V,Y,Z>
{
    public void bilgiVer(T a, U b, V c) 
    //Static metotlar sınır metotlar oldugundan ötürü sınıfın tipleri ile aynı iisimde olmasına rağmen çakışma olmuyor            
    {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }      
    
    public <T,U,V> void bilgiVer2(T a, U b, V c) 
    //Static metotlar sınır metotlar oldugundan ötürü sınıfın tipleri ile aynı iisimde olmasına rağmen çakışma olmuyor            
    {
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }    
}

public class Generics 
{
    public static void main(String[] args)
    {
        //(new Elma<String,String,Integer,Float,Long>()).bilgiVer(1, 1.1, 1.2f); //Tipler çakıştığından hata vermektedir
        (new Elma<String,String,Integer,Float,Long>()).bilgiVer2(1, 1.1, 1.2f); 
        //Eğer bilgi ver metodu static yerine normal bir metot olsaydı yukarıdaki String String Integer kuralına uymak etmek gerekecekti          
    } 
}