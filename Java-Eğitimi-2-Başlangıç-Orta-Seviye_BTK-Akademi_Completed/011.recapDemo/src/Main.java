public class Main
{
    public static void main(String[] args)
    {
        double[] dizi1 = new double[5];
        double[] dizi2 = {1.5, 13.4, 177.14, 28, 67.14};

        for(int i = 0; i<dizi1.length; i++)
        {
            dizi1[i] = dizi2[i];
            System.out.println("Dizi 2'nin "+ (i+1) + ". elemanı Dizi 1'in " + (i+1) + ". elemanına atandı.");
        }
        System.out.println("Dizi aktarım işlemi gerçekleşti");
        System.out.println("-----------------------------------");
        for(double d:dizi1)
        {
            System.out.println(d);
        }
        System.out.println("Ekrana yazdırma işlemi bitti.");
        System.out.println("-----------------------------------");
        //Toplamının yazdırılması
        double toplam = 0;
        for (int i = 0; i<dizi1.length; i++)
        {
            toplam += dizi1[i];
        }
        System.out.println("Dizinin elemanları toplamı : " + toplam);
        System.out.println("-----------------------------------");
        //Dizi içindeki en büyük eleman
        double enBuyukDeger = dizi1[0];
        for (double d:dizi1)
        {
            if(d > enBuyukDeger)
            {
                enBuyukDeger = d;
            }
        }
        System.out.println("En buyuk deger : " + enBuyukDeger);
        System.out.println("-----------------------------------");
    }
}