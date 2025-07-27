public class Main
{
    public static void main(String[] args)
    {
        //Customer Manger sınıfı oluşturuldu ve gerekli metotlar içerisine yazıldı.
        //Ardından ana sınıfımızda CustomerManager sınıfından bir nesne türetildi. (bir elçi gibi)
        //Ve o nesne vasıtası ile CustomerManager sınıfı içerisindeki metotları kullandık.


        //Classlar ile yapılacak olan işlemleri gruplamış oluyoruz
        //Classlar referans tipindedir(reference type)


        //CustomerManager cm; diyerek stackte "cm" adına bir ID aldık örneğin 101 IDsi olsun
        //new CustomerManager(); diyerek heap içerisinde 101 IDsinin karşılığı oluşturulur
        //Aynı şekilde "cm2" de oluşturulur, ona "102" Numaralı ID ve IDsinin karşılığı oluşturulur
        //cm = cm2; dediğimizda "cm2"'nin heap görüntüsünü "cm"'ye aktarır.
        //Böylelikle cm'nin kullandığı heap boşa düşer ve ikiside yani cm ve cm2, cm2'nin heapini gösterir
        //cm'nin heap karşılığını tutan herhangi bir nesne kalmadıgında garbage collector tarafından kaldırılır
        CustomerManager cm = new CustomerManager();
        CustomerManager cm2 = new CustomerManager();
        cm = cm2;
        cm.Add();
        cm.Update();
        cm.Remove();
    }
}
