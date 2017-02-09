<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<spring:url value="/resources/adminCSS.css" var="styleCSS" />
<link href="${styleCSS}" rel="stylesheet" />
<title>Login</title>
</head>
    <body>
        <h1 id="mainTest" class="col-xs-12">LOGIN PAGE</h1>
	<form:form method="POST" action="/SAPRClient/login">
            <div class="formPilot col-xs-12 col-lg-6">
                <p>License</p> <input class="form-control" type="number" name="license">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Password</p><input class="form-control" type="password" name="password">
            </div>
            <div class="formPilot  col-xs-12 col-lg-12">
                <input class="btn btn-success col-xs-12 col-lg-12" type="submit" value="Submit"/>
            </div>
        </form:form>
    </body>
</html>