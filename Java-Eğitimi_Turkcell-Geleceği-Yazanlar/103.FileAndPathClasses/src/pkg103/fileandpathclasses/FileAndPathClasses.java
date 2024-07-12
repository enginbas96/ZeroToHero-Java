package pkg103.fileandpathclasses;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileAndPathClasses 
{   
    //File sınıfı dosyaları oluşturma, arama, silme maksadıyla kullanılır
    //Path sınıfı file sınıfı ile birlikte dosya işlemlerinde kullanılır
    public static void main(String[] args) 
    {         
        File file = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\103.FileAndPathClasses\\orkenDosya\\ornek.txt");
        System.out.println(file.exists()); //file nesnesinin içindeki değere bağlı olarak dosyanın var olup olmadığını true-false dönderir
        System.out.println(file.canRead()); //dosyanın okuma izni olup olmadığını kontrol eden metot
        System.out.println(file.canWrite());//dosyanın yazma izni olup olmadığını kontrol eden metot
        System.out.println(file.isDirectory());//file nesnesinin klasör olup olmadığını döndüren metot  \\orkenDosya\\ornek_dosya olarak bir path tanımlasaydık true donderecekti
        System.out.println(file.getAbsolutePath()); //Dosyanın bize tam dizinini verir
        System.out.println(file.getParent()); // Dosyanın içinde bulunduğu klasörün yolunu döndürür
        System.out.println(file.length()); // Dosyanın içindeki kaç byte varsa onu dönderir
        System.out.println(file.lastModified()); // dosyanın en son ne zaman değiştirildiğin döndürür //1 ocak 1970 den itibaren geçen zamanın milisaniye cinsinden dönderir
        System.out.println(new Date(file.lastModified())); // new date metodu ile kullanıldığında tam tarihi verecektir
        
        System.out.println("------------------------------------------------------------------");
        
        File file2 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\103.FileAndPathClasses\\orkenDosya\\ornek2.txt");
        if(!file2.exists())
        {
            try 
            {
                file2.createNewFile();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        
        if(file2.exists())
        {
            boolean silindiMi = file2.delete();
            System.out.println("Silindi mi = " + silindiMi);
        }
        
        System.out.println("-----------------------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dosya yolunu giriniz : ");
        String yol = sc.nextLine();
        
        File file3 = new File(yol);
        String[] icerik = file3.list();
        for (int i = 0; i < icerik.length; i++) 
        {
            System.out.println(icerik[i]);
        }
        sc.close();
    }    
}
