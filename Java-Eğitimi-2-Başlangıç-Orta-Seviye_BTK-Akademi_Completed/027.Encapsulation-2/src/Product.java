public class Product
{

    //Bu şekilde tanımlanan tüm değişkenler public olarak tanımlanır
    //Başka sınıflardan da ulaşımı olacaktır.
    /*
    int id;
    String name;
    String description;
    int price;
    int stockAmount;
    String renk;
    */

    //Private olarak tanımlanan değişkenler tanımlandığı block içerisinde geçerlidir
    //Bu örnek için sınırı       public class Product{  Bu ikisi arasında geçerlidir  }
    private int id;
    private String name;
    private String description;
    private int price;
    private int stockAmount;
    private String renk;
    private String kod;


    //Getter ve Setter bir nesnenin içerisinde bulunan özellikleri çağırmak ve değiştirmek için kullanılır
    public int getId(){return id;}
    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getPrice() {return price;}
    public int getStockAmount() {return stockAmount;}
    public String getRenk() {return renk;}
    public String getKod() {return this.name.substring(0,3) + this.id;}
    //Substring bir stringin başlangıç değeri belirlendikten sonra kaç karakter alacağını belirler
    //substring(5,4) -> 5.indexteki harften başlar 4 tane alır
    //substring(0,1) -> 0.indexteki harften başlar 1 tane alır yani ilk harfi alır




    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setDescription(String description){this.description = description;}
    public void setPrice(int price){this.price = price;}    public void setStockAmount(int stockAmount){this.stockAmount = stockAmount;}
    public void setRenk(String renk){this.renk = renk;}
}
