package pkg089.overloadingoverriding;

public class OverloadingOverriding 
{
    public static void main(String[] args)
    {
        Araba a1 = new Araba("A Marka", "X Model", 1996);
        //Normal şartlarda araba sınıfında toString metodu yoktur bu javanın bize sunduğu metotlardan birisidir
        //Fakat biz araba sınıfımıza toString metodunu tanımladığımızda araba nesneleri için toString metodu artık bizim tanımladığımız metot olacaktır
        //Ve araba nesneleri için kullanılan toString metodu javanın base sınıflarından olan String metodunun toString metodunu ezmiş(Overriding) olacaktır.
        System.out.println(a1.toString()); 
        a1.setMarka("B Marka");
        System.out.println(a1.toString());
    }    
}
