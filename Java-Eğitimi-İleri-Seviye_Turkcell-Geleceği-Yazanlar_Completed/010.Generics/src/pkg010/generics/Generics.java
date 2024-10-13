package pkg010.generics;

class Insan<T1,T2>
{
    private String isim;
    private T1 boy;
    private T2 kilo;
    public Insan(String isim, T1 boy, T2 kilo) 
    {
        this.isim = isim;
        this.boy = boy;
        this.kilo = kilo;
    }  
    public void bilgiVer()
    {
        System.out.println("Isim : " + isim + " Tip : " + isim.getClass().getName());
        System.out.println("Boy : " + boy + "Tip : " + boy.getClass().getName());
        System.out.println("Kilo : " + kilo + " Tip : " + kilo.getClass().getName());
    }
}

class Ogrenci<T1,T2,T3>
{
    private T1 okulNo;
    private T2 isim;
    private T3 girisYili;

    public Ogrenci(T1 okulNo, T2 isim, T3 girisYili) 
    {
        this.okulNo = okulNo;
        this.isim = isim;
        this.girisYili = girisYili;
    }
    public void bilgiVer()
    {
        System.out.println("Okul No : " + okulNo + " Tip : " + okulNo.getClass().getName());
        System.out.println("Isim : " + isim + " Tip : " + isim.getClass().getName());
        System.out.println("Giris Yili : " + girisYili + "Tip : " + girisYili.getClass().getName());
    }
    
}

public class Generics 
{
    public static void main(String[] args) 
    {
        Insan i1 =  new Insan("Ahmet", 1.73, 95.5f);
        i1.bilgiVer();
        
        System.out.println("------------");
        
        Insan i2 =  new Insan("Mehmet", 193, 95.5);
        i2.bilgiVer();
        
        System.out.println("------------------------------------");
        
        Ogrenci o1 = new Ogrenci("123123123", "Mehmet BAS", "2000");
        o1.bilgiVer();
        
        System.out.println("------------");
        
        Ogrenci o2 =  new Ogrenci<Long,String,Integer>(142123123536L, "Engin BAS", 2000);
        o2.bilgiVer();
    }    
}