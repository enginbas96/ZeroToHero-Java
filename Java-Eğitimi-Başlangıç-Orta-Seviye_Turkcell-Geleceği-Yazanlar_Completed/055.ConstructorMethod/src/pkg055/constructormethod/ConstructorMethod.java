package pkg055.constructormethod;

public class ConstructorMethod
{
    public static void main(String[] args) 
    {
        //Yapıcı metotlar içinde bulundukları sınıf ile aynı ismi taşımak zorundadırlar
        //Bu metotların geri dönüşü yoktur
        //Parametre alabilirler
        //abstact, static, final olamazlar
        //methotlar gibi Overload edilebilirler
        
        ConstructorMethod yapiciMetot = new ConstructorMethod();
        System.out.println(yapiciMetot.x);
        
        System.out.println("------------------------------");
        
        Ogrenci ogr = new Ogrenci("Ad", "Soyad", 5);
        System.out.println(ogr.ad);
        System.out.println(ogr.soyad);
        System.out.println(ogr.yas);
        
        System.out.println("------------------------------");
        
        Ogrenci ogr2 = new Ogrenci();
        System.out.println(ogr2.ad);
        System.out.println(ogr2.soyad);
        System.out.println(ogr2.yas);
        
        System.out.println("------------------------------");
    }   
    
    int x;
    public ConstructorMethod() // Yapıcı metot
    {
        System.out.println("Yapici metot calisti.");
        x = 20;
    }
}
