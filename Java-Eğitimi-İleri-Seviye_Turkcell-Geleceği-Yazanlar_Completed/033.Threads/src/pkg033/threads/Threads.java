package pkg033.threads;

public class Threads 
{    
    public static void main(String[] args) 
    {
        //Thread
        //İş parçacıkları anlamına gelir, processlerin hafif halidir
        //Bir programın en küçük ve bağımsız birimidir
        //Ayrı bir yürütülme yolu vardır
        //Her java programı 1 thread içerir
        //java.lang.Thread sınıfından oluşturulur ve kontrol edilir
        
        //Thread LifeCycle
        // [new - runnable - running - blocked - dead] durumları vardır
        //Bir thread oluşturulur ve Start verilir bu sayede oluşturulan thread çalışabilir hale geliyor
        //Run edilerek çalışabilir durumdaki thread çalışır hale gelir
        //Çalışan thread'i sleep metodu veya wait metodu ile blocked durumuna getirebiliriz yani bekleme moduna geçer
        //notify ve resume metodları ile threadi tekrar canlandırarak çalışabilir duruma sokuyoruz
        //çalışır durumdaki thread işlemini bitirince dead olur yani sonlandırılır
        // diğer tüm durumlar için thread'ler stop metodu ile sonlandırılır        
    }    
}