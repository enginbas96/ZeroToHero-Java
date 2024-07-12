package pkg109.ınputandoutputstreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class InputAndOutputStreams 
{
    public static void main(String[] args) 
    {
        oku();/*
        File file = new File("output.dat");
        FileOutputStream fileOutputStream = null;
        Scanner sc = new Scanner(System.in);
        try
        {
            fileOutputStream = new FileOutputStream(file);
            String line = null;
            while(!(line = sc.nextLine()).equals( "quit"))
            {
                fileOutputStream.write(line.getBytes());
            }
        }
        catch (Exception e) 
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
                    System.out.println(e.getMessage());
                }
            }
        }*/
        
    }   
    
    public static void oku()
    {
        File file = new File("output.dat");
        FileInputStream fileInputStream = null;
        try 
        {
            //File input stream ile dosyadaki byteları okumuş oluyoruz
            //Bu bytelearı stringe çevirip ekrana basınca insanların anlayabileceği değerlere dönüşüyor
            //Ama diskte numeric(ascii) karşılıkları ile tutulmaktadır.
            fileInputStream = new FileInputStream(file);
            int c = 0;
            while((c = fileInputStream.read()) != -1)
            {
                System.out.println(c+ " : " + (char)c);
            }
        } 
        catch (Exception e) 
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
                    System.out.println(e.getMessage());
                }
            }
        }
    }    
}
