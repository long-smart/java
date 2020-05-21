<%@ page import="com.loong.learjava.Student" %><%--
  Created by IntelliJ IDEA.
  User: lzl36
  Date: 2020.5.18
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Student user = (Student) request.getAttribute("user");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello <%= user.getName() %>!</h1>
<p>School Name:
    <span style="color:red">
        <%= user.getSchool().getName() %>
    </span>
</p>
<p>School Address:
    <span style="color:red">
        <%= user.getSchool().getAddress() %>
    </span>
</p>
</body>
</html>
