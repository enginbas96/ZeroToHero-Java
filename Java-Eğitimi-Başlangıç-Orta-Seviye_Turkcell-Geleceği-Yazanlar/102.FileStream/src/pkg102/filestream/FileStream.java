package pkg102.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream
{
    public static void main(String[] args)        
    {
        //Dosya yazma ve okuma için fileStream kullanılır
        File dosya = new File("hello.txt");
        FileInputStream fileInputStream = null;
        try 
        {
            fileInputStream = new FileInputStream(dosya);
            int c = 0;
            while((c = fileInputStream.read()) != -1)
            {
                System.out.print((char)c);
            }
            System.out.println("");
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(fileInputStream != null)
            {
                try 
                {
                    fileInputStream.close();
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }                    
            }
        }
        /*
        FileOutputStream fileOutputStream = null;
        try 
        {
            fileOutputStream = new FileOutputStream(dosya);
            fileOutputStream.write("Merhaba".getBytes());
            System.out.println("1");
        }
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(fileOutputStream != null)
            {
                try 
                {
                    fileOutputStream.close();
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }*/
    }    
}
