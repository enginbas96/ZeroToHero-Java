package pkg151.datetimeapı;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeAPI
{
    public static void main(String[] args) 
    {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("----------------------");
        
        LocalDate of = LocalDate.of(1996, 1, 16);
        System.out.println(of);
        System.out.println("----------------------");
        
        LocalDate parse = LocalDate.parse("1996-01-16");
        System.out.println(parse);
        System.out.println("----------------------");
        
        System.out.println(localDate.plus(1, ChronoUnit.DAYS)); //İçerine girilen değer kadar, gün, ay, yıl parametresine bağlı artış sağlar
        System.out.println(localDate.plusDays(5)); //Direk 5 gün ekler
        System.out.println(localDate.plusMonths(9));//Direk ay ekler
        System.out.println(localDate.plusYears(15));//Yıl ekler
        System.out.println(localDate.plusWeeks(3));//Hafta ekler
        System.out.println(localDate.plusDays(6).plusMonths(5).plusYears(14));//Çoklu kullanım      
        System.out.println(localDate.minus(1,ChronoUnit.MONTHS));//Minus metodu çıkartma yapmaya yarar
        System.out.println("----------------------");
        
        System.out.println(LocalDate.parse("2016-07-15").getDayOfWeek());//Tarihin hangi güne denk geldiğini bulmak için dayOfWeek kullanılır
        System.out.println(LocalDate.parse("2016-07-15").getDayOfMonth());//Ayın kaçıncı günü öğrenmek için kullanılır
        System.out.println(LocalDate.parse("2016-07-15").getMonth());//Hangi ay oldugunu bulmak için kullanılır
        System.out.println("----------------------");
        
        //Tarihleri karşılaştırma
        LocalDate birinciTarih = LocalDate.parse("2020-01-20");
        LocalDate ikinciTarih = LocalDate.parse("2020-01-25");
        System.out.println(birinciTarih.isAfter(ikinciTarih));//Birinci tarih ikinci tarihten sonra mı sorusunun yanıtını dönderir
        System.out.println(ikinciTarih.isAfter(birinciTarih));//İkinci tarih birinci tarihten sonra mı sorusunun yanıtını dönderir
        System.out.println("----------------------");
        
        //Kullanıcının yasını hesaplayan program
        System.out.println("Dogum Tarihinizi Yil-Ay-Gun seklinde giriniz (Ornek: 1996-01-16 seklinde ) : ");
        Scanner sc = new Scanner(System.in);
        String tarih = sc.nextLine();
        LocalDate dogumTarihi = LocalDate.parse(tarih);
        System.out.println("Dogum tarihiniz : " + dogumTarihi);
        System.out.println("Yasiniz : " + (LocalDate.now().getYear() - dogumTarihi.getYear()));
    }    
}