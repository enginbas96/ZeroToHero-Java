public class Main
{
    public static void main(String[] args)
    {
        //Mükemmel sayı bulma örneği
        //Mükemmel sayı kendinden başka tam bölenlerinin toplamı kendisine eşit olan sayıdır
        //6 mükemmel sayıdır 1,2,3 e bölünür ve toplamları 6 yı verir
        //mükemmel sayılardan bazıları 6,28,496,8128,33550336
        int sayi = 33550336;
        int toplam = 0;
        for(int i = 1; i < sayi; i++)
        {
            if(sayi%i == 0) // bu kodun anlamı "tam bölünüyorsa"'dır
            {
                toplam = toplam + i;
            }
        }

        if(toplam == sayi)
        {
            System.out.println(sayi + " sayisi mükemmel sayıdır.");
        }
        else
        {
            System.out.println(sayi + " sayisi mükemmel sayı değildir.");
        }
    }
}