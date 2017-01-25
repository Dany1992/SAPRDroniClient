<%-- 
    Document   : removeFlightPlan
    Created on : 16-dic-2016, 16.08.02
    Author     : Tiziano
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<spring:url value="/resources/style.css" var="styleCSS" />
<link href="${styleCSS}" rel="stylesheet" />
<title>Remove FlightPLan</title>
</head>

    <h1>Welcome ${license}</h1>
    <h1>Insert SAPR and date of departure for delete corrispondent flightPlan</h1>
    
	<form:form method="POST" action="/SAPRClient/removedFlightPlan">
   <table>
    <tr>
        <td>Id SAPR:<input type="text" name="idSapr"><td>
    </tr>
    <tr>
        <td>Pilot License:<input readonly="readonly" type="text" value="${license}" name="pilotLicense"><td>
    </tr>
    <tr>
        <td>Date:<input type="date" name="dateDeparture"><td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

</html>
