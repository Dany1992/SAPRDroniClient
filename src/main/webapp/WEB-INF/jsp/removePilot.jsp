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
	<h2>Delete pilot insert his  licens code pilot</h2>
	<form:form method="POST" action="/SAPRClient/removedPilot">
   <table>
    <tr>
        <td>Licensepilot:<input type="text" name="licensepilot"><td>
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