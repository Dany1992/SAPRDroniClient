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
<title>AddDevice</title>
</head>
<body>
<h1>Welcome ${license}</h1>
<h2>Add new device with parameters</h2>
<form:form method="POST" action="/SAPRClient/addedDevice">
        <h2>Enter Data of Device: </h2>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Model</label>
    <input type="text" class="form-control" name="model" placeholder="Enter Model">
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Producer</label>
    <input type="text" class="form-control" name="producer" placeholder="Enter Producer">
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Type</label>
    <input type="text" class="form-control" name="type" placeholder="Enter Type">
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>Weight</label>
    <input type="text" class="form-control" name="weight" placeholder="Enter Weight"> 
  </div>
  <div class="form-group col-xs-12 col-lg-6">
    <label>CheckElement</label>
    <input type="text" class="form-control" name="check1" placeholder="Enter CheckElement">
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
  <input type="submit" value="Submit" class="btn-success col-xs-12 col-lg-12" id="submit"/>
</form:form>
</body>
</html>