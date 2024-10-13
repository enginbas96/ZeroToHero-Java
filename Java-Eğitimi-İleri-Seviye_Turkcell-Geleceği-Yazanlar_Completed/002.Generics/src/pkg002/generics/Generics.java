package pkg002.generics;

class JenerikSinif
{
    private Object x;
    
    public void setX(Object x){ this.x = x;}
    public Object getX(){return x;}
        
    public void sinifiniSoyle()
    {
        System.out.println(this.getX());
        System.out.println(this.getX().getClass().getName());
    }
    
    @Override
    public String toString()
    {
        return "Bu jenerik sinif objesidir";
    }    
}

public class Generics 
{
    public static void main(String[] args) 
    {
        JenerikSinif g1 = new JenerikSinif();
        System.out.println(g1.toString());
        
        System.out.println("-------------------------------");
        
        JenerikSinif g2 = new JenerikSinif();
        JenerikSinif g3 = new JenerikSinif();
        JenerikSinif g4 = new JenerikSinif();
        JenerikSinif g5 = new JenerikSinif();
        
        g2.setX(150);
        g2.sinifiniSoyle();
        
        g3.setX(150.55);
        g3.sinifiniSoyle();
        
        g4.setX(150.55f);
        g4.sinifiniSoyle();
        
        g5.setX("Abc");
        g5.sinifiniSoyle();
    }    
}
