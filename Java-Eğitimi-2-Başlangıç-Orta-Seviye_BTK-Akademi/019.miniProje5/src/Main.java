public class Main
{
    public static void main(String[] args)
    {
        //Sayı bulma
        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;

        for(int i = 0; i < sayilar.length; i++)
        {
            if(sayilar[i] == aranacak)
            {
                System.out.println(aranacak + " sayisi listede bulundu.");
                //break; döngü bitirme kodudur.
                return;
            }
        }
        System.out.println("Sayı listede bulunamadı.");
    }
}