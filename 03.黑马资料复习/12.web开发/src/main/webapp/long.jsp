<%--
  Created by IntelliJ IDEA.
  User: lzl36
  Date: 2020.5.18
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    out.println("Your IP address is ");
%>
<span style="color:red">
    <%= request.getRemoteAddr() %>
</span>

<%-- 注释 --%>
</body>
</html>
