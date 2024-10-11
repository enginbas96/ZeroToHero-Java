<%@page import="bean.pojo.Ogrenci" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ogrenciler</title>
</head>
<body>
    Su anda ogrenciler sayfasindayiz.
    <br>    
    <%
            Ogrenci o = (Ogrenci)request.getAttribute("ogrenciATTR");
    %>
    <% //=
            //"Okul No : " + o.getNo() + "<br>"
            //"Adi Soyadi : " + o.getAd() + " " + o.getSoyad() + "<br>"  
            //"Sinif/Sube : " + o.getSinif() + " " + o.getSube() + "<br>"  
    %>
  
    <h2>Ogrenci1 Bilgileri</h2> 
    <jsp:useBean id="ogrenci" class="bean.pojo.Ogrenci" scope="request">
        <!-- E?er ogrenci bilgileri olmasayd? a?a??daki veriler kullan?lacakt?, usebean bu i?e yar?yor -->
        <jsp:setProperty property="no" name="ogrenci" value="1555111"></jsp:setProperty>
        <jsp:setProperty property="ad" name="ogrenci" value="Ahmet"></jsp:setProperty>
        <jsp:setProperty property="soyad" name="ogrenci" value="SANLI"></jsp:setProperty>
        <jsp:setProperty property="sinif" name="ogrenci" value="11"></jsp:setProperty>
        <jsp:setProperty property="sube" name="ogrenci" value="C"></jsp:setProperty>     
    </jsp:useBean>    
    <jsp:getProperty property="no" name="ogrenci"></jsp:getProperty>
    <jsp:getProperty property="ad" name="ogrenci"></jsp:getProperty>
    <jsp:getProperty property="soyad" name="ogrenci"></jsp:getProperty>
    <jsp:getProperty property="sinif" name="ogrenci"></jsp:getProperty>
    <jsp:getProperty property="sube" name="ogrenci"></jsp:getProperty>
    
    <br>
    -----------------------------------------
    <br>
    
    <h2>Degismis Ogrenci1 Bilgileri</h2> 
    <jsp:setProperty property="no" name="ogrenci" value="1234"></jsp:setProperty> <!-- setProperty ile degerlerde degisiklik yapabiliyoruz -->
    <jsp:getProperty property="no" name="ogrenci"></jsp:getProperty>
    
    <jsp:setProperty property="ad" name="ogrenci" value="Engin"></jsp:setProperty>
    <jsp:getProperty property="ad" name="ogrenci"></jsp:getProperty>
    
    <jsp:getProperty property="soyad" name="ogrenci"></jsp:getProperty>
    <jsp:getProperty property="sinif" name="ogrenci"></jsp:getProperty>
    <jsp:getProperty property="sube" name="ogrenci"></jsp:getProperty>
    
    <br>
    -----------------------------------------
    <br>
    
    <jsp:useBean id="ogrenci2" class="bean.pojo.Ogrenci" scope="request"></jsp:useBean> <!-- Burada ogrenci2 olusturuldu -->
    @Eger olmayan bir verinin degerlerini yazdirmak istersen ne olur onu gozlemleyelim
    <h2>Ogrenci2 Bilgileri</h2>  
    <jsp:getProperty property="no" name="ogrenci2"></jsp:getProperty>
    <jsp:getProperty property="ad" name="ogrenci2"></jsp:getProperty>
    <jsp:getProperty property="soyad" name="ogrenci2"></jsp:getProperty>
    <jsp:getProperty property="sinif" name="ogrenci2"></jsp:getProperty>
    <jsp:getProperty property="sube" name="ogrenci2"></jsp:getProperty>
    
    <br>
    -----------------------------------------
    <br>
    
    <h2>Ogrenci3'e default degerler atama</h2>   
    <jsp:useBean id="ogrenci3" class="bean.pojo.Ogrenci" scope="request">
        <jsp:setProperty property="no" name="ogrenci3" value="No_Yok"></jsp:setProperty>
        <jsp:setProperty property="ad" name="ogrenci3" value="Ad_Yok"></jsp:setProperty>
        <jsp:setProperty property="soyad" name="ogrenci3" value="Soyad_Yok"></jsp:setProperty>
        <jsp:setProperty property="sinif" name="ogrenci3" value="00"></jsp:setProperty>
        <jsp:setProperty property="sube" name="ogrenci3" value="X"></jsp:setProperty>     
    </jsp:useBean>    
    
    <jsp:getProperty property="no" name="ogrenci3"></jsp:getProperty>
    <jsp:getProperty property="ad" name="ogrenci3"></jsp:getProperty>
    <jsp:getProperty property="soyad" name="ogrenci3"></jsp:getProperty>
    <jsp:getProperty property="sinif" name="ogrenci3"></jsp:getProperty>
    <jsp:getProperty property="sube" name="ogrenci3"></jsp:getProperty>
</body>
</html>
