<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KTC
  Date: 6/1/2023
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ket qua</title>
</head>
<body>
<h1>Gia vị bạn đã chọn</h1>
<ul>
    <c:forEach items="${giaviList}" var="giaVi">
        <li>${giaVi.getTenGiaVi()}</li>
    </c:forEach>
</ul>
</body>
</html>
