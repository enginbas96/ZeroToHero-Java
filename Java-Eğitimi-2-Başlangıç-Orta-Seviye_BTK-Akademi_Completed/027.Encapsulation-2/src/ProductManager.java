public class ProductManager
{
    //Product sınıfında "name" değişkeni private tanımlandığından erişimi sınırlandırıldı
    //Başka sınıftan erişilemeyeceği için burada hataya neden olacaktır.
    /*
    public void Add(Product product)
    {
        System.out.println(product.name + " ürünü eklendi.");
    }
    */

    //Bu şekilde tanımlanmış bir metot sonradan eklenecek yeni bir özellik için zor durumlar doğurabilir
    //Metot yanlış değil ama mantıksız ve masraflı oluyor
    //100 tane veri için 100 tane satıra yeni gelecek özelliği eklemek çok zahmetli bir iş olur
    /*
    public void Add2(int id,String name,String description,int stockAmount,double price)
    {
        //Bu metot aslında hatalı bir kullanıma sahiptir

    }
    */

}
