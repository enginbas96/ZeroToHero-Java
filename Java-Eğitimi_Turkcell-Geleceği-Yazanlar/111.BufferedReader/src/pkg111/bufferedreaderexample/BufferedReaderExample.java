package pkg111.bufferedreaderexample;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class BufferedReaderExample 
{
    public static void main(String[] args) 
    {
        File file = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\111.BufferedReader\\denemeKlasor\\denemeMetin.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try
        {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
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
            if(fileReader != null)
            {
                try 
                {
                    fileReader.close();                    
                } 
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }        
    }    
}
