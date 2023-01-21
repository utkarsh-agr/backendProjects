<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry!! Something went wrong</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    </head>
    <body>
        <div class="container p-3">
            <div class="row">
                <div class="col-md-6 offset-md-3 text-center">
                    <img src="img/oops.png" class="img-fluid">
                    <h1>Sorry!! Something went wrong</h1>
                    <p><%=exception%></p>
                </div>
            </div>
            
        </div>
    </body>
</html>
