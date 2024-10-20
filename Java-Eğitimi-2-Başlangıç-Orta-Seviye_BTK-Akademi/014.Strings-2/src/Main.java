public class Main
{
    public static void main(String[] args)
    {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println("----------------------------------------------");

        //Değiştirme yapmak için 'replace' metodu kullanılır
        //Bir metnin içinden belirli bir kesiti değiştirmek için kullanılır.
        String replaceMetin;
        replaceMetin = mesaj.replace('B','Z');
        System.out.println(replaceMetin);

        replaceMetin = mesaj.replace("Bugün", "Yarın");
        System.out.println(replaceMetin);

        replaceMetin = mesaj.replace('a', 'b'); //Mevcut tüm 'a' ları 'b' yapar
        System.out.println(replaceMetin);

        replaceMetin = mesaj.replace(' ', '-'); //Mevcut tüm 'a' ları 'b' yapar
        System.out.println(replaceMetin);

        System.out.println("----------------------------------------------");

        //Bir metnin içerisinden parça almaya yarayan metot substring'tir.
        //Başlangıç indexi verilir veya hem başlangıç hem bitiş indexi verilerek kullanılabilir
        String subStringMesaj;
        System.out.println(mesaj);
        subStringMesaj = mesaj.substring(6,13);
        System.out.println(subStringMesaj);
        subStringMesaj = mesaj.substring(2,5);
        System.out.println(subStringMesaj);

        System.out.println("----------------------------------------------");

        //split metodu belirli bir karakter veya karakter dizisinden ayırmaya yarar
        //dizi olarak dönderir
        for(String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }

        String[] splitDizi = new String[4];
        splitDizi = mesaj.split(" ");
        for (String k : splitDizi)
        {
            System.out.println(k);
        }

        System.out.println("----------------------------------------------");

        //Büyük harfe ve büyük harfe çevirme yapılır
        //Veri karşılaştırma işlemlerinde kullanılır
        String lowerCaseString;
        String upperCaseString;
        lowerCaseString = mesaj.toLowerCase();
        upperCaseString = mesaj.toUpperCase();

        System.out.println(lowerCaseString);
        System.out.println(upperCaseString);

        System.out.println("----------------------------------------------");

        //Trim fonksiyonu başında ve sonundaki boşlukları kaldırmaya yarar
        String bosluklu = "   Selam Nasılsın   ?     ";
        String bosluksuz;
        bosluksuz = bosluklu.trim();
        System.out.println(bosluksuz);
    }
}