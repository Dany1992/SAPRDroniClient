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
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.js"></script>
<title>AddFlightPlan</title>
</head>
<body>
<h1>Welcome ${license}</h1>
<h1>ADD NEW FLIGHTPLAN</h1>
<form:form method="POST" id="formFlight" action="/SAPRClient/addedFlightPlan">
 
 <div class="col-xs-6">
    <h2>Enter Data of FlightPlan: </h2>
  <div class="form-group">
    <label>Destinations</label>
    <input type="text" class="form-control" name="flight.destinations" placeholder="Enter destinations" required>
  </div>
  <div class="form-group">
    <label>Departure</label>
    <input type="text" class="form-control" name="flight.departure" placeholder="Enter departure" required>
  </div>
  <div class="form-group">
    <label>DateDeparture</label>
    <input type="date" class="form-control" name="flight.dateDeparture" required>
  </div>
  <div class="form-group">
    <label>TimeDeparture</label>
    <input size="8" type="text" value="00:00:00" class="form-control" name="flight.timeDeparture" required> 
  </div>
  <div class="form-group">
    <label>NowArriving</label>
    <input size="8" type="text" value="00:00:00" class="form-control" name="flight.nowArriving" required>
  </div>
 </div>
<div id="sapr" class="col-xs-6">
<fieldset class="form-group">
    <h2>Select SAPR:</h2>
             <table class="table table-bordered">
						    <thead>
						      <tr>
                                                        <th>Select</th>
						        <th>Producer</th>
						        <th>Model</th>
						        <th>Weight</th>
						        <th>HeavyWeight</th>
						        <th>Battery</th>
						        <th>MaxDistance</th>
						        <th>MaxHeight</th>
						      </tr>
						    </thead>
	    <c:forEach var="listValue" items="${model.saprsOfPilot}">
			      
						    <tbody>
						      <tr>
                                                        <td><input type="radio" class="form-check-input" name="flight.idSapr" id="optionsRadios1" value="${listValue.idSapr}" required></td>
						        <td>${listValue.producer}</td>
						        <td>${listValue.model}</td>
						        <td>${listValue.weight}</td>
						        <td>${listValue.heavyweight}</td>
						        <td>${listValue.battery}</td>
						        <td>${listValue.maxDistance}</td>
						        <td>${listValue.maxHeight}</td>
						      </tr>
                                                    </tbody>
	  </c:forEach>
            </table>
  </fieldset>
</div>
<div id="device" class="col-xs-6">
    <h2>Select Devices:</h2>
        <table class="table table-bordered">
						    <thead>
						      <tr>
                                                          <th>Select</th>
						        <th>Model</th>
						        <th>Type</th>
						        <th>Weight</th>
						        <th>Producer</th>
						      </tr>
						    </thead>
	    <c:forEach var="listValue" items="${model.devicesOfPilot}">
						    <tbody>
						      <tr>
                                                        <td> <input type="checkbox" value="${listValue.idDevice}" name="flight.devices" required></td>
						        <td>${listValue.model}</td>
						        <td>${listValue.type}</td>
						        <td>${listValue.weight}</td>
						        <td>${listValue.producer}</td>
						      </tr>
						    </tbody>
				    
	  </c:forEach>
                                                    </table>
</div>
<script>
$("#formFlight").validate(){
rules: {
    flight.destinations : {
        required: true
    },
    flight.departure : {
        required: true
    },
    flight.dateDeparture : {
        required: true,
        date: true
    },
    flight.timeDeparture : {
        required: true
    },
    flight.nowArriving : {
        required: true
    },
    flight.idSapr : {
        required: true
    },
    flight.devices : {
        required: true
    }
}
messages: {
    flight.destinations : {
        required: "Campo Obbligatorio"
    },
    flight.departure : {
        required: "Campo Obbligatorio"
    },
    flight.dateDeparture : {
        required: "Campo Obbligatorio",
        date: "Inserire una data valida"
    },
    flight.timeDeparture : {
        required: "Campo Obbligatorio"
    },
    flight.nowArriving : {
        required: "Campo Obbligatorio"
    },
    flight.idSapr : {
        required: "Selezionare un drone"
    },
    flight.devices : {
        required: "Seleziona almeno un dispositivo"
    }
}

};
</script>  

    <input type="submit" value="Submit" class="btn-success" id="submit"/>
</form:form>
</body>
</html>