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
                <c:forEach var="brand" items="${ListOfBrands}">
                    <tr>
                        <td>${brand.name}</td>
                        <td>
                            <div class="button-container">
                                    <button onclick="deleteAction(${brand.id})">DELETE</button>
                                    <button onclick="editAction(${brand.id})">EDIT</button>
                               </div>
                        </td>
                    </tr>
                </c:forEach>

                <script>
                        function addAction(id) {
                            alert("Add action triggered for ID: " + id);
                        }
                        function deleteAction(id) {
                            alert("Delete action triggered for ID: " + id);
                        }
                        function editAction(id) {
                           if (!id) return;
                           if (id == "Nan")
                                window.location.href = "/brands";
                           else
                                window.location.href = "/brands?brandId=" + id;
                        }
                    </script>
            </tbody>
        </table>
    </div>


</body>
</html>