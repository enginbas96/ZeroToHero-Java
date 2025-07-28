package springIntro;

public class MySqlCustomerDAL implements ICustomerDAL
{
	@Override
	public void add() 
	{
		   System.out.println("Mysql veritabanına eklendi.");
	}
}
