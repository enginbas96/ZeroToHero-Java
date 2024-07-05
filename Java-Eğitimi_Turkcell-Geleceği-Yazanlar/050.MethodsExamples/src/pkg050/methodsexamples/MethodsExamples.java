package pkg050.methodsexamples;

import java.util.Arrays;

public class MethodsExamples 
{
    public static void main(String[] args) 
    {
        boolean isTrue =   trueFalse(false, true, true);
        System.out.println("Geriye donen = " + isTrue);
        
        System.out.println("----------------------------------------------------");
        
        int[] x = {5,3,2};
        int[] y = {5,3,2};
        System.out.println(esitlik(x,y));
        
        System.out.println("----------------------------------------------------");
                
        System.out.println(cube(4));
        
        System.out.println("----------------------------------------------------");
        
        int[] dizi = {5,12,7,1,3};
        System.out.println(diziToplam(dizi));
        
        System.out.println("----------------------------------------------------");
        
        int[] ciftDizi = {5,12,7,1,3,8,1,2,84,213};
        System.out.println(Arrays.toString(ciftSayilar(ciftDizi)));
        
    }   
    
    //Girilen 2 değer true ise true 2 değer false ise false döndürsün
    private static boolean trueFalse(boolean x, boolean y, boolean z)
    {    
        /*
        int trueVal = 0;        
        if(x == true){trueVal++;}        
        if(y == true){trueVal++;}
        if(z == true){trueVal++;}        
        if(trueVal >= 2 ){return true;}
        else {return false;}
        */
        return (x && y) || (x && z) || (y && z);
    }
    
    //Girilen 2 dizinin eşitliklerini kontrol eden metot
    private static boolean esitlik(int[] x, int[] y)
    {
        boolean sonuc = false;
        
        for(int i = 0; i < x.length; i++)
        {
            if(x.length != y.length)
            {
                sonuc = false;
                break;
            }
            else if(x[i] != y[i])
            {
                sonuc = false;
                break;
            }
            else 
            {
                sonuc = true;
            } 
        }
        return sonuc;
    }
    
    //Girilen sayının küpünü alan değer
    public static int cube(int x)
    {
        return x*x*x;
    }
    
    //Girilen dizi içerisindeki sayıların toplaımı döndüren değer
    public static int diziToplam(int[] x)
    {
        int toplam = 0;
        for(int i = 0; i < x.length; i++ )
        {
            toplam += x[i];
        }
        return toplam;
    }
    
    //Kendisine verilen dizinin içindeki çift sayıları geri döndürsün
    public static int[] ciftSayilar(int[] x)
    {
        int[] ciftSayilarDizisi = null;
        int adet = 0;
        for(int i = 0; i < x.length; i++)
        {
            if(x[i] % 2 ==  0){adet++;}
        }
        ciftSayilarDizisi = new int[adet];
        int sayac = 0;
        for(int i = 0; i < x.length; i++)
        {
            if(x[i] % 2 ==  0)
            {
                ciftSayilarDizisi[sayac] =x[i]; 
                sayac++;
            }
        }        
        return ciftSayilarDizisi;
    }  
}
