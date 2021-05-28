<%-- 
    Document   : lab8form
    Created on : 28.05.2021, 12:36:45
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

    <h align="center"> Product of all elements except arr[i]: </h>
    <h3 align="center"> Please enter the number of elements of the array and the array itself </h3>

    <div>
        <form action="./lab8" method="post" align="center">
            <input type="text" name="size" placeholder="array size ">
            <input type="text" name="x" placeholder="array">
            <input type="submit" value="ok">
        </form>

    </div>


</body>

</html>
