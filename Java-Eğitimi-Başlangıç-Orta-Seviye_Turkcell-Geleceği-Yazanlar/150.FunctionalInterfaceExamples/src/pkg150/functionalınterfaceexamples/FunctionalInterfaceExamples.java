package pkg150.functionalınterfaceexamples;

import java.util.Date;
import java.util.Scanner;

public class FunctionalInterfaceExamples 
{
    public static void main(String[] args) 
    {
        //Basit thred kullanımı
        System.out.println("Merhaba");
        Scanner sc = new Scanner(System.in);
        //String nextLine = sc.nextLine(); //Normal şartlarda bir değer girişi olana kadar kod bu satırı çalıştırmaya devam eder uygulama bloklanır
        
        //Thread kullandığımızda işlemleri farklı iş parçacıklarına bölerek paralel olarak çalıştırabiliyoruz
        //Thread anonymous class ile yazılımı
        /*Thread kullaniciGirisiThread = new Thread(new Runnable() 
        {
            @Override
            public void run() 
            {
                while(true)
                {
                    System.out.println("Giris : ");
                    String line = sc.nextLine();
                    System.out.println(line.toUpperCase());
                }                
            }
        });*/
        //Thread'i Lambda interface ile oluşturma
        Thread kullaniciGirisiThread = new Thread(()->{
            while(true)
                {
                    System.out.println("Giris : ");
                    String line = sc.nextLine();
                    System.out.println(line.toUpperCase());
                }                
        });
        kullaniciGirisiThread.start(); //Thread'in çalışmasını başlatmak        
        
        //Basit bir saat örneği
        while(true)
        {
            System.out.println(new Date());
            try 
            {
                Thread.sleep(1000);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }            
        }        
    }    
}
