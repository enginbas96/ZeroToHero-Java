<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    <% 
        String bilgi = "Bilgi verilir.";
        pageContext.setAttribute("bilgi",bilgi);
        request.setAttribute("bilgi",bilgi);
        session.setAttribute("bilgi",bilgi);
        application.setAttribute("bilgi",bilgi);
        
        out.println("<br>---------Hesap Makinesi JSP----------");
        out.println("<br> Page Context : " + pageContext.getAttribute("bilgi"));
        out.println("<br> Request Context : " + request.getAttribute("bilgi"));
        out.println("<br> Session Context : " + session.getAttribute("bilgi"));
        out.println("<br> Application Context : " + application.getAttribute("bilgi"));
        out.println("<br>----------------------------------------------");
           
    %>
</body>
</html>
