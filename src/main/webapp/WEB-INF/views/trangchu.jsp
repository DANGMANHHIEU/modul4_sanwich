<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KTC
  Date: 6/1/2023
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gia Vi</title>
</head>
<body>
<h1> Chon Gia Vi </h1>
<form action="/chongiavi" method="post">
    <ul>
        <c:forEach items="${giaViList}" var="list">
                <label>
                    <input type="checkbox" name="giavi" value="${list.getTenGiaVi()}" ${list.isGiaViChon() ? 'checked': ''}>
                    ${list.getTenGiaVi()}
                </label>
        </c:forEach>
    </ul>
    <button type="submit">OK</button>
</form>
</body>
</html>
