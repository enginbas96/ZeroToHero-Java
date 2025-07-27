import java.sql.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Murat";
        String ogrenci3 = "Mehmet";
        String ogrenci4 = "Mahmut";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------------------------");

        //Aynı türdeki verileri tutarken genellikle diziler kullanılır
        //Böylece kod karmaşasından kurtulunur

        String[] ogrenci = new String[5];
        //5 elemanlı bir dizi 5 değer tutar
        //diziler 0. indisten başlar
        //0 ile 4 arasında indisler kullanılabilir
        ogrenci[0]= "Engin";
        ogrenci[1]= "Murat";
        ogrenci[2]= "Mehmet";
        ogrenci[3]= "Mahmut";
        ogrenci[4]= "Muhammet";
        //ogrenci[5]= "Muhammet";
        // Burada 5 elemanlı bir dizide taşma oluşur dizilerde [5], 6. elemanı işaret eder

        for(int i = 0; i < ogrenci.length; i++)
        {
            System.out.println((i+1) + ". Öğrenci : " + ogrenci[i]);
        }
        System.out.println("----------------------------------------------");
        for (String o:ogrenci)
        {
            System.out.println("Ogrenci : " + o);
        }
    }
}