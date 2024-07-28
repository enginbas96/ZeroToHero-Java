package pkg018.relationaloperators;

public class RelationalOperators
{
    public static void main(String[] args) 
    {
        int x = 10;
        int y = 10;
        int z = 20;
        
        System.out.println(x>y);
        System.out.println(x>z);
        System.out.println(x>5);
        System.out.println(x>= y);
        System.out.println("-----------------------------------------");
        
        System.out.println(x<y);
        System.out.println(x<z);
        System.out.println(x<5);
        System.out.println(x<=10);
        System.out.println("-----------------------------------------");
        
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x != y);
        System.out.println(x != z);
        System.out.println("-----------------------------------------");
        
        boolean isTrueOrFalse;
        isTrueOrFalse = (x == 10);
        System.out.println(isTrueOrFalse);
        isTrueOrFalse = (x == 11);
        System.out.println(isTrueOrFalse);
        isTrueOrFalse = (x != 10);
        System.out.println(isTrueOrFalse);
        isTrueOrFalse = (x != 11);
        System.out.println(isTrueOrFalse);
    }    
}
