<%-- 
    Document   : lab6-7form
    Created on : 24.05.2021, 21:57:26
    Author     : Владимир
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Lab 6 - 7 </title>
    </head>

    <body bgcolor="#FFFFF0">

        <h1 align="center"> laboratory work #6</h1>
        <h3 align="center"> Enter the number to count X and the number of elements in the array N </h3>

        <div>
            <form action="./lab6-7.jsp" method="post" align="center">

                <input type="text" name="x" placeholder="X">
                <input type="text" name="n" placeholder="array size">
                <input type="submit" value="ok">
            </form>


        </div>

    </body>

</html>
