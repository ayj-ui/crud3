<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/12/21 0021
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询所有</title>
</head>
<body>
<table>
    <tr><td>id</td><td>用户名</td><td>密码</td></tr>
<c:forEach items="${list}" var="user">



            <tr>
                <form action="change" method="post">
                <td><input type="text" value="${user.id}" name="id" readonly="readonly"></td>
                <td><input type="text" value="${user.username}" name="username"></td>
                <td><input type="text" value="${user.password}" name="password"></td>
                <td><input type="submit" value="更改"></td>
                </form>
            </tr>



</c:forEach>
</table>
</body>
</html>
