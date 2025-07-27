import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        /// Sıradan diziler
        int[] dizi = new int[5];
        for(int i = 0; i<dizi.length; i++)
        {
            dizi[i] = i*5;
        }
        for(int i = 0; i<dizi.length; i++)
        {
            System.out.println(dizi[i]);
        }
        System.out.println("-----------------------------------");
        /// Koleksiyonlar
        /// Koleksiyonlar dizilerin daha efektif yönetilmesini sağlar.
        ///ArrayList import ister
        ArrayList objeler = new ArrayList(); /// Bu şekilde tanımlana ArrayListler içerisine her türlü objeyi saklar
        System.out.println(objeler.size()); /// size metodu bize listenin uzunluğunu döndürür
        objeler.add(1);
        objeler.add(10);
        System.out.println("Listenin boyutu: " + objeler.size());
        objeler.add(1.45);
        objeler.add("Ankara");
        System.out.println("Listenin boyutu: " + objeler.size());
        System.out.println("-----------------------------------");

        System.out.println(objeler.get(2)); /// 2 numaralı indexteki değeri bize verir.

        objeler.add(2,"2 numaralı indexin değeri bu yazı ile değitirildi.");
        System.out.println(objeler.get(2));

        objeler.set(2,"Şimdi ise Set metodu kullanılarak değiştirildi.");/// Arraylisteki elemanlar set metodu ile güncellenir.
        System.out.println(objeler.get(2));

        System.out.println("-----------------------------------");
        System.out.println("Listenin boyutu: " + objeler.size());
        System.out.println(objeler.get(0));
        objeler.remove(0);///0 index içerisindeki değer silinecek ve array 1 küçültülecek
        System.out.println("Listenin boyutu: " + objeler.size());
        System.out.println(objeler.get(0));
        System.out.println("-----------------------------------");
        /// Foreach döngüsü ile listenin içerisinde dolaşmak
        for(Object o : objeler)
        {
            System.out.println(o);
        }
        System.out.println("-----------------------------------");
        objeler.clear(); /// Listeyi tamamen boşaltmak anlamına gelir
        System.out.println("Listenin boyutu: " + objeler.size());
    }
}

/// ArrayListlerde add metodu ile yeni bir eleman eklenir
/// get metodu ile elemana erişilir
/// set metodu ile eleman güncellenir
/// remove metodu ile belirtilen indexteki eleman listeden uçurulur ve listedeki indexler kayar
/// clear metodu ile liste sıfırlanır içinde hiç eleman kalmaz