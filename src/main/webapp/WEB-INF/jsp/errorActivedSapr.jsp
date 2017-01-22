<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error acrived sapr</title>
</head>
<body>
	<h2>The following Saprs is not active for an error</h2>
	<c:forEach var="listValue" items="${model}">
    	${listValue.idSapr}
    	<br>
    </c:forEach>
</body>
</html>