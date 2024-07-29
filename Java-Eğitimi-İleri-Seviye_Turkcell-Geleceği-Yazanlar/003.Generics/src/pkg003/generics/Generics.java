package pkg003.generics;

interface Donusum<T1,T2> //2 Adet tip alıyoruz T1 ve T2 bunlar integer,string vb tipler olabilir
{
    //T1 tipinde cevir metodu parametre olarak T2 tipinde x değeri alıyor
    //Burada metodun kısa tanımlaması yapılmış
    T1 cevir(T2 x); //T2 tipli bir değer T1 tipli bir değere çevirilecek
    T2 tersCevir(T1 x); //T1 tipki bir değer T2 tipli bir değere çevirilecek
}

class Helper implements Donusum<String, Integer>
{
    @Override
    public String cevir(Integer x) {return x.toString();}

    @Override
    public Integer tersCevir(String x) {return Integer.parseInt(x);}
}

public class Generics 
{
    public static void main(String[] args) 
    {
        Helper h1 = new Helper();
        String s1 = "456";
        int i1 = 123;
        
        System.out.println(h1.cevir(i1));
        System.out.println(h1.tersCevir(s1));
        
        System.out.println(h1.cevir(i1).getClass().getName()); //İnteger olan bir değeri stringe çevirdik
        System.out.println(h1.tersCevir(s1).getClass().getName()); //String olan bir değeri integera çevirdik
        
        System.out.println(h1.tersCevir(s1) + i1);
        System.out.println(h1.cevir(i1) + s1);
    }    
}