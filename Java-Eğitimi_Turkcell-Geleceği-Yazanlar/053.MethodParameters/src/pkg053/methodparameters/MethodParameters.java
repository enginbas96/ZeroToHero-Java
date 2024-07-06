package pkg053.methodparameters;

public class MethodParameters 
{    
    public static void main(String[] args) 
    {
        MethodParameters mthd = new MethodParameters();
        
        mthd.test(5);
        mthd.varArgs(10, new int[] {5,8});
        // VarArgs yani 3 noktalı değerin sonda olmasının sebebi ilk parametrelerdeki değerlerin
        // gerekli parametrelere atılması sonrası kalan parametreleri dizi içine alır
         // Burada 5 metot parametrelerinden a değişkenine atılırken geri kalan parametreler dizi içine tanımlanır.
         // normal dizi şeklinde bir parametre istenmesi durumunda hata verecektir.
        mthd.varArgs(5, 1,2,3,4,5);
    }    
    
     public void test(int x)
     {
         x = 10;
         System.out.println(x);
     }
    
     public void varArgs(int a, int...numbers)  // 3 nokta işareti bunun bir dizi olduğu anlamına gelir. böyle bir kullanım olacaksa en son parametre olmalıdır.
     {
         int x = numbers[0];
         int y = numbers[1];
         System.out.println(x*a + y * a);
     }
    
}
