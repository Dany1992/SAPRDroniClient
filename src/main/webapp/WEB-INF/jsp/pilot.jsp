<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<spring:url value="/resources/style.css" var="styleCSS" />
<link rel="stylesheet" href="${styleCSS}"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script>
<c:forEach var="listValue1" items="${model}">
$(function(){
    $('#${listValue.saprPilot.model}').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget);
        var recipient = button.data('id');
        var modal = $(this);
        modal.find('.modal-title').text('Sapr ');
        modal.find('.modal-body input').val(recipient);
    });
});
</c:forEach>
</script>
<title>Pilot Index</title>
</head>
<body>
<h1>Welcome Pilot with License: ${license}</h1>
<div class="col-xs-12">
    <c:forEach var="listValue1" items="${model}">
        <h2>Sapr: ${listValue1.saprPilot.model}</h2>
        <table class="table table-bordered">
    						    <thead>
						      <tr>
						        <th>Model</th>
						        <th>Producer</th>
						        <th>weight</th>
						        <th>heavyweight</th>
						        <th>battery</th>  
						        <th>maxDistance</th> 
						        <th>maxHeight</th> 
						        <th>active</th>
						        <th><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#${listValue1.saprPilot.model}" data-id="${listValue1.saprPilot.model}">Flight Plan</button></th>
						      </tr>
						    </thead>
						    <tbody>
						      <tr>
						        <td>${listValue1.saprPilot.model}</td>
						        <td>${listValue1.saprPilot.producer}</td>
						        <td>${listValue1.saprPilot.weight}</td>
						        <td>${listValue1.saprPilot.heavyweight}</td>
						        <td>${listValue1.saprPilot.battery}</td>
						        <td>${listValue1.saprPilot.maxDistance}</td>
						        <td>${listValue1.saprPilot.maxHeight}</td>
						        <td>${listValue1.saprPilot.active}</td>
						        <td>
                                        
										<div class="modal fade" id="${listValue1.saprPilot.model}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
										    <div class="modal-dialog">
										        <div class="modal-content window">
										            <div class="modal-header">
										                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
										                <h4 class="modal-title" id="exampleModalLabel"></h4>
										            </div>
										            <div class="modal-body">
										                    <h1>Sapr: ${listValue1.saprPilot.model}</h1>
										                             <table class="table table-bordered" id="tav">
											    						    <thead>
																	      <tr>
																	        <th>Destination</th>
																	        <th>Departure</th>
																	        <th>DateDeparture</th>
																	        <th>TimeDeparture</th>
																	        <th>NowArriving</th>  
																	      </tr>
																	    </thead>
															    <c:forEach var="listValue" items="${listValue1.flightPilot}">
																				    <tbody>
																				      <tr>
																				        <td>${listValue.destinations}</td>
																				        <td>${listValue.departure}</td>
																				        <td>${listValue.dateDeparture}</td>
																				        <td>${listValue.timeDeparture}</td>
																				        <td>${listValue.nowArriving}</td>
																				      </tr>
																				    </tbody>                    
															  </c:forEach>
                                                                                                         </table>
										            </div>
										        </div>
										    </div>
										</div>
						        </td>
						      </tr>
						    </tbody>                    				  
            </table>
   </c:forEach>
</div>

<button type="button" class="btn btn-success" id="succ"><a href="/SAPRClient/addFlightPlan">Insert FlightPlan</a></button>


<button type="button" class="btn btn-info"><a href="/SAPRClient/addSapr">Add Sapr</a></button>


<button type="button" class="btn btn-warning"><a href="/SAPRClient/addDevice">Add Device</a></button>

<button type="button" class="btn btn-danger"><a href="/SAPRClient/removeFlightPlan">Delete FlightPlan</a></button>

<br>
<br>

<button type="button" class="btn btn-danger"><a href="/SAPRClient/logOut">Log Out</a></button>

</body>
</html>