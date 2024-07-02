package pkg019.logicaloperators;

public class LogicalOperators 
{
    public static void main(String[] args) 
    {
        boolean q = true;
        
        System.out.println(q);        
        //Değil operatörü !
        System.out.println(!q);
        System.out.println("-------------------------------------------");
        
        //And operatörü & veya &&
        // & tek başına tüm değerlere bakar
        // && soldaki değere bakar soldaki değer true ise sağdaki değeri kontrol eder aksi halde ekrana direk false yazdırır
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);        
        System.out.println("-------------------------------------------");
        
        //Veya operatörü || veya |
        // | tek başına tüm değerlere bakar
        // || soldaki değere bakar soldaki değer true ise sağdaki değeri kontrol etmez ekrana direk true yazdırır
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);  
        System.out.println("-------------------------------------------");     
        
        System.out.println(true && test()); // Burada test metodu çalışır
        System.out.println(false && test()); // Burada test metoduna gerek kalmadan ekrana false yazdırır
        System.out.println(false || test()); // Test metodu çalışır.
        System.out.println(true || test()); // Test metodu çalışmaz, ekrana direk true yazdırır
    }    
    private static boolean test()
    {
        System.out.print("Burasi calisti. Sonuc : ");
        return false;
    }
}
