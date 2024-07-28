package pkg145.lambdaexpressions;

public class LambdaExpressions
{
    public static void main(String[] args) 
    {
        Merhaba m1 = () -> "Merhaba";
        System.out.println(m1.selam());
        
        Merhaba2 m2 =  (s) -> "Merhaba " + s;
        System.out.println(m2.selam("Ali"));
        
        //Topla interfacesinde 2 değişken istediği için bizde lambda işlemimizde 2 değişken kullanıyoruz
        Topla topla = (a,b) -> a+b;
        System.out.println(topla.topla(5, 3));        
    }    
}