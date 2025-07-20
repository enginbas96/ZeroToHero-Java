public class Main
{
    public static void main(String[] args)
    {
        try
        {
            int[] sayilar = new int[]{3,6,1,3,7};
            System.out.println(sayilar[5]);
        }
        /// Yakalanan ilk catch işlemini yapar diyer catchlere atlamaz ve finally metodunu çalıştırır.

        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String hatası alındı.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndex hatası alındı.");
        }
        catch (Exception e)
        {
            //Loglama işlemi
            System.out.println("Tüm hatalar.");
        }
        finally {
            System.out.println("Finally bloğu çalıştı.");
        }
        /// Neden sadece Exception e yerine hatanın kendisine odaklı metotlat yazıyoruz??
        /// Çünkü hataların gelişine göre farklı işlemler yaptırabiliriz.
        /// Örneğin para çekme işleminde yeterli tutar yoksa tekrar tutar girdirebiliriz.
        /// Tüm hataları listeleseydik bu bizim için işlemi uzatmış olurduk.
    }
}