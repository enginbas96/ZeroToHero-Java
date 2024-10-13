package pkg080.finalsuperthiskeys;

public class Ogrenci extends Kisi
{
    private int numara;
        public Ogrenci(String i, int num)
    {
        super(i); //ilk önce kişi sınıfının yapıcı metodu tam anlamıyla çalışmalı, super key ile yapıcı metodun istediği değeri atıyoruz
        numara = num;
    }
    public int getNum(){return numara;}
    public void setNum(int no){numara = no;}    
    public void ozet()
    {
        super.bilgileriYazdir(); //Super key üst sınıftaki metotlara erişmek için de kullanılabilir
        System.out.println("Numara  : " + numara);
    }
}
