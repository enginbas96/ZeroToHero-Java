package pkg047.socketprogramming;

import java.io.*;
import java.net.Socket;

public class Client 
{
    private static final String SERVER_IP = "127.0.0.1";
    private static final int PORT = 5001;
    
    public static void main(String[] args) throws IOException 
    {
        Socket socket = new Socket(SERVER_IP,PORT);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));        
        BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));        
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        
        while (true)
        {
            System.out.println("[Client] ----> ");
            String komut = klavye.readLine();
            output.println(komut);
            String sunucuCevap = input.readLine();
            System.out.println("[Sunucu] ----> " + sunucuCevap);
            
            if(komut.equals("Bitti"))
            {
                break;
            }
        }        
        socket.close();
        System.exit(0);
    }    
}