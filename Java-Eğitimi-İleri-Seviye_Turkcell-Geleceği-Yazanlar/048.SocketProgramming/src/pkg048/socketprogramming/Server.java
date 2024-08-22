package pkg048.socketprogramming;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Server 
{
    private static String[] isimler = {"Fatih", "Aysel", "Mehmet", "Melek"};
    private static String[] meslekler = {"Bilgisayar Muh.", "Doktor", "Ogretmen", "Asci"};
    
    private static final int PORT = 5001;
    
    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    
    public static ArrayList<ClientHandler> getClients()
    {
        return clients;
    }
    
    private static ExecutorService pool = Executors.newFixedThreadPool(3);
    
    public static void main(String[] args) throws IOException
    {
        ServerSocket sunucu = new ServerSocket(PORT);
        while (true) 
        {            
            System.out.println("[SERVER] -> Bir istemcinin baglanmasi bekleniyor....");
            Socket client = sunucu.accept();     
            System.out.println("[SERVER] -> Bir istemcinin baglandi.");
            ClientHandler clientThread = new ClientHandler(client, clients);
            clients.add(clientThread);
            pool.execute(clientThread);
        }
    }    
    
    public static String rastgeleKisiSec()
    {
        int no = (int)(Math.random() * isimler.length);
        return isimler[no] + "  " + meslekler[no];
    }
}