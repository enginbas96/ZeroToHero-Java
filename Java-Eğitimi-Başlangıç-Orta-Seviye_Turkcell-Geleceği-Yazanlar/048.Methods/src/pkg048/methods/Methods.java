package pkg048.methods;

public class Methods 
{
    public static void main(String[] args) 
    {
        //Statik metotları kullanmak için herhangi bir nesne oluşturmaya gerek yok
        Hello(); //Önceki örneklerde kullanılan Methods asd = new Methods(); yapmaya gerek yoktur
        Math.pow(2,5); // Math sınıfından bir nesne almadan direk powu kullanabildik bu pow'un statik tanımlandıgından kaynaklanır        
        int bes = Integer.parseInt("5"); //Parse ınt metodu da statiktir
        
        // Metotları static yaptığımız için sınıfın ismini kullanarak direk erişim sağlayabiliyoruz
        System.out.println(HesapMakinesi.bol(8, 2));
        System.out.println(HesapMakinesi.topla(3, 5));
        System.out.println(HesapMakinesi.x); // Statik değişkenlerede erişim sağlanabiliyor.
                
    }   
    //Statik metotlar diğer statik metotları direk çağırabilirler.
    //Statik metotlar statik veriye erişim sağlayabilir.
    
    //Statik metot örneği
    public static void Hello()
    {
        System.out.println("Hello World");
    }
}
