package pkg014.memorymanagement;

//Heap
//Objeleri depolamaya yarayan alandır //Objelerimizin adresleri stack'te depolanırken tüm değerleri heap içerisinde tutulur
// İnsan i1 = new İnsan("Ahmet"); buradaki i1 değişkeni/nesnesi adresi stack'te depolanır ama değişkenleri heapte tutulur
//Heap'in boyutunun sınırı yoktur ve dinamik olarak değişir //Ram el verdiği sürece artabilir.
//Stack'e göre objelere ulaşmak daha yavaş gerçekleşir

//Heap alanında
//old space(geçmişte kullanılan nesneler) - young space(yeni oluşturulan nesneler)
//FİFO mantığı vardır (ilk oluşturulan obje old spaceten siliniyor ve serbest bırakma işlemi gerçekleştiriliyor) 
//Garbage collection sayesinde old spacedeki objeleri fifo ile serbest bırakır
class Insan
{
    private String ad;
    private int yas;
    public Insan() {}
    public Insan(String ad, int yas) 
    {
        this.ad = ad;
        this.yas = yas;
    }    
    @Override
    public String toString(){return "Ad : " + ad + " Yas : " + yas;}
}

public class MemoryManagement 
{
    public static void main(String[] args) 
    {
        Insan i1 = new Insan("Engin",28); 
        // i1 nesnesi için stackte ona özel bir alan ayrıldı
        //Aynı zamanda içine girilen parametreler de heap bölgesinde kendi alanlarına ayrıldı
        System.out.println(i1); //i1 nesnesine stackten ulasıp içindeki adresleri kullanarak heap bölgesinden verilerini çekiyor
        i1 = null; //i1 nesnesinin içini boşalttık artık heap içerisinde herhangi bir bölümü kullanmıyor
        //Fakat hala heap içerisinde o veriler yer kaplıyor bunu da garbage collection sayesinde temizliyoruz
        System.out.println(i1);
    }    
}