<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddSapr</title>
</head>
<body>
	<h2>Add new sapr with parameters</h2>
	<form:form method="POST" action="/SAPRClient/addedSapr">
   <table>
   	<tr>
        <td>Id:<input type="number" name="idsapr"><td>
    </tr>
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
    <tr>
        <td>Licensepilot:<input type="text" name="licensepilot"><td>
    </tr>
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