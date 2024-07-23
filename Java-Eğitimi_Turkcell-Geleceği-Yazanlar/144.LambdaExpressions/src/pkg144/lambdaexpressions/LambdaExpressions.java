package pkg144.lambdaexpressions;

public class LambdaExpressions 
{
    public static void main(String[] args) 
    {
        //Alttaki yorum satırında anonymous bir class oluşturmuş olduk
        /* Lambda expressions sayesinde bu tür bir tanımlama yapmadan sayi olustur sınıfından olusturabiliyoruz
        SayiOlustur sayiOlustur = new SayiOlustur() 
        {
            @Override
            public double olustur() 
            {
                return 15;               
            }
        };
        */
        
        //Fonksiyonel arayüzü kullanmak için aşağıdaki kodu çalıştırmak yeterlidir
        SayiOlustur sayiOlustur = () -> 25; //Bu kod parçacığı yukarıdaki kod ile aynı işleve sahiptir
        System.out.println(sayiOlustur.olustur());        
    }    
}