package pkg039.threads;

public class Threads 
{    
    public static void main(String[] args) 
    {
        //Elimizde kullanılabilecek bir tane kaynağımız varsa onu düzgün kullanmak için senkronize ayarlarını yapmamız gerekir
        //Buradaki örnekte 1 tane yazıcımız var ve çıktıların karışık basılmasını istemiyoruz bu sebeple onları senkronize etmemiz gerekiyor
        Yazici yazici = new Yazici();
        
        Runnable r1 = new Gorev(yazici, "Vize_Dokuman", 5);
        Runnable r2 = new Gorev(yazici, "Final_Dokuman",5);
        Runnable r3 = new Gorev(yazici, "Butunleme_Dokuman",5);
        Thread gorev1 = new Thread(r1);
        Thread gorev2 = new Thread(r2);
        Thread gorev3 = new Thread(r3);
        gorev1.start();
        gorev2.start();
        gorev3.start();
    }    
}