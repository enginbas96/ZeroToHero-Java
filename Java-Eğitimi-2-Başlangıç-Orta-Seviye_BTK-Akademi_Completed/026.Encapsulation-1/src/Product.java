public class Product
{
    //Önemli***SOLID prensiplerine göre Product ve ProductManager aynı sınıf içerisinde olmamalı
    //Birisinin içerisinde attributeler olur
    //Diğerinin içerisinde yönetimsel metotlar bulunsun
    //Temiz kod yazmak için buna dikkat edilmeli

    //Attribute veya Field
    int id;
    String name;
    String description;
    double price;
    int stockAmount;
}
