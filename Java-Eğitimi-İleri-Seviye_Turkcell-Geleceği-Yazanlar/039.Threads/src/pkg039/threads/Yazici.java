package pkg039.threads;

public class Yazici
{
    //synchronized public void yazdir(int kopyaSayisi, String dokumanIsmi) 
    //Synchronized metodu sayesinde işlemler sırasıyla yapılır
    //Diğer threadler bekletilir
    //Ama burada 2 tane yazıcı oldugu durumda da problemler çıkmaktadır çünkü onların thredini de beklemeye alır
    //Burada genel bir bekleme yapmak yerine thread sınıfında senkronize ayarını yapmak daha mantıklıdır
    public void yazdir(int kopyaSayisi, String dokumanIsmi)
    {
        for (int i = 1; i <= kopyaSayisi; i++) 
        {          
            System.out.println(dokumanIsmi + " yazdiriliyor..." + " - Kopya Sayisi : " + i);
        }
    }
}