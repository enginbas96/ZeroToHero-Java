package pkg112.bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterExample
{
    public static void main(String[] args) 
    {
        //Bufferedler 8192 byte değer alabilir consoldan bu değerin üstüne çıkmak dosyayı direk yazdırır
        //BufferedWriter'ı kapattığımızda dosyayı direk yazdırır
        //Aksi halde fiziksel olarak diske yazılmaz ve sadece ramde depolanır
        File file = new File("input.txt");
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            Scanner sc = new Scanner(System.in);
            String line = null;
            while(!(line = sc.nextLine()).equals("quit"))
            {
                bufferedWriter.write(line);
                bufferedWriter.flush();//yazmayı el ile tetiklemektir yani sistemde bu metodun çalışması her yaptıgımız işlemi direk fiziksel olarak yazar
            }
            sc.close();
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(bufferedWriter != null)
            {
                try 
                {
                    bufferedWriter.close();
                } 
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
            if(fileWriter != null)
            {
                try 
                {
                    fileWriter.close();
                } 
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }    
}
