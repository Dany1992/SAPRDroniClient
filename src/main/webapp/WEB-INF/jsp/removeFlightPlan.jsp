<%-- 
    Document   : removeFlightPlan
    Created on : 16-dic-2016, 16.08.02
    Author     : Tiziano
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove FlightPLan</title>
</head>
<body>
	<h1>Insert SAPR and date of departure for delete corrispondent flightPlan</h1>
	<form:form method="POST" action="/SAPRClient/removedFlightPlan">
   <table>
    <tr>
        <td>Id SAPR:<input type="text" name="idSapr"><td>
    </tr>
    <tr>
        <td>Pilot License:<input type="text" name="pilotLicense"><td>
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
</body>
</html>
