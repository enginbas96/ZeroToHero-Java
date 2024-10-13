package pkg079.finalsuperthiskeys;

public /*final*/ class Ogrenci //Sınıf final tanımlanırsa hiçbir sınıf bu sınıftan miras alamayacaktır. 
{
    //Final değişkenleri ilk ataması yapılmaması halinde yapıcı metot ile ilk atama gerçekleştirilebilir ve ardından değiştirilemez olarak saklanır
    private final int numara;
    public Ogrenci(int num){numara = num;}    
    public int getNum(){return numara;}
    // public void setNum(int num){numara = num;}// Burada hata verecektir çünkü numara final olarak tanımlanmıştır.
    public final void yazdir(){System.out.println("No : " + numara);}    
    }
