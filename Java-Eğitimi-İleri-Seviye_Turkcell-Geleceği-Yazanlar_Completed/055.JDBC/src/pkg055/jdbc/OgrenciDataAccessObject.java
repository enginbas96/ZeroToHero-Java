package pkg055.jdbc;

import java.sql.*;

public class OgrenciDataAccessObject 
{
    private Connection conn = null;
    
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
    
    public Ogrenci getOgrenci(String ogrenciNo) throws SQLException
    {
        veriTabaninaBaglan();
        
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
        veriTabaninaBaglan();
        
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
        veriTabaninaBaglan();
        
        String sorgu = "delete from ogrenciler where ogrenciNo="+ogrenciNo;
        Statement st = conn.createStatement();
        int count = st.executeUpdate(sorgu);
        if(count == 1)System.out.println("Ogrenci basariyla silindi!");
        else System.out.println("Ogrenci mevcut degil!");
    }
}
