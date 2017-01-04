package it.uniroma2.saprClient.model;
<<<<<<< HEAD

import it.uniroma2.sapr.service.ResponseDevice;
import it.uniroma2.saprClient.view.Pilot;
import it.uniroma2.saprClient.view.Device;
import java.util.List;
=======
import it.uniroma2.sapr.service.Opzione;
import it.uniroma2.sapr.service.ResponseFlightPlan;
import it.uniroma2.sapr.service.ResponseSapr;
import it.uniroma2.saprClient.view.FlightPlan;
import it.uniroma2.saprClient.view.FlightPlanWrapper;
import it.uniroma2.saprClient.view.Pilot;
import java.util.ArrayList;
>>>>>>> master

public interface ManageService {
	public Boolean addPilot(Pilot p);
	public Boolean removePilot(Pilot p);
<<<<<<< HEAD
        public Boolean addDevice(Device d);
        public Boolean removeDevice(Device d);
        public List<ResponseDevice> selectDevices(String p);
=======
        public Boolean addFlightPlan(FlightPlan p);
	public Boolean removeFlightPlan(FlightPlan p);
        public ResponseFlightPlan getFlightPlanByFlight(FlightPlan p);
        public ArrayList<ResponseSapr> getSaprsOfPilot(Opzione opzione, String pilotLicense);
        public FlightPlanWrapper popoulateFlighPlanWrapper(String pilotLicense);
>>>>>>> master
}
