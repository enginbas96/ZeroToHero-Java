package pkg091.overridingexamples;

public class OverridingExamples 
{
    public static void main(String[] args) 
    {
        Kisi k1 = new Kisi("123","Ahmet Ali");
        System.out.println(k1.toString());
        
        Kisi k2 = new Kisi("123", "Ahmet Ali");
        System.out.println(k2.toString());
        
        System.out.println(k1 == k2);
        System.out.println(k1.equals(k2));
    }    
}
