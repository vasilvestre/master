<%--
  Created by IntelliJ IDEA.
  User: vsilvestre
  Date: 16/03/19
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/register">
    <label>
        Firstname :
        <input type="text" name="firstName">
        Lastname :
        <input type="text" name="lastName">
        Birth date :
        <input type="date" name="birthDate">
        Email :
        <input type="email" name="email">
    </label>
    <button type="submit">Send</button>
</form>
</body>
</html>
