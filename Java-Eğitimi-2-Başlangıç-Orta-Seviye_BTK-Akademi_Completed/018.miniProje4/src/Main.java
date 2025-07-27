public class Main
{
    public static void main(String[] args)
    {
        //Arkadaş sayılar örneği
        //Arkadaş sayılar; kendileri hariç pozitif tam bölenlerinin toplamı birbirine eşit olan sayılardır
        //bilinen en küçüğü 220 ve 284'tür
        int sayi1 = 1184;
        int sayi2 = 1210;
        int toplam1 = 0;
        int toplam2 = 0;

        for(int i = 1; i < sayi1; i++)
        {
            if(sayi1%i==0){toplam1+=i;}
        }

        for(int i = 1; i < sayi2; i++)
        {
            if(sayi2%i==0){toplam2+=i;}
        }

        if((toplam1 == sayi2) && (sayi1 == toplam2))
        {
            System.out.println(sayi1 + " ve " + sayi2 + " sayıları arkadaş sayıdır.");
        }
        else
        {
            System.out.println(sayi1 + " ve " + sayi2 + " sayıları arkadaş sayı değildir.");
        }
    }
}