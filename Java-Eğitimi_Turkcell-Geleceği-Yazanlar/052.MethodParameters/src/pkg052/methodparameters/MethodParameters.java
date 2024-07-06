package pkg052.methodparameters;

import java.util.Arrays;

public class MethodParameters 
{    
    public static void main(String[] args) 
    {
        MethodParameters mthd = new MethodParameters();
        int x = 20;
        System.out.println(x);
        mthd.passByValue(x);
        System.out.println(x);
        
        System.out.println("------------------------------------------");
        
        int [] sayi = {1,2,3,4,5};
        System.out.println(Arrays.toString(sayi));
        mthd.degistir(sayi);
        System.out.println(Arrays.toString(sayi));
    }    
    
    public void degistir(int[] sayilar) //Referans tipler değişikliğe uğrayabilir.
    {
        for(int i = 0; i < sayilar.length; i++)
        {
            sayilar[i] = sayilar[i] * 2;
        }
    }
    
    public void passByValue(int x) //Primitive tipler değişmezler
    {
        System.out.println("Method: " + x);
        x = 10;
        System.out.println("Method: " + x);
    }
}
