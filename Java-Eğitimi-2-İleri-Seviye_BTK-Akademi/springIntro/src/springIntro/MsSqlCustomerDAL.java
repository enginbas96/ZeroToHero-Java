package springIntro;

public class MsSqlCustomerDAL implements ICustomerDAL 
{

	@Override
	public void add() {
		System.out.println("Ms Sql Veritabanına Eklendi.");
		
	}

}
