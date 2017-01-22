/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.uniroma2.saprClient.view;
import it.uniroma2.sapr.service.ResponseFlightPlan;
import java.util.ArrayList;

/**
 *
 * @author pierfrancescotommasino
 */
public class FlightPlanPilot {
    // dovrà essere riempita richiamando il metodo del webService: getFlightPlanBySapr
    protected ArrayList<ResponseFlightPlan> flightPilot;

    public FlightPlanPilot(ArrayList<ResponseFlightPlan> flightPilot) {
        this.flightPilot = flightPilot;
    }

    public ArrayList<ResponseFlightPlan> getFlightPilot() {
        return flightPilot;
    }

    public void setFlightPilot(ArrayList<ResponseFlightPlan> flightPilot) {
        this.flightPilot = flightPilot;
    }
        
    
}
