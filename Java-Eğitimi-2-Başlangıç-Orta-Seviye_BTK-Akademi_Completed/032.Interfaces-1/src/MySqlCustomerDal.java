public class MySqlCustomerDal implements ICustomerDal, IRepository
{
    //Dal = data access layer

    @Override
    public void Add()
    {
        System.out.println("MySQL Eklendi.");
    }

    @Override
    public void Depola()
    {
        System.out.println("MySQL Depolandı.");
    }
}
