<%-- 
    Document   : addFlightPlan
    Created on : 28-nov-2016, 16.42.23
    Author     : pierfrancescotommasino
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddFlightPlan</title>
</head>
<body>
	<h2>Add new flightPlan with parameters</h2>
	<form:form method="POST" action="/SAPRClient/addedFlightPlan">
   <table>
    <tr>
        <td>Destinations:<input type="text" name="destinations"><td>
    </tr>
    <tr>
        <td>Departure:<input type="text" name=departure><td>
    </tr>
    <tr>
        <td>DateDeparture:<input type="text" name="dateDeparture"><td>
    </tr>
    <tr>
        <td>TimeDeparture:<input type="text" name="timeDeparture"><td>
    </tr>
    <tr>
        <td>NowArriving:<input type="text" name="nowArriving"><td>
    </tr>
    <tr>
        <td>IdSapr:<input type="text" name="idSapr"><td>
    </tr>
    <tr>
        <td>IdNote:<input type="date-time" name="idNote"><td>
    </tr>
    <tr>
        <td>Devices:<input type="text" name="devices"><td>
    </tr>
    <tr>
        <td>PilotLicense:<input type="text" name="pilotLicense"><td>
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