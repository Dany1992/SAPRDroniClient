 package it.uniroma2.saprClient.model;
 
 import it.uniroma2.sapr.service.Device;
 import it.uniroma2.sapr.service.Opzione;
 import it.uniroma2.sapr.service.ResponseDevice;
 import it.uniroma2.sapr.service.ResponseFlightPlan;
 import it.uniroma2.sapr.service.ResponseSapr;
 import it.uniroma2.saprClient.view.FlightPlan;
 import it.uniroma2.saprClient.view.FlightPlanWrapper;
 import it.uniroma2.saprClient.view.Pilot;
 import java.util.ArrayList;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 
 public interface ManageService {
 	public Boolean addPilot(Pilot p);
 	public Boolean removePilot(Pilot p);
         public Boolean addFlightPlan(FlightPlan p);
 	public Boolean removeFlightPlan(FlightPlan p);
         public ResponseFlightPlan getFlightPlanByFlight(FlightPlan p);
         public ArrayList<ResponseSapr> getSaprsOfPilot(Opzione opzione, String pilotLicense);
         public FlightPlanWrapper popoulateFlighPlanWrapper(String pilotLicense);
		public Boolean removeDevice(Device device);
		public Boolean addDevice(Device device);
		public List<ResponseDevice> selectDevices(String pilotLicense);
		public void setFlightPlan(HttpServletRequest request, FlightPlan flightPlan);
 }