<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vehicle Form</title>
</head>
<body>
	<h1> Vehicle Form </h1>

	<form action="/vehicles"  method="post">
        <label form="brand"> Brand: </label>
        <input type="text" id="brand" name="brand"><br><br>

        <label form="model"> Model: </label>
        <input type="text" id="model" name="model" required><br><br>

        <label form="color"> Color: </label>
        <input type="text" id="color" name="color" required><br><br>

        <button type="submit"> Submit </button><br><br>

    </form>

    <c:if test="${SuccessMessage != null}">
        <p>Optional message: ${SuccessMessage}</p>
    </c:if>

</body>
</html>
