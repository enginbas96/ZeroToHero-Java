package pkg097.trycatchfinallyblocks;

import java.util.Scanner;

public class TryCatchFinallyBlocks
{
    public static void main(String[] args) 
    {
        int[] numbers = {0,1,2,3,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Index degerini giriniz : ");
        int index = sc.nextInt();
        
        //Bazı durumlarda if else blokları try catch bloklarından daha performanslı çalışır bu sebeple ifelse blokları tercih edilir
        if(index < numbers.length && index >= 0){System.out.println(numbers[index]);}
        else{System.out.println("Yanlis index numarasi.");}        
        /* //Sürekli try catch kullanmak bazen istenmeyen bir durum olabilir 
        try{System.out.println(numbers[index]);} 
        catch (Exception e){System.out.println("Yanlis index numarasi.");}
        finally{sc.close();}
        */
    }    
}
