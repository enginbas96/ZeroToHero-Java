package pkg037.loopsfor;

public class LoopsFor 
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 10; i++) // i değişkeni 
        {
            System.out.println(i);
        }
        
        System.out.println("---------------------------------------");
        
        for(int a = 1, b = 4; a <= b; a++)
        {
            System.out.println(a);
        }
        
        System.out.println("---------------------------------------");
        
        for(int i = 10; i >= 1; i-- )
        {
            System.out.println(i);
        }
        
        System.out.println("---------------------------------------");
        
         for(int i = 1; i > 1; i-- ) //Koşul sağlandığından döngüye girmedi
        {
            System.out.println(i);
        }
    }    
}
