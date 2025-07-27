public class Main
{
    public static void main(String[] args)
    {
        //Java tip güvenli dildir, tanımlanan değişkenin tipini belirtmeliyiz
        int sayi = 12;
        // sayi = "Ankara"; burada uyumsuz tip hatası verecektir.
        // sayi = 12312312311; burada int tipinin sınırları aşıldığından sınır aşımı hatası verecektir
        // sayi = 12.5; ondalıklı sayı hatası verecektir
        double sayi2 = 13.5;

        //Primitive types //String primitive değildir char'ın birleştirilmiş halidir
        byte byteSayi = -54; //byte -128 ve 127 arasındadır
        short shortSayi = 32421; //short -32768 ve 32767 arasında
        int intSayi = 1233445234; // int deger -2147483648 ve 2147483647 arasında
        long longSayi = 1233445234; // Long çok büyük tam sayı değerler tutar
        float floatSayi = 14.3f; // float ondalıklı sayıları tutar sonuna f konur
        double doubleSayi = 324920384.12323; // double yüksek ondalıklı sayıları tutar
        char charVeri = 'A';
        boolean booleanDeger = true;
    }
}