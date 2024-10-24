public class Main
{
    public static void main(String[] args)
    {
        //CLASSLARLA ÇALIŞMAK İÇİN REFERENS VE DEĞER TİPLİ

        //Değer tipli
        //Stack içerisinde oluşup biten tiplerdir
        //değişken ve değer stack bellek içerisinde tutulur
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        System.out.println("----------------------------------------------------");
        //Referans tipli
        //Stack kısmında sadece Id si tutulur, değerleri heap kısmında tutulur
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 11; sayilar1[1] = 22; sayilar1[2] = 33;
        System.out.println(sayilar2[0]);
    }
}