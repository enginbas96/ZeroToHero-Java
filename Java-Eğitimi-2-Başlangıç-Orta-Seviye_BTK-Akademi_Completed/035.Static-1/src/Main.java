
public class Main
{
    public static void main(String[] args)
    {
        ///Static yapılar başka bir metodu çağırırken new olarak çağıramayız
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";
        manager.Add(product);




        DatabaseHelper.Crud.Create(); ///Inner Class


    }

}