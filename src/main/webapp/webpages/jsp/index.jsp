<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Spring Boot JSP</title>
</head>
<body>
<h1>Hello</h1>
<form action="add" method="post">
    Enter name : <input type="text" name="name">
    Enter password : <input type="password" name="password">
    <input type="submit" value="Add">
</form>
<h1>${message}</h1>
</body>
</html>
