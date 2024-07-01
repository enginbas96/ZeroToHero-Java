package pkg011.arraysexamples;

import java.util.Arrays;

public class ArraysExamples 
{
    public static void main(String[] args) 
    {
        int[] numbers = {20,32,12,46,4};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, -5));
        System.out.println(Arrays.binarySearch(numbers, 12)); // Dizi sıralaması yapılmadıgı için saçma sonuçlar verebiliyor
        
        int[] copy1 = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(copy1));
        
        //Eğer yeni dizi kopyalanan diziyi aşıyor ise geri kalan değerlerini 0 ile doldurur
        int[] copy2 = Arrays.copyOf(numbers, 10);
        System.out.println(Arrays.toString(copy2));
        
        //Belirli bir aralıktaki indexleri kopyalar, 2,4 verildiğinde 2 yi dahil eder 4 ü etmez yani indexi 2 olan ve 3 olan değerleri alır
        int[] copy3 = Arrays.copyOfRange(numbers, 2, 4);
        System.out.println(Arrays.toString(copy3));
        
        //Arrays.sort dizi içindeki elemanları sıralamak için kullanılır.
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));    
        
        // Arrays.fill dizinin içindeki elemanları yazılan değişken ile doldurmak için kullanılır
        Arrays.fill(numbers, 44);
        System.out.println(Arrays.toString(numbers));
        
         
    }
}
