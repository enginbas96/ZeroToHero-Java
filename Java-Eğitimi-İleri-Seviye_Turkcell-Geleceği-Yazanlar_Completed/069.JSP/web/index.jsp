<%@page import = "java.util.Date"  %>
<%@page import = "java.text.SimpleDateFormat"  %>
<%@page pageEncoding="UTF-8" contentType="text/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>    
    
    <%
        for(int i = 1; i<= 10; i++)        
        {
            if(i%2 == 1){out.println("<span style = 'color:red'>" + i + "</span>");}               
            else {out.println("<span style = 'color:blue'>" + i + "</span>");}     
            out.println("<br>");
        }        
    %>
    
    <-------------------------------------------------------------------------------------------->
    <br>
    
    <%
        Date bugunTarihi = new Date();
        SimpleDateFormat tarihFormati = new SimpleDateFormat("dd.MM.yyyy");
        out.println("Tarih: " + tarihFormati.format(bugunTarihi));
    %>    
</body>
</html>
