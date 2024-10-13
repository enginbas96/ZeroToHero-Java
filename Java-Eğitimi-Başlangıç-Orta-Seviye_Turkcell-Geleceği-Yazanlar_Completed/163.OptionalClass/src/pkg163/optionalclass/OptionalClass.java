package pkg163.optionalclass;

import java.util.Optional;

public class OptionalClass 
{    
    public static void main(String[] args)
    {
        Optional<String> bosNesne = Optional.empty(); //Boş bir nesne oluşturmaya yarayan metot
        System.out.println(bosNesne);
        System.out.println(bosNesne.isEmpty()); //Boş olup olmadığını döndürür
        System.out.println(bosNesne.isPresent()); //İçinde bir şey olup olmadığını bize bildirir
        
        System.out.println("-----------------------------------------");
        
        Optional<String> doluNesne = Optional.of("5Ahmet/-"); //.of metodu ile içine değer yerleştirilir
        System.out.println(doluNesne);
        System.out.println(doluNesne.isEmpty()); //İçinin boş olup olmadığını döndürür
        System.out.println(doluNesne.isPresent()); //İçinde bir şey olup olmadığını döndürür
        
        System.out.println("-----------------------------------------");
        
        String deger =  "Merhaba";
        Optional<String> optional = Optional.of(deger);
        System.out.println(optional.isPresent());
        
        System.out.println("-----------------------------------------");
        
        //Optional bir nesneye null değeri atma yolu ile verilemez kendi içerisinde mevcut olan bir metot sayesinde gerçekleştirilir
        String s = null;
        //Optional<String> optional2 = Optional.of(s); //null değer atanamaz
        Optional<String> optional2 = Optional.ofNullable(s);
        System.out.println(optional2.isPresent());
        System.out.println(optional2.isEmpty());
        
        System.out.println("-----------------------------------------");
        
        //Eskiden null kontrolü if metodu içerisinde aşağıdaki gibi gerçekleştirilirdi
        String s2 = "Selam";
        if(s2 != null){System.out.println(s2.length());} //Eski yöntem
        
        Optional<String> optional3 = Optional.ofNullable(s2);
        optional3.ifPresent((x) -> System.out.println(x.length())); //Yeni yöntem
        
        System.out.println("-----------------------------------------");
        
        String bosIsim = null;
        String isim = Optional.ofNullable(bosIsim).orElse("Ali");
        //Null kontrolü yaptırdık ve orElse metodu ile null olduğunda içini def bir değer ile doldurma talimatı verdik
        //Eğer değerin içi dolu olsaydı orElse metoduna geçmeyecekti
        System.out.println(isim);
        
        String doluIsim = "Veli";
        String isim2 = Optional.ofNullable(doluIsim).orElse("Ali");
        System.out.println(isim2);
        
        System.out.println("-----------------------------------------");
        
        String sehir = null;
        String sehir2 = Optional.ofNullable(sehir).orElseGet(() -> "Istanbul");
        System.out.println(sehir2);
        
        String sehir3 = "Ankara";
        String sehir4 = Optional.ofNullable(sehir3).orElseGet(() -> "Istanbul");
        System.out.println(sehir4);
        
        System.out.println("-----------------------------------------");
        
        //orElse ve orElseGet farkı nedir
        String bos = "a";
        String string = Optional.ofNullable(bos).orElse(test()); //orElse metodu null olsada olmasada test metodunu çalıştıracaktır
        String string2 = Optional.ofNullable(bos).orElseGet(() -> test()); //orElseGet metodu gerçekten null ise test metodunu çalıştıracaktır
        System.out.println(string);
        System.out.println(string2);     
    }    
    
    public static String test(){System.out.println("Test calisti.");    return "test";}
}