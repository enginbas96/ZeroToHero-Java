package pkg029.ifelseexamples;

import java.util.Scanner;

public class IfElseExamples 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);                
        System.out.print("Lutfen vize notunuzu giriniz: ");
        float vizeNot = sc.nextFloat();
        System.out.print("Lutfen final notunuzu giriniz: ");
        float finalNot = sc.nextFloat();
        float notOrtalama = (vizeNot * 0.4f) + (finalNot * 0.6f);        
        if(notOrtalama < 50)
        {
            System.out.print("Lutfen butunleme notunuzu giriniz: ");
            float butNot = sc.nextFloat();
            notOrtalama = (vizeNot * 0.4f) + (butNot * 0.6f); 
        }
        System.out.println("Not ortalamaniz: " + notOrtalama);
        if(notOrtalama >= 90 && notOrtalama <= 100)
        {
            System.out.println("Bu dersten AA aldiniz.");          
        }
        else if(notOrtalama >= 90 && notOrtalama <= 100)
        {
            System.out.println("Bu dersten AA aldiniz.");          
        }
        else if(notOrtalama >= 85 && notOrtalama < 90)
        {
            System.out.println("Bu dersten BA aldiniz.");          
        }
        else if(notOrtalama >= 80 && notOrtalama < 85)
        {
            System.out.println("Bu dersten BB aldiniz.");          
        }
        else if(notOrtalama >= 75 && notOrtalama < 80)
        {
            System.out.println("Bu dersten CB aldiniz.");          
        }
        else if(notOrtalama >= 70 && notOrtalama < 75)
        {
            System.out.println("Bu dersten CC aldiniz.");          
        }
        else if(notOrtalama >= 65 && notOrtalama < 70)
        {
            System.out.println("Bu dersten DC aldiniz.");          
        }
        else if(notOrtalama >= 60 && notOrtalama < 65)
        {
            System.out.println("Bu dersten DD aldiniz.");          
        }
        else if(notOrtalama >= 50 && notOrtalama < 60)
        {
            System.out.println("Bu dersten FD aldiniz.");          
        }
        else if(notOrtalama >= 0 && notOrtalama < 50)
        {
            System.out.println("Bu dersten FF aldiniz.");          
        }    
        else
        {
            System.out.println("Girilen notlarda bir problem gorunuyor, lutfen 0 ile 100 arasinda bir sayi giriniz.");
        }             
    }    
}
