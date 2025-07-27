public class Main
{
    public static void main(String[] args)
    {
        //Metotlar kod tekrarından kurtarır
        //Metotların içerine yazılan kodu istenilen yerde metodu çağırarak çalıştırılabilir

        ParametresizMesajVer();
        ParametreliMesajVer("Engin BAŞ");

        int[] sayilar = new int[] {1,5,3,2,78,213,4};
        SayiBulmaca(sayilar,5);


    }

    public static void ParametresizMesajVer()
    {
        System.out.println("Bu metot parametresiz metottur.");
    }

    public static void ParametreliMesajVer(String parametre)
    {
        System.out.println("Bu metot parametreli metottur. Parametre = " + parametre);
    }

    public static void SayiBulmaca(int[] sayiDizisi, int aranacakSayi)
    {
        for(int i:sayiDizisi)
        {
            if(i == aranacakSayi)
            {
                System.out.println("Aradığınız sayı dizide mevcuttur.");
                return;
            }
        }
        System.out.println("Aranacak sayı dizede bulunamadı.");
    }
}