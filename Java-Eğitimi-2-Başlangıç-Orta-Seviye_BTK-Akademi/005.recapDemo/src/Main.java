public class Main
{
    public static void main(String[] args)
    {
        int sayi1 =40;

        int sayi2;
        sayi2 = 25;

        int sayi3 = 32;

        //Yukarıdaki 3 sayıdan en büyüğünü bulma kodunu yazınız

        String enBuyukSayi = "En büyük sayı: ";

        if((sayi1 > sayi2) && (sayi1 > sayi3))
        {
            System.out.println(enBuyukSayi + sayi1);
        }
        else if((sayi2 > sayi1) && (sayi2> sayi3))
        {
            System.out.println(enBuyukSayi + sayi2);
        }
        else
        {
            System.out.println(enBuyukSayi + sayi3);
        }

        System.out.println("--------------------------------------------");

        int enBuyuk =  sayi1;
        if(enBuyuk < sayi2){enBuyuk = sayi2;}
        if(enBuyuk < sayi3){enBuyuk = sayi3;}
        System.out.println(enBuyukSayi + enBuyuk);


    }
}