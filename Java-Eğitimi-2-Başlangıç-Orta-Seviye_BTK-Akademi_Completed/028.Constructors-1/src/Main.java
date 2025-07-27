public class Main
{
    public static void main(String[] args)
    {
        Product AS;
        System.out.println("----------------------------------------");
        System.out.println("Yapıcı metot hala çalışıtırılmadı.");
        System.out.println("New'lendiği zaman çalışmaya başlayacak.");
        System.out.println("----------------------------------------");

        AS = new Product();

        System.out.println("----------------------------------------");

        //Parametreli metot tanımı yapıldı
        //Burada yapıcı metot parametreli tanıtıldı ve girilen veriler ile işlem yapıldı.
        Product AD = new Product(5,"Laptop");

        System.out.println("----------------------------------------");
    }
}