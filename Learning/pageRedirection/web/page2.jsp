<%-- 
    Document   : page2
    Created on : 21-Jan-2023, 5:25:11 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is page 2</h1>
        <%
        //redirection
        response.sendRedirect("page3.jsp");
        
        
        
        %>
    </body>
</html>
