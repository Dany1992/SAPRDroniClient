
<%@page import="it.uniroma2.sapr.service.ResponseDevice"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete Device</title>
</head>
<body>
    <h2>Delete Device</h2>
    <h1>Choose a Device</h1>
<f:form>
    <input type="radio" checked name="sex" value="male">Male
    <input type="radio" name="sex" value="female">Female
</f:form>
<%-- Il dindi ha messo la jstl, ora non funziona --%>
<c:forEach var="val" items="command">
    <li>${val}</li>
</c:foreach>
</body>
</html>