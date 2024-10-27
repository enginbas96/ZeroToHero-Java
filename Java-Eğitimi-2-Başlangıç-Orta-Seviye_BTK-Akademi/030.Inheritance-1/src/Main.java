public class Main {
    public static void main(String[] args)
    {
        //İnheritance miras alma verme durumudur
        //Çalışan ve müşteride bulunan ortak özellikleri ortak bir class olan insan sınıfında tutalım
        //Örneğin çalışan ve müşterinin adı ve soyadı ve yaşı ve id'si vardır
        //Bunları her iki sınıfta da ayrı ayrı tanımlamak yerine ortak bir sınıfta tanımlarız

        Customer customer = new Customer();
        Employee employee = new Employee();

        //Customer sınıfının içerisinde olmayan değişkenler Person classından miras alarak onları kullanmaya hak kazanmıştır
        customer.id = 1;
        customer.firstName = "Enqin";
        customer.lastName = "BAŞ";
        customer.age = 30;
        customer.email = "engin.bas@gmail.com"; //Farklı olan değişken

        employee.id = 2;
        employee.firstName = "Mehmet";
        employee.lastName = "BAŞ";
        employee.age = 65;
        employee.salary = 100000; //Farklı olan değişken

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.Add();
        customerManager.List();
        customerManager.BestCustomer();

        employeeManager.Add();
        employeeManager.List();
        employeeManager.BestEmployee();
    }
}