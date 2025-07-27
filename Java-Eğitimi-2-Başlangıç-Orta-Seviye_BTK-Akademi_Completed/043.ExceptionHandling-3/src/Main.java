import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        /// Dosya Okuma Örneği
        BufferedReader reader = null;
        int total = 0;
        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi-2-Başlangıç-Orta-Seviye_BTK-Akademi\\043.ExceptionHandling-3\\src\\Sayilar.txt"));
            String line = null;
            while ((line = reader.readLine())!=null)
            {
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam = " + total);
        }
        catch (Exception e) { System.out.println(e); }
        finally
        {
            try { reader.close(); }
            catch (Exception e){}
        }
    }
}