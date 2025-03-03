<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<div class="content">
        <table border="1">
            <thead>
                <tr>
                    <th> Brand </th>
                    <th> Function </th>
                </th>
            </thead>
            <tbody>
                <c:forEach var="model" items="${ListOfModels}">
                    <tr>
                        <td>${model.name}</td>
                        <td>
                            <div class="button-container">
                                    <button onclick="deleteAction(${model.id})">DELETE</button>
                                    <button onclick="editAction(${model.id})">EDIT</button>
                               </div>
                        </td>
                    </tr>
                </c:forEach>
</div>

</body>
</html>