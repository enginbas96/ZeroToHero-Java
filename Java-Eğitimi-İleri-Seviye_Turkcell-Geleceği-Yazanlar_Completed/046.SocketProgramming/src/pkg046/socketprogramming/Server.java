package pkg046.socketprogramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server 
{
    private static final int PORT = 5001;
    
    public static void main(String[] args) throws IOException 
    {
        ServerSocket sunucu = new ServerSocket(PORT);
        
        System.out.println("[SUNUCU] Bir istemcinin baglanmasi bekleniyor...");
        
        Socket client = sunucu.accept();
        
        PrintWriter output = new PrintWriter(client.getOutputStream(), true);
        output.println((new Date()).toString());
        
        System.out.println("[SUNUCU] Tarih bilgisi gonderildi. Baglanti kapatiliyor.");
        
        sunucu.close();
        client.close();        
    }    
}