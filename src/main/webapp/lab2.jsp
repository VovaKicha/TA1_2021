<%-- 
    Document   : lab2
    Created on : 16.04.2021, 14:41:05
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>(√dx) / ax^2 + bx c </h1>
        <h2>a = -8; b = -7; c = 8; d = 2;</h2>
        
        <p><%=request.getAttribute("result")%></p>
        
        <div>
            <form action="lab2form.jsp">
            <input type="submit" value="New x">
            </form> 
        </div> 
        
        <div>
            <form action="index.jsp">
            <input type="submit" value="Home">
            </form> 
        </div> 
        
    </body>
</html>



 
