<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>  
    <h1 style = "color:red;">JAVA DERSLERI</h1>
    
    <%
        int sayi1 = 20;
        int sayi2 = 30;
        int sonuc = sayi1 + sayi2;
        out.println("Toplama = " + sonuc + "<br>");
        out.println("C?karma = " + (sayi1 - sayi2) + "<br>");
        out.println("Carpma = " + (sayi1 * sayi2) + "<br>");
        out.println("Bolme = " + ((float)sayi1 / sayi2) + "<br>");
    %>
    
</body>
</html>
