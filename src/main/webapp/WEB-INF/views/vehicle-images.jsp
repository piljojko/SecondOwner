<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<div class="content">
<c:forEach var="image" items="${base64Images}">
<img src="${image}" alt="Image" width="200" height="150"/>
</c:forEach>

</div>

</body>
</html>