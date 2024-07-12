package pkg107.filestreamexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamExamples 
{
    public static void main(String[] args) 
    {
        //Bir dosyadan okudugumuz değeri başka bir dosyaya yazacağız
        File file1 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\107.FileStreamExamples\\denemeKlasor\\bir.txt");
        File file2 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\107.FileStreamExamples\\denemeKlasor\\iki.txt");
        if(file1.exists())
        {
            FileInputStream inputStream = null; // Byte tabanlı değerler okumak için kullanılıyor
            FileOutputStream outputStream = null; // Byte tabanlı değerler yazmak için kullanılıyor
            try
            {
                inputStream = new FileInputStream(file1);
                outputStream = new FileOutputStream(file2);
                int c = 0; // Okumanın bitip bitmediğini kontrol etmek için tanımlanan bir integer deger döngüde -1 olup olmadıgı kontrol edilecek
                 // Byte değerler 1 ile 9 arasında değişir okumanın sonuna gelindiğinde -1 değerini dönderir
                 // Yani burada dosyadan okuma bittiğinde c ye -1 değerini atacak ve okuma bitmiş olacak
                while ((c = inputStream.read()) != -1) //Okuma devam ettiği sürece yani c=-1 olmadıgı sürece döngü işlemlerini yapacak
                {
                    char ch = (char)c; // Dosyadan byte değer olarak okudugu c değerini char'a çevirip bir değişkene atıyoruz.
                    outputStream.write(Character.toUpperCase(ch)); //Outputstream sınıfının write metodu ile bu değerleri outputstream içindeki dosya yolundaki dosyaya yazdırıyoruz
                }
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
            finally
            {
                if(inputStream != null)
                {
                    try
                    {
                        inputStream.close();                        
                    } 
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                }
                if(outputStream != null )
                {
                    try
                    {
                        outputStream.close();
                    } 
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        else
        {
            System.out.println("Dosya bulunamadi");
        }        
    }    
}
