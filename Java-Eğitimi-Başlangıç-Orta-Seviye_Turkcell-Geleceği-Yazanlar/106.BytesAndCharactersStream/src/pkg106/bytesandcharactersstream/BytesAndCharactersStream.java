package pkg106.bytesandcharactersstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BytesAndCharactersStream 
{
    public static void main(String[] args) 
    {
        //InputStreamReader  Unicode olmayan bytes değerler bu metot ile Unicode karakterlere dönüştürülür
        //OuputStreamReader  Unicode karakter değerler bu metot ile Unicode olmayan bytes değerlere dönüştürülür
        oku();
        
        
        
        
        
    }    
    
    public static void yaz()
    {
        File file1 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\106.BytesAndCharactersStream\\denemeKlasor\\test.txt");
        FileOutputStream outputStream = null;
        try 
        {
            outputStream = new FileOutputStream(file1);            
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write("Merhaba dünya");
            outputStreamWriter.close();
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(outputStream != null)
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
    
    public static void oku()
    {
        File file1 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\106.BytesAndCharactersStream\\denemeKlasor\\test.txt");
        FileInputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        try 
        {
            inputStream = new FileInputStream(file1);            
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line  = null;
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(bufferedReader != null)
            {
                try 
                {
                    bufferedReader.close();                    
                } 
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
            if(inputStreamReader != null)
            {
                try 
                {
                    inputStreamReader.close();                    
                } 
                catch (Exception e) 
                {
                    System.out.println(e.getMessage());
                }
            }
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
        }
    }
}
