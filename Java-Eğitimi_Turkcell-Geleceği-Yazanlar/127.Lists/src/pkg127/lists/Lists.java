package pkg127.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lists 
{
    //Javada standart dizilerin boyutları sabittir yani tanımlanırken kaç eleman alacağı belirleşitirilir
    //Ancak arraylistlerde böyle bir zorunluluk yoktur çalışma zamanında array listlerin boyutları değiştirilebilir
    //Arraylistler değişken dizilerdir    
   public static void main(String[] args) 
   {
       ArrayList<String> arrayList = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       String line = null;
       while(!(line = sc.nextLine()).equals("exit"))
       {
           arrayList.add(line);
       }
       
       System.out.println("------------------------");
       
       Iterator<String> iterator = arrayList.iterator();
       while(iterator.hasNext())
       {
           String next = iterator.next();
           System.out.println(next);
       }
       
       System.out.println("------------------------");
       
       //İterator yerine for döngüsüde kullanılabilir
       for(int i = 0; i < arrayList.size(); i++ )
       {
           System.out.println((i) + "\t" + arrayList.get(i));
       }
       
        System.out.println("------------------------");
        
        System.out.println("Eleman kaldirildiktan once : " + arrayList.size());
        arrayList.remove(2);
        arrayList.remove("6");
        System.out.println("Eleman kaldirildiktan sonra  : " + arrayList.size());
        for(int i = 0; i < arrayList.size(); i++ )
        {
            System.out.println((i) + "\t" + arrayList.get(i));
        }         
    }
}
