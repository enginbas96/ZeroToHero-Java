import javax.print.attribute.standard.PDLOverrideSupported;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        DosyaOlustur();
        DosyaBilgisi();
        DosyayaYazma();
        DosyaOkuma();
    }

    public static void DosyaOlustur()
    {
        File file = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi-2-Başlangıç-Orta-Seviye_BTK-Akademi\\045.Files-1\\files\\students.txt");
        try
        {
            if(file.createNewFile())
            {
                System.out.println("Dosya oluşturuldu.");
            }
            else
            {
                System.out.println("Dosya zaten mevcut.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void DosyaBilgisi()
    {
        File file = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi-2-Başlangıç-Orta-Seviye_BTK-Akademi\\045.Files-1\\files\\students.txt");
        if(file.exists())
        {
            System.out.println("-----------------------------------------------");
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getPath());
            System.out.println("Dosya yazılır mı: " + file.canWrite());
            System.out.println("Dosya okununur mu: " + file.canRead());
            System.out.println("Dosya boyutu(byte): " + file.length());
            System.out.println("-----------------------------------------------");
        }
        else
        {
            System.out.println("Dosya mevcut değil.");
        }
    }

    public static void DosyaOkuma()
    {
        File file = new File("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi-2-Başlangıç-Orta-Seviye_BTK-Akademi\\045.Files-1\\files\\students.txt");
        try
        {
            String veri = "";
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                veri = sc.nextLine();
                System.out.println(veri);
            }
            sc.close();
        }
        catch (Exception e){ System.out.println(e); }
    }

    public static void DosyayaYazma()
    {
        System.out.println("--------------------------------------------------");
        try
        {
            FileWriter file = new FileWriter("C:\\Users\\ENGBA\\Documents\\GitHub\\ZeroToHero-Java\\Java-Eğitimi-2-Başlangıç-Orta-Seviye_BTK-Akademi\\045.Files-1\\files\\students.txt",true);
            /// Pathın sonuna true değeri eklenirse dosyanın üzerine eklme yapar, true olmazsa içindeki verilerden bağımsız üzerine yazar.
            BufferedWriter writer = new BufferedWriter(file);
            writer.newLine(); /// Yeni satıra geçmeye yarar.
            writer.write("Kazım"); /// Veriyi belirtilen yoldaki dosyaya eklemeye yarar
            System.out.println("Dosyaya yazıldı.");
            writer.close(); /// hafızada şişkinlik olamaması için writerı sonlandırır
        }
        catch (Exception e){ System.out.println(e); }
    }
}