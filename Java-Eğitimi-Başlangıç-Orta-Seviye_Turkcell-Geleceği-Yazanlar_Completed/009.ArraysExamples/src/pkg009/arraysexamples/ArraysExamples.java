package pkg009.arraysexamples;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExamples         
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 20;
        numbers[3] = 30;
        numbers[4] = 40;
        
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        
        System.out.println("-----------------------------------------------------");
        
        for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        System.out.println("-----------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi Uzunlugu: ");
        int diziUzunlugu = sc.nextInt();
        int[] numbers2 = new int[diziUzunlugu];
        
        for(int i =0; i < diziUzunlugu; i++)
        {
            System.out.print("Dizinizin " + (i+1)  + ". elemanini giriniz: ");
            numbers2[i] = sc.nextInt();
        }
        
        for(int i =0; i < diziUzunlugu; i++)
        {
            System.out.println("Dizinizin " + (i+1)  + ". elemani: " + numbers2[i]);
        }        
        
        int toplam = 0;
        double ortalama;
        for(int i = 0;  i< diziUzunlugu; i++)
        {
            toplam = toplam + numbers2[i];
        }       
        System.out.println("Dizi elemanlarinin toplami = " + toplam);
        ortalama = (double)toplam/(double)diziUzunlugu;
        System.out.println("Dizi elemanlarinin ortalamasi = " + ortalama);
    }    
}
