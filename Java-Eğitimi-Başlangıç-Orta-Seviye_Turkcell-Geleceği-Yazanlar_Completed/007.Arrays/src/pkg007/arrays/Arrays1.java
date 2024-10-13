package pkg007.arrays;

import java.awt.BorderLayout;
import java.util.Arrays;
        
public class Arrays1
{
    public static void main(String[] args)
    {
        //int[] numbers = new int[10];
        int[] numbers;
        numbers = new int[10];        
        System.out.println(Arrays.toString(numbers));
        
        numbers[5] = 20;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[5]);
        
        int[] numbers2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2[3]);
        
        String [] names = new String[10];
        System.out.println(Arrays.toString(names));
        names[2] = "Ahmet";
        System.out.println(names[2]);
        System.out.println(Arrays.toString(names));
    }    
}
