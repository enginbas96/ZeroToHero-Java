package pkg043.socketprogramming;

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

    //Bağlantı kurmak için gereken isterler parametre olarak istenir
    //Hata fırlatmalarına karşı throws tanımlamalarını yapıyoruz
    public Client(String ipAddress, int port) throws UnknownHostException, IOException
    {
        //Burada bir obje oluşturuldugu anda bağlantıyı başlatalım
        //Bağlantı Kurmak
        socket = new Socket(ipAddress, port); //İp adresi ve tcp bağlantı noktası sağlandı
        System.out.println("-Client- Sunucuya baglandi!");
        input = new DataInputStream(System.in); //Girdi
        output = new DataOutputStream(socket.getOutputStream()); //Çıktı
        
        //İstemci ile iletişim
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
        
        //Bağlantiyi kapama
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
    
    
    
    public static void main(String[] args) 
    {
        //Client Side
        //ilk olarak Soket,input ve output işlemleri projeye dahil edilir
        //ip adresi ve tcp bağlantı noktası sağlanması
        //iletişimin gerçekleşmesi
        //bağlantıların kapatılması
        
        
        
        
        
    }    
}