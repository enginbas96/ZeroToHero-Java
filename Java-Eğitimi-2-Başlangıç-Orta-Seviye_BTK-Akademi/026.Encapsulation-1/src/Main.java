public class Main
{
    public static void main(String[] args)
    {
        Product laptop = new Product();
        laptop.name = "Laptop";
        laptop.id = 1;
        laptop.description = "Asus Laptop";
        laptop.price = 5000;
        laptop.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(laptop);
        productManager.Update(laptop);
        System.out.println(laptop.name);

        //Önemli***SOLID prensiplerine göre Product ve ProductManager aynı sınıf içerisinde olmamalı
        //Birisinin içerisinde attributeler olur
        //Diğerinin içerisinde yönetimsel metotlar bulunsun
        //Temiz kod yazmak için buna dikkat edilmeli
    }
}