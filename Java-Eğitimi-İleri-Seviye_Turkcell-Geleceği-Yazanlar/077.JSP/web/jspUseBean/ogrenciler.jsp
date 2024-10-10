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
    <%=
            "Okul No : " + o.getNo() + "<br>"
    %>
    <%=
            "Adi Soyadi : " + o.getAd() + " " + o.getSoyad() + "<br>"    
    %>
    <%=
            "Sinif/Sube : " + o.getSinif() + " " + o.getSube() + "<br>"   
    %>    
</body>
</html>
