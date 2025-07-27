public class Main
{
    public static void main(String[] args)
    {
        //For döngüsü
        //Döngü belli bir sayıda döner
        System.out.println("Döngü başladı.");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("i'nin değeri : " + i);
        }
        System.out.println("Döngü bitti.");
        //------------------------------------------------
        System.out.println("1 ile 10 arasındaki tek sayılar.");
        for (int i = 1; i < 10; i += 2)
        {
            System.out.println(i);
        }
        //------------------------------------------------
        System.out.println("1 ile 10 arasındaki çift sayılar.");
        for (int i = 2; i < 10; i += 2)
        {
            System.out.println(i);
        }
    }
}