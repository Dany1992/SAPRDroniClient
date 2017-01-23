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
    <h1>Welcome Pilot with License: ${license}</h1>
    <c:forEach var="listValue1" items="${model}">
        <h2> Id Sapr: </h2>
         <table class="table table-bordered">
    						    <thead>
						      <tr>
						        <th>Destination</th>
						        <th>Departure</th>
						        <th>DateDeparture</th>
						        <th>TimeDeparture</th>
						        <th>NowArriving</th>  
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
						      </tr>
						    </tbody>                    				  
	  </c:forEach>
            </table>
   </c:forEach>

<button type="button" class="btn btn-success"><a href="/SAPRClient/addFlightPlan">Insert FlightPlan</a></button>


<button type="button" class="btn btn-info"><a href="/SAPRClient/addSapr">Add Sapr</a></button>


<button type="button" class="btn btn-warning"><a href="/SAPRClient/addDevice">Add Device</a></button>

<button type="button" class="btn btn-danger"><a href="/SAPRClient/removeFlightPlan">Delete FlightPlan</a></button>
</body>
</html>