package pkg142.autoboxingexamples;

import java.util.ArrayList;
import java.util.Iterator;

public class AutoboxingExamples
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        
        int x = 20;
        arrayList.add(x); //int x değeri otomatik olarak Integer değere çevrilmiş oldu - boxing işlemi uygulandı
       
        int y = arrayList.get(1); //Integer değer int değerine çevrişmiş oldu - unboxing işlemi uygulandı
        
        arrayList.add(new Integer(5));
        
        
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            int i = iterator.next();
            System.out.println(i);
        }        
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        byte b = 10;
        Byte parsByte = Byte.parseByte("15");
        System.out.println(parsByte + b);
    }    
}
