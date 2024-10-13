package pkg016.enums;

import java.awt.BorderLayout;
import java.time.DayOfWeek;
import java.util.Arrays;

public class Enums 
{
    public static void main(String[] args) 
    {
        Aylar ay = Aylar.Ocak;
        System.out.println(ay);
        
        ay = Aylar.Agustos;
        System.out.println(ay);
        
        System.out.println("---------------------");
        
        System.out.println(Aylar.Kasim);
        
        System.out.println("---------------------");        

        Aylar[] values = Aylar.values();
        for(int i = 0; i < values.length; i++)
        {
            System.out.print(values[i] + ", ");
        }
        System.out.println();     
        System.out.println("---------------------");     
        
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(Aylar.values()));
        
        System.out.println("---------------------"); 
        
        DayOfWeek gun = DayOfWeek.SATURDAY;
        System.out.println(gun);
        System.out.println(DayOfWeek.of(5));
    }    
}
