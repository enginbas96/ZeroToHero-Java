package pkg048.socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class Client 
{
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 5001;
    
    public static void main(String[] args) throws IOException 
    {
        Socket socket = new Socket(SERVER_IP, SERVER_PORT);        
        ServerConnection sunucuBaglantisi = new ServerConnection(socket);
        
        BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(socket.getOutputStream(),  true);
        
        new Thread(sunucuBaglantisi).start();
        
        while (true)
        {
            System.out.println("[CLIENT] -> ");
            String komut = klavye.readLine();
            output.println(komut);
            
            if(komut.equals("Bitti"))
            {
                break;
            }            
        }
        
        socket.close();
        System.exit(0);
        
    }
    
}
