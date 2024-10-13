package pkg095.exceptions;

import java.util.Scanner;

public class Exceptions
{
    public static void main(String[] args) 
    {
        //arithExcep();
        //arrayExcep();
        nullPointer();
    }        
    public static void nullPointer()
    {
        Scanner sc = null;
        String line = sc.nextLine();
        System.out.println(line);
    }
    public static void arrayExcep() //Sahip olunamayan bir index çağırıldıgında fırlatılan bir hata 
    {
        int[] numbers = {1,4,6,1,2}; // 5 elemanlı bir dizi
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.println(numbers[index]);
    }    
    public static void arithExcep() // Bir sayının sıfıra bölümünden fırlatılan bir hata
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x/y);
    }    
}
