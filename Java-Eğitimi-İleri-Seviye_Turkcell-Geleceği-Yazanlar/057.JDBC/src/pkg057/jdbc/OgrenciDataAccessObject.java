package pkg057.jdbc;

import java.sql.*;

public class OgrenciDataAccessObject 
{
    private Connection conn = null;
    
    public OgrenciDataAccessObject()
    {
        veriTabaninaBaglan();
    }

    @Override
    protected void finalize() throws Throwable 
    {
        System.out.println("Veritabani baglantisi kapatildi.");
        veriTabaniBaglantisiniBitir();
    } 
    
    private void veriTabaninaBaglan()
    {
        String url = "jdbc:mysql://localhost:3306/okul";
        String username = "root";
        String password = "";
        try
        {
            conn = DriverManager.getConnection(url, username, password);
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    private void veriTabaniBaglantisiniBitir()
    {
        try
        {
            conn.close();
        }
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }        
    }
    
    public Ogrenci getOgrenci(String ogrenciNo) throws SQLException
    {
        //veriTabaninaBaglan(); Obje olusturuldugunda otomatik olarak baglanmasını saglayan yapıcı metot tanımlandı
        
        Ogrenci o = new Ogrenci();
        o.setNo(ogrenciNo);
        
        String sorgu = "select * from ogrenciler where ogrenciNo=" + ogrenciNo;
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sorgu);
        
        if(rs.next())
        {
            o.setID(rs.getInt("ID"));
            o.setkAdi(rs.getString("username"));
            o.setAd(rs.getString("ad"));
            o.setSoyad(rs.getString("soyad"));            
        }      
        else
        {
            o = null;
        }        
        return o;
    }
    
    public void ogrenciEkle(Ogrenci o) throws SQLException
    {
        //veriTabaninaBaglan(); Obje olusturuldugunda otomatik olarak baglanmasını saglayan yapıcı metot tanımlandı
        
        String sorgu = "INSERT INTO ogrenciler (ogrenciNo, username, ad, soyad) VALUES (?, ?, ?, ?)";      
        PreparedStatement pst = conn.prepareStatement(sorgu);
        
        pst.setString(1, o.getNo());
        pst.setString(2, o.getkAdi());
        pst.setString(3, o.getAd());
        pst.setString(4, o.getSoyad());
        
        pst.executeUpdate();
        
        System.out.println("Ogrenci basariyla eklendi.");
    }
    
    public void ogrenciSil(String ogrenciNo) throws SQLException
    {
        //veriTabaninaBaglan(); Obje olusturuldugunda otomatik olarak baglanmasını saglayan yapıcı metot tanımlandı
        
        String sorgu = "delete from ogrenciler where ogrenciNo="+ogrenciNo;
        Statement st = conn.createStatement();
        int count = st.executeUpdate(sorgu);
        if(count == 1)System.out.println("Ogrenci basariyla silindi!");
        else System.out.println("Ogrenci mevcut degil!");
    }
    
    public void ogrenciGuncelle(Ogrenci o, String ogrenciNo) throws SQLException
    {
        //veriTabaninaBaglan(); Obje olusturuldugunda otomatik olarak baglanmasını saglayan yapıcı metot tanımlandı
        
        String sorgu = "UPDATE ogrenciler SET ogrenciNo = ?, username = ?, ad = ?, soyad = ? WHERE ogrenciNo = ?";
        PreparedStatement pstmt = conn.prepareStatement(sorgu);
        pstmt.setString(1, o.getNo());
        pstmt.setString(2, o.getkAdi());
        pstmt.setString(3, o.getAd());
        pstmt.setString(4, o.getSoyad());
        pstmt.setString(5, ogrenciNo);

        int count = pstmt.executeUpdate();
        if(count == 1)System.out.println("Ogrenci basariyla guncellendi!");
        else System.out.println("Ogrenci mevcut degil!");        
    }
}