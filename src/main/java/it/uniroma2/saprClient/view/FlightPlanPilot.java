/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.uniroma2.saprClient.view;
import it.uniroma2.sapr.service.ResponseFlightPlan;
import it.uniroma2.sapr.service.ResponseSapr;
import java.util.ArrayList;

/**
 *
 * @author pierfrancescotommasino
 */
public class FlightPlanPilot {
    // dovrà essere riempita richiamando il metodo del webService: getFlightPlanBySapr
    protected ArrayList<ResponseFlightPlan> flightPilot;
    protected ResponseSapr saprPilot;

    public ResponseSapr getSaprPilot() {
        return saprPilot;
    }

    public void setSaprPilot(ResponseSapr saprPilot) {
        this.saprPilot = saprPilot;
    }

    public FlightPlanPilot(ArrayList<ResponseFlightPlan> flightPilot,ResponseSapr saprPilot) {
        this.flightPilot = flightPilot;
        this.saprPilot = saprPilot;
    }

    public ArrayList<ResponseFlightPlan> getFlightPilot() {
        return flightPilot;
    }

    public void setFlightPilot(ArrayList<ResponseFlightPlan> flightPilot) {
        this.flightPilot = flightPilot;
    }
        
    
}
