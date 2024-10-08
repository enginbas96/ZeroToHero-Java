package pkg048.socketprogramming;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientHandler implements Runnable
{
    private Socket client;
    private BufferedReader input;
    private PrintWriter output;
    private static ArrayList<ClientHandler> clients;
    
    public ClientHandler(Socket clientSocket, ArrayList<ClientHandler> clients) throws IOException
    {
        client = clientSocket;
        this.clients = clients;
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        output = new PrintWriter(client.getOutputStream(), true);
    }
    
    @Override
    public void run()
    {
        try
        {
            while (true) 
            {
                String istek = input.readLine();
                if(istek.contains("bir kisi soyle"))
                {
                    output.println(Server.rastgeleKisiSec());
                }
                else if(istek.startsWith("[herkes]"))
                {
                    int ilkBosluk = istek.indexOf(" ");
                    if(ilkBosluk != -1)
                    {
                        butunKisilereMesajGonder(istek.substring(ilkBosluk+1));                        
                    }
                }
                else if(istek.equals("Bitti"))
                {
                    output.println("Hoscakal yine bekleriz....");
                    break;
                }
                else
                {
                    output.println("Rastgele bir kisi icin \"bir kisi soyle\" yaziniz!");
                }
            }
            
        }
        catch (Exception e) 
        {
            System.out.println("Client Handler'da hata olustu;");
            e.printStackTrace();
        }
        finally
        {
            output.close();
            try 
            {
                input.close();
            } 
            catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }        
    }
    
    private void butunKisilereMesajGonder(String msg)
    {
        for(ClientHandler tempClient: clients)
        {
            tempClient.output.println(Thread.currentThread().getName() + " " + msg);
        }
    }    
}