package pkg130.lists;

import java.util.Iterator;
import java.util.Vector;

public class Lists 
{
    public static void main(String[] args) 
    {
        Vector<Kitap> kitap =  new Vector<>();
        kitap.add(new Kitap("X Kitabi", 1996, new Yazar("Engin", "Bas")));
        kitap.add(new Kitap("Y Kitabi", 2000, new Yazar("Ahmet", "Hamdi")));
        kitap.add(new Kitap("Z Kitabi", 2020, new Yazar("Hasan", "Huseyin")));
        
        System.out.println(kitap.size());
        System.out.println(kitap.capacity());
        
        Iterator<Kitap> iterator = kitap.iterator();
        while (iterator.hasNext()) 
        {
            Kitap next = iterator.next();
            System.out.println(next);            
        }
        
        System.out.println("--------------------------------");
        
        for(int i = 0; i < kitap.size(); i++ )
        {
            System.out.println(kitap.get(i));
        }
        
        System.out.println("--------------------------------");
        
        for(int i = kitap.size() -1 ; i >=  0; i-- )
        {
            System.out.println(kitap.get(i));
        }
    }    
}
