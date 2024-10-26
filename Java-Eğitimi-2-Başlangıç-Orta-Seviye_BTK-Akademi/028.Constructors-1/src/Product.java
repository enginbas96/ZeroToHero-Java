public class Product
{
    //Aynı isim ile farklı parametrelerle oluşturmaya overloading deniyor
    int id;
    String name;
    public Product()
    {
        System.out.println("Product classından bir nesne oluşturuldu.");
        System.out.println("Nesne oluşturulduğu anda yani 'new' anahtar kelimesi ile yapıcı metot çalışır.");
        System.out.println("Yapıcı metot çalıştırıldı.");
    }
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        System.out.println(id + " id'sine ait " + name + " isminde bir nesne oluşturuldu.");
    }
}
