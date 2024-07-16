package pkg123.setexamples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetExamples 
{
    public static void main(String[] args) 
    {                
        //Girilen sayıları unique olarak saklayan bir program
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();        
        Scanner sc = new Scanner(System.in);  
        
        int sayi = 0;
        System.out.print("Bir sayi giriniz : ");
        while((sayi = sc.nextInt()) != -1)
        {
            System.out.print("Bir sayi giriniz : ");
            linkedHashSet.add(sayi);
        }
        
        System.out.println("Sayi adedi : " + linkedHashSet.size());
        
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }    
}
