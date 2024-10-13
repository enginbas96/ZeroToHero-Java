<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
    <% 
            //Scope'lar?n s?ralamalar? ?u ?ekildedir
            //pageContext   -> request  ->    session    ->   application
            
            /*String isim = "Engin BAS";
            
            isim = "Page Context Engin BAS";
            pageContext.setAttribute("isimAttr1", isim);
            
            isim = "Request Context Engin BAS";            
            request.setAttribute("isimAttr2",isim);
            
            isim = "Session Context Engin BAS";
            session.setAttribute("isimAttr3",isim);
            
            isim = "Application Context Engin BAS";
            application.setAttribute("isimAttr4",isim);
             
            out.println("<br> Page Context : " + pageContext.getAttribute("isimAttr1"));
            out.println("<br> Request Context : " + request.getAttribute("isimAttr2"));
            out.println("<br> Session Context : " + session.getAttribute("isimAttr3"));
            out.println("<br> Application Context : " + application.getAttribute("isimAttr4"));
            
            //findAttribute scope'lar? taramaya yarar ilk buldu?unu tutar            
            out.println("<br> Bulunan attribute : " + pageContext.findAttribute("isimAttr1"));*/


            String isim = "Engin BAS";
            
            isim = "Request Context Engin BAS";            
            request.setAttribute("isim",isim);
            
            //s?ralama farketmeksizin findAttribute ilk pageContext bakar daha sonra request sonra session sonra application
            isim = "Page Context Engin BAS";
            pageContext.setAttribute("isim", isim);
            
            isim = "Session Context Engin BAS";
            session.setAttribute("isim",isim);
            
            isim = "Application Context Engin BAS";
            application.setAttribute("isim",isim);
             
            out.println("<br> Page Context : " + pageContext.getAttribute("isim"));
            out.println("<br> Request Context : " + request.getAttribute("isim"));
            out.println("<br> Session Context : " + session.getAttribute("isim"));
            out.println("<br> Application Context : " + application.getAttribute("isim"));
            
            //findAttribute scope'lar? taramaya yarar //pageContext   -> request  ->    session    ->   application       
            out.println("<br> Bulunan attribute : " + pageContext.findAttribute("isim"));
    %>
</body>
</html>
