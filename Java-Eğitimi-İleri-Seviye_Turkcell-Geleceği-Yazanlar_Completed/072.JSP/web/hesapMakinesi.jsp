<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    <% 
            int s1=30, s2=50;
            String bilgi = "s1 ile s2 toplami: " + (s1+s2);
            Double kilo = 81.95;
            int boy = 175;
            
            pageContext.setAttribute("sayi1", s1); //sayi1 ad?nda bir özellik olu?turduk ve bunun içindeki özellikleri s1 de?i?keninden ald?k
            pageContext.setAttribute("sayi2", s2); //sayi2 ad?nda bir özellik olu?turduk ve bunun içindeki özellikleri s2 de?i?keninden ald?k
            pageContext.setAttribute("bilgi", bilgi);
            
            
            out.println("Sayi1:");
            out.println(pageContext.getAttribute("sayi1")); //sayi1 özelliklerini getirerek ekrana bast?rd?k
            
            out.println("<br>");
            
            out.println("Sayi2:");
            out.println(pageContext.getAttribute("sayi2")); //sayi2 özelliklerini getirerek ekrana bast?rd?k
            
            out.println("<br>");
            
            out.println("Bilgi : ");
             out.println(pageContext.getAttribute("bilgi"));            
%>
</body>
</html>
