<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Springboot JSP</title>
</head>
<body>
	<h1>Ovo je primer stranice</h1>
	<jsp:include page="/WEB-INF/views/navigation-bar.jsp"/>
     	<div class="content">
        <p>Message: ${message} </p>
        <a href="/vehicles">Back to vehicle list</a><br><br>
        <a href="/users">Registration</a><br><br>
    </div>
</body>
</html>
