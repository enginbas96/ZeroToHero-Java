<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>  
    <!-- Jsp -> java -> class -> servlet object ?eklinde d?n??t?r?lerek ger?ekle?tirilir-->
    <%-- Tire koyulmam?? hali ile java kaynak dolar?n?n yaz?laca?? aland?r <%Kodlar buraya gelir%> --%>
    <!-- HTML kodlar? bu ?ekilde yorum sat?r?na getirilir -->
    <%--    
            scriplet <% java kaynak kodlar? %>
            expression <%= durumlar %>
            declaration <%! de?i?ken veya metot tan?mlamalar? i?in kullan?l?r %>    
    --%>
    
    <h1 style = "color:red;">JAVA DERSLERI</h1>
    <%
        final float PI = 3.14159f;
        out.println("Math icindeki PI sayisi: " + Math.PI);    
        out.println("<br>"); //Buras? ?ok ?nemli
        out.println("Benim tanimladigim PI sayisi: " + PI);  
    %>
</body>
</html>
