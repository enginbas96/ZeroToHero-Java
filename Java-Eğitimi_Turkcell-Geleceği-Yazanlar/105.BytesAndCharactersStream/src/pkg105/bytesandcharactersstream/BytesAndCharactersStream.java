package pkg105.bytesandcharactersstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class BytesAndCharactersStream 
{
    public static void main(String[] args) 
    {
        File file1 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\105.BytesAndCharactersStream\\denemeKlasor\\Java.png");
        System.out.println(file1.exists());
        if(file1.exists())
        {
            FileInputStream inputStream = null;
            try
            {
                inputStream = new FileInputStream(file1);
                byte[] buffer = new byte[1024];
                int length = 0;
                while((length = inputStream.read(buffer))!= -1)
                {
                    System.out.println(Arrays.toString(buffer));                
                }
            }
            catch (IOException e) 
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
                    catch (IOException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }    
}
