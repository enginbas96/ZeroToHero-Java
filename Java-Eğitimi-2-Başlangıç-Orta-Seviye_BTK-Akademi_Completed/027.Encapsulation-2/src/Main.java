public class Main
{
    public static void main(String[] args)
    {
        //Encapsulation kullanıcıya herhangi bir alanı kullanmak için kısıtlamalara tabi tutmaya yarar
        //Yani istediği veriye istediği gibi erişememeli
        //Bizim belirlediğimiz kısıtlar çerçevesinde erişimi olmalı
        //Kullanıcı bilmediği yerlere girmemelidir bu durum programın yaşam süresine zarar verir

        ProductManager productManager = new ProductManager();

        //Bu şekilde tanımlanmış bir metot sonradan eklenecek yeni bir özellik için zor durumlar doğurabilir
        //Metot yanlış değil ama mantıksız ve masraflı oluyor
        //100 tane veri için 100 tane satıra yeni gelecek özelliği eklemek çok zahmetli bir iş olur
        /*
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        productManager.Add2(1,"Ad","Açıklama",5,5000);
        */

        Product product = new Product();
        //Normal şartlarda oluşturulan product nesnesinin id özelliğine erişemiyorduk
        //Fakat getter ve setterlar ile erişim sağlayabiliyoruz
        product.setId(15);
        product.setName("Monitör");

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getKod());
        //getKod metodunun set'i olmamalı çünkü isim ve ıdnin birleşiminden oluşuyor
        //Bu şekilde kullanıcıyı istenmeyen verilere erişimini kısıtlamış oluyoruz
    }
}