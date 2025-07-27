public class Main
{
    public static void main(String[] args)
    {
        //Sayı asal mı
        int sayi = 23;
        boolean tamBolum = false;
        if (sayi <= 1)
        {
            System.out.println(sayi + " sayisi asal sayı değildir.");
            return;
        }
        else if(sayi == 2)
        {
            System.out.println(sayi + " sayisi asal sayıdır.");
            return;
        }
        else
        {
            for(int i = 2; i < sayi; i++)
            {
                //Mod alma operatörü bölümden kalan değeri verir, 10%3=1'dir 13%5=3'tür
                if((sayi%i) == 0)
                {
                    tamBolum = true;
                }
            }
            if(tamBolum == true)
            {
                System.out.println(sayi + " sayisi asal sayı değildir.");
            }
            else
            {
                System.out.println(sayi + " sayisi asal sayıdır.");
            }
        }
    }
}