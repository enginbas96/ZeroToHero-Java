public class Main
{
    public static void main(String[] args)
    {
        //While döngüsü
        //Şart sağlanıyorsa dönmeye devam eder.
        //Arttırma veya azaltma işlemi yapılmazsa i sürekli başlangıç değerinde kalır.
        //Şarta asla gidemiyorsa bu döngü sonsuz döngü tanımıdır.
        //while(true) 'da sonsuz döngünün tanımıdır.
        int i = 1;
        while(i <= 10)
        {
            System.out.println("i'nin değeri : " + i);
            i++;
        }
        System.out.println("While döngüsü bitti.");
    }
}