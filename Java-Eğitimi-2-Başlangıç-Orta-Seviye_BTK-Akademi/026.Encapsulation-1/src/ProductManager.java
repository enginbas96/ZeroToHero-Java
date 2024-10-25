public class ProductManager
{
    //Önemli***SOLID prensiplerine göre Product ve ProductManager aynı sınıf içerisinde olmamalı
    //Birisinin içerisinde attributeler olur
    //Diğerinin içerisinde yönetimsel metotlar bulunsun
    //Temiz kod yazmak için buna dikkat edilmeli

    public void Add(Product product)
    {
        System.out.println("Ürün Eklendi : " + product.name);
    }

    public void Update(Product product)
    {
        product.name = "Güncel Laptop";
        System.out.println("Ürün Güncellendi : " + product.name);
    }
}
