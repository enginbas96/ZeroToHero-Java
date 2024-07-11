package pkg096.trycatchfinallyblocks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyBlocks 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Birinici sayiyi giriniz : ");
            int x = sc.nextInt();
            System.out.print("Ikinci sayiyi giriniz : ");
            int y = sc.nextInt();
            System.out.println("Sonuc = " + x/y);
        } 
        //catch (Exception e) {System.out.println("Alinan hata : " + e);} 
        //Genel olarak kullanımı bu olsa bile catch blokları özelleştirile bilir ve istenildiği kadar eklenebilir. ifElse yapısı şeklinde kullanımı vardır
        catch (ArithmeticException e)
        {
            //Exception sınıfına ait çeşitli metotlar da mevcuttur
            System.out.println(e.getLocalizedMessage()); //Alınan hatayı sistemin dilinde(türkçe) geri dönderir
            System.out.println(e.getMessage()); //Alınan hatayı ingilizce geri dönderir
            e.printStackTrace();//Uygulamada hata ile karşılaşılan hatanın hangi satırda olduğunu ekrana yazdırır
            System.out.println("Sayi 0'a bolunemez.");
        }
        catch(InputMismatchException e){System.out.println("Lutfen sayi disinda giriste bulunmayiniz.");}
        
        //finally programda hata olsada olmasada çalıştırılan bloktur
        //genelde Sistemden alınan kaynakları geri iade etmek için kullanılır   
        finally          
        {            
            sc.close(); //Scanner nesnesini ortadan kaldırdık.
            System.out.println("Finally blogu calisti");
        }        
        //int i = sc.nextInt(); //Bu satırda hata ile karşılaşılacaktır çünkü sc scanner nesnesini kaldırmıştık
        System.out.println("Uygulama sonlandi.");
    }    
}