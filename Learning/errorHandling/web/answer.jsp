<%-- 
    Document   : answer.jsp
    Created on : 19-Jan-2023, 6:21:25 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! 
            String n1;
            String n2;
        %>
        <%
            n1=request.getParameter("n1");
            n2=request.getParameter("n2");
            
            int a=Integer.parseInt(n1);
            int b=Integer.parseInt(n2);
            
        %>
        <h1>answer is: <%= a/b%></h1>
    </body>
</html>
