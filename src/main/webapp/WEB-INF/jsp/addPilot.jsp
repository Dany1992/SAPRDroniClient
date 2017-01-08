<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddPilot</title>
</head>
<body>
	
	
	<h2>Add new pilot with parameters</h2>
	<form:form method="POST" action="/SAPRClient/addedPilot">
   <table>
    <tr>
        <td>Name:<input type="text" name="name"><td>
    </tr>
    <tr>
        <td>Surname:<input type="text" name="surname"><td>
    </tr>
    <tr>
        <td>Nation:<input type="text" name="nation"><td>
    </tr>
    <tr>
        <td>State:<input type="text" name="state"><td>
    </tr>
    <tr>
        <td>Licensepilot:<input type="text" name="licensepilot"><td>
    </tr>
    <tr>
        <td>Taxcode:<input type="text" name="taxcode"><td>
    </tr>
	<tr>
        <td>Birthdate:<input type="text" name="birthdate"><td>
    </tr>
	<tr>
        <td>Residence:<input type="text" name="residence"><td>
    </tr>
	<tr>
        <td>Phone:<input type="text" name="phone"><td>
    </tr>
	<tr>
        <td>Mail:<input type="text" name="mail"><td>
    </tr>
	<tr>
        <td>Password:<input type="text" name="password"><td>
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