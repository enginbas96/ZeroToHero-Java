package pkg100.customexceptions;

public class HataliYaricap extends RuntimeException
{
    private double yaricap;
    
    public HataliYaricap(double yaricap)
    {
        super("Yaricap : " + yaricap + " olamaz!" );
    }
}
