package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		ICustomerService customerService = context.getBean("service",ICustomerService.class);		
		customerService.add();
		
		
		///CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDAL.class));
		///customerManager.add();
		
		
		
		
		
		
		
		
		
	}
}

/*

IOC Inversion of control
Dependency Injection
Yazılımda değişime direnç göstermeyen kod yazmak çok önemlidir
SOLİD'e uygun yazılmalı
 
 */