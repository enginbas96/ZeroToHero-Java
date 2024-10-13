<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    <% 
            ServletConfig sC = getServletConfig();
            String bilgi = sC.getInitParameter("bilgi");
            int sayi1 = Integer.parseInt(sC.getInitParameter("sayi1"));
            int sayi2 = Integer.parseInt(sC.getInitParameter("sayi2")); 
    %>
    <p>Init  Parametreleri</p>
    <p> Sayi1: <%= sayi1 %> </p>
    <p> Sayi2: <%= sayi2 %> </p>
    
   <%     
       int sayi3 = 0;
       int sayi4 = 0;
               
       try{sayi3 = Integer.parseInt(request.getParameter("sayi1"));}
       catch(Exception e){sayi3 = 10;}
        
       try{sayi4 = Integer.parseInt(request.getParameter("sayi2"));}
       catch(Exception e){sayi4 = 30;}
        //http://localhost:8080/071.JSP/hesapMakinesi?sayi1=10&sayi2=20
    %>
    <p>Request Parametreleri</p>
    <p> Sayi1: <%= sayi3 %> </p>
    <p> Sayi2: <%= sayi4 %> </p>
       
    
</body>
</html>
