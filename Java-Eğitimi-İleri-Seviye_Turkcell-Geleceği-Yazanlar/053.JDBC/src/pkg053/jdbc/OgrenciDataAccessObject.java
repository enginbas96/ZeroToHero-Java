package pkg053.jdbc;

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
}
