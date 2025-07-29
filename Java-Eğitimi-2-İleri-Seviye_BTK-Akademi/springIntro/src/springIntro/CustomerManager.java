package springIntro;

public class CustomerManager implements ICustomerService
{
	private ICustomerDAL customerDAL;
	
	public CustomerManager(ICustomerDAL customerDAL) 
	{
		this.customerDAL = customerDAL;
	}

	@Override
	public void add() 
	{
		customerDAL.add();
	}
}
