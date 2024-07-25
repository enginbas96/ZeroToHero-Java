package pkg152.datetimeapı;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI 
{    
    public static void main(String[] args) 
    {
        //LocalTime örnekleri
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println("-------------------------");
        
        LocalTime parse = LocalTime.parse("16:01");
        System.out.println(parse);
        System.out.println("-------------------------");
        
        LocalTime of = LocalTime.of(18, 23);//Saat ve dk'yı girildiğinde bunu bir değişkende tutar
        System.out.println(of);
        System.out.println("-------------------------");
        
        LocalTime time2 =LocalTime.parse("15:30").plus(5,ChronoUnit.HOURS); //5 saat ekleme işlemi
        System.out.println(time2);
        System.out.println(time2.getHour());//Saati döndürür
        System.out.println(time2.getMinute());//Dakikayı döndürür
        System.out.println(time2.getSecond());//Saniyeyi döndürür, tanımlanmamışsa 0 döndürür
        System.out.println("-------------------------");
        
        //Saatleri karşılaştırma
        LocalTime birinciTime = LocalTime.parse("15:30");
        LocalTime ikinciTime = LocalTime.parse("19:40");
        System.out.println(birinciTime.isAfter(ikinciTime));
        System.out.println(birinciTime.isBefore(ikinciTime));
    }    
}
