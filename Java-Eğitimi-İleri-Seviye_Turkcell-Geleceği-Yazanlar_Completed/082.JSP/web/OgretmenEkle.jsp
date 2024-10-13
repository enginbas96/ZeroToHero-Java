<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ogretmen Ekle</title>
    <style>
        .button
        {
            background-color: green;
            border: none;
            color: white;
            padding: 15px 30px;
            text-align: center;
            text-decoration: none;
            font-size: 16px;
            transition: background-color 1s ease;
        }
        .button:hover
        {
            background-color: grey;
            cursor:pointer;
        }
        .table
        {
            border-collapse:collapse;
            width: 100%;
        }
        .td,.th
        {
            border: 1px solid black;
            text-align: left;
            padding: 10px;
        }
    </style>
</head>
<body>   
    <form action="OgretmenEkle.jsp" method="POST">
        <table class = "table">            
            <tr class = "tr">
                <th class = "td">Numara</th>
                <th class = "td">Ad</th>
                <th class = "td">Soyad</th>
                <th class = "td">Brans</th>
            </tr>        
            <tr>
                <td class = "td"><input type = "text" name = "no" value = "1"></td>
                <td class = "td"><input type = "text" name = "ad" value = "Engin"></td>
                <td class = "td"><input type = "text" name = "soyad" value = "BAS"></td>
                <td class = "td"><input type = "text" name = "brans" value = "Bilgisayar"></td>
            </tr>
        </table>            
        <input type ="submit" class = "button" value="Ogretmen Ekle"> 
    </form>   
    
    <%--
    <jsp:useBean id="ogretmen" class = "bean.pojo.Ogretmen">
        <jsp:setProperty property="no" name="ogretmen" value='<%= request.getParameter("no") != "" ? Integer.parseInt(request.getParameter("no")) : 0 %>' />
        <jsp:setProperty property="ad" name="ogretmen" value='<%= request.getParameter("ad") != "" ? (request.getParameter("ad")) : "ADI_YOK" %>' />
        <jsp:setProperty property="soyad" name="ogretmen" value='<%= request.getParameter("soyad") != "" ? (request.getParameter("soyad")) : "SOYADI_YOK" %>' />
        <jsp:setProperty property="brans" name="ogretmen" value='<%= request.getParameter("brans") != "" ? (request.getParameter("brans")) : "BRANSI_YOK" %>' />
    </jsp:useBean>
    --%>
    
    <%--
    <jsp:useBean id="ogretmen" class = "bean.pojo.Ogretmen">
        <jsp:setProperty property="no" name="ogretmen" param="no"/>
        <jsp:setProperty property="ad" name="ogretmen" param="ad"/>
        <jsp:setProperty property="soyad" name="ogretmen" param="soyad"/>
    
        <jsp:setProperty property="brans" name="ogretmen" param="meslek"/>     
                <td class = "td"><input type = "text" name = "brans" value = "Bilgisayar"></td>
                <td class = "td"><input type = "text" name = "meslek" value = "Bilgisayar"></td>
        //Yukaridaki brans yerine meslek kullanilsaydi brans propertysine meslek parametresi aktar?lacakt?
        Böylece 
                <jsp:getProperty property="brans" name = "ogretmen" /> 
                get property yap?ld?g?nda brans propertysinde meslek degeri bulunacakt? ve veri dogru bir sekilde islenecekti
    </jsp:useBean>    
    --%>
    
    <%--Tüm property'ler ve inputlar?n isimleri birbirleri ile ayn? ise a?a??daki kodla tüm hepsini otomatik olarak doldurta biliyoruz kod fazlal?g?na gerek kalm?yor--%>
    <jsp:useBean id="ogretmen" class = "bean.pojo.Ogretmen">
        <jsp:setProperty property="*" name="ogretmen" />
    </jsp:useBean>
    
     <table class = "table">
        <tr class = "tr">
            <th class = "td">Numara</th>
            <th class = "td">Ad-Soyad</th>
            <th class = "td">Brans</th>
        </tr>
        <tr class = "tr">
            <td class = "td">
                <jsp:getProperty property="no" name = "ogretmen" />
            </td>
            <td class = "td">
                <jsp:getProperty property="ad" name = "ogretmen" />
                <jsp:getProperty property="soyad" name = "ogretmen" />
            </td>
            <td class = "td">
                <jsp:getProperty property="brans" name = "ogretmen" />
            </td>
        </tr>
    </table>
</body>
</html>
