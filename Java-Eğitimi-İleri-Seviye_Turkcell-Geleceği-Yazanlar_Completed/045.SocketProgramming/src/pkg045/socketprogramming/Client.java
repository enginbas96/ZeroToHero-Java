package pkg045.socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;

    public Client(String ipAddress, int port) throws UnknownHostException, IOException
    {
        socket = new Socket(ipAddress, port);
        System.out.println("-Client- Sunucuya baglandi!");
        input = new DataInputStream(System.in);
        output = new DataOutputStream(socket.getOutputStream());
        
        String metin = "";
        while (!metin.equals("Bitti"))
        {     
            try
            {
                metin = input.readLine();
                output.writeUTF(metin);                
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        try
        {
            input.close();
            output.close();
            socket.close();            
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }        
    }  
    
    public static void main(String[] args) throws IOException 
    {
        Client client = new Client("127.0.0.1", 5000);
    }    
}