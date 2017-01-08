/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.uniroma2.saprClient.view;

import it.uniroma2.sapr.service.ResponseDevice;
import it.uniroma2.sapr.service.ResponseSapr;
import java.util.ArrayList;

/**
 *
 * @author pierfrancescotommasino
 */
public class FlightPlanWrapper {
    	// dovrà essere riempita richiamatno il metodo del webService: getSaprsOfPilot
	ArrayList<ResponseSapr> saprsOfPilot;
	//dovrà essere riempita richiamatno il metodo del webService: getSaprsOfPilot
	ArrayList<ResponseDevice> devicesOfPilot;
	//Questo è invece il piano di volo che verrà creato quando l'utente fa le sue scelte nella pagina
	FlightPlan flight;

	public ArrayList<ResponseSapr> getSaprsOfPilot() {
		return saprsOfPilot;
	}


	public void setSaprsOfPilot(ArrayList<ResponseSapr> saprsOfPilot) {
		this.saprsOfPilot = saprsOfPilot;
	}


	public ArrayList<ResponseDevice> getDevicesOfPilot() {
		return devicesOfPilot;
	}


	public void setDevicesOfPilot(ArrayList<ResponseDevice> devicesOfPilot) {
		this.devicesOfPilot = devicesOfPilot;
	}


	public FlightPlan getFlight() {
		return flight;
	}


	public void setFlight(FlightPlan flight) {
		this.flight = flight;
	}
}
