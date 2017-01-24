/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.uniroma2.saprClient.view;

import it.uniroma2.sapr.service.Device;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pierfrancescotommasino
 */
public class FlightPlan {
    protected String destinations;
    protected String departure;
    protected String dateDeparture;
    protected String timeDeparture;
    protected String nowArriving;
    protected int idSapr;
    protected int idNote;
    protected ArrayList<Integer> devices;
    protected String pilotLicense;

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public String getNowArriving() {
        return nowArriving;
    }

    public void setNowArriving(String nowArriving) {
        this.nowArriving = nowArriving;
    }

    public int getIdSapr() {
        return idSapr;
    }

    public void setIdSapr(int idSapr) {
        this.idSapr = idSapr;
    }

    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public ArrayList<Integer> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Integer> devices) {
        this.devices = devices;
    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }
    
    
    
}
