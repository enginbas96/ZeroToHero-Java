package pkg098.trycatchfinallyexamples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchFinallyExamples 
{
    public static void main(String[] args) 
    {
        //yaz();
        oku();
        
    }    
    public static void oku()
    {
        File file = new File("read.me");
        FileReader fileReader = null;
        try 
        {
            fileReader = new FileReader(file);
            int c = 0;
            while((c = fileReader.read()) != -1)
            {
                System.out.print((char)c);
            }
            fileReader.read();
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(fileReader != null)
            {
                try 
                {
                    fileReader.close();
                } 
                catch (IOException e) 
                {
                    System.out.println(e.getMessage());
                }
            }            
        }
    }    
    public static void yaz()
    {
        File file = new File("read.me");
        FileWriter fileWriter = null;
        Scanner sc = new Scanner(System.in);
        try 
        {
            fileWriter = new FileWriter(file);
            System.out.print("Bir yazi giriniz : ");
            fileWriter.write(sc.nextLine());
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try 
            {
                fileWriter.close();
            } 
            catch (IOException e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
