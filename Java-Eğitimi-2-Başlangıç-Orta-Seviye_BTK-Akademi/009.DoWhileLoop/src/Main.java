public class Main
{
    public static void main(String[] args)
    {
        //doWhile döngüsü while döngüsünün aynısıdır fakat içindeki kod en az 1 kere çalışır
        int i = 25;
        do
        {
            System.out.println("i'nin değeri : " + i);
        }while(i < 10);
        System.out.println("DoWhile döngüsü bitti.");
        //----------------------------------------------------------
        int j = 1;
        do
        {
            System.out.println("j'nin değeri : " + j);
            j++;
        }while(j < 5);
        System.out.println("DoWhile döngüsü bitti.");
    }
}