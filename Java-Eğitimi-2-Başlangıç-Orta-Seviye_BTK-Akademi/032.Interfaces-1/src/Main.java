public class Main
{
    public static void main(String[] args)
    {
        //İnterfaceler sınıf sayılmaz ama özellikleri tutabilir.
        //1 class istenilen kadar interface'i implements edebilir

        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.Add();

        ICustomerDal customerDal1 = new OracleCustomerDal();
        customerDal1.Add();

        IRepository iRepository = new MySqlCustomerDal();
        iRepository.Depola();

        IRepository iRepository1 = new OracleCustomerDal();
        iRepository1.Depola();
    }
}