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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.js"></script>
<title>Login</title>
</head>
    <body>
    <h1 id="mainTest" class="col-xs-12">LOGIN PAGE</h1>
    <div style="color: red"><h2>${error}</h2></div>
	<form:form method="POST" id="mainTest" action="/SAPRClient/login">
            <div class="formPilot col-xs-12 col-lg-6">
                <p>License</p> <input class="form-control" type="number" name="license" required>
            	<form:errors path="license" cssClass="error" />
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Password</p><input class="form-control" type="password" name="password" required>
            	<form:errors path="password" cssClass="error" />
            </div>
            <div class="formPilot  col-xs-12 col-lg-12">
                <input class="btn btn-success col-xs-12 col-lg-12" type="submit" value="Submit"/>
            </div>
            <script>
                $("#mainTest").validate({
                    rules: {
                        license : {
                            remote: "",
                            required: true
                        },
                        password : {
                            //remote: "url",
                            required: true
                        }
                    },
                    messages: {
                        license : {
                            //remote: "Pilota non esistente"
                            required: "Inserisci Licenza"
                        },
                        password : {
                            //remote: "Email non corretta"
                            required: "Inserisci Password"
                        }
                    }
                });
            </script>
        </form:form>
    </body>
</html>