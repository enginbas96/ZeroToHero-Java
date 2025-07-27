public class OracleCustomerDal implements ICustomerDAL, IRepository
{
    @Override
    public void Add() {
        System.out.println("Oracle Eklendi");
    }

    @Override
    public void Depola() {
        System.out.println("Oracle Depolandı");
    }
}
