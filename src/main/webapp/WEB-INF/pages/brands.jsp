<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

    <h1>Welcome to Vehicle Page</h1>
    <jsp:include page="/WEB-INF/views/navigation-bar.jsp"/>
	<jsp:include page="/WEB-INF/views/brand-overview.jsp"/>
	<c:if test="${selectedBrandId != null}">
	    <jsp:include page="/WEB-INF/views/model-overview.jsp"/>
	</c:if>


</body>
</html>