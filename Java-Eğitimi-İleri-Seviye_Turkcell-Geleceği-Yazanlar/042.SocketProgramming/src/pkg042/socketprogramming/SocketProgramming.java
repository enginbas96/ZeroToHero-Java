package pkg042.socketprogramming;


public class SocketProgramming 
{   
    public static void main(String[] args) 
    {
        //Socket Programming
        //Soket programlama jre ile çalışan programların birbirleri ile haberleşmesi için kullanılıyor
        //Ağda çalışan 2 programların çift yönlü bağlantıda kalmasını sağlıyor
        //Örneğin chat uygulamaları, msn, wp.
        
        //Client ve Server
        //Client istemci anlamına gelir aynı zamanda müşteri anlamına da gelir "talep eden" durumdaki nesneden bahsediyoruz        
        //Server sunucu anlamına gelir, hizmet veren anlamına da gelir, 
        //Client serverlerden hizmet bekler ve serverler bu istemcilere hizmet sağlarlar
        
        //Client -> request (istek) -> Server
        //Server -> response (cevap) -> Client
        
        //Socket nedir?
        //Bir son durak gibi düşünüle bilir, veriler bu socket üzerinden aktarılır
        //TCP katmanı burada gönderilecek uygulamayı tanımlayabiliyor, nasıl gönderileceği bu katmanda belirlenir
        
        //Server port <-> communication(iletişim) <-> client port
        //Portlar üzerinden iletişim sağlanır liman-kapı anlamına gelir
        //public InputStream getInputStream() Sokete bağlı input streamini döndürür
        //public OutputStream getOutputStream() Sokete bağlı output streamini döndürür
        //public synchronized void close() soketi kapatmayı sağlar
        //public Socket accept() server client bağlantısını açar        
        
        //Client Side Programming
        //Soket bağlantııs kurulur
        //IP adresi - tcp bağlantı noktası sağlamak
        //İstemci ile iletişim
        //bağlantıyı kapatmak
        
        //Server side programming
        //soket bağlantısı kurma
        //istemcinin isteğini bekler
        //istemci ile iletişim
        //bağlantıyı kapatma   
    }    
}