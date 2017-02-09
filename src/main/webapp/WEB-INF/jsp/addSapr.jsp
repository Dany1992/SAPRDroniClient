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
<spring:url value="/resources/style.css" var="styleCSS" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.js"></script>
<link href="${styleCSS}" rel="stylesheet" />
<title>AddSapr</title>
</head>
<body>
	<h1>Welcome ${license}</h1>
	<h2>Add new sapr</h2>
	<form:form method="POST" id="saprForm" action="/SAPRClient/addedSapr" >
    <h2>Enter Data of FlightPlan: </h2>
  <div class="form-group col-xs-12 col-lg-6">
    <label>IDSapr</label>
    <input type="number" class="form-control" name="idSapr" placeholder="Enter IDSapr" required>
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Model</label>
    <input type="text" class="form-control" name="model" placeholder="Enter Model" required>
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Producer</label>
    <input type="text" class="form-control" name="producer" placeholder="Enter Producer" required>
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Weight</label>
    <input type="number" class="form-control" name="weight" placeholder="Enter Weight" required>
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Heavyweight</label>
    <input type="number" class="form-control" name="heavyweight" placeholder="Enter Heavyweight" required> 
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>MaxDistance</label>
    <input type="number" class="form-control" name="maxdistance" placeholder="Enter MaxDistance" required>
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>MaxHeight</label>
    <input type="number" class="form-control" name="maxheight" placeholder="Enter MaxHeight" required>
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>Battery</label>
    <input type="text" class="form-control" name="battery" placeholder="Enter Battery" required>
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check1" placeholder="Enter CheckElement" required>
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check2" placeholder="Enter CheckElement">
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check3" placeholder="Enter CheckElement">
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check4" placeholder="Enter CheckElement">
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check5" placeholder="Enter CheckElement">
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check6" placeholder="Enter CheckElement">
  </div>
     <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check7" placeholder="Enter CheckElement">
  </div>
     <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check8" placeholder="Enter CheckElement">
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check9" placeholder="Enter CheckElement">
  </div>
    <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check10" placeholder="Enter CheckElement">
  </div>
<script>
$("saprForm").validate();
</script>  
<input type="submit" value="Submit" class="btn-success col-xs-12 col-lg-12" id="submit"/>
</form:form>
</body>
</html>