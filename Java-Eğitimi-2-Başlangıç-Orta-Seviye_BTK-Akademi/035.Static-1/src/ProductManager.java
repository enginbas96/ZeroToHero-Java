
public class ProductManager
{
    public void Add(Product product)
    {

        ///Aşağıdaki isValid nesnesini validator nesnesi oluşturarak çağırabiliyoruz bunun daha esnek olabilmesi için
        /// productValidator sınıfındaki isValid metodunu statik tanımlayarak sınıfismi.Metot şeklinde daha kolay çağırabiliriz.

        /*ProductValidator validator = new ProductValidator();
        if(validator.isValid(product))
        {
            System.out.println("Eklendi.");
        }
        else
        {
            System.out.println("Ürün bilgileri geçersizdir.");
        }*/

        //isValid metodu static tanımlandığı için sınıfismi.Metot olarak çağırılabildi.
        //Static tanımlamalar program sonlanana kadar hafızadan atılmaz
        //static tanımlar birisi değiştirdiğinde diğer bir kişi de onu kullanır.

        if(ProductValidator.isValid(product))
        {
            System.out.println("Eklendi.");
        }
        else
        {
            System.out.println("Ürün bilgileri geçersizdir.");
        }

        ProductValidator asd = new ProductValidator();//Yapıcı bloklar new metodu kullanırken çalışır.

    }
}
