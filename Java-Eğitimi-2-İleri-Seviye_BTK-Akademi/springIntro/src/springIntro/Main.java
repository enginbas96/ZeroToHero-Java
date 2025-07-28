package springIntro;

public class Main 
{
	public static void main(String[] args) 
	{
		CustomerManager customerManager = new CustomerManager(new CustomerDAL());
		customerManager.add();
		
		CustomerManager customerManager2 = new CustomerManager(new MySqlCustomerDAL());
		customerManager2.add();
	}
}

/*

IOC Inversion of control
Dependency Injection
Yazılımda değişime direnç göstermeyen kod yazmak çok önemlidir
SOLİD'e uygun yazılmalı
 
 */