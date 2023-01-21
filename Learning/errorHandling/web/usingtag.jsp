<%-- 
    Document   : usingtag
    Created on : 19-Jan-2023, 11:21:26 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/myLib" prefix="t"%>
 <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
        <t:myTag></t:myTag>
        <t:printTable number="23" color="blue"></t:printTable>
        <t:printTable number="23"></t:printTable>
    
</html>
