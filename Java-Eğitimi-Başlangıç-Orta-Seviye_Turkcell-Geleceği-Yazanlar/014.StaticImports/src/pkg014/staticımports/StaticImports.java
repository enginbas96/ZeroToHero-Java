package pkg014.staticımports;

import static java.lang.Math.PI;

public class StaticImports 
{
    public static void main(String[] args) 
    {
        
        System.out.println(Math.PI); // Static import kullanmadan math sınıfından p nin çağırılması Math.PI şeklindedir
        
        System.out.println("-------------------------------");
        
        System.out.println(PI); // Static import kullandıktan sonra artık PI yi otomatik çağırabiliriz.
        
        System.out.println("-------------------------------");
        
    }    
}
