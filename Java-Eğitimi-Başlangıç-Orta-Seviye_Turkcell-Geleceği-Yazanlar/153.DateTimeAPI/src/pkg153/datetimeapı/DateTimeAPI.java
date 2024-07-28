package pkg153.datetimeapı;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI 
{    
    public static void main(String[] args) 
    {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("------------------");
        
        LocalDateTime of = LocalDateTime.of(2024, 07, 25, 14, 25);
        System.out.println(of);
        System.out.println("------------------");        
        
        System.out.println(of.plus(5, ChronoUnit.DAYS).plus(3,ChronoUnit.MINUTES));
        System.out.println("------------------");
        
        //Karsılastırma yapımı
        //LocalDateTime localdate ve localtime 'ın toplamı oldugundan ayrı ayrı yazıp of metodu ile birbirlerine eklenebilir.
        LocalDate localDate = LocalDate.parse("2023-11-30");
        LocalDateTime birinci = LocalDateTime.of(localDate, LocalTime.parse("15:20"));
        
        LocalTime localTime = LocalTime.parse("23:00");
        LocalDateTime ikinci = LocalDateTime.of(LocalDate.parse("2023-11-24"), localTime);
        
        System.out.println(birinci.isAfter(ikinci));
        System.out.println(birinci.isBefore(ikinci));
        System.out.println(birinci.isEqual(ikinci));
        System.out.println(birinci.isEqual(birinci));
                
        System.out.println("------------------");
        
        //İki tarih arasındaki farkı parametreye bağlı bulma örnekte seconds kullanılacak yani saniye
        System.out.println(ChronoUnit.SECONDS.between(ikinci, birinci));
        System.out.println(ChronoUnit.MINUTES.between(ikinci, birinci));
        System.out.println(ChronoUnit.DAYS.between(ikinci, birinci));
    }    
}
