public class Main
{
    public static void main(String[] args)
    {
        /// Throws
        AccountManager manager = new AccountManager();
        System.out.println("Hesap Tutarı : " + manager.getBalance());

        manager.deposit(500);
        System.out.println("Hesap Tutarı : " + manager.getBalance());

        try
        {
            manager.withdraw(230);
        }
        catch (YetersizBakiyeException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Hesap Tutarı : " + manager.getBalance());

        try
        {
            manager.withdraw(280);
        }
        catch (YetersizBakiyeException e)
        {
            System.out.println(e.getMessage()); ///Throw üzerinde oluşturduguğumuz hatanın kendisini çağırıyor
        }
        System.out.println("Hesap Tutarı : " + manager.getBalance());

        /// Kendi exceptionlarımızı kullanmak programı daha profesyonel hale getirir
        /// Dhaa iyi hata kontrolü ve daha iyi tepki vermemize olanak tanır
    }
}