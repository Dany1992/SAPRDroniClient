<%-- 
    Document   : addFlightPlan
    Created on : 28-nov-2016, 16.42.23
    Author     : pierfrancescotommasino
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddFlightPlan</title>
</head>

<h1>Add new flightPlan with parameters</h1>
<form:form method="POST" action="/SAPRClient/addedFlightPlan">
    
    <table class="col-xs-6">
    <h2>Insert Flight Plan Datas</h2>
    <tr>
        <td>Destinations:<input type="text" name="destinations"><td>
    </tr>
    <tr>
        <td>Departure:<input type="text" name="departure"><td>
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
        <td>IdNote:<input type="number" name="idNote"><td>
    </tr>
    <tr>
        <td>PilotLicense:<input type="text" name="pilotLicense"><td>
    </tr>
</table>
<div id="sapr" class="col-xs-6">
    <h2>Choose a Sapr ${model.flight.destinations}</h2>
    <c:forEach var="listValue" items="${model.saprsOfPilot}">
        <input type="radio" name="idSapr" value="${listValue.idSapr}">
             ${listValue.producer},${listValue.model},${listValue.weight},${listValue.heavyweight},${listValue.battery},${listValue.maxDistance},${listValue.maxHeight}
        <br>
    </c:forEach>
</div>
<div id="device" class="col-xs-6">
    <h2>Choose the Devices</h2>
        <c:forEach var="listValue" items="${model.devicesOfPilot}">
            <input type="checkbox" name="devices" value="${listValue.idDevice}">
                 ${listValue.model},${listValue.type},${listValue.weight},${listValue.producer}
               <br>
        </c:forEach>
</div>
<input type="submit" value="Submit"/>
</form:form>

