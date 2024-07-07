package pkg063.accessexample;

public class Main {
    public static void main(String[] args) 
    {
        //Aynı paket içerisinde oldugundan default tanımlamalara farklı sınıflardan bile olsa erişilebilir.
        Araba araba1 = new Araba();
        araba1.defaultMarka = "Honda";
        araba1.publicMarka = "Tofaş";
        System.out.println(araba1.defaultMarka);
    }
}
