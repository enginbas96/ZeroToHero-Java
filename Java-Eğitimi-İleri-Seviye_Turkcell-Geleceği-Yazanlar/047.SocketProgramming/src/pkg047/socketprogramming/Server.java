package pkg047.socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Server 
{
    private static final int PORT = 5001;
    private static String[] isimler = {"Engin", "Mehmet", "Aysel", "Fatma"};
    private static String[] meslekler = {"Yazilim Muh.", "Doktor", "Ogretmen", "Asci"};
    
    public static void main(String[] args) throws IOException 
    {
        ServerSocket sunucu = new ServerSocket(PORT);
        System.out.println("[Sunucu] ----> Bir istemcinin baglanmasi bekleniyor....");
        
        Socket client = sunucu.accept();
        System.out.println("[Sunucu] ----> Bir istemci baglandi.");
        
        PrintWriter output = new PrintWriter(client.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        
        while(true)
        {
            String clientRequest = input.readLine();
            if(clientRequest.contains("Bir kisi soyle"))
            {
                output.println(rastgeleKisiSec());
            }
            else if(clientRequest.equals("Bitti"))
            {
                output.println("Hoscakal, yine bekleriz...");
                System.out.println("Sunucu Kapatildi!");
                break;
            }
            else
            {
                output.println("Rastgele bir kisi bilgisi almak icin \"Bir kisi soyle\" komutunu giriniz.");
            }
        }
        
        output.close();
        input.close();        
    }  
    
    public static String rastgeleKisiSec()
    {
        int no = (int)(Math.random() * isimler.length);
        return isimler[no] + " " + meslekler[no];        
    }    
}