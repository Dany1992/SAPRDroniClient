<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<title>Pilot Index</title>
</head>
<body>
    <h1>Pilot</h1>
    <c:forEach var="listValue1" items="${model}">
        <h2> Id Sapr: ${listValue1.flightPilot.get(0).idSapr}</h2>
         <table class="table table-bordered">
    						    <thead>
						      <tr>
						        <th>Destination</th>
						        <th>Departure</th>
						        <th>DateDeparture</th>
						        <th>TimeDeparture</th>
						        <th>NowArriving</th>
						        <th>IdSapr</th>
						        <th>IdNote</th>
                                                        <th>IdDevice</th>
                                                        <th>PilotLicense</th>   
						      </tr>
						    </thead>
	    <c:forEach var="listValue" items="${listValue1.flightPilot}">
                   
						    <tbody>
						      <tr>
						        <td>${listValue.destinations}</td>
						        <td>${listValue.departure}</td>
						        <td>${listValue.dateDeparture}</td>
						        <td>${listValue.timeDeparture}</td>
						        <td>${listValue.nowArriving}</td>
						        <td>${listValue.idSapr}</td>
						        <td>${listValue.idNote}</td>
                                                        <td>${listValue.devices}</td>
                                                        <td>${listValue.pilotLicense}</td>
						      </tr>
						    </tbody>                    				  
	  </c:forEach>
            </table>
   </c:forEach>
    <br>
    <a href="/SAPRClient/removeFlightPlan">Delete FlightPlan</a><br>
<<<<<<< HEAD
    <a href="/SAPRClient/addFlightPlan">Insert FlightPlan</a><br>                                   
=======
    <a href="/SAPRClient/addFlightPlan">Insert FlightPlan</a><br>
    <a href="/SAPRClient/addSapr">Add Sapr</a><br>
    <a href="/SAPRClient/addDevice">Add Device</a><br>
>>>>>>> master
</body>
</html>