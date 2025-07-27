public class MySqlCustomerDal implements ICustomerDAL, IRepository
{
    @Override
    public void Add() {
        System.out.println("Mysql Eklendi");
    }

    @Override
    public void Depola() {
        System.out.println("Mysql Depolandı");
    }
}
