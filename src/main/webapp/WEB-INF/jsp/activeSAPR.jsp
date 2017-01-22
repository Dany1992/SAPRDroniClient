<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Active SAPR</title>
</head>
<body>  
	<h1>Select SAPR if you want active it</h1>
	<form:form method="POST" action="/SAPRClient/activedSAPR">
		<c:forEach var="listValue" items="${model}">
	    	<input type="checkbox" name="listSapr" value="${listValue.idSapr}">
	    		${listValue.idSapr},${listValue.model},${listValue.producer},${listValue.pilotLicense}
	    		<br>
	    </c:forEach>
	    <input type="submit" value="Submit"/>
	</form:form>
</body>
</html>