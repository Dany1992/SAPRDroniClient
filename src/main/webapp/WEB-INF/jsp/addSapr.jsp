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
<spring:url value="/resources/adminCSS.css" var="styleCSS" />
<link href="${styleCSS}" rel="stylesheet" />
<title>AddSapr</title>
</head>
<body>
	<h1>Welcome ${license}</h1>
	<h2>Add new sapr</h2>
	<form:form method="POST" action="/SAPRClient/addedSapr">
   <table>
<!--    	<tr> -->
<!--         <td>Id:<input type="number" name="idsapr"><td> -->
<!--     </tr> -->
    <tr>
        <td>Model:<input type="text" name="model"><td>
    </tr>
    <tr>
        <td>Producer:<input type="text" name="producer"><td>
    </tr>
    <tr>
        <td>Weight:<input type="number" name="weight"><td>
    </tr>
    <tr>
        <td>Heavyweight:<input type="number" name="heavyweight"><td>
    </tr>
    <tr>
        <td>MaxDistance:<input type="number" name="maxdistance"><td>
    </tr>
    <tr>
        <td>MaxHeight:<input type="number" name="maxheight"><td>
    </tr>
<!--     <tr> -->
<!--         <td>Licensepilot:<input type="text" name="licensepilot" value=$license><td> -->
<!--     </tr> -->
    <tr>
        <td>Battery:<input type="text" name="battery"><td>
    </tr>
    <tr>
        <td>CheckElement:<input type="text" name="check1"><td>
    </tr>
    <tr>
        <td>CheckElement:<input type="text" name="check2"><td>
    </tr>
    <tr>
        <td>CheckElement:<input type="text" name="check3"><td>
    </tr>
    <tr>
        <td>CheckElement:<input type="text" name="check4"><td>
    </tr>
    <tr>
        <td>CheckElement:<input type="text" name="check5"><td>
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