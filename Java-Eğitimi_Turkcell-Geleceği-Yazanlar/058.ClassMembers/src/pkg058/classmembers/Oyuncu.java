package pkg058.classmembers;

public class Oyuncu 
{
    int saglik = 100;
    static int oyuncuSayisi = 0; //static yaparak her bir oluşan nesne için aynı değeri devam ettirebiliyoruz yani tüm nesneler aynı değişken adresini kullanıyor
    Oyuncu()
    {
        oyuncuSayisi++;
    }
    void yasam ()
    {
        saglik = 100;
    }
    void darbe()
    {
        saglik--;
    }
    void oyuncuSayisi()
    {
        System.out.println(oyuncuSayisi);
    }
}
