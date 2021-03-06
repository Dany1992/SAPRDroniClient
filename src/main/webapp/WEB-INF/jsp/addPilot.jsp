<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="it.uniroma2.saprClient.model.*" %>
<%-- <% ManageService ms = new ManageServiceImpl(); %> --%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<spring:url value="/resources/adminCSS.css" var="styleCSS" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.15.0/jquery.validate.js"></script>
<link href="${styleCSS}" rel="stylesheet" />
<title>AddPilot</title>
</head>
    <body>
        <h1 id="mainTest" class="col-xs-12">Complete form for inser new pilot</h1>
    <div style="color: red"><h2>${error}</h2></div>
	<form:form method="POST" id="addPilotForm" action="/SAPRClient/addedPilot">
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Name</p> <input class="form-control" type="text" name="name" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Surname</p><input class="form-control" type="text" name="surname" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Nation</p><input class="form-control" type="text" name="nation" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>State</p><input class="form-control" type="text" name="state" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>LicensePilot</p><input class="form-control" type="number" name="licensepilot" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>TaxCode</p><input class="form-control" type="text" name="taxcode" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>BirthDate</p><input class="form-control" type="date" name="birthdate" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Residence</p><input class="form-control" type="text" name="residence" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Phone</p><input class="form-control" type="number" name="phone" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Mail</p><input class="form-control" type="email" name="mail" required>
            </div>
            <div class="formPilot col-xs-12 col-lg-6">
                <p>Password</p><input class="form-control" type="password" name="password" required>
            </div>
            <script>
                $("#addPilotForm").validate({
                    rules: {
                        name: {
                            required: true
                        },
                        surname: {
                            required: true
                        },
                        nation: {
                            required: true
                        },
                        state: {
                            required: true
                        },
                        licensepilot: {
                            required: true,
                            maxlength: 10
                        },
                        taxcode: {
                            required: true
                        },
                        residence: {
                            required: true
                        },
                        phone: {
                            required: true,
                           	minlength:10,
                           	maxlength:10
                        },
                        mail: {
                            required: true,
                            email: true
                        },
                        password: {
                            required: true,
                            minlength: 4
                        }
                    },
                    messages: {
                        name: {
                            required: "Campo Obbligatorio"
                        },
                        surname: {
                            required: "Campo Obbligatorio"
                        },
                        nation: {
                            required: "Campo Obbligatorio"
                        },
                        state: {
                            required: "Campo Obbligatorio"
                        },
                        licensepilot: {
                            required: "Campo Obbligatorio",
                            maxlength: "Inserire esattamente 10 caratteri",
                        },
                        taxcode: {
                            required: "Campo Obbligatorio"
                        },
                        residence: {
                            required: "Campo Obbligatorio"
                        },
                        phone: {
                            required: "Campo Obbligatorio",
                            maxlength: "Inserire esattamente 10 caratteri",
                            minlength: "Inserire esattamente 10 caratteri"
                        },
                        mail: {
                            required: "Campo Obbligatorio",
                            email: "Inserire un'email valida"
                        },
                        password: {
                            required: "Campo Obbligatorio",
                            minlength: "Inserire almeno 4 caratteri"
                        }
                    }

                });
            </script>  
            <div class="formPilot  col-xs-12 col-lg-12">
                <input class="btn btn-success col-xs-12 col-lg-12" type="submit" name="button" value="Submit"/>
            </div>
        </form:form>
        <a href="/SAPRClient/admin">IndexAdmin</a>
    </body>
</html>