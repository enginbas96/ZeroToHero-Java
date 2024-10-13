package pkg147.functionalınterfaces;


@FunctionalInterface //Bu tanımlama ile birlikte fonksiyonel arayüzlere birden fazla metot tanımlanırsa hata dönderecektir
public interface Matematik 
{
    void islem(double a, double b);
    // void topla(double a, double b); // İki veya üstü metot tanımlamaları functional arayüz tanımlamasını bozduğundan hata verecektir
}
