package pkg155.datetimeexamples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeExamples 
{
    public static void main(String[] args)
    {
        LocalDate tarih = LocalDate.now();
        
        String kisa = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(tarih);
        System.out.println(kisa);
        
        String orta = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(tarih);
        System.out.println(orta);
        
        String uzun = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(tarih);
        System.out.println(uzun);
        
        String full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(tarih);
        System.out.println(full);
        
        System.out.println("-------------------------------------------");
        
        //Kendi patternimizi oluşturmak
        String ozelFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(tarih);
        System.out.println(ozelFormat);
        System.out.println("-------------------------------------------");
        
        //LocalTime'ı formatlamak        
        LocalTime zaman = LocalTime.now();
        
        kisa = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(zaman);
        System.out.println(kisa);
        
        orta = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(zaman);
        System.out.println(orta);
        
        //Long ve full formatları time için mevcut değildir        
        System.out.println("-------------------------------------------");
        
        //Kendi patternimiz
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH---mm:ss");
        String zaman2 = ofPattern.format(zaman);
        System.out.println(zaman2);
    }    
}