/// built-in javanın içindeki paketler
import java.util.Scanner;

/// Kendi paketimizi kullanmak
/*import Matematik.DortIslem;
import Matematik.Logaritma;*/
import Matematik.*; ///  Üstteki 2 satır yerine matematik paketinin içindeki tüm classları importlarız

public class Main {
    public static void main(String[] args)
    {
        /// Scanner paketi örneği
        String kelime;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Kelime giriniz: ");
        kelime = sc.next();/// Tek kelimeyi okur nextLine olsaydı tüm satırı okurdu
        System.out.println("Girdiğiniz Kelime: " + kelime);

        ///  Kendi paketimizi kullanmak
        DortIslem islem = new DortIslem();
        System.out.println(islem.Topla(5,8));

        Logaritma log = new Logaritma();
        System.out.println("Logaritma : " + log.LogaritmaHesapla());

        /// Paketleri kullanarak işlemleri gruplandırabiliriz
        /// Bu bize sadelik sağlar ve işlerimizi kolaylaştırır
    }
}