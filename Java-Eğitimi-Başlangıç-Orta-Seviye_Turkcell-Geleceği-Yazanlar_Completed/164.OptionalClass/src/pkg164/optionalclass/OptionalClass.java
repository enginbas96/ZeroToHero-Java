package pkg164.optionalclass;

import java.util.Optional;

public class OptionalClass 
{    
    public static void main(String[] args) 
    {
        Motor m1 =  null;
        Motor m2 =  new Motor(1900);
        Araba araba = new Araba("X Marka", "Y Model", Optional.ofNullable(m2)); 
        //Motorun null olma durumunda hiç bir araç motoru olmadan çalışamaz bu sebeple kontrol edilmesi gerekiliyor
        System.out.println(araba);
    }    
}