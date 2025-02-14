<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
	<h1> Registration Form </h1>

	 <form action="/users"  method="post">

                <label form="name"> Name: </label>
                <input type="text" id="name" name="name" required<br><br><br>

                <label form="lastName"> Last name: </label>
                <input type="text" id="lastName" name="lastName" required><br><br>

                <label form="email"> E-mail: </label>
                <input type="text" id="email" name="email" required><br><br>

                <label form="username"> Username: </label>
                <input type="text" id="username" name="username" required><br><br>

                <label form="password"> Password: </label>
                <input type="password" id="password" name="password" required><br><br>

                <label form="passwordCopy"> Confirmed password: </label>
                <input type="password" id="passwordCopy" name="passwordCopy" required><br><br>

                <button type="submit"> Submit </button><br><br>

        </form>

    <c:if test="${SuccessMessage != null}">
        <p>Optional message: ${SuccessMessage}</p>
    </c:if>


</body>
</html>
