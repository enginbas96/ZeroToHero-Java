package pkg099.throwandthrows;

public class ThrowAndThrows
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 0;
        try 
        {
            System.out.println(a/b);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e.getMessage());
            throw e; //Main metoduna tekrardan fırlatılacak hatadır ve uygulama crash olacaktır.
        }
        finally
        {
            System.out.println("Finally her zaman calisir");
        }
        System.out.println("Program bu satira ulasamadi");
    }    
}
