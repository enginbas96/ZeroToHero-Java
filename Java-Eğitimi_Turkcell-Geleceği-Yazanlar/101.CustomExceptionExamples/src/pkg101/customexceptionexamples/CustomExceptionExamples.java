package pkg101.customexceptionexamples;

public class CustomExceptionExamples
{
    public static void main(String[] args) 
    {
        Isci i1 = new Isci();        
        try 
        {
            i1.setIsim("ASD");
            i1.setMaas(-66666);
        }
        catch (HataliDeger e) 
        {
            System.out.println(e.getMessage());
        }
        System.out.println(i1);
    }    
}
