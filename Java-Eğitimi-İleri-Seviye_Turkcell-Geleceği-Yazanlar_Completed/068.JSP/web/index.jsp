<%@ page pageEncoding="UTF-8" contentType="text/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>    
    <%
        int sayi1 = 10;
        int sayi2 = 5;
        
        out.println(isim);
        out.println("<br>");
        out.println("Toplama = " + topla(sayi1,sayi2));
        out.println("<br>");
        out.println("Cikarma = " + cikarma(sayi1,sayi2));
        out.println("<br>");
        out.println("Bolme = " + bolme(sayi1,sayi2));
        out.println("<br>");
        out.println("Carpma = " + carpma(sayi1,sayi2));
        out.println("<br>");
    %>
    
    <%!
        public String isim = "Engin BAS";
        public double topla(double s1, double s2)
        {
            return s1+s2;
        }
        public double cikarma(double s1, double s2)
        {
            return s1-s2;
        }
        public double bolme(double s1, double s2)
        {
            return s1/s2;
        }
        public double carpma(double s1, double s2)
        {
            return s1*s2;
        }
    %>
</body>
</html>
