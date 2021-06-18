<%-- 
    Document   : exam
    Created on : 18.06.2021, 13:59:51
    Author     : Владимир
--%>

<%@page import="knu.fit.ist.ta1.exam.Result"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <form action="./exam" method="post" class="form-inline">
            <label for="x"><b>Enter x:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p>
        </form>
        <%! Result fr = new Result(85);%>
        <p><b>Args: </b><%= fr.GetArgs()%> </p>
        <p><b>Results:</b><%= fr.Calculate()%></p>

    </body>
</html>
