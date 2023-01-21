<%-- 
    Document   : Register
    Created on : 05-Jan-2023, 8:37:50 am
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body style="background: url(img/keyboard.jpg);background-size: cover;background-attachment: fixed;">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card indigo lighten-5" style="padding: 10px;">
                        <div class="card-title center-align">
                            <h3 style="font-family:verdana;margin-top:15px;">Register here!!</h3>
                            <h5 id="msg" class="center-align"></h5>
                        </div>
                        <div class="card-content">
                            <div class="form center-align">
                                <form action="Register" method="post" id="myform">
                                    <input type="text" name="user_name" placeholder="Enter your name">
                                    <input type="email" name="user_email" placeholder="Enter your email">
                                    <input type="password" name="user_password" placeholder="Enter your password">
                                    <div class="file-field input-field">
                                        <div class="btn">
                                            <span>File</span>
                                            <input name="user_img" type="file">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input class="file-path validate" type="text">
                                        </div>
                                    </div>
                                    <button class="btn waves-effect waves-light light-blue lighten-1" type="submit">Submit
                                        <i class="material-icons right">send</i>
                                    </button>
                                </form>
                            </div>
                        </div>
                        <div class="loader center-align" style="display:none;">
                            <div class="preloader-wrapper big active">
                                <div class="spinner-layer spinner-blue">
                                    <div class="circle-clipper left">
                                        <div class="circle"></div>
                                    </div><div class="gap-patch">
                                        <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                    </div>
                                </div>

                                <div class="spinner-layer spinner-red">
                                    <div class="circle-clipper left">
                                        <div class="circle"></div>
                                    </div><div class="gap-patch">
                                        <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                    </div>
                                </div>

                                <div class="spinner-layer spinner-yellow">
                                    <div class="circle-clipper left">
                                        <div class="circle"></div>
                                    </div><div class="gap-patch">
                                        <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                    </div>
                                </div>

                                <div class="spinner-layer spinner-green">
                                    <div class="circle-clipper left">
                                        <div class="circle"></div>
                                    </div><div class="gap-patch">
                                        <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                    </div>
                                </div>
                            </div>
                            <h5 style="margin-bottom: 10px;">Please wait...</h5>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <script
            src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
            crossorigin="anonymous">
        </script>

        <script>
            $(document).ready(function () {
                console.log("Page is ready.....");

                $("#myform").on('submit', function (event) {
                    event.preventDefault(); //This will prevent our jsp file to go to response of Register.java Servlet on form submission

                 // var f = $(this).serialize();
                    let f= new FormData(this);

                    console.log(f); //This will print values inside variable f in the console
                 

                    $(".loader").show();

                    $.ajax({
                        url: "Register",
                        data: f,
                        type: 'POST',
                        success: function (data, textStatus, jqXHR) {
                            console.log(data);
                            console.log("success.....");
                            $(".loader").hide();
                            if (data.trim() === 'done') {
                                $("#msg").html("Successfully Registered...");
                                $("#msg").addClass('green-text');

                            } else {
                                $("#msg").html("Something went wrong on the server...");
                                $("#msg").addClass('pink-text');
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            console.log(data);
                            console.log("error.....");
                            $(".loader").hide();
                            $("#msg").html("Something went wrong on the server...");
                            $("#msg").addClass('pink-text');

                        },
                        processData:false,
                        contentType:false

                    });
                });
            });

        </script>
    </body>
</html>
