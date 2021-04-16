<%-- 
    Document   : lab1
    Created on : 15.04.2021, 20:54:56
    Author     : Владимир
--%>

<%@page import="knu.fit.ist.ta1.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is my Lab 1</h1>
     
        <%! MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>
        <%
            int x = mFJC.getMyInt();
            
            x+=3;
            x%=3;
        %>
        
        <p><%=x%></p>
        
        <a href="index.jsp">HOME</a>
        
    </body>
</html>
