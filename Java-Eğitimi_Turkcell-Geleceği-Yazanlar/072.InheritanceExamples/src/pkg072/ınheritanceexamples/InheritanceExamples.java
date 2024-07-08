package pkg072.ınheritanceexamples;

public class InheritanceExamples 
{
    public static void main(String[] args) 
    {
        //A sınıfından nesne olusturuldugunda A sınıfının yapici metodu çalıştı.
        A a = new A(); 
        
        System.out.println("--------------------------------");
        
        //B sınıfının var olabilmesi için önce miras aldığı sınıfın yani A sınıfının var olması gerekiyor.
        //B sınıfından nesne oluşturuldugunda hem A sınıfının hem B sınıfının yapıcı metodu çalıştı çünkü B sınıfı A sınıfından miras alıyor.
        B b = new B("Mehmet"); 
        
        System.out.println("--------------------------------");
                
        //C sınıfının var olabilmesi için önce A nın sonra B nin var olması gerekiyor.
        C c = new C("Ahmet");         
    }    
}
