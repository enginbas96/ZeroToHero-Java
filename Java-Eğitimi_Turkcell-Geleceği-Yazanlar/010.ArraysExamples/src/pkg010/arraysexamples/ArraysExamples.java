package pkg010.arraysexamples;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysExamples
{
    public static void main(String[] args) 
    {       
        int[] numbers ={15,3,2,-5,17};
        int toplam = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            toplam += numbers[i];
        }
        System.out.println("Toplam : " + toplam);
        System.out.println("-------------------------------------------------------------------");
        
        int[] numbers2 = new int[numbers.length];
        for(int i = 0; i < numbers2.length; i++)
        {
            numbers2[i] = numbers[i];
        }
        System.out.println("Ilk Dizi : " + Arrays.toString(numbers2));
        System.out.println("Ikinci Dizi : " + Arrays.toString(numbers2));
        System.out.println("-------------------------------------------------------------------");
        
        String[] names = new String[3];
        names[0] = "Ali";
        names[1] = "Ahmet";
        names[2] = "Mehmet";
        System.out.println(Arrays.toString(names));        
        for (int i = (names.length-1); i >= 0; i--) 
        {
            System.out.println("Names : " + names[i]);           
        }
        System.out.println("-------------------------------------------------------------------");
        
        int[] numbers11 = {1,2,3};        
        int[] numbers22 = numbers11; //Bellekteki adresleri aynı adresi gösterir
        
        System.out.println(Arrays.toString(numbers11));
        System.out.println(Arrays.toString(numbers22));
        
        //Bellekteki adresleri aynı oldugundan 2 değişken de işlemden etkilenecektir
        numbers11[0] = 5; 
        numbers22[2] = 55;
        
        System.out.println(Arrays.toString(numbers11));
        System.out.println(Arrays.toString(numbers22));
        
    }    
}
