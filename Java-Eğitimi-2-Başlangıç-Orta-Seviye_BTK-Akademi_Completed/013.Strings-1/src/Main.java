public class Main
{
    public static void main(String[] args)
    {
        String mesaj = "Bugün hava çok güzel.";

        //Bu metni ekrana yazdırabiliriz
        System.out.println(mesaj);
        System.out.println("----------------------------------------------");

        //Metinlerin içindeki herhangi bir karakter seçilebilir
        //Sonuç olarak String'ler char'ların dizi halidir.
        //Diziler de oldugu gibi index 0 dan başlar
        //Yukarıdaki cümle için 0.index B harfine karşılık gelir
        char karakter;
        for (char c:mesaj.toCharArray())
        {
            System.out.println(c);
        }

        System.out.println("----------------------------------------------");

        karakter = mesaj.charAt(5);
        System.out.println("Metnin 6. karakteri = " + karakter); //Boşluk karakterine denk geldi
        System.out.println("Metnin 7. karakteri = " + mesaj.charAt(6));

        System.out.println("----------------------------------------------");

        //String ifadenin uzunluğunu almaya yarar, karakter sayısını almaya yarar
        System.out.println(mesaj.length());

        System.out.println("----------------------------------------------");

        //2 Metni birleştirme işlemini 'concat' ile gerçekleştirebiliriz.
        String mesaj2 = "O zaman dışarıda oynayabiliriz.";
        String birlesmisMetin = mesaj.concat(" " + mesaj2);
        System.out.println(birlesmisMetin);
        birlesmisMetin = birlesmisMetin.concat(" Yaşasın.");
        System.out.println(birlesmisMetin);

        System.out.println("----------------------------------------------");

        //Bir metnin istenilen bir harfle başladığının veya bitiminin kontrolu sağlanabilir
        //Mesela metnimiz 'B' harfi ile başlıyor mu veya 'Z' harfi ile bitiyor mu
        //Bunları gerçekleştiren metotlar startWith ve endWith metodlarıdır.
        //Sonucu boolean değer tutar doğru/yanlış
        boolean boolDeger;
        boolDeger = mesaj.startsWith("B");
        System.out.println("B ile mi başlıyor = " + boolDeger);

        //Sadece karakter sorgulaması değil metin de sorgular
        boolDeger = mesaj.startsWith("Bu");
        System.out.println("'Bu' ile mi başlıyor = " + boolDeger);

        boolDeger = mesaj.startsWith("Z");
        System.out.println("Z harfi ile mi başlıyor = " + boolDeger);

        boolDeger = mesaj.endsWith(".");
        System.out.println("Sonu . ile mi bitiyor = " + boolDeger);

        boolDeger = mesaj.endsWith("l");
        System.out.println("Sonu l ile mi bitiyor = " + boolDeger);

        System.out.println("----------------------------------------------");

        //getChars metodu ile başlangıç ve bitiş karakter değerleri verilir
        //Aktarılması istenen karakter dizini yazdırılır
        //Dizinin kaçıncı elemanından başlayacağı belirtilir.
        char[] karakterler = new char[8];
        mesaj.getChars(2,5,karakterler,2);
        System.out.println(karakterler);

        System.out.println("----------------------------------------------");

        //indexOf metodu, metin içerisinde karakter veya metni aratmaya yarar
        //Karakteri veya metni bulduğu ilk indexin numarasını verir
        //Baştan sona tarama yapar
        int mesajIndex = 0;
        mesajIndex = mesaj.indexOf("a");
        System.out.println("a harfinin indexi = " + mesajIndex);

        mesajIndex = mesaj.indexOf("va");
        System.out.println("va kelimesinin indexi = " + mesajIndex);

        System.out.println("----------------------------------------------");

        //lastIndexOf metni sondan taramaya başlar
        //ama sıralamada bi değişiklik olmaz
        mesajIndex = mesaj.lastIndexOf("a");
        System.out.println("a harfinin indexi sondan = " + mesajIndex);

        mesajIndex = mesaj.lastIndexOf("va");
        System.out.println("a harfinin indexi sondan = " + mesajIndex);
    }
}