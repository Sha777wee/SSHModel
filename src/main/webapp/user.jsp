<%--
  Created by IntelliJ IDEA.
  User: shawee
  Date: 2018/7/19
  Time: 0:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>user</title>
</head>
<body>
    <table border="1" cellspacing="0">
        <tr>
            <th>account</th>
            <th>password</th>
        </tr>
        <s:iterator value="#request.userList" id="user" status="st">
            <tr>
                <th>${user.account}</th>
                <th>${user.password}</th>
            </tr>
        </s:iterator>
    </table>
    <script>
        alert("111");
        alert(${requestScope.userList});
    </script>
</body>
</html>
