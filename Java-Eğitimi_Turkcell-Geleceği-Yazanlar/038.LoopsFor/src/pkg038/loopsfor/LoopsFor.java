package pkg038.loopsfor;

import java.util.Scanner;

public class LoopsFor 
{
    public static void main(String[] args) 
    {       
        int[] sayilar = {5,1,3,6,0,-1,1};        
        for(int i = 0; i < sayilar.length; i++)
        {
            System.out.println(sayilar[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen sayi-1'i giriniz: ");
        int x = sc.nextInt();
        System.out.print("Lutfen sayi-2'i giriniz: ");
        int y = sc.nextInt();        
        for(int i = x; x <= y; x++)
        {
            System.out.println(x);
        }
        
        System.out.println("-----------------------------------------------");
        
        System.out.print("Lutfen sayi-1'i giriniz: ");
        int v = sc.nextInt();
        System.out.print("Lutfen sayi-2'i giriniz: ");
        int z = sc.nextInt();
        for(int i = v; v <= z; v++)
        {
            if(v % 2 == 0)
            {
                System.out.println(v);
            }
        }
        
        System.out.println("-----------------------------------------------");
        
        String[] names;
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Kac kisi eklenecek : ");
        names = new String[Integer.parseInt(sc2.nextLine())];     
        for(int i = 0; i < names.length; i++)
        {
            System.out.print(i+1 + ". ismi giriniz: ");
            names[i] = sc2.nextLine();
        }  
        
        System.out.println("-------------------------------------------------");
        
        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
    }    
}
