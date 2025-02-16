<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Springboot JSP</title>
</head>
<body>
	<h1>Welcome to Vehicle Page</h1>
	<jsp:include page="/WEB-INF/views/vehicle-create-form.jsp"/>

	<table border="1">
	    <thead>
	        <tr>
	            <th> Brand </th>
	            <th> Model </th>
                <th> Price </th>
            </th>
        </thead>
        <tbody>
            <c:forEach var="car" items="${ListOfVehicles}">
                <tr>
                    <td>${car.brand}</td>
                    <td>${car.model}</td>
                    <td>${car.price}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>


</body>
</html>

