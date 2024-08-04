package pkg017.regularexpression;

public class RegularExpression 
{
    public static void main(String[] args) 
    {
        //String bir ifade içersinde belirli özelliklere göre arama ve doğrulama yapılmasını sağlayan ifadelerdir
        //Kısaltması regex'tir
        // ^  -> bir şeyle başlayan manasına gelir 
        // ^[a-zA-Z0-9_-] köşeli parantezin içindeki karakterlerle başlayan ifadeleri arar
        // ^[a-zA-Z0-9_-]{3,12} süslü parantez içerisinde 3 karakter ile 12 karakter arası kelimelerde arama yapacak
        //^[a-zA-Z0-9_-]{3,12}$ dolar işareti de string ifadenin sonunun bu şekilde bitmesini kontrol eder        
        //"Benim ismim" şeklinde bir ifade var ^Benim yazdığınızda Benim kelimesi ile başlıyor mu şeklinde bir soru yöneltmiş oluyoruz
        //a-z    a ve z harfleri arasında sorgu '-'(tire) işareti arasında anlamına geliyor
        //0-9    0 ve 9 arasında rakam sorgusu
        //_ ve - tire ve alt çizgi sorgusu
        //{3,5} uzunluk belirtme "el" kelimesi mevcut fakat uzunluk 3 ile 5 arasında denildiğinde bizim isterlerimizi karşılamadığı için geri döndürmeyecektir
        //$ satırın sonu anlamına gelir
        // ^ Bazı durumlarda dışında anlamında da kullanılabiliyor
        // . ifadesi \\. şeklinde kullanılırsa karakter olarak gösterilir . kendi başına regex ifadesidir
        // [a-e[p-t]] şeklinde tanımlamalarda union yani birleşme vardır a'dan e'ye ve p'den t'ye kadar olan ifadeleri içerir
        // && intersection yani kesişim anlamına gelmektedir, sorguda kesişim noktalarındaki ifadeleri kullanır
        // ^a-p  a ve p arasındaki harflerin dışında yer alan ifadeleri kullanır, eğer ^[a-p] olsaydı tam tersi olacaktı. ^a-p sorgusuna giden z ifadesini kabul eder
        // .'nın kullanımı herhangi bir harf gelebilir anlamına geliyor "Ahmet" kelimesine "..me." şeklinde bir sorgu gönderirsek bunu karşılayacaktır
        
        //[abc] a yada b yada c harflerinden biri mi sorgulamasını yapar
        //[^abc] a yada b yada c harfleri dışında mı sorgulaması yapar
        //[a-zA-Z] a ve z yada A ve Z arasında
        //[a-e[p-t]] a ve e yada p ve t arasında
        //[a-f && [b-t]] a harfi araması yapar -> a'dan f ye kadar olan harfler ve b'den t'ye kadar olan harfler'in kesişimi içerisinde arar b,c,d,e,f
        //[a-z && [^bc]] a ve z arasında olsun ama b ve c olmasın -> a harfi veya d ve z arasında
        //[a-z && [^c-g]] c ve g ve arasındaki harfler dışındaki harfleri temsil eder        
    }    
}