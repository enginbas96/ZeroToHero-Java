package pkg015.memorymanagement;

public class MemoryManagement 
{
    public static void main(String[] args) 
    {
        //Stack VS Heap
        
        //Stack -> static hafıza tahsisi  //Static atamalar için kullanılır
        //Heap -> dinamil hafıza tahsisi //Objelerin değerleri dinamik olarak değişebiliyor
        
        //Stack -> değişkenlere doğrudan erişilebilir bu sebeple hızlıdır
        //Heap -> değişkenlere dolaylı yoldan erişim sağlanıyor // i1.isim = "ASD" tarzında bir metot ile erişiliyor bu sebeple stackten yavaştır
        
        //Stack -> program compile-time esnasında bellek tahsisi yapar
        //Heap -> program runtime esnasında bellek tahsisi yapar        
    }    
}