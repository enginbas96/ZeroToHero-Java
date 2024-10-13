package pkg016.garbagecollection;

class Hayvan
{
    private String ad;

    public Hayvan(String ad) {this.ad = ad;}    
    public String getAd(){return ad;}
    public void setAd(String ad){this.ad = ad;}  
    @Override
    public String toString(){return "Ad : " + ad;}    
    @Override
    public void finalize() throws Throwable{System.out.println(ad + " isimli hayvan objesi hafizadan silindi.");}
    //finalize metodu obje hafızadan kaldırıldıgında otomatik olarak devreye giren bir metottur (referansı olmayan objeleri)
}

public class GarbageCollection 
{    
    public static void main(String[] args)
    {
        
        Hayvan kopek = new Hayvan("Karabas"); //Stack içerisinde bir alan ayrıldı bu alanda heap içerisinde yer alan verilerin adresi saklanıyor
        //kopek = null; //Heap ve stack arasındaki bağlantı kaldırıldı, artık heap içerisinde ayrılan yerleri gösterecek bir yol olmadıgından çöp olmuş oldu.
        System.out.println(kopek.getAd());      
        //Bir objenin adresinin null yapılması durumunda unreferenced object durumu meydana gelir    
        kopek = null; //kopek objesinin adresini null yaptık
        try
        {
            System.out.println(kopek.getAd()); //kopek adresi null oldugundan verilere erişemeyecek bu sebeple hata fırlatacaktır
        } 
        catch (NullPointerException hata) 
        {
            System.out.println(hata);
            System.out.println(hata.getMessage());
        }
        System.out.println("-------------------------------------------------------------");
        
        //2. Durum 
        Hayvan kedi = new Hayvan("Pisi Pisi"); //Stack'te ve heap'te ayrı ayrı yerler kedi için oluşturuldu
        Hayvan kus = new Hayvan("Cik Cik");  //Stack'te ve heap'te ayrı ayrı yerler kus için oluşturuldu
        
        kedi = kus; //Kusun referans adresini kedinin referans adresine kopyaladık bu sayede kedi ve kus, kus'un heap adresini tutacak
        System.out.println(kedi.getAd()); //Adreslerin ikiside kusu gösterdiği için ona göre işlemler yapacak
        System.out.println(kus.getAd());
        //Yukarıdaki atama işlemi sayesinde kedi için oluşturulan heap bölgeleri unreferenced oldu
        System.out.println("-------------------------------------------------------------");
        
        //3.Durum
        //Anonim obje oluşturursak adresi bilinmez
        //Böylece oluşturulan objenin heap adresi elimizde olmaz
        //Bu sebeple unreferenced object haline gelmiş oluyor
        System.out.println(new Hayvan("Pamuk").getAd()); //Bunun için bize bir adres tahsis etti
        System.out.println("-------------------------------------------------------------");
        
        //Tüm bu boşa yer kaplayan verilerin kaldırılması gerekmektedir
        Hayvan maymun = new Hayvan("Kong");
        kedi = maymun;
        kopek = maymun;        
        kus = null;
        maymun = null;
        
        System.out.println(kedi.getAd());
        kedi = null;
        kopek = null;
        
        System.out.println("---------------");
        System.gc(); //çöp temizleme kodu
        
        // Aşağıdaki try-catch blogu gc metodu kullanıldıgında finalize metodunun çalışması için gerekli zamanı ona sağlamak için verilmiştir
        //Aksi taktirde yapılan işlemin sırası bilinmediğinden bazen çıktı olarak görünmeyecektir
        try 
        {
            Thread.sleep(1000); // 1 saniye bekleme süresi
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}