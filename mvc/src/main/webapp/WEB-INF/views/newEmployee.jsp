<!DOCTYPE HTML>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<spring:message code="buildNumber" var="buildNumber" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="/resources/js/common/jquery-1.9.0.js"></script>
<script src="/resources/js/custom/newEmployee.js"></script>
<link rel="stylesheet" href="<c:url value="/resources/css/custom/newEmployee.css?${buildNumber}"/>" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		First name: <input type="text" name="name" id="name"><br>
		<button type="button" id="ajax1" >Ajax Test</button>
		<input type="submit" value="Submit">
	</form>
</body>
</html>