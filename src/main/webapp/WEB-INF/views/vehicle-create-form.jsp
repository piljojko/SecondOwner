<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>Vehicle Form</title>
</head>
<body>
	<h1> Vehicle Form </h1>

	<form action="/vehicles"  method="post">

	    <label for="brand">Brand:</label>
        <select id="brand" name="brand">
            <option value="Nan">---</option>
             <c:forEach var="item" items="${ListOfBrands}">
                <option
                    value="${item.id}"
                    <c:if test="${item.id == selectedBrandId}">selected</c:if>>
                        ${item.name}
                </option>
             </c:forEach>
        </select><br><br>

        <label for="model">Model:</label>
        <select id="model" name="modelId" ${selectedBrandId != null ? "" : "disabled"}>
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
     <script>
        $(document).ready(function() {
            $("#brand").change(function() {
                var brandId = $(this).val();
                console.log("Promenjena vrednost branda na " + brandId)
                if (!brandId) return;
                if (brandId == "Nan")
                     window.location.href = "/vehicles";
                else
                    window.location.href = "/vehicles?brandId=" + brandId;
            });
        });
    </script>
</body>
</html>
