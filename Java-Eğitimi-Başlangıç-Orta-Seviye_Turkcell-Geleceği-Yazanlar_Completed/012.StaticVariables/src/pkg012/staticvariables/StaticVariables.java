package pkg012.staticvariables;

public class StaticVariables
{
    static int i = 10;
    int j = 20;
    
    public static void main(String[] args) 
    {
        //Eğer i değeri static olmasaydı derleme zamanında bir hata meydana gelecekti
        //Çünkü static metodlar dışarıdan yalnızca static değişkenleri kullanabilirler
        //Fakat main metodunun içinde tanımlansaydı değişkenin static olduguna bakılmaksızın kullanabilirdi.        
        System.out.println(i);        
        System.out.println("-----------------------------------");
        
        //Eğer erişilmek istenen değer static değilse, sınıfımızdan bir nesne oluşturup erişmek mümkün olacaktı
        StaticVariables sv = new StaticVariables();
        System.out.println(sv.j);
        System.out.println("-----------------------------------");
        
        //static bir değişken genel erişim adresine sahip olur ve sınıfın her yerinden erişilebilir
        System.out.println(StaticVariables.i);
        
    }    
}
