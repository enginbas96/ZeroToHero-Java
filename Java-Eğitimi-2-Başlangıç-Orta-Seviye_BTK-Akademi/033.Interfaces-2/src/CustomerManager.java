public class CustomerManager
{
    //Sadece bu şekilde verseydik hata vermediği için programcı bazı kodları görmeyebilirdi
    //Bunun önüne geçmek için yapıcı metot kullanılır
    ICustomerDAL customerDAL;
    IRepository iRepository;
    public CustomerManager(ICustomerDAL customerDAL, IRepository iRepository)
    {
        this.customerDAL = customerDAL;
        this.iRepository = iRepository;
    }
    public void Add()
    {
        customerDAL.Add();
    }
    public void Depola()
    {
        iRepository.Depola();
    }
}
