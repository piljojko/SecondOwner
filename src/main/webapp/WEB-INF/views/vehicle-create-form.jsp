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

        <label form="model"> Model: </label>
        <input type="text" id="model" name="modelId" required><br><br>

        <label form="price"> Price: </label>
        <input type="text" id="price" name="price" required><br><br>

        <button type="submit"> Submit </button><br><br>

    </form>

    <c:if test="${SuccessMessage != null}">
        <p>Optional message: ${SuccessMessage}</p>
    </c:if>

</body>
</html>
