<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 610501
  Date: 5/6/2020
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.

  Directive     <%@ page import =""%>
  Declarative  <%!  %> outside service
  Scriplets --- <%  %>  service method
  Expression     <%  =k  %>  out.print(k)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#00ffff">

<%!   int addedValue ;
List<Integer> list = new ArrayList<>();
%>


<%


    int num1= Integer.parseInt(request.getParameter("num1"));
    int num2= Integer.parseInt(request.getParameter("num2"));
    addedValue = num1 + num2;

%>

The result = <%= addedValue%>
</body>
</html>
