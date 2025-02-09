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

   	<table border="1">
    	    <thead>
    	        <tr>
    	            <th> ID</th>
    	            <th> Name </th>
    	            <th> Last name </th>
                    <th> E-mail </th>
                    <th> Username </th>

                </th>
            </thead>
            <tbody>
                <c:forEach var="user" items="${ListOfUsers}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.lastName}</td>
                        <td>${user.email}</td>
                        <td>${user.username}</td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>

</body>
</html>
