package pkg049.methodsexamples;

public class MethodsExamples 
{
    private static int x = 20;
    public static void main(String[] args)
    {
        MethodsExamples mthd = new MethodsExamples();
        mthd.normalMethod();
        
        staticMethod();
        MethodsExamples.staticMethod();
        
        int intMax = maxValue(3, 5, 4);
        System.out.println(intMax);
        
        double doubleMax = maxValue(3.6, 4, 3.5);
        System.out.println(doubleMax);
    }  
    public void normalMethod()
    {
        System.out.println(x);
    }
    
    public static void staticMethod()
    {
        // static olmayan bir değişkene erişmek hatalarla sonuçlanır
        System.out.println(x);
    }
    
    public static int maxValue(int x, int y, int z)
    {
        if(x>y && x>z){return x;}
        if(y>x && y>z){return y;}
        else {return z;}   
    }
    
    public static double maxValue(double x, double y, double z)
    {
        if(x>y && x>z){return x;}
        if(y>x && y>z){return y;}
        else {return z;}   
    }
    
}
