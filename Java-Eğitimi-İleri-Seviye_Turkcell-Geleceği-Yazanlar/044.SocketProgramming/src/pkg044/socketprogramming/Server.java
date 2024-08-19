package pkg044.socketprogramming;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream input = null;
    
    public Server(int port) throws IOException
    {
        server = new ServerSocket(port);
        System.out.println("Sunucu baslatildi.");
        
        System.out.println("Bir Client (istemci) bekleniyor...");
        
        socket = server.accept();
        System.out.println("Bir Client (istemci) kabul edildi.");
        
        //İstemcinin soketinden girdi alınıyor..
        input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        
        String metin = "";
        while(!metin.equals("Bitti"))
        {
            metin = input.readUTF();
            System.out.println(metin);         
        }    
        
        System.out.println("Baglanti sonlandiriliyor...");
        input.close();
        socket.close();        
    }
    
    public static void main(String[] args) throws IOException
    {    
        
    }    
}