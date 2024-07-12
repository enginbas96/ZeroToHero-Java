package pkg104.fileandpathclasses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAndPathClasses
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dosya Yolu = ");
        String dosyaYolu = sc.nextLine();
        File file1 = new File(dosyaYolu);
        if(!file1.exists())
        {
            try 
            {
                boolean dosyaOlustuMu = file1.createNewFile(); // Dosya oluşturma işlemi için createnewfile dönüt olarak boolean deger dönderir
                if(dosyaOlustuMu){System.out.println("Dosya basariyla olusturuldu.");}
            } 
            catch (IOException e)                 
            {
                System.out.println(e.getMessage());
            }
        }
        
        FileWriter dosyaYazicisi = null; // Dosyaya yazı yazdırmaya yarayan class FileWriter
        try 
        {
            dosyaYazicisi = new FileWriter(file1);
            String text = null;
            do
            {
                text = sc.nextLine();
                dosyaYazicisi.write(text);
                // Javada bir alt satıra geçme operatörüdür bu tüm işletim sistemlerinde çalışmaya yarar bunun yerine /r /n de koysak bizim için problem olmayacaktı
                dosyaYazicisi.write(System.lineSeparator()); 
            }
            while(!text.equals("quit"));
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(dosyaYazicisi != null)
            {
                try 
                {
                  dosyaYazicisi.close();//Kaynakları sisteme iade etmek nesneleri kullandıkta sonra ortadan kaldırıyoruz
                } 
                catch (IOException e) 
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        sc.close();  
        System.out.println("Dosya yazdirma basarili.");
        System.out.println("Dosya boyutu : " + file1.length() + " byte");
    }    
}