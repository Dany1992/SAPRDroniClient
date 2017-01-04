package it.uniroma2.saprClient.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import it.uniroma2.sapr.service.Exception_Exception;
import it.uniroma2.sapr.service.Operation;
import it.uniroma2.sapr.service.Opzione;
<<<<<<< HEAD
import it.uniroma2.sapr.service.RequestCheckElement;
import it.uniroma2.sapr.service.RequestDevice;
import it.uniroma2.sapr.service.RequestPilot;
import it.uniroma2.sapr.service.ResponseDevice;
=======
import it.uniroma2.sapr.service.RequestFlightPlan;
import it.uniroma2.sapr.service.RequestPilot;
import it.uniroma2.sapr.service.ResponseDevice;
import it.uniroma2.sapr.service.ResponseFlightPlan;
import it.uniroma2.sapr.service.ResponseSapr;
>>>>>>> master
import it.uniroma2.sapr.service.SAPRDroniInterface;
import it.uniroma2.saprClient.view.FlightPlan;
import it.uniroma2.saprClient.view.FlightPlanWrapper;
import it.uniroma2.saprClient.view.Pilot;
<<<<<<< HEAD
import it.uniroma2.saprClient.view.Device;
import java.util.Iterator;
import java.util.List;
import javafx.beans.binding.ListBinding;
=======
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
>>>>>>> master

public class ManageServiceImpl implements ManageService {
	String clazz = "MangeServiceImpl";
	final static Logger logger = Logger.getLogger("CLIENT");
	SAPRDroniInterface service = null;
	public ManageServiceImpl(){
		String method = "ManageServiceImpl";
		URL urlService = null;
		try {
			urlService = new URL("http://localhost:9999/ws/sapr?wsdl");
		} catch (MalformedURLException e) {
			logger.info(String.format("Class:%s-Method:%s::Error url[%s]", clazz,method,e.toString()));
			e.printStackTrace();
		}
		service = FactoryServiceSAPR.getService(urlService);		
	}

	public Boolean addPilot(Pilot p) {
		String method = "addPilot";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestPilot rq = new RequestPilot();
		rq.setOperation(Operation.ADD);
		buildMapPilot(p, rq);
		
		try {
			result = service.managerPilot(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			return false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}


	public Boolean removePilot(Pilot p) {
		String method = "removePilot";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestPilot rq = new RequestPilot();
		rq.setOperation(Operation.DELETE);
		rq.setPilotLicense(p.getLicensepilot());
		
		try {
			result = service.managerPilot(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
	
	public Boolean addDevice(Device d) {
		String method = "addDevice";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,d.toString()));
		RequestDevice rq = new RequestDevice();
		rq.setOperation(Operation.ADD);
		buildMapDevice(d, rq);
		
		try {
			result = service.managerDevice(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			return false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
        
	public List<ResponseDevice> selectDevices(String pilotLicense) {
		String method = "selectDevicesOfPilot";
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,pilotLicense));
                List<ResponseDevice> devices = null;
                try{
                    devices = service.getDevicesOfPilot(Opzione.ENABLED, pilotLicense);
                } catch (Exception_Exception e) {
			e.printStackTrace();
		}
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,devices));
		return devices;
	}

	public Boolean removeDevice(Device d) {
		String method = "removeDevice";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,d.toString()));
		RequestDevice rq = new RequestDevice();
		rq.setOperation(Operation.DELETE);
		buildMapDevice(d, rq);
		
		try {
			result = service.managerDevice(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
        
        
	private void buildMapPilot(Pilot p, RequestPilot rq) {
		String method = "buildMapPilot";
		logger.info(String.format("Class:%s-Method:%s::START with dates", clazz,method));
		
		rq.setName(p.getName());
		rq.setSurname(p.getSurname());
		rq.setNation(p.getNation());
		rq.setState(p.getState());
		rq.setResidence(p.getResidence());
		rq.setMail(p.getMail());
		rq.setPhone(p.getPhone());
		rq.setTaxCode(p.getTaxcode());
		rq.setPassword(p.getPassword());
		rq.setBirthDate(p.getBirthdate());
		rq.setPilotLicense(p.getLicensepilot());
		
		logger.info(String.format("Class:%s-Method:%s::END", clazz,method));
	}
        
        public Boolean addFlightPlan(FlightPlan p) {
		String method = "addFlightPlan";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestFlightPlan rq = new RequestFlightPlan();
		rq.setOperation(Operation.ADD);
		buildMapFlightPlan(p, rq);
		try {
			result = service.managerFlightPlan(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			return false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}


<<<<<<< HEAD
        private void buildMapDevice(Device d, RequestDevice rq) {
                String method = "buildMapDevice";
		logger.info(String.format("Class:%s-Method:%s::START with dates", clazz,method));
		rq.setIdDevice(d.getIdDevice());
                rq.setModel(d.getModel());
                rq.setTyper(d.getType());
                rq.setWeight(d.getWeight());
                rq.setProducer(d.getProducer());
                rq.setPilotLicense(d.getPilotLicense());
                
                RequestCheckElement checkElement = new RequestCheckElement();
                for (Iterator iterator = d.getCheckDevice().iterator(); iterator.hasNext();) {
                    checkElement.setValues(String.valueOf(iterator));
                    rq.getChekDevice().set(0, checkElement);
                }
                
		logger.info(String.format("Class:%s-Method:%s::END", clazz,method));
        }

=======
	public Boolean removeFlightPlan(FlightPlan p) {
		String method = "removeFlightPlan";
		Boolean result = false;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		RequestFlightPlan rq = new RequestFlightPlan();
		rq.setOperation(Operation.DELETE);
		buildMapFlightPlan(p, rq);
		
		try {
			result = service.managerFlightPlan(rq);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = false;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
	
	private void buildMapFlightPlan(FlightPlan p, RequestFlightPlan rq) {
		String method = "buildMapFlightPlan";
		logger.info(String.format("Class:%s-Method:%s::START with dates", clazz,method));
		rq.setDestinations(p.getDestinations());
		rq.setDeparture(p.getDeparture());
		rq.setDateDeparture(p.getDateDeparture());
		rq.setTimeDeparture(p.getTimeDeparture());
		rq.setNowArriving(p.getNowArriving());
		rq.setIdSapr(p.getIdSapr());
		rq.setIdNote(p.getIdNote());
		rq.setDevices(p.getDevices());
		rq.setPilotLicense(p.getPilotLicense());	
		logger.info(String.format("Class:%s-Method:%s::END", clazz,method));
	}
        
        public ResponseFlightPlan getFlightPlanByFlight(FlightPlan p) {
		String method = "getFlightPlanByFlight";
		ResponseFlightPlan result;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,p.toString()));
		//RequestFlightPlan rq = new RequestFlightPlan();
		//buildMapFlightPlan(p, rq);
		
		try {
			result = service.getFlightPlanByFlight(p.getIdSapr(),p.getPilotLicense(),p.getDateDeparture());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = null;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
	}
        
        public ArrayList<ResponseSapr> getSaprsOfPilot(Opzione opzione, String pilotLicense){
                String method = "getSaprsOfPilot";
		ArrayList<ResponseSapr> result;
		logger.info(String.format("Class:%s-Method:%s::START with dates[%s]", clazz,method,pilotLicense));
		//RequestFlightPlan rq = new RequestFlightPlan();
		//buildMapFlightPlan(p, rq);
		
		try {
			result = (ArrayList<ResponseSapr>) service.getSaprsOfPilot(opzione,pilotLicense);
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService Success", clazz,method,result));
		} catch (Exception_Exception e) {
			System.out.println(e.toString());
			logger.info(String.format("Class:%s-Method:%s:: Call to WebService error[%s]", clazz,method,e.toString()));
			result = null;
		}
		
		logger.info(String.format("Class:%s-Method:%s::END with result[%b]", clazz,method,result));
		return result;
        }
        
        public FlightPlanWrapper popoulateFlighPlanWrapper(String pilotLicense){
		FlightPlanWrapper flight = new FlightPlanWrapper();
		
		ArrayList<ResponseSapr> saprsOfPilot = null;
		ArrayList<ResponseDevice> devicesOfPilot = null;
		FlightPlan willFlight = new FlightPlan();
		try {
			saprsOfPilot = (ArrayList<ResponseSapr>) service.getSaprsOfPilot(Opzione.ENABLED, pilotLicense);
			devicesOfPilot = (ArrayList<ResponseDevice>) service.getDevicesOfPilot(Opzione.ENABLED, pilotLicense);
		} catch (Exception_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		flight.setDevicesOfPilot(devicesOfPilot);
		flight.setSaprsOfPilot(saprsOfPilot);
		flight.setFlight(willFlight);
		return flight;
	}
>>>>>>> master
}
