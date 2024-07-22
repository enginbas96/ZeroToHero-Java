package pkg143.foreach;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach 
{    
    public static void main(String[] args) 
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(1);
        
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            int next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("-----------------------------------");
        
        for(Integer i:arrayList)
        {
            System.out.println(i);
        }        
        
        /*
        int[] numbers = {1,2,3,4,5};
        for(int i = 0; i<numbers.length; i++){System.out.println(numbers[i]);}
        
        System.out.println("----------------------------------");
        
        int i = 0;
        while(i < numbers.length){System.out.println(numbers[i++]);}
        
        System.out.println("---------------------------------");
        
        i = 0;
        do
        {
            System.out.println(numbers[i++]);
        }
        while(i<numbers.length);
        */
    }    
}
