<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<spring:url value="/resources/adminCSS.css" var="styleCSS"/>
<link href="${styleCSS}" rel="stylesheet"/>

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
	    <div class="formPilot  col-xs-12 col-lg-12">
                <input class="btn btn-success col-xs-12 col-lg-12" type="submit" value="Submit"/>
            </div>
	</form:form>
</body>
</html>