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

        <label for="model">Model:</label>
        <select id="model" name="modelId">
            <option>---</option>
             <c:forEach var="item" items="${ListOfModels}">
                <option value="${item.id}">${item.name}</option>
             </c:forEach>
        </select><br><br>

        <label for="price"> Price: </label>
        <input type="text" id="price" name="price" required><br><br>

        <button type="submit"> Submit </button><br><br>

    </form>

    <c:if test="${SuccessMessage != null}">
        <p>Optional message: ${SuccessMessage}</p>
    </c:if>

</body>
</html>
