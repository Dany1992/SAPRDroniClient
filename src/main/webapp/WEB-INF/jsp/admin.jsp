<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<spring:url value="/resources/adminCSS.css" var="styleCSS"/>
<link href="${styleCSS}" rel="stylesheet"/>
<title>Amministratore</title>
</head>
<body>
    <!-- Heading -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Admin page
                <small>Operation</small>
            </h1>
        </div>
    </div>
        
    <div class="row col-lg-6">
        <div class="portfolio-item">
            <h3>                   
                <a href="/SAPRClient/addPilot">Add new Pilot</a>
            </h3>
                <p>In this section you can fill the fields, then enter a new pilot</p>
        </div>
    </div>
            
        
    <div class="row col-lg-6">
        <div class="portfolio-item">
            <h3>
                <a href="/SAPRClient/removePilot">Delete Pilot</a>
            </h3>
            <p>In this section you may delete pilot simply inserting pilot's licence that you want to delete.</p>
        </div>
    </div> 
        
        <div class="row col-lg-6">
            <div class="portfolio-item">
                <h3>
                    <a href="/SAPRClient/activeSAPR">Active Sapr</a>
                </h3>
                <p>In this section you may active sapr.</p>
            </div>
        </div>
        <!-- jQuery -->
    <script src="js/jquery-1.11.3.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>