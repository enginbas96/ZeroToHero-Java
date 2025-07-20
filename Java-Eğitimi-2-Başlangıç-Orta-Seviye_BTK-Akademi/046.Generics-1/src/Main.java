import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        /*
        /// Array Listleri objeler şeklinde tanımlandığımızda istediğimiz veriyi atayabiliyoruz
        ArrayList list1 = new ArrayList();
        list1.add("Ankara");
        list1.add("İstanbul");
        list1.add("İzmir");
        list1.add(1);
        list1.add(1.5);
        list1.add('A');

        ///  Bunun önüne geçmek için Array Listleri belirli bir tipe bağlıyorduk
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ankara");
        //list2.add(1); integer değer hata verecektir
        list2.add("Mahmuet");
        */
        /// Generic type bir liste oluşturalım
        MyList<Customer> sehirler = new MyList<Customer>();
        sehirler.add(new Customer());
        //sehirler.add(1); tipini string tanımladığımız için sadece String ifadeler yazılabilir.
    }
}