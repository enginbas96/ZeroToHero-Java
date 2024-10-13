package pkg108.filestreamexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileStreamExamples 
{
    public static void main(String[] args) 
    {
        File file1 = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\108.FileStreamExamples\\denemeKlasor\\oku.txt");
        if(file1.exists())
        {
            //Karakter tabanlı okuma yapmak için filereader sınıfı kullanılır.
            //Karakter girişi yapmak için filewriter kullanılır.
            FileReader fileReader = null; 
            try
            {
                fileReader = new FileReader(file1);
                int c = 0;
                long now = System.currentTimeMillis();
                /*while((c = fileReader.read()) != -1)
                {
                    System.out.print((char)c);
                }     
                System.out.println("----------------------");
                System.out.println(System.currentTimeMillis() - now); // 120 ms         
                */
                
                //While kullanmadan buffer kullanmak okuma yapmak daha performanslı 
                char[] buffer = new char[(int)file1.length()];
                fileReader.read(buffer);
                System.out.println(new String(buffer));
                System.out.println("----------------------");
                System.out.println(System.currentTimeMillis() - now); //51 ms            
            }
            catch (Exception e)
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
                    catch (Exception e) 
                    {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        else
        {
            System.out.println("Dosya bulunamadi.");
        }
        
        
        
        
        
        
        
        
        
        
    }    
}
