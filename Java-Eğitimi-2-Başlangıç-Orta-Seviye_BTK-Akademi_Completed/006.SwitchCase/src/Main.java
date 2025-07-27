public class Main
{
    public static void main(String[] args)
    {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz.");
                break;

            case 'B':
                System.out.println("İyi : Geçtiniz.");
                break;

            //2 Case aynı anda kullanmak aşağıdaki gibidir.
            case 'C':
            case 'D':
                System.out.println("Fena değil : Geçtiniz.");
                break;

            case 'F':
                System.out.println("Malseef Kaldınız.");
                break;

            //Eğer hiç bir şart sağlanmıyorsa default çalıştırılır
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}