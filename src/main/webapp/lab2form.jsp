 <%-- 
    Document   : lab2form
    Created on : 16.04.2021, 14:42:32
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MY LAB 2</title>
    </head>
    <body>
        <h1>(√dx) / ax^2 + bx c </h1>
        <h2>a = -8; b = -7; c = 8; d = 2;</h2>
        <h1>Enter your x</h1>
        
        <div>
            <form action="./lab2" method="post">
            <input type="text" name ="x" place="enter x as ##.###"/>
            <input type="submit" value="Ok"/>
        </form> 
        </div>
    </body>
</html>
