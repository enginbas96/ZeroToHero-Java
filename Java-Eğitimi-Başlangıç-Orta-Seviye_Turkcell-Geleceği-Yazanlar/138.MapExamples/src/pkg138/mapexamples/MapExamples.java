package pkg138.mapexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapExamples 
{    
    public static void main(String[] args) 
    {
        //Bir dosyadan sözcük değerlerini okuyup mapin içine atacağız ve kullanıcıdan girilen değere göre bir dönüt sağlayacağız
        
        File file = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi_Turkcell-Geleceği-Yazanlar\\138.MapExamples\\sozluk\\sozluk.txt");
        FileReader fileReader = null; // Dosyadan okuma yapılacağı için reader nesnesi oluşturduk
        BufferedReader bufferedReader = null; //Satır satır okuma yapılacağı için buffered reader oluşturduk
        FileWriter fileWriter = null;
        try
        {            
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(file, true);//True nesnesi alan fileWriter metodu istenilen değerleri en sona ekleyecektir
            String satir = null;
            SortedMap<String, String> sortedMap = new TreeMap<>();            
            while((satir =bufferedReader.readLine()) != null)
            {                
                /*System.out.println(satir);
                String[] strings = satir.split(":");//Split metodu istenilen kuraldan bölmeye yarar
                System.out.println(strings[0]);
                System.out.println(strings[1]);*/
                
                String[] strings = satir.split(":");
                sortedMap.put(strings[0], strings[1]);                
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Kelime : ");
            String kelime = null;
            while(!(kelime = sc.nextLine()).equals("exit"))
            {
                if(sortedMap.get(kelime) != null)
                {
                    System.out.println(kelime + " : " + sortedMap.get(kelime));
                }
                else
                {
                    System.out.println("Kelime bulunamadi! Eklemek ister misiniz E/H : ");
                    if(sc.nextLine().equals("E"))
                    {
                        System.out.print("Girdiginiz kelimenin anlami : ");
                        String yeniKelime = sc.nextLine();
                        fileWriter.write("\n");
                        fileWriter.write(kelime);
                        fileWriter.write(":");
                        fileWriter.write(yeniKelime);
                        fileWriter.flush();//Eklediklerimizin anlık 
                        sortedMap.put(kelime, yeniKelime);
                        System.out.println("Kelime eklendi.");                        
                    }
                }                
                System.out.print("Kelime : ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(fileReader != null){fileReader.close();}                
                if(bufferedReader != null){bufferedReader.close();}                
                if(fileWriter != null){fileWriter.close();}                
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }        
    }    
}
