
package pkg088.overloadingoverriding;

public class OverloadingOverriding 
{
    public static void main(String[] args) 
    {
        //Java sanal makinesi metoda gönderdiğimiz parametrelerden çıkarımda bulunarak gerekli metodu gerçekleştirir buna overloading denir
        HesapMakinesi hm = new HesapMakinesi();
        hm.topla(5, 5);
        hm.topla(1.2f, 3.5f);
        hm.topla(5, 3.5f);
        hm.topla(1.6f, 7);        
        //Ogrenci sınıfındaki yapıcı metotlar overloading örneğidir
    }    
}
