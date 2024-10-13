<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Korunan Ozellikler!</h1>
    <%
        out.println("<br>---------Korunan Parametreler JSP----------");
        out.println("<br> Page Context : " + pageContext.getAttribute("bilgi"));
        out.println("<br> Request Context : " + request.getAttribute("bilgi"));
        out.println("<br> Session Context : " + session.getAttribute("bilgi"));
        out.println("<br> Application Context : " + application.getAttribute("bilgi"));
        out.println("<br>----------------------------------------------");
        //Ekran ç?kt?s?
        /*---------Korunan Parametreler JSP----------
        Page Context : null
        Request Context : null
        Session Context : Bilgi verilir.
        Application Context : Bilgi verilir.
        ----------------------------------------------*/
        //Buradan anla??laca?? üzere Session ve application context koruma alt?nda yani ba?ka sayfalara geçersen de?erini kaybetmiyor
        //Page context ve request context sayfaya özgü de?erlerdir bu sebeple sayfalar aras? gezintide kaybolur
    %>    
</body>
</html>
