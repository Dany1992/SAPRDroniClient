<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Sapr</title>
</head>
<body>
	<h2>Delete sapr, insert the id</h2>
	<form:form method="POST" action="/SAPRClient/removedSapr">
   <table>
    <tr>
        <td>Id:<input type="text" name="idsapr"><td>
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