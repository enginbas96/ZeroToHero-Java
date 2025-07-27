import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Engin","BAŞ"));
        customers.add(new Customer(2,"Murat","BAŞ"));
        customers.add(new Customer(3,"Mehmet","BAŞ"));
        for(Customer c:customers)
        {
            System.out.println(c.ad);
        }

        System.out.println("-------------------------------------------");

        /// Listeden veri silmek
        ArrayList<Customer> customers2 = new ArrayList<>();

        Customer A = new Customer(1,"A","A"); ///Referans tipine dönüştürdük bu sayede A üzerinden direk islem yapabiliriz
        customers2.add(A);

        customers2.add(new Customer(2,"B","B"));
        customers2.add(new Customer(3,"C","C"));

        customers2.remove(new Customer(1,"A","A")); ///Bu şekilde silme işlemi gerçekleşmez yine A elemanı orada kalır
        for(Customer c:customers2)
        {
            System.out.println(c.ad);
        }
        System.out.println("-----------------");
        customers2.remove(A);/// Referans tipine dönüştürüp silme işlemi gerçekleştirdiğimiz zaman silme işlemi gerçekleşir
        for(Customer c:customers2)
        {
            System.out.println(c.ad);
        }
    }
}