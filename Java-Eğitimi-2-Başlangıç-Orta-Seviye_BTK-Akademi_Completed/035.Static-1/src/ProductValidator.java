public class ProductValidator
{
    static
    {
        System.out.println("Static yapıcı blok çalıştı.");
    }
    static
    {
        System.out.println("Static yapıcı blok çalıştı. 2");
    }
    public ProductValidator()
    {
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product)
    {
        if(product.price > 0  && !product.name.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
