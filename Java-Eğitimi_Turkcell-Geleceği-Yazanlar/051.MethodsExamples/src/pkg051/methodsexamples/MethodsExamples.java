package pkg051.methodsexamples;

import java.util.Arrays;

public class MethodsExamples 
{
    public static void main(String[] args) 
    {
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Sayi1 = " + sayi1 + "   Sayi2 = " + sayi2);
        degistir(sayi1, sayi2);
        System.out.println("Sayi1 = " + sayi1 + "   Sayi2 = " + sayi2); // Herhangi bir değişiklik olmadı        
        
        System.out.println("-----------------------------------------------");
        
        int[] sayilar = {4,2};
        System.out.println(Arrays.toString(sayilar));
        degistir(sayilar);
        System.out.println(Arrays.toString(sayilar));// Buradaki değişimin sebebi iç değişiklikler olabilir ama değişkenlerin değeri değişemez
        
    }    
    
    //Sayıların yerini değiştiren kod
    public static void degistir(int x, int y)
    {
        int kovaDegisken = x;
        x = y;
        y = kovaDegisken;
    }
    
    //Sayıların degerini değiştiren kod
    public static void degistir(int[] sayilar)
    {
        int kovaDegisken = sayilar[0];
        sayilar[0] = sayilar[1];
        sayilar[1] = kovaDegisken;
    }
    
}
