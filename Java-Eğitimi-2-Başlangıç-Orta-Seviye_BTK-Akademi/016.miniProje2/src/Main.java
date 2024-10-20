public class Main
{
    public static void main(String[] args)
    {
        //Kalın sesli ve ince sesli harfler
        char harf = 'E';
        switch (harf)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harftir.");
                return;

            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harftir.");
                return;

            default:
                System.out.println("Bu harfi sesli harf kategorisine tanımlı değildir.");
        }
    }
}