package pkg079.finalsuperthiskeys;

public class UniOgrenci extends Ogrenci
{
    public UniOgrenci(int no){super(no);}  
    
    //Alttaki yazdir metodu ögrenci metodunun içindeki yazdir metodunu ezmek istiyor
    //Fakat ogrenci.yazdir() final anahtar kelimesi ile tanımlandığından buna izin verilmemekte
    //public void yazdir(){System.out.println("Universite Ogrencisi = " + getNum());}
    public void yazdir2(){System.out.println("Universite Ogrencisi = " + getNum());}
    
}
