package pkg140.ıteratorexamples;

import java.util.Iterator;

public class IteratorExamples 
{    
    public static void main(String[] args) 
    {
        Ogrenci o1 = new Ogrenci();
        o1.setIsim("Engin");
        int[] notlar = new int[5];
        notlar[0] = 60;
        notlar[1] = 90;
        notlar[2] = 95;
        notlar[3] = 98;
        notlar[4] = 75;
        o1.setNotlar(notlar);
        
        Iterator<Integer> iterator = o1.iterator();
        while(iterator.hasNext())
        {
            Integer next = iterator.next();
            System.out.println(o1.getIsim()+" : "+next);
        }               
    }    
}
