package pkg047.methods;

public class Methods 
{
    public static void main(String[] args) 
    {
        //Başka bir class içinde olan metotları çağırırken ilk önce o sınıftan bir nesne oluşturuyoruz.
        
        HesapMakinesi hm = new HesapMakinesi(); //oluşturulan bu nesne ile hesap makinesi içerisindeki public olan tüm metotlara erişebiliriz.
        System.out.println(hm.topla(5, 4));        
        System.out.println(hm.cikar(5, 3));
        System.out.println(hm.carp(4, 2));
        System.out.println(hm.bol(6, 2));
        System.out.println(hm.kare(23));
        System.out.println(hm.kareKok(25));   
    }        
}
