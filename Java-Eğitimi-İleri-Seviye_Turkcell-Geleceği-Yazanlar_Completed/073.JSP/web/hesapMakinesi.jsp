<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    <% 
        int s1 = 880, s2 = 4510;
        String bilgi = "Toplamin sonucu: " + (s1 + s2) + " olarak bulunmustur. ";
        Double kilo = 81.95;
        
        pageContext.setAttribute("bilgi", bilgi); //Bir de?i?keni farkl? attribute farkli scoplarda tan?mlayabiliriz
        pageContext.setAttribute("kilo", kilo); //Bir de?i?keni farkl? attribute farkli scoplarda tan?mlayabiliriz
        
        pageContext.setAttribute("bilgiAttr", bilgi, pageContext.SESSION_SCOPE);
        pageContext.setAttribute("kiloAttr", kilo, pageContext.APPLICATION_SCOPE);
        pageContext.setAttribute("boyAttr", boy); // Scope belirtmedi?imiz zaman default olarak PAGE_SCOPE kullan?l?r
        // SCOPE'lar 4 tanedir: APPLICATION_SCOPE, PAGE_SCOPE, REQUEST_SCOPE, SESSION_SCOPE

        bilgi += " VIA SESSION OBJECT";

        session.setAttribute("sessionBilgiAttr", bilgi);
        application.setAttribute("appKiloAttr", kilo);

        out.println("<br> PageContext bilgi: " + pageContext.getAttribute("bilgi"));      
        
        out.println("<br> Session_Scope bilgi: " + session.getAttribute("bilgiAttr"));      
        out.println("<br> Session_Scope bilgi: " + session.getAttribute("sessionBilgiAttr"));
        
        out.println("<br> Page_Context kilo " + pageContext.getAttribute("kilo"));     
        out.println("<br> Application_Scope kilo " + application.getAttribute("kiloAttr"));     
        out.println("<br> Application_Scope kilo " + application.getAttribute("appKiloAttr"));     
    %>
</body>
</html>
