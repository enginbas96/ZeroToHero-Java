public class Main
{
    public static void main(String[] args)
    {
        /*
        CustomerManager customerManager = new CustomerManager(); //CustomerManager nesnesi oluşturuldu
        customerManager.customerDAL = new MySqlCustomerDal(); //Oluşturulan nesnenin customerDal'ı Mysql yapıldı
        //Artık MySqlCustomerDal içerisindeki işlemleri yapacak
        customerManager.Add();

        //Depolama işlemlerinden Oracle seçildi
        customerManager.iRepository = new OracleCustomerDal();
        customerManager.Depola();
        */


        ICustomerDAL iCustomerDAL = new OracleCustomerDal();
        IRepository iRepository = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(iCustomerDAL, iRepository);
        customerManager.Add();
        customerManager.Depola();

        //Başka bir kullanımı
        System.out.println("-----------------------------------------");
        CustomerManager customerManager1 =  new CustomerManager(new MySqlCustomerDal(), new MySqlCustomerDal());
        customerManager1.Add();;
        customerManager1.Depola();
    }
}