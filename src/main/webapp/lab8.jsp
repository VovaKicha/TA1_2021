<%-- 
    Document   : lab8
    Created on : 28.05.2021, 12:34:58
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 8</title>
    </head>

    <body>

        <h1 align="center"> Laboratory work 8 </h1>
        <h2 align="center" > Product of all elements except arr[i]: </h2>

        <hr noshade size="2" width="100%">
        <h3 align="center" > Your array: <%= request.getParameter("x")%></h3>
        <p align="center" > The first solution ( O(nˆ2) ): <%= request.getAttribute("res_1")%></p>
        <p align="center" > The second solution ( O(1) ): <%= request.getAttribute("res_2")%></p>
        <p align="center" > The third solution ( O(log n) ): <%= request.getAttribute("res_3")%></p>


        <hr noshade size="2" width="100%">
        <form action="../index.jsp" align="center">
            <input type="submit" value="Home">
        </form>

        <form action="lab8form.jsp" align="center">
            <input type= "submit" value="Return to input array">
        </form>

    </body>

</html>
