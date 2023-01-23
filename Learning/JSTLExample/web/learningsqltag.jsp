<%-- 
    Document   : learningsqltag
    Created on : 22-Jan-2023, 12:37:10 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    </head>
    <body>
        <h1>The details of users are:</h1>
        <sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/learn" user="root" password="root" var="ds"></sql:setDataSource>
        <sql:query dataSource="${ds}" var="rs">select * from registrationmodule;</sql:query>
            <div class="container">
                <table class="table">
                    <tr>
                        <th>User ID</th>
                        <th>Name</th>
                        <th>Email</th>

                    </tr>

                <c:forEach items="${rs.rows}" var="row">
                    <tr>
                        <td><c:out value="${row.id}"></c:out></td>
                        <td><c:out value="${row.name}"></c:out></td>
                        <td><c:out value="${row.email}"></c:out></td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </body>
</html>
