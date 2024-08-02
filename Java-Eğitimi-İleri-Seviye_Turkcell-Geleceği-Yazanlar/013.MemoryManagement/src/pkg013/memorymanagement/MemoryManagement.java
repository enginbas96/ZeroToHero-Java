package pkg013.memorymanagement;

import java.util.Stack;

//Stack - Yığıt //Son giren ilk çıkar //İlk tanımlanan veri en alta tanımlanır ve sonraki veriler üstüne birikir
//Geçici değişkenlerin depolandığı yerdir
//Thread için kullanılan hafıza bölümüdür
//Yığında depolanan değişkenler onları kullanan olduğu sürece var olur aksi halde kaldırılır
//Boyutları işletim sistemine göre değişir
//Kullanılan bölgeler iş bitince serbest bırakılıyor yani kaynak iade ediliyor
//Son eklenilen değer silinebilir

//Stack metotlari
//push ve add metodu eleman ekleme metodudur
//pop metodu stack'e son giren/eklenen elemanın kaldırılmasını sağlar
//top ve peek en üstteki elemanı döndürür
//isEmpty boş olup olmadığının bool edeğerini döndürür
public class MemoryManagement
{
    public static void main(String[] args) 
    {
       //Bu değişkenler main metodu çalıştığı sürece hafızada tutulur, program sonlandıgında veya onlara ait scope sonlandıgında 
        //kaynakar iade edilir
        int sayi = 5;
        float sayi2 = 5.6f;
        
        Stack<Integer> yigin = new Stack<>();
        yigin.add(10); //add ile eleman eklenebilir
        yigin.push(20); //push ile eleman eklenebilir
        yigin.add(30);
        
        System.out.println(yigin.peek()); //Peek metodu yiğinin en üstündeki değeri bize gönderir en son eklenen değer 30 oldugundan 30 döndürür
        yigin.pop(); //En üstteki elemanı yığından serbest bırakır.
        System.out.println(yigin.peek()); //30 değeri kaldırıldıgında en yukarıda 20 kalır 
        yigin.pop();
        System.out.println(yigin.peek());
        yigin.pop(); // Son kalan değeride kaldırıyoruz 
        System.out.println(yigin.peek());//Artık değer kalmadığı için bu satırda bir hata ile karşılaşacağız EmptyStackException hatası fırlatır
        
    }    
}