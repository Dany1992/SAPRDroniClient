<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AddDevice</title>
</head>
<body>
<h1>Welcome ${license}</h1>
<h2>Add new device with parameters</h2>
<form:form method="POST" action="/SAPRClient/addedDevice">
    <table>
<!--         <tr> -->
<!--             <td>Id:<input type="text" name="id"><td> -->
<!--         </tr> -->
        <tr>
            <td>Model:<input type="text" name="model"><td>
        </tr>
<!--         <tr> -->
<!--             <td>Pilot License:<input type="text" name="pilotLicense"><td> -->
<!--         </tr> -->
        <tr>
            <td>Producer:<input type="text" name="producer"><td>
        </tr>
        <tr>
            <td>Type:<input type="text" name="type"><td>
        </tr>
        <tr>
            <td>Weight:<input type="text" name="weight"><td>
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
            <td>CheckElement:<input type="text" name="check6"><td>
        </tr>
                <tr>
            <td>CheckElement:<input type="text" name="check7"><td>
        </tr>
                <tr>
            <td>CheckElement:<input type="text" name="check8"><td>
        </tr>
                <tr>
            <td>CheckElement:<input type="text" name="check9"><td>
        </tr>
                <tr>
            <td>CheckElement:<input type="text" name="check10"><td>
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