<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
   <h1>Welcome to Vehicle Page</h1>
   	<jsp:include page="/WEB-INF/views/registration-form.jsp"/>

    <c:choose>
        <c:when test="${RegisteredUser != null && RegisteredUser.id != null}">
           <p> User successfully registered ${RegisteredUser} </p>
        </c:when>
        <c:when test="${ErrorMessage != null}">
            <p>Error: ${ErrorMessage}</p>
        </c:when>
    </c:choose>
</body>
</html>
