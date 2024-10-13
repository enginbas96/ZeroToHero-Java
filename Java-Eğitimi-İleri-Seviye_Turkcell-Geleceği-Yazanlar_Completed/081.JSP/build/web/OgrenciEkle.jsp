<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ogrenci Ekle</title>
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
    <form action="ogrenciEkle" method="POST">
        <table class = "table">            
            <tr class = "tr">
                <th class = "td">Numara</th>
                <th class = "td">Ad</th>
                <th class = "td">Soyad</th>
                <th class = "td">Sinif</th>
                <th class = "td">Sube</th>
            </tr>            
            <td class = "td"><input type = "text" name = "no"></td>
            <td class = "td"><input type = "text" name = "ad"></td>
            <td class = "td"><input type = "text" name = "soyad"></td>
            <td class = "td"><input type = "text" name = "sinif"></td>
            <td class = "td"><input type = "text" name = "sube"></td>               
        </table>        
        <input type ="submit" class = "button" value="Ogrenci ekle"> 
    </form>       
    
    
    <jsp:useBean id = "eklenenOgrenci" type = "bean.pojo.Ogrenci"  class = "bean.pojo.Ogrenci" scope = "request">
        <jsp:setProperty property="no" name = "eklenenOgrenci" value="NO_YOK"/>
        <jsp:setProperty property="ad" name = "eklenenOgrenci" value="AD_YOK"/>
        <jsp:setProperty property="soyad" name = "eklenenOgrenci" value="SOYAD_YOK"/>
        <jsp:setProperty property="sinif" name = "eklenenOgrenci" value="0"/>
        <jsp:setProperty property="sube" name = "eklenenOgrenci" value="X"/>
    </jsp:useBean> 
    
    <table class = "table">
        <tr class = "tr">
            <th class = "td">Numara</th>
            <th class = "td">Ad-Soyad</th>
            <th class = "td">Sinif-Sube</th>
        </tr>
        <tr class = "tr">
            <td class = "td">
                <jsp:getProperty property="no" name = "eklenenOgrenci" />
            </td>
            <td class = "td">
                <jsp:getProperty property="ad" name = "eklenenOgrenci" />
                <jsp:getProperty property="soyad" name = "eklenenOgrenci" />
            </td>
            <td class = "td">
                <jsp:getProperty property="sinif" name = "eklenenOgrenci" />
                <jsp:getProperty property="sube" name = "eklenenOgrenci" />
            </td>
        </tr>
    </table>
</body>
</html>
