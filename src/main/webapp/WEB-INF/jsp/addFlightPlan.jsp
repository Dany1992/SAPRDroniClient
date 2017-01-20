<%-- 
    Document   : addFlightPlan
    Created on : 28-nov-2016, 16.42.23
    Author     : pierfrancescotommasino
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
<title>AddFlightPlan</title>
</head>
<body>
<h1>ADD NEW FLIGHTPLAN</h1>
<form:form method="POST" action="/SAPRClient/addedFlightPlan">
 
 <div class="col-xs-6">
    <h2>Enter Data of FlightPlan: </h2>
  <div class="form-group">
    <label>Destinations</label>
    <input type="text" class="form-control" name="flight.destinations" placeholder="Enter destinations">
  </div>
  <div class="form-group">
    <label>Departure</label>
    <input type="text" class="form-control" name="flight.departure" placeholder="Enter departure">
  </div>
  <div class="form-group">
    <label>DateDeparture</label>
    <input type="date" class="form-control" name="flight.dateDeparture">
  </div>
  <div class="form-group">
    <label>TimeDeparture</label>
    <input size="8" type="text" value="00:00:00" class="form-control" name="flight.timeDeparture" > 
  </div>
  <div class="form-group">
    <label>NowArriving</label>
    <input size="8" type="text" value="00:00:00" class="form-control" name="flight.nowArriving">
  </div>
  <div class="form-group">
    <label>IdNote</label>
    <input type="number" class="form-control" name="flight.idNote" placeholder="Enter idNote">
  </div>
  <div class="form-group">
    <label>PilotLicense</label>
    <input type="text" class="form-control" name="flight.pilotLicense" placeholder="Enter pilotLicense">
  </div>
</div>
<div id="sapr" class="col-xs-6">
<fieldset class="form-group">
    <h2>Select SAPR:</h2>
	    <c:forEach var="listValue" items="${model.saprsOfPilot}">
		    <div class="form-check">
		      <label class="form-check-label">
			        <input type="radio" class="form-check-input" name="flight.idSapr" id="optionsRadios1" value="${listValue.idSapr}">
			          <table class="table">
						    <thead>
						      <tr>
						        <th>Producer</th>
						        <th>Model</th>
						        <th>Weight</th>
						        <th>HeavyWeight</th>
						        <th>Battery</th>
						        <th>MaxDistance</th>
						        <th>MaxHeight</th>
						      </tr>
						    </thead>
						    <tbody>
						      <tr>
						        <td>${listValue.producer}</td>
						        <td>${listValue.model}</td>
						        <td>${listValue.weight}</td>
						        <td>${listValue.heavyweight}</td>
						        <td>${listValue.battery}</td>
						        <td>${listValue.maxDistance}</td>
						        <td>${listValue.maxHeight}</td>
						      </tr>
						    </tbody>
				    </table>
			  </label>
		    </div>
	  </c:forEach>
  </fieldset>
</div>
<div id="device" class="col-xs-6">
   <div class="checkbox">
    <h2>Select Devices:</h2>
	    <c:forEach var="listValue" items="${model.devicesOfPilot}">
		   <input type="checkbox" value="${listValue.idDevice}" name="flight.devices">
			          <table class="table">
						    <thead>
						      <tr>
						        <th>Model</th>
						        <th>Type</th>
						        <th>Weight</th>
						        <th>Producer</th>
						      </tr>
						    </thead>
						    <tbody>
						      <tr>
						        <td>${listValue.model}</td>
						        <td>${listValue.type}</td>
						        <td>${listValue.weight}</td>
						        <td>${listValue.producer}</td>
						      </tr>
						    </tbody>
				    </table>
	  </c:forEach>
  </div>
</div>
    <input type="submit" value="Submit" class="btn-success" id="submit"/>
</form:form>
</body>
</html>