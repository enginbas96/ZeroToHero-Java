package pkg141.autoboxing;

public class Autoboxing 
{
    public static int passInteger(Integer x)
    {
        return x.intValue();
    }
    
    public static void main(String[] args) 
    {
        int i = 10;        
        //public static int passInteger(Integer x) metoduna giren ilkel int değeri önce Integer degerine dondurulur
        int passIngeter = passInteger(i); 
        
        //Boxing ve unboxing işlemlerine örnekler
        Double d = 10.0;
        double x = d;
        
        Integer integer = 10;
        int y = integer;
    }    
}
