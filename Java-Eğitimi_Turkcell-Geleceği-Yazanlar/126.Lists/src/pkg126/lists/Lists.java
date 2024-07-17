package pkg126.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Lists 
{
    public static void main(String[] args) 
    {
        LinkedList<Ogrenci> ogrenciList = new LinkedList<>();
        ogrenciList.add(new Ogrenci(1,"Engin","Bas"));
        ogrenciList.add(new Ogrenci(2,"Ahmet","Veli"));
        ogrenciList.add(new Ogrenci(3,"Mehmet","Bas"));        
        System.out.println(ogrenciList.size());
        System.out.println("----------------------------------");
        
        Iterator<Ogrenci> iterator = ogrenciList.iterator();
        while(iterator.hasNext())
        {
            Ogrenci next = iterator.next();
            System.out.println(next);
        }
        
        System.out.println("----------------------------------");
        ogrenciList.remove(1);
        System.out.println(ogrenciList.size());
        iterator = ogrenciList.iterator();
        while(iterator.hasNext())
        {
            Ogrenci next = iterator.next();
            System.out.println(next);
        }        
    }    
}
