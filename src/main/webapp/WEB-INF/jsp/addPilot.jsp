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
<title>AddPilot</title>
</head>
    <body>
        <h1 id="mainTest" class="col-xs-12">Complete form for inser new pilot</h1>
	<form:form method="POST" action="/SAPRClient/addedPilot">
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Name</p> <input class="form-control" type="text" name="name">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Surname</p><input class="form-control" type="text" name="surname">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Nation</p><input class="form-control" type="text" name="nation">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>State</p><input class="form-control" type="text" name="state">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>LicensePilot</p><input class="form-control" type="text" name="licensepilot">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>TaxCode</p><input class="form-control" type="text" name="taxcode">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>BirthDate</p><input class="form-control" type="date" name="birthdate">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Residence</p><input class="form-control" type="text" name="residence">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Phone</p><input class="form-control" type="tel" name="phone">
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Mail</p><input class="form-control" type="email" name="mail">
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