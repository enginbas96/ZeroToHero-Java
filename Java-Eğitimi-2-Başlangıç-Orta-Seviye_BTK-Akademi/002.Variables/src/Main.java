public class Main
{
    public static void main(String[] args)
    {
        //reusability -> tekrar kullanılabilirlik bir koda aynı işleve sahip değişkenleri aynı isimlendirmek gerekir okunurluk artar
        //camelCase yazım kuralı
        int ogrenciSayisi = 15;
        System.out.println("Öğrenci sayım : 10");
        System.out.println("Öğrenci sayım : 10");
        System.out.println("Öğrenci sayım : 10");
        //Yukarıdaki 10ları değiştirmek için satır kadar(3) tane işlem yapmak gerekirken
        //Sayı tanımlayıp dinamik bir yapıya geçerek her değiştirme tüm satırlara otomatik uygulanacaktır
        System.out.println("__________________________________________");
        System.out.println("Öğrenci sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci sayım : " + ogrenciSayisi);
        System.out.println("Öğrenci sayım : " + ogrenciSayisi);
        System.out.println("__________________________________________");
        String mesaj = "Öğrenci sayısı : ";
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
    }
}