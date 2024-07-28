package pkg122.setexamples;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples 
{
    public static void doldur(SortedSet<Integer> integers, int sutun)
    {
        integers.clear();
        Random random = new Random();
        while(integers.size() < sutun)
        {
            integers.add(random.nextInt(49)+1);
        }
    }
    public static void main(String[] args) 
    {        
        //1 ile 49 arasında random rakam versin ve bize 8 tane stun oluştursun
        //Sayısal lotoda 1 sayıdan başka bir tane daha olmadıgı için SET kullanmak mantıklı olacaktır
        //Ayrıca sonucu gösterirken sıralı yapması işimize yarayacaktır
        Scanner sc = new Scanner(System.in);
        System.out.print("Sutun sayisi : ");
        int sutun = sc.nextInt();
        System.out.print("Satir sayisi : ");
        int satir = sc.nextInt();        
        SortedSet<Integer> integers = new TreeSet<>();
        for(int i = 0; i < satir; i++)
        {            
            doldur(integers,sutun);
            Iterator<Integer> iterator = integers.iterator();
            while(iterator.hasNext())
            {
                Integer next = iterator.next();
                System.out.print(next + "\t");
            }
            System.out.println("");
        }
    }    
}
