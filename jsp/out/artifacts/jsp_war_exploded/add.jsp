<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 610501
  Date: 5/6/2020
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.

  Directive     <%@ page import =""%>
  @page---------->       import=""      language ="java"  isELIngnore="true|false"  extends="className"
  @include ------>        <%@include file ="header.jsp" %>  - it is used to add another page
  @taglib  ------>        <%taglib  uri ="" prefix="fx" %>  -t is used to include tags and library of tag. We can also use external tags.
  Declarative  <%!  %> outside service
  Scriplets --- <%  %>  service method
  Expression     <%  =k  %>  out.print(k)
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#00ffff">

<%!   int addedValue ;
int k;
List<Integer> list = new ArrayList<>();
%>


<%


    int num1= Integer.parseInt(request.getParameter("num1"));
    int num2= Integer.parseInt(request.getParameter("num2"));
    addedValue = num1 + num2;

   k=9/0;

%>

The result = <%= addedValue%>
</body>
</html>
